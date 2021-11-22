package gsubnetlookupproto;

import static gsubnetlookupproto.SubnetLookupGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: gsubnetlookup.proto")
public final class VertxSubnetLookupGrpc {
    private VertxSubnetLookupGrpc() {}

    public static SubnetLookupVertxStub newVertxStub(io.grpc.Channel channel) {
        return new SubnetLookupVertxStub(channel);
    }

    
    public static final class SubnetLookupVertxStub extends io.grpc.stub.AbstractStub<SubnetLookupVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private SubnetLookupGrpc.SubnetLookupStub delegateStub;

        private SubnetLookupVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = SubnetLookupGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private SubnetLookupVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = SubnetLookupGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected SubnetLookupVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SubnetLookupVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> subnetID(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::subnetID);
        }

    }

    
    public static abstract class SubnetLookupVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public SubnetLookupVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> subnetID(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            gsubnetlookupproto.SubnetLookupGrpc.getSubnetIDMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest,
                                            gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse>(
                                            this, METHODID_SUBNET_ID, compression)))
                    .build();
        }
    }

    private static final int METHODID_SUBNET_ID = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final SubnetLookupVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(SubnetLookupVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SUBNET_ID:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest) request,
                            (io.grpc.stub.StreamObserver<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse>) responseObserver,
                            compression,
                            serviceImpl::subnetID);
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
