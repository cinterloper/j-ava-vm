package gwriterproto;

import static gwriterproto.WriterGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: gwriter.proto")
public final class VertxWriterGrpc {
    private VertxWriterGrpc() {}

    public static WriterVertxStub newVertxStub(io.grpc.Channel channel) {
        return new WriterVertxStub(channel);
    }

    
    public static final class WriterVertxStub extends io.grpc.stub.AbstractStub<WriterVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private WriterGrpc.WriterStub delegateStub;

        private WriterVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = WriterGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private WriterVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = WriterGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected WriterVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new WriterVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<gwriterproto.Gwriter.WriteResponse> write(gwriterproto.Gwriter.WriteRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::write);
        }

    }

    
    public static abstract class WriterVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public WriterVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<gwriterproto.Gwriter.WriteResponse> write(gwriterproto.Gwriter.WriteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            gwriterproto.WriterGrpc.getWriteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gwriterproto.Gwriter.WriteRequest,
                                            gwriterproto.Gwriter.WriteResponse>(
                                            this, METHODID_WRITE, compression)))
                    .build();
        }
    }

    private static final int METHODID_WRITE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final WriterVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(WriterVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_WRITE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gwriterproto.Gwriter.WriteRequest) request,
                            (io.grpc.stub.StreamObserver<gwriterproto.Gwriter.WriteResponse>) responseObserver,
                            compression,
                            serviceImpl::write);
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
