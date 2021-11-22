package gkeystoreproto;

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
    comments = "Source: gkeystore.proto")
public final class KeystoreGrpc {

  private KeystoreGrpc() {}

  public static final String SERVICE_NAME = "gkeystoreproto.Keystore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gkeystoreproto.Gkeystore.GetDatabaseRequest,
      gkeystoreproto.Gkeystore.GetDatabaseResponse> getGetDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatabase",
      requestType = gkeystoreproto.Gkeystore.GetDatabaseRequest.class,
      responseType = gkeystoreproto.Gkeystore.GetDatabaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gkeystoreproto.Gkeystore.GetDatabaseRequest,
      gkeystoreproto.Gkeystore.GetDatabaseResponse> getGetDatabaseMethod() {
    io.grpc.MethodDescriptor<gkeystoreproto.Gkeystore.GetDatabaseRequest, gkeystoreproto.Gkeystore.GetDatabaseResponse> getGetDatabaseMethod;
    if ((getGetDatabaseMethod = KeystoreGrpc.getGetDatabaseMethod) == null) {
      synchronized (KeystoreGrpc.class) {
        if ((getGetDatabaseMethod = KeystoreGrpc.getGetDatabaseMethod) == null) {
          KeystoreGrpc.getGetDatabaseMethod = getGetDatabaseMethod =
              io.grpc.MethodDescriptor.<gkeystoreproto.Gkeystore.GetDatabaseRequest, gkeystoreproto.Gkeystore.GetDatabaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gkeystoreproto.Gkeystore.GetDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gkeystoreproto.Gkeystore.GetDatabaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeystoreMethodDescriptorSupplier("GetDatabase"))
              .build();
        }
      }
    }
    return getGetDatabaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeystoreStub newStub(io.grpc.Channel channel) {
    return new KeystoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeystoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeystoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeystoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeystoreFutureStub(channel);
  }

  /**
   */
  public static abstract class KeystoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDatabase(gkeystoreproto.Gkeystore.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<gkeystoreproto.Gkeystore.GetDatabaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatabaseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDatabaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gkeystoreproto.Gkeystore.GetDatabaseRequest,
                gkeystoreproto.Gkeystore.GetDatabaseResponse>(
                  this, METHODID_GET_DATABASE)))
          .build();
    }
  }

  /**
   */
  public static final class KeystoreStub extends io.grpc.stub.AbstractStub<KeystoreStub> {
    private KeystoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeystoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeystoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeystoreStub(channel, callOptions);
    }

    /**
     */
    public void getDatabase(gkeystoreproto.Gkeystore.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<gkeystoreproto.Gkeystore.GetDatabaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatabaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeystoreBlockingStub extends io.grpc.stub.AbstractStub<KeystoreBlockingStub> {
    private KeystoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeystoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeystoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeystoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public gkeystoreproto.Gkeystore.GetDatabaseResponse getDatabase(gkeystoreproto.Gkeystore.GetDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatabaseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeystoreFutureStub extends io.grpc.stub.AbstractStub<KeystoreFutureStub> {
    private KeystoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeystoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeystoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeystoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gkeystoreproto.Gkeystore.GetDatabaseResponse> getDatabase(
        gkeystoreproto.Gkeystore.GetDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatabaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATABASE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeystoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeystoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATABASE:
          serviceImpl.getDatabase((gkeystoreproto.Gkeystore.GetDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<gkeystoreproto.Gkeystore.GetDatabaseResponse>) responseObserver);
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

  private static abstract class KeystoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeystoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gkeystoreproto.Gkeystore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Keystore");
    }
  }

  private static final class KeystoreFileDescriptorSupplier
      extends KeystoreBaseDescriptorSupplier {
    KeystoreFileDescriptorSupplier() {}
  }

  private static final class KeystoreMethodDescriptorSupplier
      extends KeystoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeystoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeystoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeystoreFileDescriptorSupplier())
              .addMethod(getGetDatabaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
