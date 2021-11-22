package gsharedmemoryproto;

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
    comments = "Source: gsharedmemory.proto")
public final class SharedMemoryGrpc {

  private SharedMemoryGrpc() {}

  public static final String SERVICE_NAME = "gsharedmemoryproto.SharedMemory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.GetRequest,
      gsharedmemoryproto.Gsharedmemory.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = gsharedmemoryproto.Gsharedmemory.GetRequest.class,
      responseType = gsharedmemoryproto.Gsharedmemory.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.GetRequest,
      gsharedmemoryproto.Gsharedmemory.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.GetRequest, gsharedmemoryproto.Gsharedmemory.GetResponse> getGetMethod;
    if ((getGetMethod = SharedMemoryGrpc.getGetMethod) == null) {
      synchronized (SharedMemoryGrpc.class) {
        if ((getGetMethod = SharedMemoryGrpc.getGetMethod) == null) {
          SharedMemoryGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<gsharedmemoryproto.Gsharedmemory.GetRequest, gsharedmemoryproto.Gsharedmemory.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsharedmemoryproto.Gsharedmemory.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsharedmemoryproto.Gsharedmemory.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SharedMemoryMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.IndexedRequest,
      gsharedmemoryproto.Gsharedmemory.IndexedResponse> getIndexedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Indexed",
      requestType = gsharedmemoryproto.Gsharedmemory.IndexedRequest.class,
      responseType = gsharedmemoryproto.Gsharedmemory.IndexedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.IndexedRequest,
      gsharedmemoryproto.Gsharedmemory.IndexedResponse> getIndexedMethod() {
    io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.IndexedRequest, gsharedmemoryproto.Gsharedmemory.IndexedResponse> getIndexedMethod;
    if ((getIndexedMethod = SharedMemoryGrpc.getIndexedMethod) == null) {
      synchronized (SharedMemoryGrpc.class) {
        if ((getIndexedMethod = SharedMemoryGrpc.getIndexedMethod) == null) {
          SharedMemoryGrpc.getIndexedMethod = getIndexedMethod =
              io.grpc.MethodDescriptor.<gsharedmemoryproto.Gsharedmemory.IndexedRequest, gsharedmemoryproto.Gsharedmemory.IndexedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Indexed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsharedmemoryproto.Gsharedmemory.IndexedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsharedmemoryproto.Gsharedmemory.IndexedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SharedMemoryMethodDescriptorSupplier("Indexed"))
              .build();
        }
      }
    }
    return getIndexedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.ApplyRequest,
      gsharedmemoryproto.Gsharedmemory.ApplyResponse> getApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Apply",
      requestType = gsharedmemoryproto.Gsharedmemory.ApplyRequest.class,
      responseType = gsharedmemoryproto.Gsharedmemory.ApplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.ApplyRequest,
      gsharedmemoryproto.Gsharedmemory.ApplyResponse> getApplyMethod() {
    io.grpc.MethodDescriptor<gsharedmemoryproto.Gsharedmemory.ApplyRequest, gsharedmemoryproto.Gsharedmemory.ApplyResponse> getApplyMethod;
    if ((getApplyMethod = SharedMemoryGrpc.getApplyMethod) == null) {
      synchronized (SharedMemoryGrpc.class) {
        if ((getApplyMethod = SharedMemoryGrpc.getApplyMethod) == null) {
          SharedMemoryGrpc.getApplyMethod = getApplyMethod =
              io.grpc.MethodDescriptor.<gsharedmemoryproto.Gsharedmemory.ApplyRequest, gsharedmemoryproto.Gsharedmemory.ApplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Apply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsharedmemoryproto.Gsharedmemory.ApplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsharedmemoryproto.Gsharedmemory.ApplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SharedMemoryMethodDescriptorSupplier("Apply"))
              .build();
        }
      }
    }
    return getApplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SharedMemoryStub newStub(io.grpc.Channel channel) {
    return new SharedMemoryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SharedMemoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SharedMemoryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SharedMemoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SharedMemoryFutureStub(channel);
  }

  /**
   */
  public static abstract class SharedMemoryImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(gsharedmemoryproto.Gsharedmemory.GetRequest request,
        io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void indexed(gsharedmemoryproto.Gsharedmemory.IndexedRequest request,
        io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.IndexedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIndexedMethod(), responseObserver);
    }

    /**
     */
    public void apply(gsharedmemoryproto.Gsharedmemory.ApplyRequest request,
        io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.ApplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gsharedmemoryproto.Gsharedmemory.GetRequest,
                gsharedmemoryproto.Gsharedmemory.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getIndexedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gsharedmemoryproto.Gsharedmemory.IndexedRequest,
                gsharedmemoryproto.Gsharedmemory.IndexedResponse>(
                  this, METHODID_INDEXED)))
          .addMethod(
            getApplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gsharedmemoryproto.Gsharedmemory.ApplyRequest,
                gsharedmemoryproto.Gsharedmemory.ApplyResponse>(
                  this, METHODID_APPLY)))
          .build();
    }
  }

  /**
   */
  public static final class SharedMemoryStub extends io.grpc.stub.AbstractStub<SharedMemoryStub> {
    private SharedMemoryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SharedMemoryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedMemoryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SharedMemoryStub(channel, callOptions);
    }

    /**
     */
    public void get(gsharedmemoryproto.Gsharedmemory.GetRequest request,
        io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void indexed(gsharedmemoryproto.Gsharedmemory.IndexedRequest request,
        io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.IndexedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIndexedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void apply(gsharedmemoryproto.Gsharedmemory.ApplyRequest request,
        io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.ApplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SharedMemoryBlockingStub extends io.grpc.stub.AbstractStub<SharedMemoryBlockingStub> {
    private SharedMemoryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SharedMemoryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedMemoryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SharedMemoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public gsharedmemoryproto.Gsharedmemory.GetResponse get(gsharedmemoryproto.Gsharedmemory.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public gsharedmemoryproto.Gsharedmemory.IndexedResponse indexed(gsharedmemoryproto.Gsharedmemory.IndexedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIndexedMethod(), getCallOptions(), request);
    }

    /**
     */
    public gsharedmemoryproto.Gsharedmemory.ApplyResponse apply(gsharedmemoryproto.Gsharedmemory.ApplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getApplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SharedMemoryFutureStub extends io.grpc.stub.AbstractStub<SharedMemoryFutureStub> {
    private SharedMemoryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SharedMemoryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedMemoryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SharedMemoryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gsharedmemoryproto.Gsharedmemory.GetResponse> get(
        gsharedmemoryproto.Gsharedmemory.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gsharedmemoryproto.Gsharedmemory.IndexedResponse> indexed(
        gsharedmemoryproto.Gsharedmemory.IndexedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIndexedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gsharedmemoryproto.Gsharedmemory.ApplyResponse> apply(
        gsharedmemoryproto.Gsharedmemory.ApplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyMethod(), getCallOptions()), request);
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
    private final SharedMemoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SharedMemoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((gsharedmemoryproto.Gsharedmemory.GetRequest) request,
              (io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.GetResponse>) responseObserver);
          break;
        case METHODID_INDEXED:
          serviceImpl.indexed((gsharedmemoryproto.Gsharedmemory.IndexedRequest) request,
              (io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.IndexedResponse>) responseObserver);
          break;
        case METHODID_APPLY:
          serviceImpl.apply((gsharedmemoryproto.Gsharedmemory.ApplyRequest) request,
              (io.grpc.stub.StreamObserver<gsharedmemoryproto.Gsharedmemory.ApplyResponse>) responseObserver);
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

  private static abstract class SharedMemoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SharedMemoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gsharedmemoryproto.Gsharedmemory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SharedMemory");
    }
  }

  private static final class SharedMemoryFileDescriptorSupplier
      extends SharedMemoryBaseDescriptorSupplier {
    SharedMemoryFileDescriptorSupplier() {}
  }

  private static final class SharedMemoryMethodDescriptorSupplier
      extends SharedMemoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SharedMemoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (SharedMemoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SharedMemoryFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getIndexedMethod())
              .addMethod(getApplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
