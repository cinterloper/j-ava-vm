package ghttpproto;

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
    comments = "Source: ghttp.proto")
public final class HTTPGrpc {

  private HTTPGrpc() {}

  public static final String SERVICE_NAME = "ghttpproto.HTTP";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ghttpproto.Ghttp.HTTPRequest,
      ghttpproto.Ghttp.HTTPResponse> getHandleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Handle",
      requestType = ghttpproto.Ghttp.HTTPRequest.class,
      responseType = ghttpproto.Ghttp.HTTPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ghttpproto.Ghttp.HTTPRequest,
      ghttpproto.Ghttp.HTTPResponse> getHandleMethod() {
    io.grpc.MethodDescriptor<ghttpproto.Ghttp.HTTPRequest, ghttpproto.Ghttp.HTTPResponse> getHandleMethod;
    if ((getHandleMethod = HTTPGrpc.getHandleMethod) == null) {
      synchronized (HTTPGrpc.class) {
        if ((getHandleMethod = HTTPGrpc.getHandleMethod) == null) {
          HTTPGrpc.getHandleMethod = getHandleMethod =
              io.grpc.MethodDescriptor.<ghttpproto.Ghttp.HTTPRequest, ghttpproto.Ghttp.HTTPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Handle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ghttpproto.Ghttp.HTTPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ghttpproto.Ghttp.HTTPResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HTTPMethodDescriptorSupplier("Handle"))
              .build();
        }
      }
    }
    return getHandleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HTTPStub newStub(io.grpc.Channel channel) {
    return new HTTPStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HTTPBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HTTPBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HTTPFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HTTPFutureStub(channel);
  }

  /**
   */
  public static abstract class HTTPImplBase implements io.grpc.BindableService {

    /**
     */
    public void handle(ghttpproto.Ghttp.HTTPRequest request,
        io.grpc.stub.StreamObserver<ghttpproto.Ghttp.HTTPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHandleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHandleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ghttpproto.Ghttp.HTTPRequest,
                ghttpproto.Ghttp.HTTPResponse>(
                  this, METHODID_HANDLE)))
          .build();
    }
  }

  /**
   */
  public static final class HTTPStub extends io.grpc.stub.AbstractStub<HTTPStub> {
    private HTTPStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HTTPStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HTTPStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HTTPStub(channel, callOptions);
    }

    /**
     */
    public void handle(ghttpproto.Ghttp.HTTPRequest request,
        io.grpc.stub.StreamObserver<ghttpproto.Ghttp.HTTPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHandleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HTTPBlockingStub extends io.grpc.stub.AbstractStub<HTTPBlockingStub> {
    private HTTPBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HTTPBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HTTPBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HTTPBlockingStub(channel, callOptions);
    }

    /**
     */
    public ghttpproto.Ghttp.HTTPResponse handle(ghttpproto.Ghttp.HTTPRequest request) {
      return blockingUnaryCall(
          getChannel(), getHandleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HTTPFutureStub extends io.grpc.stub.AbstractStub<HTTPFutureStub> {
    private HTTPFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HTTPFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HTTPFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HTTPFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ghttpproto.Ghttp.HTTPResponse> handle(
        ghttpproto.Ghttp.HTTPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHandleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HTTPImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HTTPImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HANDLE:
          serviceImpl.handle((ghttpproto.Ghttp.HTTPRequest) request,
              (io.grpc.stub.StreamObserver<ghttpproto.Ghttp.HTTPResponse>) responseObserver);
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

  private static abstract class HTTPBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HTTPBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ghttpproto.Ghttp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HTTP");
    }
  }

  private static final class HTTPFileDescriptorSupplier
      extends HTTPBaseDescriptorSupplier {
    HTTPFileDescriptorSupplier() {}
  }

  private static final class HTTPMethodDescriptorSupplier
      extends HTTPBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HTTPMethodDescriptorSupplier(String methodName) {
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
      synchronized (HTTPGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HTTPFileDescriptorSupplier())
              .addMethod(getHandleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
