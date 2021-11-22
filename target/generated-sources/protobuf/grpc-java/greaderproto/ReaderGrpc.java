package greaderproto;

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
    comments = "Source: greader.proto")
public final class ReaderGrpc {

  private ReaderGrpc() {}

  public static final String SERVICE_NAME = "greaderproto.Reader";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<greaderproto.Greader.ReadRequest,
      greaderproto.Greader.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = greaderproto.Greader.ReadRequest.class,
      responseType = greaderproto.Greader.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<greaderproto.Greader.ReadRequest,
      greaderproto.Greader.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<greaderproto.Greader.ReadRequest, greaderproto.Greader.ReadResponse> getReadMethod;
    if ((getReadMethod = ReaderGrpc.getReadMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getReadMethod = ReaderGrpc.getReadMethod) == null) {
          ReaderGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<greaderproto.Greader.ReadRequest, greaderproto.Greader.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  greaderproto.Greader.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  greaderproto.Greader.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReaderStub newStub(io.grpc.Channel channel) {
    return new ReaderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReaderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReaderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReaderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReaderFutureStub(channel);
  }

  /**
   */
  public static abstract class ReaderImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(greaderproto.Greader.ReadRequest request,
        io.grpc.stub.StreamObserver<greaderproto.Greader.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                greaderproto.Greader.ReadRequest,
                greaderproto.Greader.ReadResponse>(
                  this, METHODID_READ)))
          .build();
    }
  }

  /**
   */
  public static final class ReaderStub extends io.grpc.stub.AbstractStub<ReaderStub> {
    private ReaderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReaderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReaderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReaderStub(channel, callOptions);
    }

    /**
     */
    public void read(greaderproto.Greader.ReadRequest request,
        io.grpc.stub.StreamObserver<greaderproto.Greader.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReaderBlockingStub extends io.grpc.stub.AbstractStub<ReaderBlockingStub> {
    private ReaderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReaderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReaderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReaderBlockingStub(channel, callOptions);
    }

    /**
     */
    public greaderproto.Greader.ReadResponse read(greaderproto.Greader.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReaderFutureStub extends io.grpc.stub.AbstractStub<ReaderFutureStub> {
    private ReaderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReaderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReaderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReaderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<greaderproto.Greader.ReadResponse> read(
        greaderproto.Greader.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReaderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReaderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((greaderproto.Greader.ReadRequest) request,
              (io.grpc.stub.StreamObserver<greaderproto.Greader.ReadResponse>) responseObserver);
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

  private static abstract class ReaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReaderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return greaderproto.Greader.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Reader");
    }
  }

  private static final class ReaderFileDescriptorSupplier
      extends ReaderBaseDescriptorSupplier {
    ReaderFileDescriptorSupplier() {}
  }

  private static final class ReaderMethodDescriptorSupplier
      extends ReaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReaderMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReaderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReaderFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
