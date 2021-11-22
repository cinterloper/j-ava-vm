package galiaslookupproto;

import static galiaslookupproto.AliasLookupGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: galiaslookup.proto")
public final class VertxAliasLookupGrpc {
    private VertxAliasLookupGrpc() {}

    public static AliasLookupVertxStub newVertxStub(io.grpc.Channel channel) {
        return new AliasLookupVertxStub(channel);
    }

    
    public static final class AliasLookupVertxStub extends io.grpc.stub.AbstractStub<AliasLookupVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private AliasLookupGrpc.AliasLookupStub delegateStub;

        private AliasLookupVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = AliasLookupGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private AliasLookupVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = AliasLookupGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected AliasLookupVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AliasLookupVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<galiaslookupproto.Galiaslookup.LookupResponse> lookup(galiaslookupproto.Galiaslookup.LookupRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::lookup);
        }

        
        public io.vertx.core.Future<galiaslookupproto.Galiaslookup.PrimaryAliasResponse> primaryAlias(galiaslookupproto.Galiaslookup.PrimaryAliasRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::primaryAlias);
        }

    }

    
    public static abstract class AliasLookupVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public AliasLookupVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<galiaslookupproto.Galiaslookup.LookupResponse> lookup(galiaslookupproto.Galiaslookup.LookupRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<galiaslookupproto.Galiaslookup.PrimaryAliasResponse> primaryAlias(galiaslookupproto.Galiaslookup.PrimaryAliasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            galiaslookupproto.AliasLookupGrpc.getLookupMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            galiaslookupproto.Galiaslookup.LookupRequest,
                                            galiaslookupproto.Galiaslookup.LookupResponse>(
                                            this, METHODID_LOOKUP, compression)))
                    .addMethod(
                            galiaslookupproto.AliasLookupGrpc.getPrimaryAliasMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            galiaslookupproto.Galiaslookup.PrimaryAliasRequest,
                                            galiaslookupproto.Galiaslookup.PrimaryAliasResponse>(
                                            this, METHODID_PRIMARY_ALIAS, compression)))
                    .build();
        }
    }

    private static final int METHODID_LOOKUP = 0;
    private static final int METHODID_PRIMARY_ALIAS = 1;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AliasLookupVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(AliasLookupVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_LOOKUP:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (galiaslookupproto.Galiaslookup.LookupRequest) request,
                            (io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.LookupResponse>) responseObserver,
                            compression,
                            serviceImpl::lookup);
                    break;
                case METHODID_PRIMARY_ALIAS:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (galiaslookupproto.Galiaslookup.PrimaryAliasRequest) request,
                            (io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.PrimaryAliasResponse>) responseObserver,
                            compression,
                            serviceImpl::primaryAlias);
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
