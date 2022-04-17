package com.proto.greeting;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: greeting/greeting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "dummy.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greeting.GreetingRequest.class,
      responseType = com.proto.greeting.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingEveryoneRequest,
      com.proto.greeting.GreetingEveryoneResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetEveryone",
      requestType = com.proto.greeting.GreetingEveryoneRequest.class,
      responseType = com.proto.greeting.GreetingEveryoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingEveryoneRequest,
      com.proto.greeting.GreetingEveryoneResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingEveryoneRequest, com.proto.greeting.GreetingEveryoneResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingEveryoneRequest, com.proto.greeting.GreetingEveryoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingEveryoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingEveryoneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetEveryone"))
              .build();
        }
      }
    }
    return getGreetEveryoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingWithDeadlineRequest,
      com.proto.greeting.GreetingWithDeadlineResponse> getGreetWithDeadLinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetWithDeadLines",
      requestType = com.proto.greeting.GreetingWithDeadlineRequest.class,
      responseType = com.proto.greeting.GreetingWithDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingWithDeadlineRequest,
      com.proto.greeting.GreetingWithDeadlineResponse> getGreetWithDeadLinesMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingWithDeadlineRequest, com.proto.greeting.GreetingWithDeadlineResponse> getGreetWithDeadLinesMethod;
    if ((getGreetWithDeadLinesMethod = GreetServiceGrpc.getGreetWithDeadLinesMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetWithDeadLinesMethod = GreetServiceGrpc.getGreetWithDeadLinesMethod) == null) {
          GreetServiceGrpc.getGreetWithDeadLinesMethod = getGreetWithDeadLinesMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingWithDeadlineRequest, com.proto.greeting.GreetingWithDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetWithDeadLines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingWithDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingWithDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetWithDeadLines"))
              .build();
        }
      }
    }
    return getGreetWithDeadLinesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greeting.GreetingEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingEveryoneResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    /**
     * <pre>
     *this rpc will complete in no less than 300ms
     * </pre>
     */
    public void greetWithDeadLines(com.proto.greeting.GreetingWithDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingWithDeadlineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetWithDeadLinesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greeting.GreetingRequest,
                com.proto.greeting.GreetingResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetEveryoneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.greeting.GreetingEveryoneRequest,
                com.proto.greeting.GreetingEveryoneResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .addMethod(
            getGreetWithDeadLinesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greeting.GreetingWithDeadlineRequest,
                com.proto.greeting.GreetingWithDeadlineResponse>(
                  this, METHODID_GREET_WITH_DEAD_LINES)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     */
    public void greet(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greeting.GreetingEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingEveryoneResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *this rpc will complete in no less than 300ms
     * </pre>
     */
    public void greetWithDeadLines(com.proto.greeting.GreetingWithDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingWithDeadlineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetWithDeadLinesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.greeting.GreetingResponse greet(com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *this rpc will complete in no less than 300ms
     * </pre>
     */
    public com.proto.greeting.GreetingWithDeadlineResponse greetWithDeadLines(com.proto.greeting.GreetingWithDeadlineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetWithDeadLinesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greeting.GreetingResponse> greet(
        com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *this rpc will complete in no less than 300ms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greeting.GreetingWithDeadlineResponse> greetWithDeadLines(
        com.proto.greeting.GreetingWithDeadlineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetWithDeadLinesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_WITH_DEAD_LINES = 1;
  private static final int METHODID_GREET_EVERYONE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greeting.GreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse>) responseObserver);
          break;
        case METHODID_GREET_WITH_DEAD_LINES:
          serviceImpl.greetWithDeadLines((com.proto.greeting.GreetingWithDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingWithDeadlineResponse>) responseObserver);
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
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingEveryoneResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greeting.GreetingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetEveryoneMethod())
              .addMethod(getGreetWithDeadLinesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
