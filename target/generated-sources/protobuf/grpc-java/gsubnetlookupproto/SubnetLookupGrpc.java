package gsubnetlookupproto;

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
    comments = "Source: gsubnetlookup.proto")
public final class SubnetLookupGrpc {

  private SubnetLookupGrpc() {}

  public static final String SERVICE_NAME = "gsubnetlookupproto.SubnetLookup";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest,
      gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> getSubnetIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubnetID",
      requestType = gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.class,
      responseType = gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest,
      gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> getSubnetIDMethod() {
    io.grpc.MethodDescriptor<gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest, gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> getSubnetIDMethod;
    if ((getSubnetIDMethod = SubnetLookupGrpc.getSubnetIDMethod) == null) {
      synchronized (SubnetLookupGrpc.class) {
        if ((getSubnetIDMethod = SubnetLookupGrpc.getSubnetIDMethod) == null) {
          SubnetLookupGrpc.getSubnetIDMethod = getSubnetIDMethod =
              io.grpc.MethodDescriptor.<gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest, gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubnetID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetLookupMethodDescriptorSupplier("SubnetID"))
              .build();
        }
      }
    }
    return getSubnetIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubnetLookupStub newStub(io.grpc.Channel channel) {
    return new SubnetLookupStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubnetLookupBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubnetLookupBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubnetLookupFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubnetLookupFutureStub(channel);
  }

  /**
   */
  public static abstract class SubnetLookupImplBase implements io.grpc.BindableService {

    /**
     */
    public void subnetID(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest request,
        io.grpc.stub.StreamObserver<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubnetIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubnetIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest,
                gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse>(
                  this, METHODID_SUBNET_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SubnetLookupStub extends io.grpc.stub.AbstractStub<SubnetLookupStub> {
    private SubnetLookupStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubnetLookupStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetLookupStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubnetLookupStub(channel, callOptions);
    }

    /**
     */
    public void subnetID(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest request,
        io.grpc.stub.StreamObserver<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubnetIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubnetLookupBlockingStub extends io.grpc.stub.AbstractStub<SubnetLookupBlockingStub> {
    private SubnetLookupBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubnetLookupBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetLookupBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubnetLookupBlockingStub(channel, callOptions);
    }

    /**
     */
    public gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse subnetID(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubnetIDMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubnetLookupFutureStub extends io.grpc.stub.AbstractStub<SubnetLookupFutureStub> {
    private SubnetLookupFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubnetLookupFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetLookupFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubnetLookupFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse> subnetID(
        gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubnetIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBNET_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubnetLookupImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubnetLookupImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBNET_ID:
          serviceImpl.subnetID((gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest) request,
              (io.grpc.stub.StreamObserver<gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse>) responseObserver);
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

  private static abstract class SubnetLookupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubnetLookupBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gsubnetlookupproto.Gsubnetlookup.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubnetLookup");
    }
  }

  private static final class SubnetLookupFileDescriptorSupplier
      extends SubnetLookupBaseDescriptorSupplier {
    SubnetLookupFileDescriptorSupplier() {}
  }

  private static final class SubnetLookupMethodDescriptorSupplier
      extends SubnetLookupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubnetLookupMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubnetLookupGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubnetLookupFileDescriptorSupplier())
              .addMethod(getSubnetIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
