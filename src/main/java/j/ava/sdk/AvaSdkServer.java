package j.ava.sdk;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


public class AvaSdkServer extends AbstractVerticle {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle("j.ava.sdk.AvaSdkServer");
    }

    @Override
    public void start() {
        String magicKey = "VM_PLUGIN";
        String magicVal = "dynamic";
        int port = 8080;
        //https://cheppers.com/post/hashicorps-go-plugin-extensive-tutorial/
        String hcPluginHello = "1|9|tcp|127.0.0.1:" + port + "|grpc";

        //1|8|unix|/tmp/plugin144809160|grpc| //from coreth
        VertxServerBuilder grpcServer = VertxServerBuilder.forAddress(vertx, "localhost", port);
        grpcServer.addService(new AvaGrpcConn(vertx));
        grpcServer.addService(new PluginGrpcBroker(vertx));
        grpcServer.addService(new PluginGrpcStdio(vertx));
        logger.info("Starting " + this.getClass().getName());
        VertxServer server = grpcServer.build();
        server.start(ar -> {
            if (ar.succeeded()) {
                System.out.println(hcPluginHello);
                logger.info("listening on " + server.getPort());
            } else {
                System.out.println("Could not start " + this.getClass().getName() + ": " + ar.cause().getMessage());
            }
        });
    }
}