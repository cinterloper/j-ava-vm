package j.ava.example;

import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import io.vertx.core.Vertx;
import io.vertx.generated.GreeterGrpc;
import io.vertx.generated.HelloReply;
import io.vertx.generated.HelloRequest;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;
import vmproto.VMGrpc;
import vmproto.Vm;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class Server {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Server.class);

        VMGrpc.VMImplBase VM = new VMGrpc.VMImplBase() {
            @Override
            public void initialize(Vm.InitializeRequest request, StreamObserver<Vm.InitializeResponse> responseObserver) {
                logger.info("initialization");


                responseObserver.onNext(
                        Vm.InitializeResponse.newBuilder()
                                .setHeight(7)
                                .setLastAcceptedID(ByteString.copyFromUtf8("abc123"))
                                .setStatus(0)
                                .build()
                );
                responseObserver.onCompleted();
            }

            @Override
            public void bootstrapping(Vm.BootstrappingRequest request, StreamObserver<Vm.BootstrappingResponse> responseObserver) {
                super.bootstrapping(request, responseObserver);
            }

            @Override
            public void bootstrapped(Vm.BootstrappedRequest request, StreamObserver<Vm.BootstrappedResponse> responseObserver) {
                super.bootstrapped(request, responseObserver);
            }

            @Override
            public void shutdown(Vm.ShutdownRequest request, StreamObserver<Vm.ShutdownResponse> responseObserver) {
                super.shutdown(request, responseObserver);
            }

            @Override
            public void createHandlers(Vm.CreateHandlersRequest request, StreamObserver<Vm.CreateHandlersResponse> responseObserver) {
                super.createHandlers(request, responseObserver);
            }

            @Override
            public void createStaticHandlers(Vm.CreateStaticHandlersRequest request, StreamObserver<Vm.CreateStaticHandlersResponse> responseObserver) {
                super.createStaticHandlers(request, responseObserver);
            }

            @Override
            public void buildBlock(Vm.BuildBlockRequest request, StreamObserver<Vm.BuildBlockResponse> responseObserver) {
                super.buildBlock(request, responseObserver);
            }

            @Override
            public void parseBlock(Vm.ParseBlockRequest request, StreamObserver<Vm.ParseBlockResponse> responseObserver) {
                super.parseBlock(request, responseObserver);
            }

            @Override
            public void getBlock(Vm.GetBlockRequest request, StreamObserver<Vm.GetBlockResponse> responseObserver) {
                super.getBlock(request, responseObserver);
            }

            @Override
            public void setPreference(Vm.SetPreferenceRequest request, StreamObserver<Vm.SetPreferenceResponse> responseObserver) {
                super.setPreference(request, responseObserver);
            }

            @Override
            public void health(Vm.HealthRequest request, StreamObserver<Vm.HealthResponse> responseObserver) {
                super.health(request, responseObserver);
            }

            @Override
            public void version(Vm.VersionRequest request, StreamObserver<Vm.VersionResponse> responseObserver) {
                super.version(request, responseObserver);
            }

            @Override
            public void blockVerify(Vm.BlockVerifyRequest request, StreamObserver<Vm.BlockVerifyResponse> responseObserver) {
                super.blockVerify(request, responseObserver);
            }

            @Override
            public void blockAccept(Vm.BlockAcceptRequest request, StreamObserver<Vm.BlockAcceptResponse> responseObserver) {
                super.blockAccept(request, responseObserver);
            }

            @Override
            public void blockReject(Vm.BlockRejectRequest request, StreamObserver<Vm.BlockRejectResponse> responseObserver) {
//                responseObserver.onNext(Vm.BlockRejectResponse.newBuilder().setField(""));
                super.blockReject(request, responseObserver);
            }
        };
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
                addService(VM).
                build();
        try {

            rpcServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
