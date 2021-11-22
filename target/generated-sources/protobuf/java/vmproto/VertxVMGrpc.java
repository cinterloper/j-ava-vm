package vmproto;

import static vmproto.VMGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: vm.proto")
public final class VertxVMGrpc {
    private VertxVMGrpc() {}

    public static VMVertxStub newVertxStub(io.grpc.Channel channel) {
        return new VMVertxStub(channel);
    }

    
    public static final class VMVertxStub extends io.grpc.stub.AbstractStub<VMVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private VMGrpc.VMStub delegateStub;

        private VMVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = VMGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private VMVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = VMGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected VMVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new VMVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<vmproto.Vm.InitializeResponse> initialize(vmproto.Vm.InitializeRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::initialize);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BootstrappingResponse> bootstrapping(vmproto.Vm.BootstrappingRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::bootstrapping);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BootstrappedResponse> bootstrapped(vmproto.Vm.BootstrappedRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::bootstrapped);
        }

        
        public io.vertx.core.Future<vmproto.Vm.ShutdownResponse> shutdown(vmproto.Vm.ShutdownRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::shutdown);
        }

        
        public io.vertx.core.Future<vmproto.Vm.CreateHandlersResponse> createHandlers(vmproto.Vm.CreateHandlersRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::createHandlers);
        }

        
        public io.vertx.core.Future<vmproto.Vm.CreateStaticHandlersResponse> createStaticHandlers(vmproto.Vm.CreateStaticHandlersRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::createStaticHandlers);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BuildBlockResponse> buildBlock(vmproto.Vm.BuildBlockRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::buildBlock);
        }

        
        public io.vertx.core.Future<vmproto.Vm.ParseBlockResponse> parseBlock(vmproto.Vm.ParseBlockRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::parseBlock);
        }

        
        public io.vertx.core.Future<vmproto.Vm.GetBlockResponse> getBlock(vmproto.Vm.GetBlockRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::getBlock);
        }

        
        public io.vertx.core.Future<vmproto.Vm.SetPreferenceResponse> setPreference(vmproto.Vm.SetPreferenceRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::setPreference);
        }

        
        public io.vertx.core.Future<vmproto.Vm.HealthResponse> health(vmproto.Vm.HealthRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::health);
        }

        
        public io.vertx.core.Future<vmproto.Vm.VersionResponse> version(vmproto.Vm.VersionRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::version);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BlockVerifyResponse> blockVerify(vmproto.Vm.BlockVerifyRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::blockVerify);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BlockAcceptResponse> blockAccept(vmproto.Vm.BlockAcceptRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::blockAccept);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BlockRejectResponse> blockReject(vmproto.Vm.BlockRejectRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::blockReject);
        }

    }

    
    public static abstract class VMVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public VMVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<vmproto.Vm.InitializeResponse> initialize(vmproto.Vm.InitializeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BootstrappingResponse> bootstrapping(vmproto.Vm.BootstrappingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BootstrappedResponse> bootstrapped(vmproto.Vm.BootstrappedRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.ShutdownResponse> shutdown(vmproto.Vm.ShutdownRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.CreateHandlersResponse> createHandlers(vmproto.Vm.CreateHandlersRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.CreateStaticHandlersResponse> createStaticHandlers(vmproto.Vm.CreateStaticHandlersRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BuildBlockResponse> buildBlock(vmproto.Vm.BuildBlockRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.ParseBlockResponse> parseBlock(vmproto.Vm.ParseBlockRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.GetBlockResponse> getBlock(vmproto.Vm.GetBlockRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.SetPreferenceResponse> setPreference(vmproto.Vm.SetPreferenceRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.HealthResponse> health(vmproto.Vm.HealthRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.VersionResponse> version(vmproto.Vm.VersionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BlockVerifyResponse> blockVerify(vmproto.Vm.BlockVerifyRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BlockAcceptResponse> blockAccept(vmproto.Vm.BlockAcceptRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<vmproto.Vm.BlockRejectResponse> blockReject(vmproto.Vm.BlockRejectRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            vmproto.VMGrpc.getInitializeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.InitializeRequest,
                                            vmproto.Vm.InitializeResponse>(
                                            this, METHODID_INITIALIZE, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getBootstrappingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.BootstrappingRequest,
                                            vmproto.Vm.BootstrappingResponse>(
                                            this, METHODID_BOOTSTRAPPING, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getBootstrappedMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.BootstrappedRequest,
                                            vmproto.Vm.BootstrappedResponse>(
                                            this, METHODID_BOOTSTRAPPED, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getShutdownMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.ShutdownRequest,
                                            vmproto.Vm.ShutdownResponse>(
                                            this, METHODID_SHUTDOWN, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getCreateHandlersMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.CreateHandlersRequest,
                                            vmproto.Vm.CreateHandlersResponse>(
                                            this, METHODID_CREATE_HANDLERS, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getCreateStaticHandlersMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.CreateStaticHandlersRequest,
                                            vmproto.Vm.CreateStaticHandlersResponse>(
                                            this, METHODID_CREATE_STATIC_HANDLERS, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getBuildBlockMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.BuildBlockRequest,
                                            vmproto.Vm.BuildBlockResponse>(
                                            this, METHODID_BUILD_BLOCK, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getParseBlockMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.ParseBlockRequest,
                                            vmproto.Vm.ParseBlockResponse>(
                                            this, METHODID_PARSE_BLOCK, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getGetBlockMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.GetBlockRequest,
                                            vmproto.Vm.GetBlockResponse>(
                                            this, METHODID_GET_BLOCK, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getSetPreferenceMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.SetPreferenceRequest,
                                            vmproto.Vm.SetPreferenceResponse>(
                                            this, METHODID_SET_PREFERENCE, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getHealthMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.HealthRequest,
                                            vmproto.Vm.HealthResponse>(
                                            this, METHODID_HEALTH, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getVersionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.VersionRequest,
                                            vmproto.Vm.VersionResponse>(
                                            this, METHODID_VERSION, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getBlockVerifyMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.BlockVerifyRequest,
                                            vmproto.Vm.BlockVerifyResponse>(
                                            this, METHODID_BLOCK_VERIFY, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getBlockAcceptMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.BlockAcceptRequest,
                                            vmproto.Vm.BlockAcceptResponse>(
                                            this, METHODID_BLOCK_ACCEPT, compression)))
                    .addMethod(
                            vmproto.VMGrpc.getBlockRejectMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vmproto.Vm.BlockRejectRequest,
                                            vmproto.Vm.BlockRejectResponse>(
                                            this, METHODID_BLOCK_REJECT, compression)))
                    .build();
        }
    }

    private static final int METHODID_INITIALIZE = 0;
    private static final int METHODID_BOOTSTRAPPING = 1;
    private static final int METHODID_BOOTSTRAPPED = 2;
    private static final int METHODID_SHUTDOWN = 3;
    private static final int METHODID_CREATE_HANDLERS = 4;
    private static final int METHODID_CREATE_STATIC_HANDLERS = 5;
    private static final int METHODID_BUILD_BLOCK = 6;
    private static final int METHODID_PARSE_BLOCK = 7;
    private static final int METHODID_GET_BLOCK = 8;
    private static final int METHODID_SET_PREFERENCE = 9;
    private static final int METHODID_HEALTH = 10;
    private static final int METHODID_VERSION = 11;
    private static final int METHODID_BLOCK_VERIFY = 12;
    private static final int METHODID_BLOCK_ACCEPT = 13;
    private static final int METHODID_BLOCK_REJECT = 14;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final VMVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(VMVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_INITIALIZE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.InitializeRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.InitializeResponse>) responseObserver,
                            compression,
                            serviceImpl::initialize);
                    break;
                case METHODID_BOOTSTRAPPING:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.BootstrappingRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappingResponse>) responseObserver,
                            compression,
                            serviceImpl::bootstrapping);
                    break;
                case METHODID_BOOTSTRAPPED:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.BootstrappedRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappedResponse>) responseObserver,
                            compression,
                            serviceImpl::bootstrapped);
                    break;
                case METHODID_SHUTDOWN:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.ShutdownRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.ShutdownResponse>) responseObserver,
                            compression,
                            serviceImpl::shutdown);
                    break;
                case METHODID_CREATE_HANDLERS:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.CreateHandlersRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.CreateHandlersResponse>) responseObserver,
                            compression,
                            serviceImpl::createHandlers);
                    break;
                case METHODID_CREATE_STATIC_HANDLERS:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.CreateStaticHandlersRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.CreateStaticHandlersResponse>) responseObserver,
                            compression,
                            serviceImpl::createStaticHandlers);
                    break;
                case METHODID_BUILD_BLOCK:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.BuildBlockRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.BuildBlockResponse>) responseObserver,
                            compression,
                            serviceImpl::buildBlock);
                    break;
                case METHODID_PARSE_BLOCK:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.ParseBlockRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.ParseBlockResponse>) responseObserver,
                            compression,
                            serviceImpl::parseBlock);
                    break;
                case METHODID_GET_BLOCK:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.GetBlockRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.GetBlockResponse>) responseObserver,
                            compression,
                            serviceImpl::getBlock);
                    break;
                case METHODID_SET_PREFERENCE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.SetPreferenceRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.SetPreferenceResponse>) responseObserver,
                            compression,
                            serviceImpl::setPreference);
                    break;
                case METHODID_HEALTH:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.HealthRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.HealthResponse>) responseObserver,
                            compression,
                            serviceImpl::health);
                    break;
                case METHODID_VERSION:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.VersionRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.VersionResponse>) responseObserver,
                            compression,
                            serviceImpl::version);
                    break;
                case METHODID_BLOCK_VERIFY:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.BlockVerifyRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.BlockVerifyResponse>) responseObserver,
                            compression,
                            serviceImpl::blockVerify);
                    break;
                case METHODID_BLOCK_ACCEPT:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.BlockAcceptRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.BlockAcceptResponse>) responseObserver,
                            compression,
                            serviceImpl::blockAccept);
                    break;
                case METHODID_BLOCK_REJECT:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vmproto.Vm.BlockRejectRequest) request,
                            (io.grpc.stub.StreamObserver<vmproto.Vm.BlockRejectResponse>) responseObserver,
                            compression,
                            serviceImpl::blockReject);
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
