package rpcdbproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: rpcdb.proto")
public final class DatabaseGrpc {

  private DatabaseGrpc() {}

  public static final String SERVICE_NAME = "rpcdbproto.Database";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.HasRequest,
      rpcdbproto.Rpcdb.HasResponse> getHasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Has",
      requestType = rpcdbproto.Rpcdb.HasRequest.class,
      responseType = rpcdbproto.Rpcdb.HasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.HasRequest,
      rpcdbproto.Rpcdb.HasResponse> getHasMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.HasRequest, rpcdbproto.Rpcdb.HasResponse> getHasMethod;
    if ((getHasMethod = DatabaseGrpc.getHasMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getHasMethod = DatabaseGrpc.getHasMethod) == null) {
          DatabaseGrpc.getHasMethod = getHasMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.HasRequest, rpcdbproto.Rpcdb.HasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Has"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.HasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.HasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Has"))
              .build();
        }
      }
    }
    return getHasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.GetRequest,
      rpcdbproto.Rpcdb.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = rpcdbproto.Rpcdb.GetRequest.class,
      responseType = rpcdbproto.Rpcdb.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.GetRequest,
      rpcdbproto.Rpcdb.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.GetRequest, rpcdbproto.Rpcdb.GetResponse> getGetMethod;
    if ((getGetMethod = DatabaseGrpc.getGetMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getGetMethod = DatabaseGrpc.getGetMethod) == null) {
          DatabaseGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.GetRequest, rpcdbproto.Rpcdb.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.PutRequest,
      rpcdbproto.Rpcdb.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = rpcdbproto.Rpcdb.PutRequest.class,
      responseType = rpcdbproto.Rpcdb.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.PutRequest,
      rpcdbproto.Rpcdb.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.PutRequest, rpcdbproto.Rpcdb.PutResponse> getPutMethod;
    if ((getPutMethod = DatabaseGrpc.getPutMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getPutMethod = DatabaseGrpc.getPutMethod) == null) {
          DatabaseGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.PutRequest, rpcdbproto.Rpcdb.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.DeleteRequest,
      rpcdbproto.Rpcdb.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = rpcdbproto.Rpcdb.DeleteRequest.class,
      responseType = rpcdbproto.Rpcdb.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.DeleteRequest,
      rpcdbproto.Rpcdb.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.DeleteRequest, rpcdbproto.Rpcdb.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = DatabaseGrpc.getDeleteMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getDeleteMethod = DatabaseGrpc.getDeleteMethod) == null) {
          DatabaseGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.DeleteRequest, rpcdbproto.Rpcdb.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.StatRequest,
      rpcdbproto.Rpcdb.StatResponse> getStatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stat",
      requestType = rpcdbproto.Rpcdb.StatRequest.class,
      responseType = rpcdbproto.Rpcdb.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.StatRequest,
      rpcdbproto.Rpcdb.StatResponse> getStatMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.StatRequest, rpcdbproto.Rpcdb.StatResponse> getStatMethod;
    if ((getStatMethod = DatabaseGrpc.getStatMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getStatMethod = DatabaseGrpc.getStatMethod) == null) {
          DatabaseGrpc.getStatMethod = getStatMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.StatRequest, rpcdbproto.Rpcdb.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.StatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Stat"))
              .build();
        }
      }
    }
    return getStatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.CompactRequest,
      rpcdbproto.Rpcdb.CompactResponse> getCompactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compact",
      requestType = rpcdbproto.Rpcdb.CompactRequest.class,
      responseType = rpcdbproto.Rpcdb.CompactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.CompactRequest,
      rpcdbproto.Rpcdb.CompactResponse> getCompactMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.CompactRequest, rpcdbproto.Rpcdb.CompactResponse> getCompactMethod;
    if ((getCompactMethod = DatabaseGrpc.getCompactMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getCompactMethod = DatabaseGrpc.getCompactMethod) == null) {
          DatabaseGrpc.getCompactMethod = getCompactMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.CompactRequest, rpcdbproto.Rpcdb.CompactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.CompactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.CompactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Compact"))
              .build();
        }
      }
    }
    return getCompactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.CloseRequest,
      rpcdbproto.Rpcdb.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = rpcdbproto.Rpcdb.CloseRequest.class,
      responseType = rpcdbproto.Rpcdb.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.CloseRequest,
      rpcdbproto.Rpcdb.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.CloseRequest, rpcdbproto.Rpcdb.CloseResponse> getCloseMethod;
    if ((getCloseMethod = DatabaseGrpc.getCloseMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getCloseMethod = DatabaseGrpc.getCloseMethod) == null) {
          DatabaseGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.CloseRequest, rpcdbproto.Rpcdb.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.WriteBatchRequest,
      rpcdbproto.Rpcdb.WriteBatchResponse> getWriteBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteBatch",
      requestType = rpcdbproto.Rpcdb.WriteBatchRequest.class,
      responseType = rpcdbproto.Rpcdb.WriteBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.WriteBatchRequest,
      rpcdbproto.Rpcdb.WriteBatchResponse> getWriteBatchMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.WriteBatchRequest, rpcdbproto.Rpcdb.WriteBatchResponse> getWriteBatchMethod;
    if ((getWriteBatchMethod = DatabaseGrpc.getWriteBatchMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getWriteBatchMethod = DatabaseGrpc.getWriteBatchMethod) == null) {
          DatabaseGrpc.getWriteBatchMethod = getWriteBatchMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.WriteBatchRequest, rpcdbproto.Rpcdb.WriteBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.WriteBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.WriteBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("WriteBatch"))
              .build();
        }
      }
    }
    return getWriteBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest,
      rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> getNewIteratorWithStartAndPrefixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewIteratorWithStartAndPrefix",
      requestType = rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest.class,
      responseType = rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest,
      rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> getNewIteratorWithStartAndPrefixMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest, rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> getNewIteratorWithStartAndPrefixMethod;
    if ((getNewIteratorWithStartAndPrefixMethod = DatabaseGrpc.getNewIteratorWithStartAndPrefixMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getNewIteratorWithStartAndPrefixMethod = DatabaseGrpc.getNewIteratorWithStartAndPrefixMethod) == null) {
          DatabaseGrpc.getNewIteratorWithStartAndPrefixMethod = getNewIteratorWithStartAndPrefixMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest, rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewIteratorWithStartAndPrefix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("NewIteratorWithStartAndPrefix"))
              .build();
        }
      }
    }
    return getNewIteratorWithStartAndPrefixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorNextRequest,
      rpcdbproto.Rpcdb.IteratorNextResponse> getIteratorNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IteratorNext",
      requestType = rpcdbproto.Rpcdb.IteratorNextRequest.class,
      responseType = rpcdbproto.Rpcdb.IteratorNextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorNextRequest,
      rpcdbproto.Rpcdb.IteratorNextResponse> getIteratorNextMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorNextRequest, rpcdbproto.Rpcdb.IteratorNextResponse> getIteratorNextMethod;
    if ((getIteratorNextMethod = DatabaseGrpc.getIteratorNextMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getIteratorNextMethod = DatabaseGrpc.getIteratorNextMethod) == null) {
          DatabaseGrpc.getIteratorNextMethod = getIteratorNextMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.IteratorNextRequest, rpcdbproto.Rpcdb.IteratorNextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IteratorNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.IteratorNextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.IteratorNextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("IteratorNext"))
              .build();
        }
      }
    }
    return getIteratorNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorErrorRequest,
      rpcdbproto.Rpcdb.IteratorErrorResponse> getIteratorErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IteratorError",
      requestType = rpcdbproto.Rpcdb.IteratorErrorRequest.class,
      responseType = rpcdbproto.Rpcdb.IteratorErrorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorErrorRequest,
      rpcdbproto.Rpcdb.IteratorErrorResponse> getIteratorErrorMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorErrorRequest, rpcdbproto.Rpcdb.IteratorErrorResponse> getIteratorErrorMethod;
    if ((getIteratorErrorMethod = DatabaseGrpc.getIteratorErrorMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getIteratorErrorMethod = DatabaseGrpc.getIteratorErrorMethod) == null) {
          DatabaseGrpc.getIteratorErrorMethod = getIteratorErrorMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.IteratorErrorRequest, rpcdbproto.Rpcdb.IteratorErrorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IteratorError"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.IteratorErrorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.IteratorErrorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("IteratorError"))
              .build();
        }
      }
    }
    return getIteratorErrorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorReleaseRequest,
      rpcdbproto.Rpcdb.IteratorReleaseResponse> getIteratorReleaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IteratorRelease",
      requestType = rpcdbproto.Rpcdb.IteratorReleaseRequest.class,
      responseType = rpcdbproto.Rpcdb.IteratorReleaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorReleaseRequest,
      rpcdbproto.Rpcdb.IteratorReleaseResponse> getIteratorReleaseMethod() {
    io.grpc.MethodDescriptor<rpcdbproto.Rpcdb.IteratorReleaseRequest, rpcdbproto.Rpcdb.IteratorReleaseResponse> getIteratorReleaseMethod;
    if ((getIteratorReleaseMethod = DatabaseGrpc.getIteratorReleaseMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getIteratorReleaseMethod = DatabaseGrpc.getIteratorReleaseMethod) == null) {
          DatabaseGrpc.getIteratorReleaseMethod = getIteratorReleaseMethod =
              io.grpc.MethodDescriptor.<rpcdbproto.Rpcdb.IteratorReleaseRequest, rpcdbproto.Rpcdb.IteratorReleaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IteratorRelease"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.IteratorReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rpcdbproto.Rpcdb.IteratorReleaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("IteratorRelease"))
              .build();
        }
      }
    }
    return getIteratorReleaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseStub newStub(io.grpc.Channel channel) {
    return new DatabaseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatabaseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatabaseFutureStub(channel);
  }

  /**
   */
  public static abstract class DatabaseImplBase implements io.grpc.BindableService {

    /**
     */
    public void has(rpcdbproto.Rpcdb.HasRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.HasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasMethod(), responseObserver);
    }

    /**
     */
    public void get(rpcdbproto.Rpcdb.GetRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void put(rpcdbproto.Rpcdb.PutRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void delete(rpcdbproto.Rpcdb.DeleteRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void stat(rpcdbproto.Rpcdb.StatRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.StatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatMethod(), responseObserver);
    }

    /**
     */
    public void compact(rpcdbproto.Rpcdb.CompactRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CompactResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompactMethod(), responseObserver);
    }

    /**
     */
    public void close(rpcdbproto.Rpcdb.CloseRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     */
    public void writeBatch(rpcdbproto.Rpcdb.WriteBatchRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.WriteBatchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteBatchMethod(), responseObserver);
    }

    /**
     */
    public void newIteratorWithStartAndPrefix(rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewIteratorWithStartAndPrefixMethod(), responseObserver);
    }

    /**
     */
    public void iteratorNext(rpcdbproto.Rpcdb.IteratorNextRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorNextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIteratorNextMethod(), responseObserver);
    }

    /**
     */
    public void iteratorError(rpcdbproto.Rpcdb.IteratorErrorRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorErrorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIteratorErrorMethod(), responseObserver);
    }

    /**
     */
    public void iteratorRelease(rpcdbproto.Rpcdb.IteratorReleaseRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorReleaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIteratorReleaseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.HasRequest,
                rpcdbproto.Rpcdb.HasResponse>(
                  this, METHODID_HAS)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.GetRequest,
                rpcdbproto.Rpcdb.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.PutRequest,
                rpcdbproto.Rpcdb.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.DeleteRequest,
                rpcdbproto.Rpcdb.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.StatRequest,
                rpcdbproto.Rpcdb.StatResponse>(
                  this, METHODID_STAT)))
          .addMethod(
            getCompactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.CompactRequest,
                rpcdbproto.Rpcdb.CompactResponse>(
                  this, METHODID_COMPACT)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.CloseRequest,
                rpcdbproto.Rpcdb.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getWriteBatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.WriteBatchRequest,
                rpcdbproto.Rpcdb.WriteBatchResponse>(
                  this, METHODID_WRITE_BATCH)))
          .addMethod(
            getNewIteratorWithStartAndPrefixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest,
                rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse>(
                  this, METHODID_NEW_ITERATOR_WITH_START_AND_PREFIX)))
          .addMethod(
            getIteratorNextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.IteratorNextRequest,
                rpcdbproto.Rpcdb.IteratorNextResponse>(
                  this, METHODID_ITERATOR_NEXT)))
          .addMethod(
            getIteratorErrorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.IteratorErrorRequest,
                rpcdbproto.Rpcdb.IteratorErrorResponse>(
                  this, METHODID_ITERATOR_ERROR)))
          .addMethod(
            getIteratorReleaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rpcdbproto.Rpcdb.IteratorReleaseRequest,
                rpcdbproto.Rpcdb.IteratorReleaseResponse>(
                  this, METHODID_ITERATOR_RELEASE)))
          .build();
    }
  }

  /**
   */
  public static final class DatabaseStub extends io.grpc.stub.AbstractStub<DatabaseStub> {
    private DatabaseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseStub(channel, callOptions);
    }

    /**
     */
    public void has(rpcdbproto.Rpcdb.HasRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.HasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(rpcdbproto.Rpcdb.GetRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void put(rpcdbproto.Rpcdb.PutRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(rpcdbproto.Rpcdb.DeleteRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stat(rpcdbproto.Rpcdb.StatRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.StatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void compact(rpcdbproto.Rpcdb.CompactRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CompactResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void close(rpcdbproto.Rpcdb.CloseRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void writeBatch(rpcdbproto.Rpcdb.WriteBatchRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.WriteBatchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newIteratorWithStartAndPrefix(rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewIteratorWithStartAndPrefixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iteratorNext(rpcdbproto.Rpcdb.IteratorNextRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorNextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIteratorNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iteratorError(rpcdbproto.Rpcdb.IteratorErrorRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorErrorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIteratorErrorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iteratorRelease(rpcdbproto.Rpcdb.IteratorReleaseRequest request,
        io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorReleaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIteratorReleaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatabaseBlockingStub extends io.grpc.stub.AbstractStub<DatabaseBlockingStub> {
    private DatabaseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public rpcdbproto.Rpcdb.HasResponse has(rpcdbproto.Rpcdb.HasRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.GetResponse get(rpcdbproto.Rpcdb.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.PutResponse put(rpcdbproto.Rpcdb.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.DeleteResponse delete(rpcdbproto.Rpcdb.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.StatResponse stat(rpcdbproto.Rpcdb.StatRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.CompactResponse compact(rpcdbproto.Rpcdb.CompactRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompactMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.CloseResponse close(rpcdbproto.Rpcdb.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.WriteBatchResponse writeBatch(rpcdbproto.Rpcdb.WriteBatchRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse newIteratorWithStartAndPrefix(rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewIteratorWithStartAndPrefixMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.IteratorNextResponse iteratorNext(rpcdbproto.Rpcdb.IteratorNextRequest request) {
      return blockingUnaryCall(
          getChannel(), getIteratorNextMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.IteratorErrorResponse iteratorError(rpcdbproto.Rpcdb.IteratorErrorRequest request) {
      return blockingUnaryCall(
          getChannel(), getIteratorErrorMethod(), getCallOptions(), request);
    }

    /**
     */
    public rpcdbproto.Rpcdb.IteratorReleaseResponse iteratorRelease(rpcdbproto.Rpcdb.IteratorReleaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getIteratorReleaseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatabaseFutureStub extends io.grpc.stub.AbstractStub<DatabaseFutureStub> {
    private DatabaseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.HasResponse> has(
        rpcdbproto.Rpcdb.HasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.GetResponse> get(
        rpcdbproto.Rpcdb.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.PutResponse> put(
        rpcdbproto.Rpcdb.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.DeleteResponse> delete(
        rpcdbproto.Rpcdb.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.StatResponse> stat(
        rpcdbproto.Rpcdb.StatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.CompactResponse> compact(
        rpcdbproto.Rpcdb.CompactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.CloseResponse> close(
        rpcdbproto.Rpcdb.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.WriteBatchResponse> writeBatch(
        rpcdbproto.Rpcdb.WriteBatchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse> newIteratorWithStartAndPrefix(
        rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewIteratorWithStartAndPrefixMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.IteratorNextResponse> iteratorNext(
        rpcdbproto.Rpcdb.IteratorNextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIteratorNextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.IteratorErrorResponse> iteratorError(
        rpcdbproto.Rpcdb.IteratorErrorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIteratorErrorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rpcdbproto.Rpcdb.IteratorReleaseResponse> iteratorRelease(
        rpcdbproto.Rpcdb.IteratorReleaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIteratorReleaseMethod(), getCallOptions()), request);
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
    private final DatabaseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatabaseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HAS:
          serviceImpl.has((rpcdbproto.Rpcdb.HasRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.HasResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((rpcdbproto.Rpcdb.GetRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.GetResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((rpcdbproto.Rpcdb.PutRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.PutResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((rpcdbproto.Rpcdb.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.DeleteResponse>) responseObserver);
          break;
        case METHODID_STAT:
          serviceImpl.stat((rpcdbproto.Rpcdb.StatRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.StatResponse>) responseObserver);
          break;
        case METHODID_COMPACT:
          serviceImpl.compact((rpcdbproto.Rpcdb.CompactRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CompactResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((rpcdbproto.Rpcdb.CloseRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.CloseResponse>) responseObserver);
          break;
        case METHODID_WRITE_BATCH:
          serviceImpl.writeBatch((rpcdbproto.Rpcdb.WriteBatchRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.WriteBatchResponse>) responseObserver);
          break;
        case METHODID_NEW_ITERATOR_WITH_START_AND_PREFIX:
          serviceImpl.newIteratorWithStartAndPrefix((rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.NewIteratorWithStartAndPrefixResponse>) responseObserver);
          break;
        case METHODID_ITERATOR_NEXT:
          serviceImpl.iteratorNext((rpcdbproto.Rpcdb.IteratorNextRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorNextResponse>) responseObserver);
          break;
        case METHODID_ITERATOR_ERROR:
          serviceImpl.iteratorError((rpcdbproto.Rpcdb.IteratorErrorRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorErrorResponse>) responseObserver);
          break;
        case METHODID_ITERATOR_RELEASE:
          serviceImpl.iteratorRelease((rpcdbproto.Rpcdb.IteratorReleaseRequest) request,
              (io.grpc.stub.StreamObserver<rpcdbproto.Rpcdb.IteratorReleaseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DatabaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatabaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rpcdbproto.Rpcdb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Database");
    }
  }

  private static final class DatabaseFileDescriptorSupplier
      extends DatabaseBaseDescriptorSupplier {
    DatabaseFileDescriptorSupplier() {}
  }

  private static final class DatabaseMethodDescriptorSupplier
      extends DatabaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatabaseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DatabaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseFileDescriptorSupplier())
              .addMethod(getHasMethod())
              .addMethod(getGetMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getStatMethod())
              .addMethod(getCompactMethod())
              .addMethod(getCloseMethod())
              .addMethod(getWriteBatchMethod())
              .addMethod(getNewIteratorWithStartAndPrefixMethod())
              .addMethod(getIteratorNextMethod())
              .addMethod(getIteratorErrorMethod())
              .addMethod(getIteratorReleaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
