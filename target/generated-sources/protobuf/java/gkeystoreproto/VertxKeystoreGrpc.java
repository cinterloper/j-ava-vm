package gkeystoreproto;

import static gkeystoreproto.KeystoreGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: gkeystore.proto")
public final class VertxKeystoreGrpc {
    private VertxKeystoreGrpc() {}

    public static KeystoreVertxStub newVertxStub(io.grpc.Channel channel) {
        return new KeystoreVertxStub(channel);
    }

    
    public static final class KeystoreVertxStub extends io.grpc.stub.AbstractStub<KeystoreVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private KeystoreGrpc.KeystoreStub delegateStub;

        private KeystoreVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = KeystoreGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private KeystoreVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = KeystoreGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected KeystoreVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new KeystoreVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<gkeystoreproto.Gkeystore.GetDatabaseResponse> getDatabase(gkeystoreproto.Gkeystore.GetDatabaseRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::getDatabase);
        }

    }

    
    public static abstract class KeystoreVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public KeystoreVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<gkeystoreproto.Gkeystore.GetDatabaseResponse> getDatabase(gkeystoreproto.Gkeystore.GetDatabaseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            gkeystoreproto.KeystoreGrpc.getGetDatabaseMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gkeystoreproto.Gkeystore.GetDatabaseRequest,
                                            gkeystoreproto.Gkeystore.GetDatabaseResponse>(
                                            this, METHODID_GET_DATABASE, compression)))
                    .build();
        }
    }

    private static final int METHODID_GET_DATABASE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final KeystoreVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(KeystoreVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_DATABASE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gkeystoreproto.Gkeystore.GetDatabaseRequest) request,
                            (io.grpc.stub.StreamObserver<gkeystoreproto.Gkeystore.GetDatabaseResponse>) responseObserver,
                            compression,
                            serviceImpl::getDatabase);
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
