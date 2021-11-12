package j.ava.example.server;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import j.ava.example.vm.wasm.GraalWasmEngine;
import org.graalvm.polyglot.Value;

public class HttpServerImpl {
    public void startHttpServer(Vertx vertx) {
        GraalWasmEngine wasmEngine = new GraalWasmEngine();
        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);
        String pathDebug = "/debug";
        Route debugRoute = router.route(HttpMethod.GET, pathDebug);
        debugRoute.handler(ctx -> {
            String a = ctx.request().getParam("a");
            String b = ctx.request().getParam("b");
            Value val = (Value)wasmEngine.eval("wasm_build/test.wasm", new String[]{a, b});
            ctx.response().end(String.valueOf(val.asInt()));
        });
        server.requestHandler(router).listen(8080);
        System.out.println("http on 8080");
    }

}
