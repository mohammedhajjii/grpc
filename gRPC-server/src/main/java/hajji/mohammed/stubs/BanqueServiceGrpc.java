package hajji.mohammed.stubs;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: schema.proto")
public final class BanqueServiceGrpc {

  private BanqueServiceGrpc() {}

  public static final String SERVICE_NAME = "BanqueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getUnaryModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryModel",
      requestType = hajji.mohammed.stubs.Schema.ObjectRequest.class,
      responseType = hajji.mohammed.stubs.Schema.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getUnaryModelMethod() {
    io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse> getUnaryModelMethod;
    if ((getUnaryModelMethod = BanqueServiceGrpc.getUnaryModelMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getUnaryModelMethod = BanqueServiceGrpc.getUnaryModelMethod) == null) {
          BanqueServiceGrpc.getUnaryModelMethod = getUnaryModelMethod = 
              io.grpc.MethodDescriptor.<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "unaryModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("unaryModel"))
                  .build();
          }
        }
     }
     return getUnaryModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getServerStreamModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStreamModel",
      requestType = hajji.mohammed.stubs.Schema.ObjectRequest.class,
      responseType = hajji.mohammed.stubs.Schema.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getServerStreamModelMethod() {
    io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse> getServerStreamModelMethod;
    if ((getServerStreamModelMethod = BanqueServiceGrpc.getServerStreamModelMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getServerStreamModelMethod = BanqueServiceGrpc.getServerStreamModelMethod) == null) {
          BanqueServiceGrpc.getServerStreamModelMethod = getServerStreamModelMethod = 
              io.grpc.MethodDescriptor.<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "serverStreamModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("serverStreamModel"))
                  .build();
          }
        }
     }
     return getServerStreamModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getClientStreamModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStreamModel",
      requestType = hajji.mohammed.stubs.Schema.ObjectRequest.class,
      responseType = hajji.mohammed.stubs.Schema.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getClientStreamModelMethod() {
    io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse> getClientStreamModelMethod;
    if ((getClientStreamModelMethod = BanqueServiceGrpc.getClientStreamModelMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getClientStreamModelMethod = BanqueServiceGrpc.getClientStreamModelMethod) == null) {
          BanqueServiceGrpc.getClientStreamModelMethod = getClientStreamModelMethod = 
              io.grpc.MethodDescriptor.<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "clientStreamModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("clientStreamModel"))
                  .build();
          }
        }
     }
     return getClientStreamModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getFullStreamModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStreamModel",
      requestType = hajji.mohammed.stubs.Schema.ObjectRequest.class,
      responseType = hajji.mohammed.stubs.Schema.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest,
      hajji.mohammed.stubs.Schema.ObjectResponse> getFullStreamModelMethod() {
    io.grpc.MethodDescriptor<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse> getFullStreamModelMethod;
    if ((getFullStreamModelMethod = BanqueServiceGrpc.getFullStreamModelMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getFullStreamModelMethod = BanqueServiceGrpc.getFullStreamModelMethod) == null) {
          BanqueServiceGrpc.getFullStreamModelMethod = getFullStreamModelMethod = 
              io.grpc.MethodDescriptor.<hajji.mohammed.stubs.Schema.ObjectRequest, hajji.mohammed.stubs.Schema.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "fullStreamModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hajji.mohammed.stubs.Schema.ObjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("fullStreamModel"))
                  .build();
          }
        }
     }
     return getFullStreamModelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BanqueServiceStub newStub(io.grpc.Channel channel) {
    return new BanqueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BanqueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BanqueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BanqueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BanqueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BanqueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void unaryModel(hajji.mohammed.stubs.Schema.ObjectRequest request,
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnaryModelMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamModel(hajji.mohammed.stubs.Schema.ObjectRequest request,
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamModelMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectRequest> clientStreamModel(
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamModelMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectRequest> fullStreamModel(
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullStreamModelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                hajji.mohammed.stubs.Schema.ObjectRequest,
                hajji.mohammed.stubs.Schema.ObjectResponse>(
                  this, METHODID_UNARY_MODEL)))
          .addMethod(
            getServerStreamModelMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                hajji.mohammed.stubs.Schema.ObjectRequest,
                hajji.mohammed.stubs.Schema.ObjectResponse>(
                  this, METHODID_SERVER_STREAM_MODEL)))
          .addMethod(
            getClientStreamModelMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                hajji.mohammed.stubs.Schema.ObjectRequest,
                hajji.mohammed.stubs.Schema.ObjectResponse>(
                  this, METHODID_CLIENT_STREAM_MODEL)))
          .addMethod(
            getFullStreamModelMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                hajji.mohammed.stubs.Schema.ObjectRequest,
                hajji.mohammed.stubs.Schema.ObjectResponse>(
                  this, METHODID_FULL_STREAM_MODEL)))
          .build();
    }
  }

  /**
   */
  public static final class BanqueServiceStub extends io.grpc.stub.AbstractStub<BanqueServiceStub> {
    private BanqueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceStub(channel, callOptions);
    }

    /**
     */
    public void unaryModel(hajji.mohammed.stubs.Schema.ObjectRequest request,
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnaryModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamModel(hajji.mohammed.stubs.Schema.ObjectRequest request,
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectRequest> clientStreamModel(
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamModelMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectRequest> fullStreamModel(
        io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullStreamModelMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BanqueServiceBlockingStub extends io.grpc.stub.AbstractStub<BanqueServiceBlockingStub> {
    private BanqueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public hajji.mohammed.stubs.Schema.ObjectResponse unaryModel(hajji.mohammed.stubs.Schema.ObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnaryModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<hajji.mohammed.stubs.Schema.ObjectResponse> serverStreamModel(
        hajji.mohammed.stubs.Schema.ObjectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamModelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BanqueServiceFutureStub extends io.grpc.stub.AbstractStub<BanqueServiceFutureStub> {
    private BanqueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<hajji.mohammed.stubs.Schema.ObjectResponse> unaryModel(
        hajji.mohammed.stubs.Schema.ObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnaryModelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_MODEL = 0;
  private static final int METHODID_SERVER_STREAM_MODEL = 1;
  private static final int METHODID_CLIENT_STREAM_MODEL = 2;
  private static final int METHODID_FULL_STREAM_MODEL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BanqueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BanqueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_MODEL:
          serviceImpl.unaryModel((hajji.mohammed.stubs.Schema.ObjectRequest) request,
              (io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_MODEL:
          serviceImpl.serverStreamModel((hajji.mohammed.stubs.Schema.ObjectRequest) request,
              (io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse>) responseObserver);
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
        case METHODID_CLIENT_STREAM_MODEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamModel(
              (io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse>) responseObserver);
        case METHODID_FULL_STREAM_MODEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullStreamModel(
              (io.grpc.stub.StreamObserver<hajji.mohammed.stubs.Schema.ObjectResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BanqueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return hajji.mohammed.stubs.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BanqueService");
    }
  }

  private static final class BanqueServiceFileDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier {
    BanqueServiceFileDescriptorSupplier() {}
  }

  private static final class BanqueServiceMethodDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BanqueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BanqueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BanqueServiceFileDescriptorSupplier())
              .addMethod(getUnaryModelMethod())
              .addMethod(getServerStreamModelMethod())
              .addMethod(getClientStreamModelMethod())
              .addMethod(getFullStreamModelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
