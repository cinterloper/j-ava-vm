package rpcdbproto;

import static rpcdbproto.DatabaseGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: rpcdb.proto")
public final class VertxDatabaseGrpc {
    private VertxDatabaseGrpc() {}

    public static DatabaseVertxStub newVertxStub(io.grpc.Channel channel) {
        return new DatabaseVertxStub(channel);
    }

    
    public static final class DatabaseVertxStub extends io.grpc.stub.AbstractStub<DatabaseVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private DatabaseGrpc.DatabaseStub delegateStub;

        private DatabaseVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = DatabaseGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private DatabaseVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = DatabaseGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected DatabaseVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DatabaseVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.HasResponse> has(rpcdbproto.Rpcdb.HasRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::has);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.GetResponse> get(rpcdbproto.Rpcdb.GetRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::get);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.PutResponse> put(rpcdbproto.Rpcdb.PutRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::put);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.DeleteResponse> delete(rpcdbproto.Rpcdb.DeleteRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::delete);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.StatResponse> stat(rpcdbproto.Rpcdb.StatRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::stat);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.CompactResponse> compact(rpcdbproto.Rpcdb.CompactRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::compact);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.CloseResponse> close(rpcdbproto.Rpcdb.CloseRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::close);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.WriteBatchResponse> writeBatch(rpcdbproto.Rpcdb.WriteBatchRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::writeBatch);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> newIteratorWithStartAndPrefix(rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::newIteratorWithStartAndPrefix);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.IteratorNextResponse> iteratorNext(rpcdbproto.Rpcdb.IteratorNextRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::iteratorNext);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.IteratorErrorResponse> iteratorError(rpcdbproto.Rpcdb.IteratorErrorRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::iteratorError);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.IteratorReleaseResponse> iteratorRelease(rpcdbproto.Rpcdb.IteratorReleaseRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::iteratorRelease);
        }

    }

    
    public static abstract class DatabaseVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public DatabaseVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.HasResponse> has(rpcdbproto.Rpcdb.HasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.GetResponse> get(rpcdbproto.Rpcdb.GetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.PutResponse> put(rpcdbproto.Rpcdb.PutRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.DeleteResponse> delete(rpcdbproto.Rpcdb.DeleteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.StatResponse> stat(rpcdbproto.Rpcdb.StatRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.CompactResponse> compact(rpcdbproto.Rpcdb.CompactRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.CloseResponse> close(rpcdbproto.Rpcdb.CloseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.WriteBatchResponse> writeBatch(rpcdbproto.Rpcdb.WriteBatchRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> newIteratorWithStartAndPrefix(rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.IteratorNextResponse> iteratorNext(rpcdbproto.Rpcdb.IteratorNextRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.IteratorErrorResponse> iteratorError(rpcdbproto.Rpcdb.IteratorErrorRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.vertx.core.Future<rpcdbproto.Rpcdb.IteratorReleaseResponse> iteratorRelease(rpcdbproto.Rpcdb.IteratorReleaseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getHasMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.HasRequest,
                                            rpcdbproto.Rpcdb.HasResponse>(
                                            this, METHODID_HAS, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getGetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.GetRequest,
                                            rpcdbproto.Rpcdb.GetResponse>(
                                            this, METHODID_GET, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getPutMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.PutRequest,
                                            rpcdbproto.Rpcdb.PutResponse>(
                                            this, METHODID_PUT, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getDeleteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.DeleteRequest,
                                            rpcdbproto.Rpcdb.DeleteResponse>(
                                            this, METHODID_DELETE, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getStatMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.StatRequest,
                                            rpcdbproto.Rpcdb.StatResponse>(
                                            this, METHODID_STAT, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getCompactMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.CompactRequest,
                                            rpcdbproto.Rpcdb.CompactResponse>(
                                            this, METHODID_COMPACT, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getCloseMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.CloseRequest,
                                            rpcdbproto.Rpcdb.CloseResponse>(
                                            this, METHODID_CLOSE, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getWriteBatchMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.WriteBatchRequest,
                                            rpcdbproto.Rpcdb.WriteBatchResponse>(
                                            this, METHODID_WRITE_BATCH, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getNewIteratorWithStartAndPrefixMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest,
                                            rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse>(
                                            this, METHODID_NEW_ITERATOR_WITH_START_AND_PREFIX, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getIteratorNextMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.IteratorNextRequest,
                                            rpcdbproto.Rpcdb.IteratorNextResponse>(
                                            this, METHODID_ITERATOR_NEXT, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getIteratorErrorMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.IteratorErrorRequest,
                                            rpcdbproto.Rpcdb.IteratorErrorResponse>(
                                            this, METHODID_ITERATOR_ERROR, compression)))
                    .addMethod(
                            rpcdbproto.DatabaseGrpc.getIteratorReleaseMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            rpcdbproto.Rpcdb.IteratorReleaseRequest,
                                            rpcdbproto.Rpcdb.IteratorReleaseResponse>(
                                            this, METHODID_ITERATOR_RELEASE, compression)))
                    .build();
        }
    }

    private static final int METHODID_HAS = 0;
    private static final int METHODID_GET = 1;
    private static final int METHODID_PUT = 2;
    private static final int METHODID_DELETE = 3;
    private static final int METHODID_STAT = 4;
    private static final int METHODID_COMPACT = 5;
    private static final int METHODID_CLOSE = 6;
    private static final int METHODID_WRITE_BATCH = 7;
    private static final int METHODID_NEW_ITERATOR_WITH_START_AND_PREFIX = 8;
    private static final int METHODID_ITERATOR_NEXT = 9;
    private static final int METHODID_ITERATOR_ERROR = 10;
    private static final int METHODID_ITERATOR_RELEASE = 11;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final DatabaseVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(DatabaseVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_HAS:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.HasRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.HasResponse>) responseObserver,
                            compression,
                            serviceImpl::has);
                    break;
                case METHODID_GET:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.GetRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.GetResponse>) responseObserver,
                            compression,
                            serviceImpl::get);
                    break;
                case METHODID_PUT:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.PutRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.PutResponse>) responseObserver,
                            compression,
                            serviceImpl::put);
                    break;
                case METHODID_DELETE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.DeleteRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.DeleteResponse>) responseObserver,
                            compression,
                            serviceImpl::delete);
                    break;
                case METHODID_STAT:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.StatRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.StatResponse>) responseObserver,
                            compression,
                            serviceImpl::stat);
                    break;
                case METHODID_COMPACT:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.CompactRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CompactResponse>) responseObserver,
                            compression,
                            serviceImpl::compact);
                    break;
                case METHODID_CLOSE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.CloseRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CloseResponse>) responseObserver,
                            compression,
                            serviceImpl::close);
                    break;
                case METHODID_WRITE_BATCH:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.WriteBatchRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.WriteBatchResponse>) responseObserver,
                            compression,
                            serviceImpl::writeBatch);
                    break;
                case METHODID_NEW_ITERATOR_WITH_START_AND_PREFIX:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse>) responseObserver,
                            compression,
                            serviceImpl::newIteratorWithStartAndPrefix);
                    break;
                case METHODID_ITERATOR_NEXT:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.IteratorNextRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorNextResponse>) responseObserver,
                            compression,
                            serviceImpl::iteratorNext);
                    break;
                case METHODID_ITERATOR_ERROR:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.IteratorErrorRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorErrorResponse>) responseObserver,
                            compression,
                            serviceImpl::iteratorError);
                    break;
                case METHODID_ITERATOR_RELEASE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (rpcdbproto.Rpcdb.IteratorReleaseRequest) request,
                            (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorReleaseResponse>) responseObserver,
                            compression,
                            serviceImpl::iteratorRelease);
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
