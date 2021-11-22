package appproto;

import static appproto.NodeGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: app.proto")
public final class VertxNodeGrpc {
    private VertxNodeGrpc() {}

    public static NodeVertxStub newVertxStub(io.grpc.Channel channel) {
        return new NodeVertxStub(channel);
    }

    
    public static final class NodeVertxStub extends io.grpc.stub.AbstractStub<NodeVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private NodeGrpc.NodeStub delegateStub;

        private NodeVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = NodeGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private NodeVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = NodeGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected NodeVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NodeVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<appproto.App.StartResponse> start(appproto.App.StartRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::start);
        }

        
        public io.vertx.core.Future<appproto.App.StopResponse> stop(appproto.App.StopRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::stop);
        }

    }

    
    public static abstract class NodeVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public NodeVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<appproto.App.StartResponse> start(appproto.App.StartRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<appproto.App.StopResponse> stop(appproto.App.StopRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            appproto.NodeGrpc.getStartMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            appproto.App.StartRequest,
                                            appproto.App.StartResponse>(
                                            this, METHODID_START, compression)))
                    .addMethod(
                            appproto.NodeGrpc.getStopMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            appproto.App.StopRequest,
                                            appproto.App.StopResponse>(
                                            this, METHODID_STOP, compression)))
                    .build();
        }
    }

    private static final int METHODID_START = 0;
    private static final int METHODID_STOP = 1;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final NodeVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(NodeVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_START:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (appproto.App.StartRequest) request,
                            (io.grpc.stub.StreamObserver<appproto.App.StartResponse>) responseObserver,
                            compression,
                            serviceImpl::start);
                    break;
                case METHODID_STOP:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (appproto.App.StopRequest) request,
                            (io.grpc.stub.StreamObserver<appproto.App.StopResponse>) responseObserver,
                            compression,
                            serviceImpl::stop);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
