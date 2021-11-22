package greadcloserproto;

import static greadcloserproto.ReaderGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: greadcloser.proto")
public final class VertxReaderGrpc {
    private VertxReaderGrpc() {}

    public static ReaderVertxStub newVertxStub(io.grpc.Channel channel) {
        return new ReaderVertxStub(channel);
    }

    
    public static final class ReaderVertxStub extends io.grpc.stub.AbstractStub<ReaderVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private ReaderGrpc.ReaderStub delegateStub;

        private ReaderVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ReaderGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private ReaderVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ReaderGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected ReaderVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReaderVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<greadcloserproto.Greadcloser.ReadResponse> read(greadcloserproto.Greadcloser.ReadRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::read);
        }

        
        public io.vertx.core.Future<greadcloserproto.Greadcloser.CloseResponse> close(greadcloserproto.Greadcloser.CloseRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::close);
        }

    }

    
    public static abstract class ReaderVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public ReaderVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<greadcloserproto.Greadcloser.ReadResponse> read(greadcloserproto.Greadcloser.ReadRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<greadcloserproto.Greadcloser.CloseResponse> close(greadcloserproto.Greadcloser.CloseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            greadcloserproto.ReaderGrpc.getReadMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            greadcloserproto.Greadcloser.ReadRequest,
                                            greadcloserproto.Greadcloser.ReadResponse>(
                                            this, METHODID_READ, compression)))
                    .addMethod(
                            greadcloserproto.ReaderGrpc.getCloseMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            greadcloserproto.Greadcloser.CloseRequest,
                                            greadcloserproto.Greadcloser.CloseResponse>(
                                            this, METHODID_CLOSE, compression)))
                    .build();
        }
    }

    private static final int METHODID_READ = 0;
    private static final int METHODID_CLOSE = 1;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final ReaderVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(ReaderVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_READ:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (greadcloserproto.Greadcloser.ReadRequest) request,
                            (io.grpc.stub.StreamObserver<greadcloserproto.Greadcloser.ReadResponse>) responseObserver,
                            compression,
                            serviceImpl::read);
                    break;
                case METHODID_CLOSE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (greadcloserproto.Greadcloser.CloseRequest) request,
                            (io.grpc.stub.StreamObserver<greadcloserproto.Greadcloser.CloseResponse>) responseObserver,
                            compression,
                            serviceImpl::close);
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
