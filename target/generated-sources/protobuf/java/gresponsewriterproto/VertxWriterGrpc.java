package gresponsewriterproto;

import static gresponsewriterproto.WriterGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: gresponsewriter.proto")
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

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.WriteResponse> write(gresponsewriterproto.Gresponsewriter.WriteRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::write);
        }

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> writeHeader(gresponsewriterproto.Gresponsewriter.WriteHeaderRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::writeHeader);
        }

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.FlushResponse> flush(gresponsewriterproto.Gresponsewriter.FlushRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::flush);
        }

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.HijackResponse> hijack(gresponsewriterproto.Gresponsewriter.HijackRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::hijack);
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

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.WriteResponse> write(gresponsewriterproto.Gresponsewriter.WriteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> writeHeader(gresponsewriterproto.Gresponsewriter.WriteHeaderRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.FlushResponse> flush(gresponsewriterproto.Gresponsewriter.FlushRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gresponsewriterproto.Gresponsewriter.HijackResponse> hijack(gresponsewriterproto.Gresponsewriter.HijackRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            gresponsewriterproto.WriterGrpc.getWriteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gresponsewriterproto.Gresponsewriter.WriteRequest,
                                            gresponsewriterproto.Gresponsewriter.WriteResponse>(
                                            this, METHODID_WRITE, compression)))
                    .addMethod(
                            gresponsewriterproto.WriterGrpc.getWriteHeaderMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gresponsewriterproto.Gresponsewriter.WriteHeaderRequest,
                                            gresponsewriterproto.Gresponsewriter.WriteHeaderResponse>(
                                            this, METHODID_WRITE_HEADER, compression)))
                    .addMethod(
                            gresponsewriterproto.WriterGrpc.getFlushMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gresponsewriterproto.Gresponsewriter.FlushRequest,
                                            gresponsewriterproto.Gresponsewriter.FlushResponse>(
                                            this, METHODID_FLUSH, compression)))
                    .addMethod(
                            gresponsewriterproto.WriterGrpc.getHijackMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gresponsewriterproto.Gresponsewriter.HijackRequest,
                                            gresponsewriterproto.Gresponsewriter.HijackResponse>(
                                            this, METHODID_HIJACK, compression)))
                    .build();
        }
    }

    private static final int METHODID_WRITE = 0;
    private static final int METHODID_WRITE_HEADER = 1;
    private static final int METHODID_FLUSH = 2;
    private static final int METHODID_HIJACK = 3;

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
                            (gresponsewriterproto.Gresponsewriter.WriteRequest) request,
                            (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteResponse>) responseObserver,
                            compression,
                            serviceImpl::write);
                    break;
                case METHODID_WRITE_HEADER:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gresponsewriterproto.Gresponsewriter.WriteHeaderRequest) request,
                            (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse>) responseObserver,
                            compression,
                            serviceImpl::writeHeader);
                    break;
                case METHODID_FLUSH:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gresponsewriterproto.Gresponsewriter.FlushRequest) request,
                            (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.FlushResponse>) responseObserver,
                            compression,
                            serviceImpl::flush);
                    break;
                case METHODID_HIJACK:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gresponsewriterproto.Gresponsewriter.HijackRequest) request,
                            (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.HijackResponse>) responseObserver,
                            compression,
                            serviceImpl::hijack);
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
