package messengerproto;

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
    comments = "Source: messenger.proto")
public final class MessengerGrpc {

  private MessengerGrpc() {}

  public static final String SERVICE_NAME = "messengerproto.Messenger";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<messengerproto.MessengerOuterClass.NotifyRequest,
      messengerproto.MessengerOuterClass.NotifyResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notify",
      requestType = messengerproto.MessengerOuterClass.NotifyRequest.class,
      responseType = messengerproto.MessengerOuterClass.NotifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<messengerproto.MessengerOuterClass.NotifyRequest,
      messengerproto.MessengerOuterClass.NotifyResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<messengerproto.MessengerOuterClass.NotifyRequest, messengerproto.MessengerOuterClass.NotifyResponse> getNotifyMethod;
    if ((getNotifyMethod = MessengerGrpc.getNotifyMethod) == null) {
      synchronized (MessengerGrpc.class) {
        if ((getNotifyMethod = MessengerGrpc.getNotifyMethod) == null) {
          MessengerGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<messengerproto.MessengerOuterClass.NotifyRequest, messengerproto.MessengerOuterClass.NotifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  messengerproto.MessengerOuterClass.NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  messengerproto.MessengerOuterClass.NotifyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessengerMethodDescriptorSupplier("Notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessengerStub newStub(io.grpc.Channel channel) {
    return new MessengerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessengerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessengerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessengerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessengerFutureStub(channel);
  }

  /**
   */
  public static abstract class MessengerImplBase implements io.grpc.BindableService {

    /**
     */
    public void notify(messengerproto.MessengerOuterClass.NotifyRequest request,
        io.grpc.stub.StreamObserver<messengerproto.MessengerOuterClass.NotifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                messengerproto.MessengerOuterClass.NotifyRequest,
                messengerproto.MessengerOuterClass.NotifyResponse>(
                  this, METHODID_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class MessengerStub extends io.grpc.stub.AbstractStub<MessengerStub> {
    private MessengerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessengerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessengerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessengerStub(channel, callOptions);
    }

    /**
     */
    public void notify(messengerproto.MessengerOuterClass.NotifyRequest request,
        io.grpc.stub.StreamObserver<messengerproto.MessengerOuterClass.NotifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessengerBlockingStub extends io.grpc.stub.AbstractStub<MessengerBlockingStub> {
    private MessengerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessengerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessengerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessengerBlockingStub(channel, callOptions);
    }

    /**
     */
    public messengerproto.MessengerOuterClass.NotifyResponse notify(messengerproto.MessengerOuterClass.NotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessengerFutureStub extends io.grpc.stub.AbstractStub<MessengerFutureStub> {
    private MessengerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessengerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessengerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessengerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<messengerproto.MessengerOuterClass.NotifyResponse> notify(
        messengerproto.MessengerOuterClass.NotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessengerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessengerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY:
          serviceImpl.notify((messengerproto.MessengerOuterClass.NotifyRequest) request,
              (io.grpc.stub.StreamObserver<messengerproto.MessengerOuterClass.NotifyResponse>) responseObserver);
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

  private static abstract class MessengerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessengerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return messengerproto.MessengerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Messenger");
    }
  }

  private static final class MessengerFileDescriptorSupplier
      extends MessengerBaseDescriptorSupplier {
    MessengerFileDescriptorSupplier() {}
  }

  private static final class MessengerMethodDescriptorSupplier
      extends MessengerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessengerMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessengerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessengerFileDescriptorSupplier())
              .addMethod(getNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
