package gconnproto;

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
    comments = "Source: gconn.proto")
public final class ConnGrpc {

  private ConnGrpc() {}

  public static final String SERVICE_NAME = "gconnproto.Conn";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gconnproto.Gconn.ReadRequest,
      gconnproto.Gconn.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = gconnproto.Gconn.ReadRequest.class,
      responseType = gconnproto.Gconn.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gconnproto.Gconn.ReadRequest,
      gconnproto.Gconn.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<gconnproto.Gconn.ReadRequest, gconnproto.Gconn.ReadResponse> getReadMethod;
    if ((getReadMethod = ConnGrpc.getReadMethod) == null) {
      synchronized (ConnGrpc.class) {
        if ((getReadMethod = ConnGrpc.getReadMethod) == null) {
          ConnGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<gconnproto.Gconn.ReadRequest, gconnproto.Gconn.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gconnproto.Gconn.WriteRequest,
      gconnproto.Gconn.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = gconnproto.Gconn.WriteRequest.class,
      responseType = gconnproto.Gconn.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gconnproto.Gconn.WriteRequest,
      gconnproto.Gconn.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<gconnproto.Gconn.WriteRequest, gconnproto.Gconn.WriteResponse> getWriteMethod;
    if ((getWriteMethod = ConnGrpc.getWriteMethod) == null) {
      synchronized (ConnGrpc.class) {
        if ((getWriteMethod = ConnGrpc.getWriteMethod) == null) {
          ConnGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<gconnproto.Gconn.WriteRequest, gconnproto.Gconn.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gconnproto.Gconn.CloseRequest,
      gconnproto.Gconn.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = gconnproto.Gconn.CloseRequest.class,
      responseType = gconnproto.Gconn.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gconnproto.Gconn.CloseRequest,
      gconnproto.Gconn.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<gconnproto.Gconn.CloseRequest, gconnproto.Gconn.CloseResponse> getCloseMethod;
    if ((getCloseMethod = ConnGrpc.getCloseMethod) == null) {
      synchronized (ConnGrpc.class) {
        if ((getCloseMethod = ConnGrpc.getCloseMethod) == null) {
          ConnGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<gconnproto.Gconn.CloseRequest, gconnproto.Gconn.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gconnproto.Gconn.SetDeadlineRequest,
      gconnproto.Gconn.SetDeadlineResponse> getSetDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDeadline",
      requestType = gconnproto.Gconn.SetDeadlineRequest.class,
      responseType = gconnproto.Gconn.SetDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gconnproto.Gconn.SetDeadlineRequest,
      gconnproto.Gconn.SetDeadlineResponse> getSetDeadlineMethod() {
    io.grpc.MethodDescriptor<gconnproto.Gconn.SetDeadlineRequest, gconnproto.Gconn.SetDeadlineResponse> getSetDeadlineMethod;
    if ((getSetDeadlineMethod = ConnGrpc.getSetDeadlineMethod) == null) {
      synchronized (ConnGrpc.class) {
        if ((getSetDeadlineMethod = ConnGrpc.getSetDeadlineMethod) == null) {
          ConnGrpc.getSetDeadlineMethod = getSetDeadlineMethod =
              io.grpc.MethodDescriptor.<gconnproto.Gconn.SetDeadlineRequest, gconnproto.Gconn.SetDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.SetDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.SetDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnMethodDescriptorSupplier("SetDeadline"))
              .build();
        }
      }
    }
    return getSetDeadlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gconnproto.Gconn.SetReadDeadlineRequest,
      gconnproto.Gconn.SetReadDeadlineResponse> getSetReadDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetReadDeadline",
      requestType = gconnproto.Gconn.SetReadDeadlineRequest.class,
      responseType = gconnproto.Gconn.SetReadDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gconnproto.Gconn.SetReadDeadlineRequest,
      gconnproto.Gconn.SetReadDeadlineResponse> getSetReadDeadlineMethod() {
    io.grpc.MethodDescriptor<gconnproto.Gconn.SetReadDeadlineRequest, gconnproto.Gconn.SetReadDeadlineResponse> getSetReadDeadlineMethod;
    if ((getSetReadDeadlineMethod = ConnGrpc.getSetReadDeadlineMethod) == null) {
      synchronized (ConnGrpc.class) {
        if ((getSetReadDeadlineMethod = ConnGrpc.getSetReadDeadlineMethod) == null) {
          ConnGrpc.getSetReadDeadlineMethod = getSetReadDeadlineMethod =
              io.grpc.MethodDescriptor.<gconnproto.Gconn.SetReadDeadlineRequest, gconnproto.Gconn.SetReadDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetReadDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.SetReadDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.SetReadDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnMethodDescriptorSupplier("SetReadDeadline"))
              .build();
        }
      }
    }
    return getSetReadDeadlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gconnproto.Gconn.SetWriteDeadlineRequest,
      gconnproto.Gconn.SetWriteDeadlineResponse> getSetWriteDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWriteDeadline",
      requestType = gconnproto.Gconn.SetWriteDeadlineRequest.class,
      responseType = gconnproto.Gconn.SetWriteDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gconnproto.Gconn.SetWriteDeadlineRequest,
      gconnproto.Gconn.SetWriteDeadlineResponse> getSetWriteDeadlineMethod() {
    io.grpc.MethodDescriptor<gconnproto.Gconn.SetWriteDeadlineRequest, gconnproto.Gconn.SetWriteDeadlineResponse> getSetWriteDeadlineMethod;
    if ((getSetWriteDeadlineMethod = ConnGrpc.getSetWriteDeadlineMethod) == null) {
      synchronized (ConnGrpc.class) {
        if ((getSetWriteDeadlineMethod = ConnGrpc.getSetWriteDeadlineMethod) == null) {
          ConnGrpc.getSetWriteDeadlineMethod = getSetWriteDeadlineMethod =
              io.grpc.MethodDescriptor.<gconnproto.Gconn.SetWriteDeadlineRequest, gconnproto.Gconn.SetWriteDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWriteDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.SetWriteDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gconnproto.Gconn.SetWriteDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnMethodDescriptorSupplier("SetWriteDeadline"))
              .build();
        }
      }
    }
    return getSetWriteDeadlineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnStub newStub(io.grpc.Channel channel) {
    return new ConnStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConnBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConnFutureStub(channel);
  }

  /**
   */
  public static abstract class ConnImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(gconnproto.Gconn.ReadRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void write(gconnproto.Gconn.WriteRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.WriteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     */
    public void close(gconnproto.Gconn.CloseRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     */
    public void setDeadline(gconnproto.Gconn.SetDeadlineRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.SetDeadlineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDeadlineMethod(), responseObserver);
    }

    /**
     */
    public void setReadDeadline(gconnproto.Gconn.SetReadDeadlineRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.SetReadDeadlineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetReadDeadlineMethod(), responseObserver);
    }

    /**
     */
    public void setWriteDeadline(gconnproto.Gconn.SetWriteDeadlineRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.SetWriteDeadlineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWriteDeadlineMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gconnproto.Gconn.ReadRequest,
                gconnproto.Gconn.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gconnproto.Gconn.WriteRequest,
                gconnproto.Gconn.WriteResponse>(
                  this, METHODID_WRITE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gconnproto.Gconn.CloseRequest,
                gconnproto.Gconn.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSetDeadlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gconnproto.Gconn.SetDeadlineRequest,
                gconnproto.Gconn.SetDeadlineResponse>(
                  this, METHODID_SET_DEADLINE)))
          .addMethod(
            getSetReadDeadlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gconnproto.Gconn.SetReadDeadlineRequest,
                gconnproto.Gconn.SetReadDeadlineResponse>(
                  this, METHODID_SET_READ_DEADLINE)))
          .addMethod(
            getSetWriteDeadlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gconnproto.Gconn.SetWriteDeadlineRequest,
                gconnproto.Gconn.SetWriteDeadlineResponse>(
                  this, METHODID_SET_WRITE_DEADLINE)))
          .build();
    }
  }

  /**
   */
  public static final class ConnStub extends io.grpc.stub.AbstractStub<ConnStub> {
    private ConnStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnStub(channel, callOptions);
    }

    /**
     */
    public void read(gconnproto.Gconn.ReadRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(gconnproto.Gconn.WriteRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.WriteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void close(gconnproto.Gconn.CloseRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDeadline(gconnproto.Gconn.SetDeadlineRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.SetDeadlineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDeadlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setReadDeadline(gconnproto.Gconn.SetReadDeadlineRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.SetReadDeadlineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetReadDeadlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setWriteDeadline(gconnproto.Gconn.SetWriteDeadlineRequest request,
        io.grpc.stub.StreamObserver<gconnproto.Gconn.SetWriteDeadlineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWriteDeadlineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConnBlockingStub extends io.grpc.stub.AbstractStub<ConnBlockingStub> {
    private ConnBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnBlockingStub(channel, callOptions);
    }

    /**
     */
    public gconnproto.Gconn.ReadResponse read(gconnproto.Gconn.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public gconnproto.Gconn.WriteResponse write(gconnproto.Gconn.WriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public gconnproto.Gconn.CloseResponse close(gconnproto.Gconn.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     */
    public gconnproto.Gconn.SetDeadlineResponse setDeadline(gconnproto.Gconn.SetDeadlineRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetDeadlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public gconnproto.Gconn.SetReadDeadlineResponse setReadDeadline(gconnproto.Gconn.SetReadDeadlineRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetReadDeadlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public gconnproto.Gconn.SetWriteDeadlineResponse setWriteDeadline(gconnproto.Gconn.SetWriteDeadlineRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetWriteDeadlineMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConnFutureStub extends io.grpc.stub.AbstractStub<ConnFutureStub> {
    private ConnFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gconnproto.Gconn.ReadResponse> read(
        gconnproto.Gconn.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gconnproto.Gconn.WriteResponse> write(
        gconnproto.Gconn.WriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gconnproto.Gconn.CloseResponse> close(
        gconnproto.Gconn.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gconnproto.Gconn.SetDeadlineResponse> setDeadline(
        gconnproto.Gconn.SetDeadlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDeadlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gconnproto.Gconn.SetReadDeadlineResponse> setReadDeadline(
        gconnproto.Gconn.SetReadDeadlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetReadDeadlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gconnproto.Gconn.SetWriteDeadlineResponse> setWriteDeadline(
        gconnproto.Gconn.SetWriteDeadlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWriteDeadlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_WRITE = 1;
  private static final int METHODID_CLOSE = 2;
  private static final int METHODID_SET_DEADLINE = 3;
  private static final int METHODID_SET_READ_DEADLINE = 4;
  private static final int METHODID_SET_WRITE_DEADLINE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((gconnproto.Gconn.ReadRequest) request,
              (io.grpc.stub.StreamObserver<gconnproto.Gconn.ReadResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((gconnproto.Gconn.WriteRequest) request,
              (io.grpc.stub.StreamObserver<gconnproto.Gconn.WriteResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((gconnproto.Gconn.CloseRequest) request,
              (io.grpc.stub.StreamObserver<gconnproto.Gconn.CloseResponse>) responseObserver);
          break;
        case METHODID_SET_DEADLINE:
          serviceImpl.setDeadline((gconnproto.Gconn.SetDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<gconnproto.Gconn.SetDeadlineResponse>) responseObserver);
          break;
        case METHODID_SET_READ_DEADLINE:
          serviceImpl.setReadDeadline((gconnproto.Gconn.SetReadDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<gconnproto.Gconn.SetReadDeadlineResponse>) responseObserver);
          break;
        case METHODID_SET_WRITE_DEADLINE:
          serviceImpl.setWriteDeadline((gconnproto.Gconn.SetWriteDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<gconnproto.Gconn.SetWriteDeadlineResponse>) responseObserver);
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

  private static abstract class ConnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gconnproto.Gconn.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Conn");
    }
  }

  private static final class ConnFileDescriptorSupplier
      extends ConnBaseDescriptorSupplier {
    ConnFileDescriptorSupplier() {}
  }

  private static final class ConnMethodDescriptorSupplier
      extends ConnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSetDeadlineMethod())
              .addMethod(getSetReadDeadlineMethod())
              .addMethod(getSetWriteDeadlineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
