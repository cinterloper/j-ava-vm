package vmproto;

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
    comments = "Source: vm.proto")
public final class VMGrpc {

  private VMGrpc() {}

  public static final String SERVICE_NAME = "vmproto.VM";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.InitializeRequest,
      vmproto.Vm.InitializeResponse> getInitializeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Initialize",
      requestType = vmproto.Vm.InitializeRequest.class,
      responseType = vmproto.Vm.InitializeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.InitializeRequest,
      vmproto.Vm.InitializeResponse> getInitializeMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.InitializeRequest, vmproto.Vm.InitializeResponse> getInitializeMethod;
    if ((getInitializeMethod = VMGrpc.getInitializeMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getInitializeMethod = VMGrpc.getInitializeMethod) == null) {
          VMGrpc.getInitializeMethod = getInitializeMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.InitializeRequest, vmproto.Vm.InitializeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Initialize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.InitializeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.InitializeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("Initialize"))
              .build();
        }
      }
    }
    return getInitializeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.BootstrappingRequest,
      vmproto.Vm.BootstrappingResponse> getBootstrappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bootstrapping",
      requestType = vmproto.Vm.BootstrappingRequest.class,
      responseType = vmproto.Vm.BootstrappingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.BootstrappingRequest,
      vmproto.Vm.BootstrappingResponse> getBootstrappingMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.BootstrappingRequest, vmproto.Vm.BootstrappingResponse> getBootstrappingMethod;
    if ((getBootstrappingMethod = VMGrpc.getBootstrappingMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getBootstrappingMethod = VMGrpc.getBootstrappingMethod) == null) {
          VMGrpc.getBootstrappingMethod = getBootstrappingMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.BootstrappingRequest, vmproto.Vm.BootstrappingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bootstrapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BootstrappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BootstrappingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("Bootstrapping"))
              .build();
        }
      }
    }
    return getBootstrappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.BootstrappedRequest,
      vmproto.Vm.BootstrappedResponse> getBootstrappedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bootstrapped",
      requestType = vmproto.Vm.BootstrappedRequest.class,
      responseType = vmproto.Vm.BootstrappedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.BootstrappedRequest,
      vmproto.Vm.BootstrappedResponse> getBootstrappedMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.BootstrappedRequest, vmproto.Vm.BootstrappedResponse> getBootstrappedMethod;
    if ((getBootstrappedMethod = VMGrpc.getBootstrappedMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getBootstrappedMethod = VMGrpc.getBootstrappedMethod) == null) {
          VMGrpc.getBootstrappedMethod = getBootstrappedMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.BootstrappedRequest, vmproto.Vm.BootstrappedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bootstrapped"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BootstrappedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BootstrappedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("Bootstrapped"))
              .build();
        }
      }
    }
    return getBootstrappedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.ShutdownRequest,
      vmproto.Vm.ShutdownResponse> getShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Shutdown",
      requestType = vmproto.Vm.ShutdownRequest.class,
      responseType = vmproto.Vm.ShutdownResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.ShutdownRequest,
      vmproto.Vm.ShutdownResponse> getShutdownMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.ShutdownRequest, vmproto.Vm.ShutdownResponse> getShutdownMethod;
    if ((getShutdownMethod = VMGrpc.getShutdownMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getShutdownMethod = VMGrpc.getShutdownMethod) == null) {
          VMGrpc.getShutdownMethod = getShutdownMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.ShutdownRequest, vmproto.Vm.ShutdownResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Shutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.ShutdownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.ShutdownResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("Shutdown"))
              .build();
        }
      }
    }
    return getShutdownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.CreateHandlersRequest,
      vmproto.Vm.CreateHandlersResponse> getCreateHandlersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHandlers",
      requestType = vmproto.Vm.CreateHandlersRequest.class,
      responseType = vmproto.Vm.CreateHandlersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.CreateHandlersRequest,
      vmproto.Vm.CreateHandlersResponse> getCreateHandlersMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.CreateHandlersRequest, vmproto.Vm.CreateHandlersResponse> getCreateHandlersMethod;
    if ((getCreateHandlersMethod = VMGrpc.getCreateHandlersMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getCreateHandlersMethod = VMGrpc.getCreateHandlersMethod) == null) {
          VMGrpc.getCreateHandlersMethod = getCreateHandlersMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.CreateHandlersRequest, vmproto.Vm.CreateHandlersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHandlers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.CreateHandlersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.CreateHandlersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("CreateHandlers"))
              .build();
        }
      }
    }
    return getCreateHandlersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.CreateStaticHandlersRequest,
      vmproto.Vm.CreateStaticHandlersResponse> getCreateStaticHandlersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStaticHandlers",
      requestType = vmproto.Vm.CreateStaticHandlersRequest.class,
      responseType = vmproto.Vm.CreateStaticHandlersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.CreateStaticHandlersRequest,
      vmproto.Vm.CreateStaticHandlersResponse> getCreateStaticHandlersMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.CreateStaticHandlersRequest, vmproto.Vm.CreateStaticHandlersResponse> getCreateStaticHandlersMethod;
    if ((getCreateStaticHandlersMethod = VMGrpc.getCreateStaticHandlersMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getCreateStaticHandlersMethod = VMGrpc.getCreateStaticHandlersMethod) == null) {
          VMGrpc.getCreateStaticHandlersMethod = getCreateStaticHandlersMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.CreateStaticHandlersRequest, vmproto.Vm.CreateStaticHandlersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStaticHandlers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.CreateStaticHandlersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.CreateStaticHandlersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("CreateStaticHandlers"))
              .build();
        }
      }
    }
    return getCreateStaticHandlersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.BuildBlockRequest,
      vmproto.Vm.BuildBlockResponse> getBuildBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildBlock",
      requestType = vmproto.Vm.BuildBlockRequest.class,
      responseType = vmproto.Vm.BuildBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.BuildBlockRequest,
      vmproto.Vm.BuildBlockResponse> getBuildBlockMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.BuildBlockRequest, vmproto.Vm.BuildBlockResponse> getBuildBlockMethod;
    if ((getBuildBlockMethod = VMGrpc.getBuildBlockMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getBuildBlockMethod = VMGrpc.getBuildBlockMethod) == null) {
          VMGrpc.getBuildBlockMethod = getBuildBlockMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.BuildBlockRequest, vmproto.Vm.BuildBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BuildBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BuildBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("BuildBlock"))
              .build();
        }
      }
    }
    return getBuildBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.ParseBlockRequest,
      vmproto.Vm.ParseBlockResponse> getParseBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseBlock",
      requestType = vmproto.Vm.ParseBlockRequest.class,
      responseType = vmproto.Vm.ParseBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.ParseBlockRequest,
      vmproto.Vm.ParseBlockResponse> getParseBlockMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.ParseBlockRequest, vmproto.Vm.ParseBlockResponse> getParseBlockMethod;
    if ((getParseBlockMethod = VMGrpc.getParseBlockMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getParseBlockMethod = VMGrpc.getParseBlockMethod) == null) {
          VMGrpc.getParseBlockMethod = getParseBlockMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.ParseBlockRequest, vmproto.Vm.ParseBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.ParseBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.ParseBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("ParseBlock"))
              .build();
        }
      }
    }
    return getParseBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.GetBlockRequest,
      vmproto.Vm.GetBlockResponse> getGetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlock",
      requestType = vmproto.Vm.GetBlockRequest.class,
      responseType = vmproto.Vm.GetBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.GetBlockRequest,
      vmproto.Vm.GetBlockResponse> getGetBlockMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.GetBlockRequest, vmproto.Vm.GetBlockResponse> getGetBlockMethod;
    if ((getGetBlockMethod = VMGrpc.getGetBlockMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getGetBlockMethod = VMGrpc.getGetBlockMethod) == null) {
          VMGrpc.getGetBlockMethod = getGetBlockMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.GetBlockRequest, vmproto.Vm.GetBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.GetBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.GetBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("GetBlock"))
              .build();
        }
      }
    }
    return getGetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.SetPreferenceRequest,
      vmproto.Vm.SetPreferenceResponse> getSetPreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPreference",
      requestType = vmproto.Vm.SetPreferenceRequest.class,
      responseType = vmproto.Vm.SetPreferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.SetPreferenceRequest,
      vmproto.Vm.SetPreferenceResponse> getSetPreferenceMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.SetPreferenceRequest, vmproto.Vm.SetPreferenceResponse> getSetPreferenceMethod;
    if ((getSetPreferenceMethod = VMGrpc.getSetPreferenceMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getSetPreferenceMethod = VMGrpc.getSetPreferenceMethod) == null) {
          VMGrpc.getSetPreferenceMethod = getSetPreferenceMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.SetPreferenceRequest, vmproto.Vm.SetPreferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.SetPreferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.SetPreferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("SetPreference"))
              .build();
        }
      }
    }
    return getSetPreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.HealthRequest,
      vmproto.Vm.HealthResponse> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = vmproto.Vm.HealthRequest.class,
      responseType = vmproto.Vm.HealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.HealthRequest,
      vmproto.Vm.HealthResponse> getHealthMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.HealthRequest, vmproto.Vm.HealthResponse> getHealthMethod;
    if ((getHealthMethod = VMGrpc.getHealthMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getHealthMethod = VMGrpc.getHealthMethod) == null) {
          VMGrpc.getHealthMethod = getHealthMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.HealthRequest, vmproto.Vm.HealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.HealthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("Health"))
              .build();
        }
      }
    }
    return getHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.VersionRequest,
      vmproto.Vm.VersionResponse> getVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Version",
      requestType = vmproto.Vm.VersionRequest.class,
      responseType = vmproto.Vm.VersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.VersionRequest,
      vmproto.Vm.VersionResponse> getVersionMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.VersionRequest, vmproto.Vm.VersionResponse> getVersionMethod;
    if ((getVersionMethod = VMGrpc.getVersionMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getVersionMethod = VMGrpc.getVersionMethod) == null) {
          VMGrpc.getVersionMethod = getVersionMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.VersionRequest, vmproto.Vm.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Version"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.VersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("Version"))
              .build();
        }
      }
    }
    return getVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.BlockVerifyRequest,
      vmproto.Vm.BlockVerifyResponse> getBlockVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockVerify",
      requestType = vmproto.Vm.BlockVerifyRequest.class,
      responseType = vmproto.Vm.BlockVerifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.BlockVerifyRequest,
      vmproto.Vm.BlockVerifyResponse> getBlockVerifyMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.BlockVerifyRequest, vmproto.Vm.BlockVerifyResponse> getBlockVerifyMethod;
    if ((getBlockVerifyMethod = VMGrpc.getBlockVerifyMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getBlockVerifyMethod = VMGrpc.getBlockVerifyMethod) == null) {
          VMGrpc.getBlockVerifyMethod = getBlockVerifyMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.BlockVerifyRequest, vmproto.Vm.BlockVerifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockVerify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BlockVerifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BlockVerifyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("BlockVerify"))
              .build();
        }
      }
    }
    return getBlockVerifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.BlockAcceptRequest,
      vmproto.Vm.BlockAcceptResponse> getBlockAcceptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockAccept",
      requestType = vmproto.Vm.BlockAcceptRequest.class,
      responseType = vmproto.Vm.BlockAcceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.BlockAcceptRequest,
      vmproto.Vm.BlockAcceptResponse> getBlockAcceptMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.BlockAcceptRequest, vmproto.Vm.BlockAcceptResponse> getBlockAcceptMethod;
    if ((getBlockAcceptMethod = VMGrpc.getBlockAcceptMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getBlockAcceptMethod = VMGrpc.getBlockAcceptMethod) == null) {
          VMGrpc.getBlockAcceptMethod = getBlockAcceptMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.BlockAcceptRequest, vmproto.Vm.BlockAcceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockAccept"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BlockAcceptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BlockAcceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("BlockAccept"))
              .build();
        }
      }
    }
    return getBlockAcceptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vmproto.Vm.BlockRejectRequest,
      vmproto.Vm.BlockRejectResponse> getBlockRejectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockReject",
      requestType = vmproto.Vm.BlockRejectRequest.class,
      responseType = vmproto.Vm.BlockRejectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vmproto.Vm.BlockRejectRequest,
      vmproto.Vm.BlockRejectResponse> getBlockRejectMethod() {
    io.grpc.MethodDescriptor<vmproto.Vm.BlockRejectRequest, vmproto.Vm.BlockRejectResponse> getBlockRejectMethod;
    if ((getBlockRejectMethod = VMGrpc.getBlockRejectMethod) == null) {
      synchronized (VMGrpc.class) {
        if ((getBlockRejectMethod = VMGrpc.getBlockRejectMethod) == null) {
          VMGrpc.getBlockRejectMethod = getBlockRejectMethod =
              io.grpc.MethodDescriptor.<vmproto.Vm.BlockRejectRequest, vmproto.Vm.BlockRejectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockReject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BlockRejectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vmproto.Vm.BlockRejectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VMMethodDescriptorSupplier("BlockReject"))
              .build();
        }
      }
    }
    return getBlockRejectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VMStub newStub(io.grpc.Channel channel) {
    return new VMStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VMBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VMBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VMFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VMFutureStub(channel);
  }

  /**
   */
  public static abstract class VMImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialize(vmproto.Vm.InitializeRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.InitializeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitializeMethod(), responseObserver);
    }

    /**
     */
    public void bootstrapping(vmproto.Vm.BootstrappingRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBootstrappingMethod(), responseObserver);
    }

    /**
     */
    public void bootstrapped(vmproto.Vm.BootstrappedRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBootstrappedMethod(), responseObserver);
    }

    /**
     */
    public void shutdown(vmproto.Vm.ShutdownRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.ShutdownResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShutdownMethod(), responseObserver);
    }

    /**
     */
    public void createHandlers(vmproto.Vm.CreateHandlersRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.CreateHandlersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateHandlersMethod(), responseObserver);
    }

    /**
     */
    public void createStaticHandlers(vmproto.Vm.CreateStaticHandlersRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.CreateStaticHandlersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStaticHandlersMethod(), responseObserver);
    }

    /**
     */
    public void buildBlock(vmproto.Vm.BuildBlockRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BuildBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuildBlockMethod(), responseObserver);
    }

    /**
     */
    public void parseBlock(vmproto.Vm.ParseBlockRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.ParseBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParseBlockMethod(), responseObserver);
    }

    /**
     */
    public void getBlock(vmproto.Vm.GetBlockRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.GetBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockMethod(), responseObserver);
    }

    /**
     */
    public void setPreference(vmproto.Vm.SetPreferenceRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.SetPreferenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPreferenceMethod(), responseObserver);
    }

    /**
     */
    public void health(vmproto.Vm.HealthRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.HealthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }

    /**
     */
    public void version(vmproto.Vm.VersionRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.VersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVersionMethod(), responseObserver);
    }

    /**
     */
    public void blockVerify(vmproto.Vm.BlockVerifyRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BlockVerifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockVerifyMethod(), responseObserver);
    }

    /**
     */
    public void blockAccept(vmproto.Vm.BlockAcceptRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BlockAcceptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockAcceptMethod(), responseObserver);
    }

    /**
     */
    public void blockReject(vmproto.Vm.BlockRejectRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BlockRejectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockRejectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitializeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.InitializeRequest,
                vmproto.Vm.InitializeResponse>(
                  this, METHODID_INITIALIZE)))
          .addMethod(
            getBootstrappingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.BootstrappingRequest,
                vmproto.Vm.BootstrappingResponse>(
                  this, METHODID_BOOTSTRAPPING)))
          .addMethod(
            getBootstrappedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.BootstrappedRequest,
                vmproto.Vm.BootstrappedResponse>(
                  this, METHODID_BOOTSTRAPPED)))
          .addMethod(
            getShutdownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.ShutdownRequest,
                vmproto.Vm.ShutdownResponse>(
                  this, METHODID_SHUTDOWN)))
          .addMethod(
            getCreateHandlersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.CreateHandlersRequest,
                vmproto.Vm.CreateHandlersResponse>(
                  this, METHODID_CREATE_HANDLERS)))
          .addMethod(
            getCreateStaticHandlersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.CreateStaticHandlersRequest,
                vmproto.Vm.CreateStaticHandlersResponse>(
                  this, METHODID_CREATE_STATIC_HANDLERS)))
          .addMethod(
            getBuildBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.BuildBlockRequest,
                vmproto.Vm.BuildBlockResponse>(
                  this, METHODID_BUILD_BLOCK)))
          .addMethod(
            getParseBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.ParseBlockRequest,
                vmproto.Vm.ParseBlockResponse>(
                  this, METHODID_PARSE_BLOCK)))
          .addMethod(
            getGetBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.GetBlockRequest,
                vmproto.Vm.GetBlockResponse>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            getSetPreferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.SetPreferenceRequest,
                vmproto.Vm.SetPreferenceResponse>(
                  this, METHODID_SET_PREFERENCE)))
          .addMethod(
            getHealthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.HealthRequest,
                vmproto.Vm.HealthResponse>(
                  this, METHODID_HEALTH)))
          .addMethod(
            getVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.VersionRequest,
                vmproto.Vm.VersionResponse>(
                  this, METHODID_VERSION)))
          .addMethod(
            getBlockVerifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.BlockVerifyRequest,
                vmproto.Vm.BlockVerifyResponse>(
                  this, METHODID_BLOCK_VERIFY)))
          .addMethod(
            getBlockAcceptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.BlockAcceptRequest,
                vmproto.Vm.BlockAcceptResponse>(
                  this, METHODID_BLOCK_ACCEPT)))
          .addMethod(
            getBlockRejectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vmproto.Vm.BlockRejectRequest,
                vmproto.Vm.BlockRejectResponse>(
                  this, METHODID_BLOCK_REJECT)))
          .build();
    }
  }

  /**
   */
  public static final class VMStub extends io.grpc.stub.AbstractStub<VMStub> {
    private VMStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VMStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VMStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VMStub(channel, callOptions);
    }

    /**
     */
    public void initialize(vmproto.Vm.InitializeRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.InitializeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitializeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bootstrapping(vmproto.Vm.BootstrappingRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBootstrappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bootstrapped(vmproto.Vm.BootstrappedRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBootstrappedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shutdown(vmproto.Vm.ShutdownRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.ShutdownResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createHandlers(vmproto.Vm.CreateHandlersRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.CreateHandlersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateHandlersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStaticHandlers(vmproto.Vm.CreateStaticHandlersRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.CreateStaticHandlersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStaticHandlersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buildBlock(vmproto.Vm.BuildBlockRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BuildBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuildBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseBlock(vmproto.Vm.ParseBlockRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.ParseBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlock(vmproto.Vm.GetBlockRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.GetBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPreference(vmproto.Vm.SetPreferenceRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.SetPreferenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void health(vmproto.Vm.HealthRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.HealthResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void version(vmproto.Vm.VersionRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.VersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blockVerify(vmproto.Vm.BlockVerifyRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BlockVerifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blockAccept(vmproto.Vm.BlockAcceptRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BlockAcceptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockAcceptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blockReject(vmproto.Vm.BlockRejectRequest request,
        io.grpc.stub.StreamObserver<vmproto.Vm.BlockRejectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockRejectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VMBlockingStub extends io.grpc.stub.AbstractStub<VMBlockingStub> {
    private VMBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VMBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VMBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VMBlockingStub(channel, callOptions);
    }

    /**
     */
    public vmproto.Vm.InitializeResponse initialize(vmproto.Vm.InitializeRequest request) {
      return blockingUnaryCall(
          getChannel(), getInitializeMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.BootstrappingResponse bootstrapping(vmproto.Vm.BootstrappingRequest request) {
      return blockingUnaryCall(
          getChannel(), getBootstrappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.BootstrappedResponse bootstrapped(vmproto.Vm.BootstrappedRequest request) {
      return blockingUnaryCall(
          getChannel(), getBootstrappedMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.ShutdownResponse shutdown(vmproto.Vm.ShutdownRequest request) {
      return blockingUnaryCall(
          getChannel(), getShutdownMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.CreateHandlersResponse createHandlers(vmproto.Vm.CreateHandlersRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateHandlersMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.CreateStaticHandlersResponse createStaticHandlers(vmproto.Vm.CreateStaticHandlersRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStaticHandlersMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.BuildBlockResponse buildBlock(vmproto.Vm.BuildBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuildBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.ParseBlockResponse parseBlock(vmproto.Vm.ParseBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.GetBlockResponse getBlock(vmproto.Vm.GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.SetPreferenceResponse setPreference(vmproto.Vm.SetPreferenceRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetPreferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.HealthResponse health(vmproto.Vm.HealthRequest request) {
      return blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.VersionResponse version(vmproto.Vm.VersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.BlockVerifyResponse blockVerify(vmproto.Vm.BlockVerifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockVerifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.BlockAcceptResponse blockAccept(vmproto.Vm.BlockAcceptRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockAcceptMethod(), getCallOptions(), request);
    }

    /**
     */
    public vmproto.Vm.BlockRejectResponse blockReject(vmproto.Vm.BlockRejectRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockRejectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VMFutureStub extends io.grpc.stub.AbstractStub<VMFutureStub> {
    private VMFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VMFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VMFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VMFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.InitializeResponse> initialize(
        vmproto.Vm.InitializeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInitializeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.BootstrappingResponse> bootstrapping(
        vmproto.Vm.BootstrappingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBootstrappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.BootstrappedResponse> bootstrapped(
        vmproto.Vm.BootstrappedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBootstrappedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.ShutdownResponse> shutdown(
        vmproto.Vm.ShutdownRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.CreateHandlersResponse> createHandlers(
        vmproto.Vm.CreateHandlersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateHandlersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.CreateStaticHandlersResponse> createStaticHandlers(
        vmproto.Vm.CreateStaticHandlersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStaticHandlersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.BuildBlockResponse> buildBlock(
        vmproto.Vm.BuildBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuildBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.ParseBlockResponse> parseBlock(
        vmproto.Vm.ParseBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.GetBlockResponse> getBlock(
        vmproto.Vm.GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.SetPreferenceResponse> setPreference(
        vmproto.Vm.SetPreferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPreferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.HealthResponse> health(
        vmproto.Vm.HealthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.VersionResponse> version(
        vmproto.Vm.VersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.BlockVerifyResponse> blockVerify(
        vmproto.Vm.BlockVerifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockVerifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.BlockAcceptResponse> blockAccept(
        vmproto.Vm.BlockAcceptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockAcceptMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vmproto.Vm.BlockRejectResponse> blockReject(
        vmproto.Vm.BlockRejectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockRejectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIALIZE = 0;
  private static final int METHODID_BOOTSTRAPPING = 1;
  private static final int METHODID_BOOTSTRAPPED = 2;
  private static final int METHODID_SHUTDOWN = 3;
  private static final int METHODID_CREATE_HANDLERS = 4;
  private static final int METHODID_CREATE_STATIC_HANDLERS = 5;
  private static final int METHODID_BUILD_BLOCK = 6;
  private static final int METHODID_PARSE_BLOCK = 7;
  private static final int METHODID_GET_BLOCK = 8;
  private static final int METHODID_SET_PREFERENCE = 9;
  private static final int METHODID_HEALTH = 10;
  private static final int METHODID_VERSION = 11;
  private static final int METHODID_BLOCK_VERIFY = 12;
  private static final int METHODID_BLOCK_ACCEPT = 13;
  private static final int METHODID_BLOCK_REJECT = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VMImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VMImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIALIZE:
          serviceImpl.initialize((vmproto.Vm.InitializeRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.InitializeResponse>) responseObserver);
          break;
        case METHODID_BOOTSTRAPPING:
          serviceImpl.bootstrapping((vmproto.Vm.BootstrappingRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappingResponse>) responseObserver);
          break;
        case METHODID_BOOTSTRAPPED:
          serviceImpl.bootstrapped((vmproto.Vm.BootstrappedRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.BootstrappedResponse>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((vmproto.Vm.ShutdownRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.ShutdownResponse>) responseObserver);
          break;
        case METHODID_CREATE_HANDLERS:
          serviceImpl.createHandlers((vmproto.Vm.CreateHandlersRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.CreateHandlersResponse>) responseObserver);
          break;
        case METHODID_CREATE_STATIC_HANDLERS:
          serviceImpl.createStaticHandlers((vmproto.Vm.CreateStaticHandlersRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.CreateStaticHandlersResponse>) responseObserver);
          break;
        case METHODID_BUILD_BLOCK:
          serviceImpl.buildBlock((vmproto.Vm.BuildBlockRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.BuildBlockResponse>) responseObserver);
          break;
        case METHODID_PARSE_BLOCK:
          serviceImpl.parseBlock((vmproto.Vm.ParseBlockRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.ParseBlockResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((vmproto.Vm.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.GetBlockResponse>) responseObserver);
          break;
        case METHODID_SET_PREFERENCE:
          serviceImpl.setPreference((vmproto.Vm.SetPreferenceRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.SetPreferenceResponse>) responseObserver);
          break;
        case METHODID_HEALTH:
          serviceImpl.health((vmproto.Vm.HealthRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.HealthResponse>) responseObserver);
          break;
        case METHODID_VERSION:
          serviceImpl.version((vmproto.Vm.VersionRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.VersionResponse>) responseObserver);
          break;
        case METHODID_BLOCK_VERIFY:
          serviceImpl.blockVerify((vmproto.Vm.BlockVerifyRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.BlockVerifyResponse>) responseObserver);
          break;
        case METHODID_BLOCK_ACCEPT:
          serviceImpl.blockAccept((vmproto.Vm.BlockAcceptRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.BlockAcceptResponse>) responseObserver);
          break;
        case METHODID_BLOCK_REJECT:
          serviceImpl.blockReject((vmproto.Vm.BlockRejectRequest) request,
              (io.grpc.stub.StreamObserver<vmproto.Vm.BlockRejectResponse>) responseObserver);
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

  private static abstract class VMBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VMBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vmproto.Vm.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VM");
    }
  }

  private static final class VMFileDescriptorSupplier
      extends VMBaseDescriptorSupplier {
    VMFileDescriptorSupplier() {}
  }

  private static final class VMMethodDescriptorSupplier
      extends VMBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VMMethodDescriptorSupplier(String methodName) {
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
      synchronized (VMGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VMFileDescriptorSupplier())
              .addMethod(getInitializeMethod())
              .addMethod(getBootstrappingMethod())
              .addMethod(getBootstrappedMethod())
              .addMethod(getShutdownMethod())
              .addMethod(getCreateHandlersMethod())
              .addMethod(getCreateStaticHandlersMethod())
              .addMethod(getBuildBlockMethod())
              .addMethod(getParseBlockMethod())
              .addMethod(getGetBlockMethod())
              .addMethod(getSetPreferenceMethod())
              .addMethod(getHealthMethod())
              .addMethod(getVersionMethod())
              .addMethod(getBlockVerifyMethod())
              .addMethod(getBlockAcceptMethod())
              .addMethod(getBlockRejectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
