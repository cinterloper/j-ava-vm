package j.ava.sdk.plugin;

import io.grpc.stub.StreamObserver;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;
import plugin.GRPCBrokerGrpc;
import plugin.GrpcBroker;

import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static plugin.GRPCBrokerGrpc.getStartStreamMethod;

public class PluginGrpcBroker extends GRPCBrokerGrpc.GRPCBrokerImplBase {
    Vertx vertx;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public PluginGrpcBroker(Vertx vertx){
        this.vertx = vertx;
        logger.info("creating PluginGrpcBroker");
    }
    @Override
    public io.grpc.stub.StreamObserver<plugin.GrpcBroker.ConnInfo> startStream(
            io.grpc.stub.StreamObserver<plugin.GrpcBroker.ConnInfo> responseObserver) {

        logger.info("startStream");
        GrpcBroker.ConnInfo i =  GrpcBroker.ConnInfo.newBuilder().setNetwork("tcp").setAddress("localhost:8080").build();
        responseObserver.onNext(i);
        logger.info("startStream responded localhost:8080");

        StreamObserver<GrpcBroker.ConnInfo> s = new StreamObserver<GrpcBroker.ConnInfo>() {
            @Override
            public void onNext(GrpcBroker.ConnInfo connInfo) {
                logger.info("onNext in response");
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error("onError in response");
            }

            @Override
            public void onCompleted() {
                logger.info("onCompleted in response");
            }
        };

        return s;
    }
}
