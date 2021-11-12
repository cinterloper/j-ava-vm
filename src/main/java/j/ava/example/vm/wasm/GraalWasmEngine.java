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
    @Override
    public Object eval(String program, String[] args) {
        Path path = Paths.get(program);
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
        Context context = contextBuilder.allowAllAccess(true).build();

        context.eval(source);
        Value mainFunction = context.getBindings("wasm").getMember("main").getMember("main");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Value returnVal = mainFunction.execute(a,b);
        System.out.println("return value: " + returnVal.asInt());
        return returnVal;
    }
}
