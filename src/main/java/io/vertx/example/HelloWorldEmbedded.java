package io.vertx.example;

import io.grpc.stub.StreamObserver;
import io.vertx.core.Vertx;
import io.vertx.generated.GreeterGrpc;
import io.vertx.generated.HelloReply;
import io.vertx.generated.HelloRequest;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;

import java.io.IOException;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldEmbedded {

    public static void main(String[] args) {
        GreeterGrpc.GreeterImplBase service = new GreeterGrpc.GreeterImplBase() {
            @Override
            public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
                responseObserver.onNext(
                        HelloReply.newBuilder()
                                .setMessage("hellothere").build()
                );
                responseObserver.onCompleted();
            }
        };


        // Create an HTTP server which simply returns "Hello World!" to each request.
        VertxServer rpcServer = VertxServerBuilder.
                forAddress(Vertx.vertx(), "0.0.0.0", 1888).
                addService(service).
                build();
        try {

            rpcServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
