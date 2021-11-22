package appproto;

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
    comments = "Source: app.proto")
public final class NodeGrpc {

  private NodeGrpc() {}

  public static final String SERVICE_NAME = "appproto.Node";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<appproto.App.StartRequest,
      appproto.App.StartResponse> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = appproto.App.StartRequest.class,
      responseType = appproto.App.StartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<appproto.App.StartRequest,
      appproto.App.StartResponse> getStartMethod() {
    io.grpc.MethodDescriptor<appproto.App.StartRequest, appproto.App.StartResponse> getStartMethod;
    if ((getStartMethod = NodeGrpc.getStartMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getStartMethod = NodeGrpc.getStartMethod) == null) {
          NodeGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<appproto.App.StartRequest, appproto.App.StartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  appproto.App.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  appproto.App.StartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<appproto.App.StopRequest,
      appproto.App.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = appproto.App.StopRequest.class,
      responseType = appproto.App.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<appproto.App.StopRequest,
      appproto.App.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<appproto.App.StopRequest, appproto.App.StopResponse> getStopMethod;
    if ((getStopMethod = NodeGrpc.getStopMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getStopMethod = NodeGrpc.getStopMethod) == null) {
          NodeGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<appproto.App.StopRequest, appproto.App.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  appproto.App.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  appproto.App.StopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeStub newStub(io.grpc.Channel channel) {
    return new NodeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NodeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NodeFutureStub(channel);
  }

  /**
   */
  public static abstract class NodeImplBase implements io.grpc.BindableService {

    /**
     */
    public void start(appproto.App.StartRequest request,
        io.grpc.stub.StreamObserver<appproto.App.StartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     */
    public void stop(appproto.App.StopRequest request,
        io.grpc.stub.StreamObserver<appproto.App.StopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                appproto.App.StartRequest,
                appproto.App.StartResponse>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                appproto.App.StopRequest,
                appproto.App.StopResponse>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class NodeStub extends io.grpc.stub.AbstractStub<NodeStub> {
    private NodeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeStub(channel, callOptions);
    }

    /**
     */
    public void start(appproto.App.StartRequest request,
        io.grpc.stub.StreamObserver<appproto.App.StartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stop(appproto.App.StopRequest request,
        io.grpc.stub.StreamObserver<appproto.App.StopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NodeBlockingStub extends io.grpc.stub.AbstractStub<NodeBlockingStub> {
    private NodeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeBlockingStub(channel, callOptions);
    }

    /**
     */
    public appproto.App.StartResponse start(appproto.App.StartRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public appproto.App.StopResponse stop(appproto.App.StopRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NodeFutureStub extends io.grpc.stub.AbstractStub<NodeFutureStub> {
    private NodeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appproto.App.StartResponse> start(
        appproto.App.StartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appproto.App.StopResponse> stop(
        appproto.App.StopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_STOP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((appproto.App.StartRequest) request,
              (io.grpc.stub.StreamObserver<appproto.App.StartResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((appproto.App.StopRequest) request,
              (io.grpc.stub.StreamObserver<appproto.App.StopResponse>) responseObserver);
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

  private static abstract class NodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return appproto.App.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Node");
    }
  }

  private static final class NodeFileDescriptorSupplier
      extends NodeBaseDescriptorSupplier {
    NodeFileDescriptorSupplier() {}
  }

  private static final class NodeMethodDescriptorSupplier
      extends NodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodeMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
