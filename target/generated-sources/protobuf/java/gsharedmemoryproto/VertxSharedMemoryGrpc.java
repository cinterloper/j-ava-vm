package gsharedmemoryproto;

import static gsharedmemoryproto.SharedMemoryGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: gsharedmemory.proto")
public final class VertxSharedMemoryGrpc {
    private VertxSharedMemoryGrpc() {}

    public static SharedMemoryVertxStub newVertxStub(io.grpc.Channel channel) {
        return new SharedMemoryVertxStub(channel);
    }

    
    public static final class SharedMemoryVertxStub extends io.grpc.stub.AbstractStub<SharedMemoryVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private SharedMemoryGrpc.SharedMemoryStub delegateStub;

        private SharedMemoryVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = SharedMemoryGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private SharedMemoryVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = SharedMemoryGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected SharedMemoryVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SharedMemoryVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<gsharedmemoryproto.Gsharedmemory.GetResponse> get(gsharedmemoryproto.Gsharedmemory.GetRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::get);
        }

        
        public io.vertx.core.Future<gsharedmemoryproto.Gsharedmemory.IndexedResponse> indexed(gsharedmemoryproto.Gsharedmemory.IndexedRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::indexed);
        }

        
        public io.vertx.core.Future<gsharedmemoryproto.Gsharedmemory.ApplyResponse> apply(gsharedmemoryproto.Gsharedmemory.ApplyRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::apply);
        }

    }

    
    public static abstract class SharedMemoryVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public SharedMemoryVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<gsharedmemoryproto.Gsharedmemory.GetResponse> get(gsharedmemoryproto.Gsharedmemory.GetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gsharedmemoryproto.Gsharedmemory.IndexedResponse> indexed(gsharedmemoryproto.Gsharedmemory.IndexedRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<gsharedmemoryproto.Gsharedmemory.ApplyResponse> apply(gsharedmemoryproto.Gsharedmemory.ApplyRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            gsharedmemoryproto.SharedMemoryGrpc.getGetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gsharedmemoryproto.Gsharedmemory.GetRequest,
                                            gsharedmemoryproto.Gsharedmemory.GetResponse>(
                                            this, METHODID_GET, compression)))
                    .addMethod(
                            gsharedmemoryproto.SharedMemoryGrpc.getIndexedMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gsharedmemoryproto.Gsharedmemory.IndexedRequest,
                                            gsharedmemoryproto.Gsharedmemory.IndexedResponse>(
                                            this, METHODID_INDEXED, compression)))
                    .addMethod(
                            gsharedmemoryproto.SharedMemoryGrpc.getApplyMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            gsharedmemoryproto.Gsharedmemory.ApplyRequest,
                                            gsharedmemoryproto.Gsharedmemory.ApplyResponse>(
                                            this, METHODID_APPLY, compression)))
                    .build();
        }
    }

    private static final int METHODID_GET = 0;
    private static final int METHODID_INDEXED = 1;
    private static final int METHODID_APPLY = 2;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final SharedMemoryVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(SharedMemoryVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gsharedmemoryproto.Gsharedmemory.GetRequest) request,
                            (io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.GetResponse>) responseObserver,
                            compression,
                            serviceImpl::get);
                    break;
                case METHODID_INDEXED:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gsharedmemoryproto.Gsharedmemory.IndexedRequest) request,
                            (io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.IndexedResponse>) responseObserver,
                            compression,
                            serviceImpl::indexed);
                    break;
                case METHODID_APPLY:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (gsharedmemoryproto.Gsharedmemory.ApplyRequest) request,
                            (io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.ApplyResponse>) responseObserver,
                            compression,
                            serviceImpl::apply);
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
