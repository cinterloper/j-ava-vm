package j.ava.sdk;


import com.google.protobuf.ByteString;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;
import j.ava.sdk.block.Block;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import vmproto.VertxVMGrpc;
import vmproto.Vm;

import java.nio.charset.StandardCharsets;

public class AvaSdkServer extends AbstractVerticle {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle("j.ava.sdk.AvaSdkServer");
    }

    private class AvaGrpcConn extends VertxVMGrpc.VMVertxImplBase {


        AvaGrpcConn() {
            logger.info("AvaGrpcConn init");

        }

        @Override
        public io.vertx.core.Future<vmproto.Vm.InitializeResponse> initialize(vmproto.Vm.InitializeRequest request) {
            Block b = new Block("1", null);
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            logger.info(String.valueOf(request.getAvaxAssetID()));
            logger.info(String.valueOf(request.getBcLookupServer()));
            logger.info(String.valueOf(request.getChainID()));
            logger.info(String.valueOf(request.getConfigBytes()));
            logger.info(String.valueOf(request.getDbServers(0)));
            logger.info(String.valueOf(request.getDbServersCount()));
            logger.info(String.valueOf(request.getDbServersList()));
            logger.info(String.valueOf(request.getEpochFirstTransition()));
            logger.info(String.valueOf(request.getEpochDuration()));
            logger.info(String.valueOf(request.getEngineServer()));
            logger.info(String.valueOf(request.getGenesisBytes()));
            logger.info(String.valueOf(request.getKeystoreServer()));
            logger.info(String.valueOf(request.getNodeID()));
            logger.info(String.valueOf(request.getNetworkID()));
            logger.info(String.valueOf(request.getSubnetID()));
            logger.info(String.valueOf(request.getSnLookupServer()));
            logger.info(String.valueOf(request.getSharedMemoryServer()));
            logger.info(String.valueOf(request.getUpgradeBytes()));
            logger.info(String.valueOf(request.getXChainID()));


            return Future.succeededFuture(Vm.InitializeResponse.newBuilder()
                    .setBytes(ByteString.copyFrom(b.bytes))
                    .setHeight(1)
                    .setLastAcceptedID(ByteString.copyFrom("0".getBytes()))
                    .setLastAcceptedParentID(ByteString.copyFrom("0".getBytes()))
                    .setStatus(1)
                    .build());
        }

        @Override
        public io.vertx.core.Future<vmproto.Vm.BootstrappingResponse> bootstrapping(vmproto.Vm.BootstrappingRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            return Future.succeededFuture(Vm.BootstrappingResponse.newBuilder()

                    .build());
        }

        @Override
        public io.vertx.core.Future<vmproto.Vm.BootstrappedResponse> bootstrapped(vmproto.Vm.BootstrappedRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            return Future.succeededFuture(Vm.BootstrappedResponse.newBuilder()

                    .build());
        }

        @Override
        public io.vertx.core.Future<vmproto.Vm.ShutdownResponse> shutdown(vmproto.Vm.ShutdownRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            return Future.succeededFuture(Vm.ShutdownResponse.newBuilder()


                    .build());
        }

        @Override
        public io.vertx.core.Future<vmproto.Vm.CreateHandlersResponse> createHandlers(vmproto.Vm.CreateHandlersRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            return Future.succeededFuture(Vm.CreateHandlersResponse.newBuilder()
                    .setHandlers(0, Vm.Handler.newBuilder().setPrefix("/")).build());
        }

        @Override
        public io.vertx.core.Future<vmproto.Vm.CreateStaticHandlersResponse> createStaticHandlers(vmproto.Vm.CreateStaticHandlersRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            return Future.succeededFuture(Vm.CreateStaticHandlersResponse.newBuilder()
                    .setHandlers(0, Vm.Handler.newBuilder().setPrefix("/")).build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.BuildBlockResponse> buildBlock(vmproto.Vm.BuildBlockRequest request) {
            Block b = new Block("1", null);
            logger.info(new Throwable().getStackTrace()[0].getMethodName());

            return Future.succeededFuture(Vm.BuildBlockResponse.newBuilder()
                    .setBytes(ByteString.copyFrom(b.bytes))
                    .setId(ByteString.copyFrom(b.ID.getBytes()))
                    .setHeight(1)
                    .setParentID(ByteString.copyFrom("1".getBytes(StandardCharsets.UTF_8)))
                    .build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.ParseBlockResponse> parseBlock(vmproto.Vm.ParseBlockRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            logger.info(String.valueOf(request.getBytes()));
            return Future.succeededFuture(Vm.ParseBlockResponse.newBuilder()
                    .setHeight(1)
                    .setParentID(ByteString.copyFrom("0".getBytes()))
                    .setStatus(0)
                    .build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.GetBlockResponse> getBlock(vmproto.Vm.GetBlockRequest request) {
            Block b = new Block("1", null);
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            logger.info(String.valueOf(request.getId()));
            return Future.succeededFuture(Vm.GetBlockResponse.newBuilder()
                    .setBytes(ByteString.copyFrom(b.bytes))
                    .setHeight(1)
                    .setStatus(0)
                    .setParentID(ByteString.copyFrom("1".getBytes(StandardCharsets.UTF_8)))
                    .build());


        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.SetPreferenceResponse> setPreference(vmproto.Vm.SetPreferenceRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            logger.info(String.valueOf(request.getId()));

            return Future.succeededFuture(Vm.SetPreferenceResponse.newBuilder()

                    .build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.HealthResponse> health(vmproto.Vm.HealthRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());

            return Future.succeededFuture(Vm.HealthResponse.newBuilder()

                    .build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.VersionResponse> version(vmproto.Vm.VersionRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());

            return Future.succeededFuture(Vm.VersionResponse.newBuilder()
                    .setVersion("0.1")
                    .build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.BlockVerifyResponse> blockVerify(vmproto.Vm.BlockVerifyRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            logger.info(String.valueOf(request.getBytes()));

            Block b = Block.fromBytes(request.getBytes().toByteArray());
            return Future.succeededFuture(Vm.BlockVerifyResponse.newBuilder()

                    .build());
        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.BlockAcceptResponse> blockAccept(vmproto.Vm.BlockAcceptRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());
            logger.info(String.valueOf(request.getId()));

            return Future.succeededFuture(Vm.BlockAcceptResponse.newBuilder()
                    .build());

        }


        @Override
        public io.vertx.core.Future<vmproto.Vm.BlockRejectResponse> blockReject(vmproto.Vm.BlockRejectRequest request) {
            logger.info(new Throwable().getStackTrace()[0].getMethodName());

            logger.info(String.valueOf(request.getId()));
            return Future.succeededFuture(Vm.BlockRejectResponse.newBuilder()

                    .build());
        }

    }

    @Override
    public void start() {
        String magicKey = "VM_PLUGIN";
        String magicVal = "dynamic";
        int port = 8080;
        //https://cheppers.com/post/hashicorps-go-plugin-extensive-tutorial/
        String hcPluginHello = "1|1|tcp|127.0.0.1:" + port + "|grpc";

        //1|8|unix|/tmp/plugin144809160|grpc| //from coreth
        VertxServerBuilder localhost = VertxServerBuilder.forAddress(vertx, "localhost", port);
        localhost.addService(new AvaGrpcConn());
        logger.error("hello logger");
        VertxServer server = localhost.build();
        server.start(ar -> {
            if (ar.succeeded()) {
                System.out.println(hcPluginHello);
            } else {
                System.out.println("Could not start server " + ar.cause().getMessage());
            }
        });
    }
}