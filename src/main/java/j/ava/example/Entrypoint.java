package j.ava.example;

import io.vertx.core.Vertx;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;
import j.ava.example.chain.service.impl.VMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class Entrypoint {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Entrypoint.class);
        Vertx vertx = Vertx.vertx();
        VMService VM = new VMService(vertx);
        String host = "0.0.0.0";
        int port = 1888;
        //GRPC server
        VertxServer rpcServer = VertxServerBuilder.
                forAddress(vertx, host, 1888).
                addService(VM).
                build();
        try {
            rpcServer.start();
            logger.info("started grpc server on " + host + ":" + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
