package j.ava.example.server;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class HttpServerImpl {
    void startHttpServer(Vertx vertx) {
        HttpServer server = vertx.createHttpServer();

        Router router = Router.router(vertx);
        String pathSubmit = "/submit";
//        Route submitRoute =
    }

}
