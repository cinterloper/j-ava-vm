package j.ava.sdk;

import com.google.protobuf.InvalidProtocolBufferException;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;
import plugin.GRPCStdioGrpc;
import plugin.GrpcStdio.StdioData;
import plugin.VertxGRPCStdioGrpc;

import java.nio.charset.StandardCharsets;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static plugin.GRPCStdioGrpc.getStreamStdioMethod;

public class PluginGrpcStdio extends VertxGRPCStdioGrpc.GRPCStdioVertxImplBase {
    Vertx vertx;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    PluginGrpcStdio(Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public void streamStdio(com.google.protobuf.Empty request, io.vertx.core.streams.WriteStream<plugin.GrpcStdio.StdioData> response) {
        logger.info("streamStdio");
        response.write(StdioData.getDefaultInstance()).result();
    }

}
