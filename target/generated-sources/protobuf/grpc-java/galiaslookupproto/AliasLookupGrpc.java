package galiaslookupproto;

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
    comments = "Source: galiaslookup.proto")
public final class AliasLookupGrpc {

  private AliasLookupGrpc() {}

  public static final String SERVICE_NAME = "galiaslookupproto.AliasLookup";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<galiaslookupproto.Galiaslookup.LookupRequest,
      galiaslookupproto.Galiaslookup.LookupResponse> getLookupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lookup",
      requestType = galiaslookupproto.Galiaslookup.LookupRequest.class,
      responseType = galiaslookupproto.Galiaslookup.LookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<galiaslookupproto.Galiaslookup.LookupRequest,
      galiaslookupproto.Galiaslookup.LookupResponse> getLookupMethod() {
    io.grpc.MethodDescriptor<galiaslookupproto.Galiaslookup.LookupRequest, galiaslookupproto.Galiaslookup.LookupResponse> getLookupMethod;
    if ((getLookupMethod = AliasLookupGrpc.getLookupMethod) == null) {
      synchronized (AliasLookupGrpc.class) {
        if ((getLookupMethod = AliasLookupGrpc.getLookupMethod) == null) {
          AliasLookupGrpc.getLookupMethod = getLookupMethod =
              io.grpc.MethodDescriptor.<galiaslookupproto.Galiaslookup.LookupRequest, galiaslookupproto.Galiaslookup.LookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lookup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  galiaslookupproto.Galiaslookup.LookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  galiaslookupproto.Galiaslookup.LookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AliasLookupMethodDescriptorSupplier("Lookup"))
              .build();
        }
      }
    }
    return getLookupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<galiaslookupproto.Galiaslookup.PrimaryAliasRequest,
      galiaslookupproto.Galiaslookup.PrimaryAliasResponse> getPrimaryAliasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrimaryAlias",
      requestType = galiaslookupproto.Galiaslookup.PrimaryAliasRequest.class,
      responseType = galiaslookupproto.Galiaslookup.PrimaryAliasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<galiaslookupproto.Galiaslookup.PrimaryAliasRequest,
      galiaslookupproto.Galiaslookup.PrimaryAliasResponse> getPrimaryAliasMethod() {
    io.grpc.MethodDescriptor<galiaslookupproto.Galiaslookup.PrimaryAliasRequest, galiaslookupproto.Galiaslookup.PrimaryAliasResponse> getPrimaryAliasMethod;
    if ((getPrimaryAliasMethod = AliasLookupGrpc.getPrimaryAliasMethod) == null) {
      synchronized (AliasLookupGrpc.class) {
        if ((getPrimaryAliasMethod = AliasLookupGrpc.getPrimaryAliasMethod) == null) {
          AliasLookupGrpc.getPrimaryAliasMethod = getPrimaryAliasMethod =
              io.grpc.MethodDescriptor.<galiaslookupproto.Galiaslookup.PrimaryAliasRequest, galiaslookupproto.Galiaslookup.PrimaryAliasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrimaryAlias"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  galiaslookupproto.Galiaslookup.PrimaryAliasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  galiaslookupproto.Galiaslookup.PrimaryAliasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AliasLookupMethodDescriptorSupplier("PrimaryAlias"))
              .build();
        }
      }
    }
    return getPrimaryAliasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AliasLookupStub newStub(io.grpc.Channel channel) {
    return new AliasLookupStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AliasLookupBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AliasLookupBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AliasLookupFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AliasLookupFutureStub(channel);
  }

  /**
   */
  public static abstract class AliasLookupImplBase implements io.grpc.BindableService {

    /**
     */
    public void lookup(galiaslookupproto.Galiaslookup.LookupRequest request,
        io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.LookupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupMethod(), responseObserver);
    }

    /**
     */
    public void primaryAlias(galiaslookupproto.Galiaslookup.PrimaryAliasRequest request,
        io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.PrimaryAliasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimaryAliasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLookupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                galiaslookupproto.Galiaslookup.LookupRequest,
                galiaslookupproto.Galiaslookup.LookupResponse>(
                  this, METHODID_LOOKUP)))
          .addMethod(
            getPrimaryAliasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                galiaslookupproto.Galiaslookup.PrimaryAliasRequest,
                galiaslookupproto.Galiaslookup.PrimaryAliasResponse>(
                  this, METHODID_PRIMARY_ALIAS)))
          .build();
    }
  }

  /**
   */
  public static final class AliasLookupStub extends io.grpc.stub.AbstractStub<AliasLookupStub> {
    private AliasLookupStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AliasLookupStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AliasLookupStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AliasLookupStub(channel, callOptions);
    }

    /**
     */
    public void lookup(galiaslookupproto.Galiaslookup.LookupRequest request,
        io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.LookupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primaryAlias(galiaslookupproto.Galiaslookup.PrimaryAliasRequest request,
        io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.PrimaryAliasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrimaryAliasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AliasLookupBlockingStub extends io.grpc.stub.AbstractStub<AliasLookupBlockingStub> {
    private AliasLookupBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AliasLookupBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AliasLookupBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AliasLookupBlockingStub(channel, callOptions);
    }

    /**
     */
    public galiaslookupproto.Galiaslookup.LookupResponse lookup(galiaslookupproto.Galiaslookup.LookupRequest request) {
      return blockingUnaryCall(
          getChannel(), getLookupMethod(), getCallOptions(), request);
    }

    /**
     */
    public galiaslookupproto.Galiaslookup.PrimaryAliasResponse primaryAlias(galiaslookupproto.Galiaslookup.PrimaryAliasRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrimaryAliasMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AliasLookupFutureStub extends io.grpc.stub.AbstractStub<AliasLookupFutureStub> {
    private AliasLookupFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AliasLookupFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AliasLookupFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AliasLookupFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<galiaslookupproto.Galiaslookup.LookupResponse> lookup(
        galiaslookupproto.Galiaslookup.LookupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<galiaslookupproto.Galiaslookup.PrimaryAliasResponse> primaryAlias(
        galiaslookupproto.Galiaslookup.PrimaryAliasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrimaryAliasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP = 0;
  private static final int METHODID_PRIMARY_ALIAS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AliasLookupImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AliasLookupImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOOKUP:
          serviceImpl.lookup((galiaslookupproto.Galiaslookup.LookupRequest) request,
              (io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.LookupResponse>) responseObserver);
          break;
        case METHODID_PRIMARY_ALIAS:
          serviceImpl.primaryAlias((galiaslookupproto.Galiaslookup.PrimaryAliasRequest) request,
              (io.grpc.stub.StreamObserver<galiaslookupproto.Galiaslookup.PrimaryAliasResponse>) responseObserver);
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

  private static abstract class AliasLookupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AliasLookupBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return galiaslookupproto.Galiaslookup.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AliasLookup");
    }
  }

  private static final class AliasLookupFileDescriptorSupplier
      extends AliasLookupBaseDescriptorSupplier {
    AliasLookupFileDescriptorSupplier() {}
  }

  private static final class AliasLookupMethodDescriptorSupplier
      extends AliasLookupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AliasLookupMethodDescriptorSupplier(String methodName) {
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
      synchronized (AliasLookupGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AliasLookupFileDescriptorSupplier())
              .addMethod(getLookupMethod())
              .addMethod(getPrimaryAliasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
