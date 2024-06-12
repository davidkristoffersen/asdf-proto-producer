package com.example.asdfprotoproducer.java;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/user/user_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User,
      com.example.asdfprotoproducer.java.UserApi.User> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.example.asdfprotoproducer.java.UserApi.User.class,
      responseType = com.example.asdfprotoproducer.java.UserApi.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User,
      com.example.asdfprotoproducer.java.UserApi.User> getCreateMethod() {
    io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User, com.example.asdfprotoproducer.java.UserApi.User> getCreateMethod;
    if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
          UserServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.example.asdfprotoproducer.java.UserApi.User, com.example.asdfprotoproducer.java.UserApi.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserApi.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserApi.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User,
      com.example.asdfprotoproducer.java.UserApi.User> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.example.asdfprotoproducer.java.UserApi.User.class,
      responseType = com.example.asdfprotoproducer.java.UserApi.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User,
      com.example.asdfprotoproducer.java.UserApi.User> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User, com.example.asdfprotoproducer.java.UserApi.User> getUpdateMethod;
    if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
          UserServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.asdfprotoproducer.java.UserApi.User, com.example.asdfprotoproducer.java.UserApi.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserApi.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserApi.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User,
      com.example.asdfprotoproducer.java.UserApi.User> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.example.asdfprotoproducer.java.UserApi.User.class,
      responseType = com.example.asdfprotoproducer.java.UserApi.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User,
      com.example.asdfprotoproducer.java.UserApi.User> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserApi.User, com.example.asdfprotoproducer.java.UserApi.User> getDeleteMethod;
    if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
          UserServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.example.asdfprotoproducer.java.UserApi.User, com.example.asdfprotoproducer.java.UserApi.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserApi.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserApi.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
      com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getCreateExtendedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExtended",
      requestType = com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.class,
      responseType = com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
      com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getCreateExtendedMethod() {
    io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended, com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getCreateExtendedMethod;
    if ((getCreateExtendedMethod = UserServiceGrpc.getCreateExtendedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateExtendedMethod = UserServiceGrpc.getCreateExtendedMethod) == null) {
          UserServiceGrpc.getCreateExtendedMethod = getCreateExtendedMethod =
              io.grpc.MethodDescriptor.<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended, com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExtended"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateExtended"))
              .build();
        }
      }
    }
    return getCreateExtendedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
      com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getUpdateExtendedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExtended",
      requestType = com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.class,
      responseType = com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
      com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getUpdateExtendedMethod() {
    io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended, com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getUpdateExtendedMethod;
    if ((getUpdateExtendedMethod = UserServiceGrpc.getUpdateExtendedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateExtendedMethod = UserServiceGrpc.getUpdateExtendedMethod) == null) {
          UserServiceGrpc.getUpdateExtendedMethod = getUpdateExtendedMethod =
              io.grpc.MethodDescriptor.<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended, com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExtended"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateExtended"))
              .build();
        }
      }
    }
    return getUpdateExtendedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
      com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getDeleteExtendedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExtended",
      requestType = com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.class,
      responseType = com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
      com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getDeleteExtendedMethod() {
    io.grpc.MethodDescriptor<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended, com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> getDeleteExtendedMethod;
    if ((getDeleteExtendedMethod = UserServiceGrpc.getDeleteExtendedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteExtendedMethod = UserServiceGrpc.getDeleteExtendedMethod) == null) {
          UserServiceGrpc.getDeleteExtendedMethod = getDeleteExtendedMethod =
              io.grpc.MethodDescriptor.<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended, com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExtended"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteExtended"))
              .build();
        }
      }
    }
    return getDeleteExtendedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    default void create(com.example.asdfprotoproducer.java.UserApi.User request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    default void update(com.example.asdfprotoproducer.java.UserApi.User request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    default void delete(com.example.asdfprotoproducer.java.UserApi.User request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    default void createExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExtendedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    default void updateExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExtendedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    default void deleteExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExtendedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public void create(com.example.asdfprotoproducer.java.UserApi.User request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public void update(com.example.asdfprotoproducer.java.UserApi.User request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public void delete(com.example.asdfprotoproducer.java.UserApi.User request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public void createExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExtendedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public void updateExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExtendedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public void deleteExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request,
        io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExtendedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public com.example.asdfprotoproducer.java.UserApi.User create(com.example.asdfprotoproducer.java.UserApi.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public com.example.asdfprotoproducer.java.UserApi.User update(com.example.asdfprotoproducer.java.UserApi.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public com.example.asdfprotoproducer.java.UserApi.User delete(com.example.asdfprotoproducer.java.UserApi.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended createExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExtendedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended updateExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExtendedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended deleteExtended(com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExtendedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.asdfprotoproducer.java.UserApi.User> create(
        com.example.asdfprotoproducer.java.UserApi.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.asdfprotoproducer.java.UserApi.User> update(
        com.example.asdfprotoproducer.java.UserApi.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.asdfprotoproducer.java.UserApi.User> delete(
        com.example.asdfprotoproducer.java.UserApi.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> createExtended(
        com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExtendedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> updateExtended(
        com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExtendedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended> deleteExtended(
        com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteExtendedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_CREATE_EXTENDED = 3;
  private static final int METHODID_UPDATE_EXTENDED = 4;
  private static final int METHODID_DELETE_EXTENDED = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.example.asdfprotoproducer.java.UserApi.User) request,
              (io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.asdfprotoproducer.java.UserApi.User) request,
              (io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.example.asdfprotoproducer.java.UserApi.User) request,
              (io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserApi.User>) responseObserver);
          break;
        case METHODID_CREATE_EXTENDED:
          serviceImpl.createExtended((com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended) request,
              (io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>) responseObserver);
          break;
        case METHODID_UPDATE_EXTENDED:
          serviceImpl.updateExtended((com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended) request,
              (io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>) responseObserver);
          break;
        case METHODID_DELETE_EXTENDED:
          serviceImpl.deleteExtended((com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended) request,
              (io.grpc.stub.StreamObserver<com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.asdfprotoproducer.java.UserApi.User,
              com.example.asdfprotoproducer.java.UserApi.User>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.asdfprotoproducer.java.UserApi.User,
              com.example.asdfprotoproducer.java.UserApi.User>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.asdfprotoproducer.java.UserApi.User,
              com.example.asdfprotoproducer.java.UserApi.User>(
                service, METHODID_DELETE)))
        .addMethod(
          getCreateExtendedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
              com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>(
                service, METHODID_CREATE_EXTENDED)))
        .addMethod(
          getUpdateExtendedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
              com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>(
                service, METHODID_UPDATE_EXTENDED)))
        .addMethod(
          getDeleteExtendedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended,
              com.example.asdfprotoproducer.java.UserExtendedOuterClass.UserExtended>(
                service, METHODID_DELETE_EXTENDED)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.asdfprotoproducer.java.UserApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getCreateExtendedMethod())
              .addMethod(getUpdateExtendedMethod())
              .addMethod(getDeleteExtendedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
