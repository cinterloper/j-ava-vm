package j.ava.sdk;

import com.google.protobuf.ByteString;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;
import j.ava.sdk.block.Block;
import vmproto.VertxVMGrpc;
import vmproto.Vm;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

class AvaGrpcConn extends VertxVMGrpc.VMVertxImplBase {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    Vertx vertx;

    AvaGrpcConn(Vertx vertx) {
        this.vertx = vertx;
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
    public Future<Vm.BootstrappingResponse> bootstrapping(Vm.BootstrappingRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        return Future.succeededFuture(Vm.BootstrappingResponse.newBuilder()

                .build());
    }

    @Override
    public Future<Vm.BootstrappedResponse> bootstrapped(Vm.BootstrappedRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        return Future.succeededFuture(Vm.BootstrappedResponse.newBuilder()

                .build());
    }

    @Override
    public Future<Vm.ShutdownResponse> shutdown(Vm.ShutdownRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        return Future.succeededFuture(Vm.ShutdownResponse.newBuilder()


                .build());
    }

    @Override
    public Future<Vm.CreateHandlersResponse> createHandlers(Vm.CreateHandlersRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        return Future.succeededFuture(Vm.CreateHandlersResponse.newBuilder()
                .setHandlers(0, Vm.Handler.newBuilder().setPrefix("/")).build());
    }

    @Override
    public Future<Vm.CreateStaticHandlersResponse> createStaticHandlers(Vm.CreateStaticHandlersRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        logger.info("here we go");
        Vm.Handler handler_0 = Vm.Handler.newBuilder()
                .setPrefix("")
                .setPrefixBytes(ByteString.copyFrom(new byte[]{}))
                .build();
        ArrayList<Vm.Handler> handlers = new ArrayList<>();
        handlers.add(handler_0);
        logger.info("after create handler");
        Vm.CreateStaticHandlersResponse response;
        try {
            response = Vm.CreateStaticHandlersResponse.newBuilder()
                    .addAllHandlers(handlers).build();
        } catch (Exception e) {
            logger.error(e);
            return Future.failedFuture(e);
        }
        logger.info("will respond with " + response);
        return Future.succeededFuture(response);
    }


    @Override
    public Future<Vm.BuildBlockResponse> buildBlock(Vm.BuildBlockRequest request) {
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
    public Future<Vm.ParseBlockResponse> parseBlock(Vm.ParseBlockRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        logger.info(String.valueOf(request.getBytes()));
        return Future.succeededFuture(Vm.ParseBlockResponse.newBuilder()
                .setHeight(1)
                .setParentID(ByteString.copyFrom("0".getBytes()))
                .setStatus(0)
                .build());
    }


    @Override
    public Future<Vm.GetBlockResponse> getBlock(Vm.GetBlockRequest request) {
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
    public Future<Vm.SetPreferenceResponse> setPreference(Vm.SetPreferenceRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        logger.info(String.valueOf(request.getId()));

        return Future.succeededFuture(Vm.SetPreferenceResponse.newBuilder()

                .build());
    }


    @Override
    public Future<Vm.HealthResponse> health(Vm.HealthRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());

        return Future.succeededFuture(Vm.HealthResponse.newBuilder()

                .build());
    }


    @Override
    public Future<Vm.VersionResponse> version(Vm.VersionRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        Vm.VersionResponse response = Vm.VersionResponse.newBuilder()
                .setVersion("0.1")
                .build();
        logger.info("will respond with: " + response);
        return Future.succeededFuture(response);
    }


    @Override
    public Future<Vm.BlockVerifyResponse> blockVerify(Vm.BlockVerifyRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        logger.info(String.valueOf(request.getBytes()));

        Block b = Block.fromBytes(request.getBytes().toByteArray());
        return Future.succeededFuture(Vm.BlockVerifyResponse.newBuilder()

                .build());
    }


    @Override
    public Future<Vm.BlockAcceptResponse> blockAccept(Vm.BlockAcceptRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());
        logger.info(String.valueOf(request.getId()));

        return Future.succeededFuture(Vm.BlockAcceptResponse.newBuilder()
                .build());

    }


    @Override
    public Future<Vm.BlockRejectResponse> blockReject(Vm.BlockRejectRequest request) {
        logger.info(new Throwable().getStackTrace()[0].getMethodName());

        logger.info(String.valueOf(request.getId()));
        return Future.succeededFuture(Vm.BlockRejectResponse.newBuilder()

                .build());
    }

}
