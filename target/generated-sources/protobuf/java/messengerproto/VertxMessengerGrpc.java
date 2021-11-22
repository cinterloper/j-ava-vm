package messengerproto;

import static messengerproto.MessengerGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: messenger.proto")
public final class VertxMessengerGrpc {
    private VertxMessengerGrpc() {}

    public static MessengerVertxStub newVertxStub(io.grpc.Channel channel) {
        return new MessengerVertxStub(channel);
    }

    
    public static final class MessengerVertxStub extends io.grpc.stub.AbstractStub<MessengerVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private MessengerGrpc.MessengerStub delegateStub;

        private MessengerVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MessengerGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private MessengerVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MessengerGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected MessengerVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MessengerVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<messengerproto.MessengerOuterClass.NotifyResponse> notify(messengerproto.MessengerOuterClass.NotifyRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::notify);
        }

    }

    
    public static abstract class MessengerVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MessengerVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<messengerproto.MessengerOuterClass.NotifyResponse> notify(messengerproto.MessengerOuterClass.NotifyRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            messengerproto.MessengerGrpc.getNotifyMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            messengerproto.MessengerOuterClass.NotifyRequest,
                                            messengerproto.MessengerOuterClass.NotifyResponse>(
                                            this, METHODID_NOTIFY, compression)))
                    .build();
        }
    }

    private static final int METHODID_NOTIFY = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MessengerVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(MessengerVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_NOTIFY:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (messengerproto.MessengerOuterClass.NotifyRequest) request,
                            (io.grpc.stub.StreamObserver<messengerproto.MessengerOuterClass.NotifyResponse>) responseObserver,
                            compression,
                            serviceImpl::notify);
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
