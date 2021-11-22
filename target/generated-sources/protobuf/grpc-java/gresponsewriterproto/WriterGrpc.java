package gresponsewriterproto;

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
    comments = "Source: gresponsewriter.proto")
public final class WriterGrpc {

  private WriterGrpc() {}

  public static final String SERVICE_NAME = "gresponsewriterproto.Writer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.WriteRequest,
      gresponsewriterproto.Gresponsewriter.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = gresponsewriterproto.Gresponsewriter.WriteRequest.class,
      responseType = gresponsewriterproto.Gresponsewriter.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.WriteRequest,
      gresponsewriterproto.Gresponsewriter.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.WriteRequest, gresponsewriterproto.Gresponsewriter.WriteResponse> getWriteMethod;
    if ((getWriteMethod = WriterGrpc.getWriteMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getWriteMethod = WriterGrpc.getWriteMethod) == null) {
          WriterGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<gresponsewriterproto.Gresponsewriter.WriteRequest, gresponsewriterproto.Gresponsewriter.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.WriteHeaderRequest,
      gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> getWriteHeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteHeader",
      requestType = gresponsewriterproto.Gresponsewriter.WriteHeaderRequest.class,
      responseType = gresponsewriterproto.Gresponsewriter.WriteHeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.WriteHeaderRequest,
      gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> getWriteHeaderMethod() {
    io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.WriteHeaderRequest, gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> getWriteHeaderMethod;
    if ((getWriteHeaderMethod = WriterGrpc.getWriteHeaderMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getWriteHeaderMethod = WriterGrpc.getWriteHeaderMethod) == null) {
          WriterGrpc.getWriteHeaderMethod = getWriteHeaderMethod =
              io.grpc.MethodDescriptor.<gresponsewriterproto.Gresponsewriter.WriteHeaderRequest, gresponsewriterproto.Gresponsewriter.WriteHeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteHeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.WriteHeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.WriteHeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("WriteHeader"))
              .build();
        }
      }
    }
    return getWriteHeaderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.FlushRequest,
      gresponsewriterproto.Gresponsewriter.FlushResponse> getFlushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flush",
      requestType = gresponsewriterproto.Gresponsewriter.FlushRequest.class,
      responseType = gresponsewriterproto.Gresponsewriter.FlushResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.FlushRequest,
      gresponsewriterproto.Gresponsewriter.FlushResponse> getFlushMethod() {
    io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.FlushRequest, gresponsewriterproto.Gresponsewriter.FlushResponse> getFlushMethod;
    if ((getFlushMethod = WriterGrpc.getFlushMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getFlushMethod = WriterGrpc.getFlushMethod) == null) {
          WriterGrpc.getFlushMethod = getFlushMethod =
              io.grpc.MethodDescriptor.<gresponsewriterproto.Gresponsewriter.FlushRequest, gresponsewriterproto.Gresponsewriter.FlushResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.FlushRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.FlushResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("Flush"))
              .build();
        }
      }
    }
    return getFlushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.HijackRequest,
      gresponsewriterproto.Gresponsewriter.HijackResponse> getHijackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hijack",
      requestType = gresponsewriterproto.Gresponsewriter.HijackRequest.class,
      responseType = gresponsewriterproto.Gresponsewriter.HijackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.HijackRequest,
      gresponsewriterproto.Gresponsewriter.HijackResponse> getHijackMethod() {
    io.grpc.MethodDescriptor<gresponsewriterproto.Gresponsewriter.HijackRequest, gresponsewriterproto.Gresponsewriter.HijackResponse> getHijackMethod;
    if ((getHijackMethod = WriterGrpc.getHijackMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getHijackMethod = WriterGrpc.getHijackMethod) == null) {
          WriterGrpc.getHijackMethod = getHijackMethod =
              io.grpc.MethodDescriptor.<gresponsewriterproto.Gresponsewriter.HijackRequest, gresponsewriterproto.Gresponsewriter.HijackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hijack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.HijackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gresponsewriterproto.Gresponsewriter.HijackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("Hijack"))
              .build();
        }
      }
    }
    return getHijackMethod;
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
    public void write(gresponsewriterproto.Gresponsewriter.WriteRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     */
    public void writeHeader(gresponsewriterproto.Gresponsewriter.WriteHeaderRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteHeaderMethod(), responseObserver);
    }

    /**
     */
    public void flush(gresponsewriterproto.Gresponsewriter.FlushRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.FlushResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
    }

    /**
     */
    public void hijack(gresponsewriterproto.Gresponsewriter.HijackRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.HijackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHijackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gresponsewriterproto.Gresponsewriter.WriteRequest,
                gresponsewriterproto.Gresponsewriter.WriteResponse>(
                  this, METHODID_WRITE)))
          .addMethod(
            getWriteHeaderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gresponsewriterproto.Gresponsewriter.WriteHeaderRequest,
                gresponsewriterproto.Gresponsewriter.WriteHeaderResponse>(
                  this, METHODID_WRITE_HEADER)))
          .addMethod(
            getFlushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gresponsewriterproto.Gresponsewriter.FlushRequest,
                gresponsewriterproto.Gresponsewriter.FlushResponse>(
                  this, METHODID_FLUSH)))
          .addMethod(
            getHijackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gresponsewriterproto.Gresponsewriter.HijackRequest,
                gresponsewriterproto.Gresponsewriter.HijackResponse>(
                  this, METHODID_HIJACK)))
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
    public void write(gresponsewriterproto.Gresponsewriter.WriteRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void writeHeader(gresponsewriterproto.Gresponsewriter.WriteHeaderRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteHeaderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flush(gresponsewriterproto.Gresponsewriter.FlushRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.FlushResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hijack(gresponsewriterproto.Gresponsewriter.HijackRequest request,
        io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.HijackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHijackMethod(), getCallOptions()), request, responseObserver);
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
    public gresponsewriterproto.Gresponsewriter.WriteResponse write(gresponsewriterproto.Gresponsewriter.WriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public gresponsewriterproto.Gresponsewriter.WriteHeaderResponse writeHeader(gresponsewriterproto.Gresponsewriter.WriteHeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteHeaderMethod(), getCallOptions(), request);
    }

    /**
     */
    public gresponsewriterproto.Gresponsewriter.FlushResponse flush(gresponsewriterproto.Gresponsewriter.FlushRequest request) {
      return blockingUnaryCall(
          getChannel(), getFlushMethod(), getCallOptions(), request);
    }

    /**
     */
    public gresponsewriterproto.Gresponsewriter.HijackResponse hijack(gresponsewriterproto.Gresponsewriter.HijackRequest request) {
      return blockingUnaryCall(
          getChannel(), getHijackMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<gresponsewriterproto.Gresponsewriter.WriteResponse> write(
        gresponsewriterproto.Gresponsewriter.WriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse> writeHeader(
        gresponsewriterproto.Gresponsewriter.WriteHeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteHeaderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gresponsewriterproto.Gresponsewriter.FlushResponse> flush(
        gresponsewriterproto.Gresponsewriter.FlushRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gresponsewriterproto.Gresponsewriter.HijackResponse> hijack(
        gresponsewriterproto.Gresponsewriter.HijackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHijackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE = 0;
  private static final int METHODID_WRITE_HEADER = 1;
  private static final int METHODID_FLUSH = 2;
  private static final int METHODID_HIJACK = 3;

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
          serviceImpl.write((gresponsewriterproto.Gresponsewriter.WriteRequest) request,
              (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteResponse>) responseObserver);
          break;
        case METHODID_WRITE_HEADER:
          serviceImpl.writeHeader((gresponsewriterproto.Gresponsewriter.WriteHeaderRequest) request,
              (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.WriteHeaderResponse>) responseObserver);
          break;
        case METHODID_FLUSH:
          serviceImpl.flush((gresponsewriterproto.Gresponsewriter.FlushRequest) request,
              (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.FlushResponse>) responseObserver);
          break;
        case METHODID_HIJACK:
          serviceImpl.hijack((gresponsewriterproto.Gresponsewriter.HijackRequest) request,
              (io.grpc.stub.StreamObserver<gresponsewriterproto.Gresponsewriter.HijackResponse>) responseObserver);
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
      return gresponsewriterproto.Gresponsewriter.getDescriptor();
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
              .addMethod(getWriteHeaderMethod())
              .addMethod(getFlushMethod())
              .addMethod(getHijackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
