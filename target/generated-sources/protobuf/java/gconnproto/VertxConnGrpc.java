package gconnproto;

import static gconnproto.ConnGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: gconn.proto")
public final class VertxConnGrpc {
    private VertxConnGrpc() {}

    public static ConnVertxStub newVertxStub(io.grpc.Channel channel) {
        return new ConnVertxStub(channel);
    }

    
    public static final class ConnVertxStub extends io.grpc.stub.AbstractStub<ConnVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private ConnGrpc.ConnStub delegateStub;

        private ConnVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ConnGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private ConnVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ConnGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected ConnVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConnVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.ReadResponse> read(gconnproto.Gconn.ReadRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::read);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.WriteResponse> write(gconnproto.Gconn.WriteRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::write);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.CloseResponse> close(gconnproto.Gconn.CloseRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::close);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.SetDeadlineResponse> setDeadline(gconnproto.Gconn.SetDeadlineRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::setDeadline);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.SetReadDeadlineResponse> setReadDeadline(gconnproto.Gconn.SetReadDeadlineRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::setReadDeadline);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.SetWriteDeadlineResponse> setWriteDeadline(gconnproto.Gconn.SetWriteDeadlineRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::setWriteDeadline);
        }

    }

    
    public static abstract class ConnVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public ConnVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.ReadResponse> read(gconnproto.Gconn.ReadRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.WriteResponse> write(gconnproto.Gconn.WriteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.CloseResponse> close(gconnproto.Gconn.CloseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.SetDeadlineResponse> setDeadline(gconnproto.Gconn.SetDeadlineRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.SetReadDeadlineResponse> setReadDeadline(gconnproto.Gconn.SetReadDeadlineRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gconnproto.Gconn.SetWriteDeadlineResponse> setWriteDeadline(gconnproto.Gconn.SetWriteDeadlineRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            gconnproto.ConnGrpc.getReadMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gconnproto.Gconn.ReadRequest,
                                            gconnproto.Gconn.ReadResponse>(
                                            this, METHODID_READ, compression)))
                    .addMethod(
                            gconnproto.ConnGrpc.getWriteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gconnproto.Gconn.WriteRequest,
                                            gconnproto.Gconn.WriteResponse>(
                                            this, METHODID_WRITE, compression)))
                    .addMethod(
                            gconnproto.ConnGrpc.getCloseMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gconnproto.Gconn.CloseRequest,
                                            gconnproto.Gconn.CloseResponse>(
                                            this, METHODID_CLOSE, compression)))
                    .addMethod(
                            gconnproto.ConnGrpc.getSetDeadlineMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gconnproto.Gconn.SetDeadlineRequest,
                                            gconnproto.Gconn.SetDeadlineResponse>(
                                            this, METHODID_SET_DEADLINE, compression)))
                    .addMethod(
                            gconnproto.ConnGrpc.getSetReadDeadlineMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gconnproto.Gconn.SetReadDeadlineRequest,
                                            gconnproto.Gconn.SetReadDeadlineResponse>(
                                            this, METHODID_SET_READ_DEADLINE, compression)))
                    .addMethod(
                            gconnproto.ConnGrpc.getSetWriteDeadlineMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gconnproto.Gconn.SetWriteDeadlineRequest,
                                            gconnproto.Gconn.SetWriteDeadlineResponse>(
                                            this, METHODID_SET_WRITE_DEADLINE, compression)))
                    .build();
        }
    }

    private static final int METHODID_READ = 0;
    private static final int METHODID_WRITE = 1;
    private static final int METHODID_CLOSE = 2;
    private static final int METHODID_SET_DEADLINE = 3;
    private static final int METHODID_SET_READ_DEADLINE = 4;
    private static final int METHODID_SET_WRITE_DEADLINE = 5;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final ConnVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(ConnVertxImplBase serviceImpl, int methodId, String compression) {
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
                            (gconnproto.Gconn.ReadRequest) request,
                            (io.grpc.stub.StreamObserver<gconnproto.Gconn.ReadResponse>) responseObserver,
                            compression,
                            serviceImpl::read);
                    break;
                case METHODID_WRITE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gconnproto.Gconn.WriteRequest) request,
                            (io.grpc.stub.StreamObserver<gconnproto.Gconn.WriteResponse>) responseObserver,
                            compression,
                            serviceImpl::write);
                    break;
                case METHODID_CLOSE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gconnproto.Gconn.CloseRequest) request,
                            (io.grpc.stub.StreamObserver<gconnproto.Gconn.CloseResponse>) responseObserver,
                            compression,
                            serviceImpl::close);
                    break;
                case METHODID_SET_DEADLINE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gconnproto.Gconn.SetDeadlineRequest) request,
                            (io.grpc.stub.StreamObserver<gconnproto.Gconn.SetDeadlineResponse>) responseObserver,
                            compression,
                            serviceImpl::setDeadline);
                    break;
                case METHODID_SET_READ_DEADLINE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gconnproto.Gconn.SetReadDeadlineRequest) request,
                            (io.grpc.stub.StreamObserver<gconnproto.Gconn.SetReadDeadlineResponse>) responseObserver,
                            compression,
                            serviceImpl::setReadDeadline);
                    break;
                case METHODID_SET_WRITE_DEADLINE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gconnproto.Gconn.SetWriteDeadlineRequest) request,
                            (io.grpc.stub.StreamObserver<gconnproto.Gconn.SetWriteDeadlineResponse>) responseObserver,
                            compression,
                            serviceImpl::setWriteDeadline);
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
