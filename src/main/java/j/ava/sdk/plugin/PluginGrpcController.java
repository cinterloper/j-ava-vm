package j.ava.sdk.plugin;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;
import io.vertx.core.shareddata.LocalMap;
import plugin.VertxGRPCControllerGrpc;

public class PluginGrpcController extends VertxGRPCControllerGrpc.GRPCControllerVertxImplBase {
    Vertx vertx;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    PluginGrpcController(Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Future<plugin.GrpcController.Empty> shutdown(plugin.GrpcController.Empty request) {
        logger.info("received shutdown request on grpc");
        LocalMap<String, Boolean> intmetadata = vertx.sharedData().getLocalMap("InternalMetadata");
        intmetadata.replace("shutdown",true);
        return Future.succeededFuture();
    }

}
