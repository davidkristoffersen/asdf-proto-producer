package com.example.asdfprotoproducer.grpc.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

import com.example.asdfprotoproducer.java.user.UserApi;
import com.example.asdfprotoproducer.java.user.UserExtendedOuterClass;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: user/user_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UserApi.User,
      UserApi.User> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = UserApi.User.class,
      responseType = UserApi.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserApi.User,
      UserApi.User> getCreateMethod() {
    io.grpc.MethodDescriptor<UserApi.User, UserApi.User> getCreateMethod;
    if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
          UserServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<UserApi.User, UserApi.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserApi.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserApi.User.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserApi.User,
      UserApi.User> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = UserApi.User.class,
      responseType = UserApi.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserApi.User,
      UserApi.User> getUpdateMethod() {
    io.grpc.MethodDescriptor<UserApi.User, UserApi.User> getUpdateMethod;
    if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
          UserServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<UserApi.User, UserApi.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserApi.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserApi.User.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserApi.User,
      UserApi.User> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = UserApi.User.class,
      responseType = UserApi.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserApi.User,
      UserApi.User> getDeleteMethod() {
    io.grpc.MethodDescriptor<UserApi.User, UserApi.User> getDeleteMethod;
    if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
          UserServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<UserApi.User, UserApi.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserApi.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserApi.User.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended,
      UserExtendedOuterClass.UserExtended> getCreateExtendedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExtended",
      requestType = UserExtendedOuterClass.UserExtended.class,
      responseType = UserExtendedOuterClass.UserExtended.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended,
      UserExtendedOuterClass.UserExtended> getCreateExtendedMethod() {
    io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended, UserExtendedOuterClass.UserExtended> getCreateExtendedMethod;
    if ((getCreateExtendedMethod = UserServiceGrpc.getCreateExtendedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateExtendedMethod = UserServiceGrpc.getCreateExtendedMethod) == null) {
          UserServiceGrpc.getCreateExtendedMethod = getCreateExtendedMethod =
              io.grpc.MethodDescriptor.<UserExtendedOuterClass.UserExtended, UserExtendedOuterClass.UserExtended>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExtended"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateExtendedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended,
      UserExtendedOuterClass.UserExtended> getUpdateExtendedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExtended",
      requestType = UserExtendedOuterClass.UserExtended.class,
      responseType = UserExtendedOuterClass.UserExtended.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended,
      UserExtendedOuterClass.UserExtended> getUpdateExtendedMethod() {
    io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended, UserExtendedOuterClass.UserExtended> getUpdateExtendedMethod;
    if ((getUpdateExtendedMethod = UserServiceGrpc.getUpdateExtendedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateExtendedMethod = UserServiceGrpc.getUpdateExtendedMethod) == null) {
          UserServiceGrpc.getUpdateExtendedMethod = getUpdateExtendedMethod =
              io.grpc.MethodDescriptor.<UserExtendedOuterClass.UserExtended, UserExtendedOuterClass.UserExtended>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExtended"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateExtendedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended,
      UserExtendedOuterClass.UserExtended> getDeleteExtendedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExtended",
      requestType = UserExtendedOuterClass.UserExtended.class,
      responseType = UserExtendedOuterClass.UserExtended.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended,
      UserExtendedOuterClass.UserExtended> getDeleteExtendedMethod() {
    io.grpc.MethodDescriptor<UserExtendedOuterClass.UserExtended, UserExtendedOuterClass.UserExtended> getDeleteExtendedMethod;
    if ((getDeleteExtendedMethod = UserServiceGrpc.getDeleteExtendedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteExtendedMethod = UserServiceGrpc.getDeleteExtendedMethod) == null) {
          UserServiceGrpc.getDeleteExtendedMethod = getDeleteExtendedMethod =
              io.grpc.MethodDescriptor.<UserExtendedOuterClass.UserExtended, UserExtendedOuterClass.UserExtended>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExtended"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserExtendedOuterClass.UserExtended.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  UserExtendedOuterClass.UserExtended.getDefaultInstance()))
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
        @Override
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
        @Override
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
        @Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public void create(UserApi.User request,
                       io.grpc.stub.StreamObserver<UserApi.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public void update(UserApi.User request,
                       io.grpc.stub.StreamObserver<UserApi.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public void delete(UserApi.User request,
                       io.grpc.stub.StreamObserver<UserApi.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public void createExtended(UserExtendedOuterClass.UserExtended request,
                               io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExtendedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public void updateExtended(UserExtendedOuterClass.UserExtended request,
                               io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExtendedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public void deleteExtended(UserExtendedOuterClass.UserExtended request,
                               io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExtendedMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserApi.User,
                UserApi.User>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserApi.User,
                UserApi.User>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserApi.User,
                UserApi.User>(
                  this, METHODID_DELETE)))
          .addMethod(
            getCreateExtendedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserExtendedOuterClass.UserExtended,
                UserExtendedOuterClass.UserExtended>(
                  this, METHODID_CREATE_EXTENDED)))
          .addMethod(
            getUpdateExtendedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserExtendedOuterClass.UserExtended,
                UserExtendedOuterClass.UserExtended>(
                  this, METHODID_UPDATE_EXTENDED)))
          .addMethod(
            getDeleteExtendedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserExtendedOuterClass.UserExtended,
                UserExtendedOuterClass.UserExtended>(
                  this, METHODID_DELETE_EXTENDED)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public void create(UserApi.User request,
                       io.grpc.stub.StreamObserver<UserApi.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public void update(UserApi.User request,
                       io.grpc.stub.StreamObserver<UserApi.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public void delete(UserApi.User request,
                       io.grpc.stub.StreamObserver<UserApi.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public void createExtended(UserExtendedOuterClass.UserExtended request,
                               io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExtendedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public void updateExtended(UserExtendedOuterClass.UserExtended request,
                               io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExtendedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public void deleteExtended(UserExtendedOuterClass.UserExtended request,
                               io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExtendedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public UserApi.User create(UserApi.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public UserApi.User update(UserApi.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public UserApi.User delete(UserApi.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public UserExtendedOuterClass.UserExtended createExtended(UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExtendedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public UserExtendedOuterClass.UserExtended updateExtended(UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExtendedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public UserExtendedOuterClass.UserExtended deleteExtended(UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExtendedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserApi.User> create(
        UserApi.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserApi.User> update(
        UserApi.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserApi.User> delete(
        UserApi.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new user with extended details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserExtendedOuterClass.UserExtended> createExtended(
        UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExtendedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a user with extended details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserExtendedOuterClass.UserExtended> updateExtended(
        UserExtendedOuterClass.UserExtended request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExtendedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a user with extended details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserExtendedOuterClass.UserExtended> deleteExtended(
        UserExtendedOuterClass.UserExtended request) {
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
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((UserApi.User) request,
              (io.grpc.stub.StreamObserver<UserApi.User>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((UserApi.User) request,
              (io.grpc.stub.StreamObserver<UserApi.User>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((UserApi.User) request,
              (io.grpc.stub.StreamObserver<UserApi.User>) responseObserver);
          break;
        case METHODID_CREATE_EXTENDED:
          serviceImpl.createExtended((UserExtendedOuterClass.UserExtended) request,
              (io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended>) responseObserver);
          break;
        case METHODID_UPDATE_EXTENDED:
          serviceImpl.updateExtended((UserExtendedOuterClass.UserExtended) request,
              (io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended>) responseObserver);
          break;
        case METHODID_DELETE_EXTENDED:
          serviceImpl.deleteExtended((UserExtendedOuterClass.UserExtended) request,
              (io.grpc.stub.StreamObserver<UserExtendedOuterClass.UserExtended>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
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
