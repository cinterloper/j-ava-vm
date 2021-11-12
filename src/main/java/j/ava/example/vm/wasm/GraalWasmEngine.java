package j.ava.example.vm.wasm;

import j.ava.example.vm.VM;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.io.ByteSequence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class GraalWasmEngine implements VM  {
    public static class MyClass {
        public int               id    = 42;
        public String            text  = "42";
        public int[]             arr   = new int[]{1, 42, 3};
        public Callable<Integer> ret42 = () -> 42;
    }
    @Override
    public Object eval(String program, String[] args) {
        Path path = Paths.get("./helloWorld.wasm");
        byte[] binary;
        try {
            binary = Files.readAllBytes(path);
        } catch (IOException e) {
            System.out.println("something went wrong reading in eval");
            return null;
        }
        Context.Builder contextBuilder = Context.newBuilder("wasm");
        Source.Builder sourceBuilder = Source.newBuilder("wasm", ByteSequence.create(binary), "output");
        Source source = null;
        try {
            source = sourceBuilder.build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        //allow calling registered java
        Context context = contextBuilder.allowAllAccess(true).build();
        Value val = context.getBindings("wasm");
        context.getBindings("wasm").putMember("javaObj", new MyClass());

//        Value wasmBindings = context.getBindings("wasm");
//        wasmBindings.putMember("env", new ENV());

        context.eval(source);
        Value mainFunction = context.getBindings("wasm").getMember("main").getMember("helloWorld");

        return mainFunction.execute();
    }
}
