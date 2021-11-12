package j.ava.example;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import j.ava.example.vm.wasm.GraalWasmEngine;
import org.graalvm.polyglot.Value;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(VertxUnitRunner.class)
public class GraalWasmEngineTest {
    Vertx vertx = Vertx.vertx();

    @Before
    public void before(TestContext context) {
        vertx.exceptionHandler(context.exceptionHandler());
    }

    @After
    public void after(TestContext context) {

    }

    @Test
    public void InvokeWasmIntArgsGetResult(TestContext context) {
        Async async = context.async();
        GraalWasmEngine wasm_eng = new GraalWasmEngine();
        Value returnval = (Value)wasm_eng.eval("wasm_build/test.wasm", new String[]{"1", "2"});
        int result = returnval.asInt();
        assert result == 23;
        async.complete();
    }

}
