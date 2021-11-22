package ghttpproto;

import static ghttpproto.HTTPGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: ghttp.proto")
public final class VertxHTTPGrpc {
    private VertxHTTPGrpc() {}

    public static HTTPVertxStub newVertxStub(io.grpc.Channel channel) {
        return new HTTPVertxStub(channel);
    }

    
    public static final class HTTPVertxStub extends io.grpc.stub.AbstractStub<HTTPVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private HTTPGrpc.HTTPStub delegateStub;

        private HTTPVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = HTTPGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private HTTPVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = HTTPGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected HTTPVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HTTPVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<ghttpproto.Ghttp.HTTPResponse> handle(ghttpproto.Ghttp.HTTPRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::handle);
        }

    }

    
    public static abstract class HTTPVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public HTTPVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<ghttpproto.Ghttp.HTTPResponse> handle(ghttpproto.Ghttp.HTTPRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            ghttpproto.HTTPGrpc.getHandleMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ghttpproto.Ghttp.HTTPRequest,
                                            ghttpproto.Ghttp.HTTPResponse>(
                                            this, METHODID_HANDLE, compression)))
                    .build();
        }
    }

    private static final int METHODID_HANDLE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final HTTPVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(HTTPVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_HANDLE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (ghttpproto.Ghttp.HTTPRequest) request,
                            (io.grpc.stub.StreamObserver<ghttpproto.Ghttp.HTTPResponse>) responseObserver,
                            compression,
                            serviceImpl::handle);
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
