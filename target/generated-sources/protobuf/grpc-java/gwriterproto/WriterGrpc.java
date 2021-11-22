package gwriterproto;

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
    comments = "Source: gwriter.proto")
public final class WriterGrpc {

  private WriterGrpc() {}

  public static final String SERVICE_NAME = "gwriterproto.Writer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gwriterproto.Gwriter.WriteRequest,
      gwriterproto.Gwriter.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = gwriterproto.Gwriter.WriteRequest.class,
      responseType = gwriterproto.Gwriter.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gwriterproto.Gwriter.WriteRequest,
      gwriterproto.Gwriter.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<gwriterproto.Gwriter.WriteRequest, gwriterproto.Gwriter.WriteResponse> getWriteMethod;
    if ((getWriteMethod = WriterGrpc.getWriteMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getWriteMethod = WriterGrpc.getWriteMethod) == null) {
          WriterGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<gwriterproto.Gwriter.WriteRequest, gwriterproto.Gwriter.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gwriterproto.Gwriter.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gwriterproto.Gwriter.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WriterStub newStub(io.grpc.Channel channel) {
    return new WriterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WriterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WriterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WriterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WriterFutureStub(channel);
  }

  /**
   */
  public static abstract class WriterImplBase implements io.grpc.BindableService {

    /**
     */
    public void write(gwriterproto.Gwriter.WriteRequest request,
        io.grpc.stub.StreamObserver<gwriterproto.Gwriter.WriteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gwriterproto.Gwriter.WriteRequest,
                gwriterproto.Gwriter.WriteResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   */
  public static final class WriterStub extends io.grpc.stub.AbstractStub<WriterStub> {
    private WriterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WriterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WriterStub(channel, callOptions);
    }

    /**
     */
    public void write(gwriterproto.Gwriter.WriteRequest request,
        io.grpc.stub.StreamObserver<gwriterproto.Gwriter.WriteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WriterBlockingStub extends io.grpc.stub.AbstractStub<WriterBlockingStub> {
    private WriterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WriterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WriterBlockingStub(channel, callOptions);
    }

    /**
     */
    public gwriterproto.Gwriter.WriteResponse write(gwriterproto.Gwriter.WriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WriterFutureStub extends io.grpc.stub.AbstractStub<WriterFutureStub> {
    private WriterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WriterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WriterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gwriterproto.Gwriter.WriteResponse> write(
        gwriterproto.Gwriter.WriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WriterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WriterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          serviceImpl.write((gwriterproto.Gwriter.WriteRequest) request,
              (io.grpc.stub.StreamObserver<gwriterproto.Gwriter.WriteResponse>) responseObserver);
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

  private static abstract class WriterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WriterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gwriterproto.Gwriter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Writer");
    }
  }

  private static final class WriterFileDescriptorSupplier
      extends WriterBaseDescriptorSupplier {
    WriterFileDescriptorSupplier() {}
  }

  private static final class WriterMethodDescriptorSupplier
      extends WriterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WriterMethodDescriptorSupplier(String methodName) {
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
      synchronized (WriterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WriterFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
