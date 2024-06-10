// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification/notification_api.proto

package com.example.asdfprotoproducer.java.notification;

public final class NotificationApi {
  private NotificationApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface NotificationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:notification.Notification)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * ID. Required. A unique identifier for the notification.
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The title.
     */
    String getTitle();
    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     * @return The body.
     */
    String getBody();
    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     * @return The bytes for body.
     */
    com.google.protobuf.ByteString
        getBodyBytes();
  }
  /**
   * <pre>
   * Notification is a message that can be sent to a user.
   * </pre>
   *
   * Protobuf type {@code notification.Notification}
   */
  public  static final class Notification extends
      com.google.protobuf.GeneratedMessageLite<
          Notification, Notification.Builder> implements
      // @@protoc_insertion_point(message_implements:notification.Notification)
      NotificationOrBuilder {
    private Notification() {
      title_ = "";
      body_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <pre>
     * ID. Required. A unique identifier for the notification.
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @Override
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * ID. Required. A unique identifier for the notification.
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     */
    private void setId(int value) {
      
      id_ = value;
    }
    /**
     * <pre>
     * ID. Required. A unique identifier for the notification.
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0;
    }

    public static final int TITLE_FIELD_NUMBER = 2;
    private String title_;
    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The title.
     */
    @Override
    public String getTitle() {
      return title_;
    }
    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    @Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(title_);
    }
    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The title to set.
     */
    private void setTitle(
        String value) {
      value.getClass();
  
      title_ = value;
    }
    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     */
    private void clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
    }
    /**
     * <pre>
     * Title. Required. The title of the notification.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     */
    private void setTitleBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      title_ = value.toStringUtf8();
      
    }

    public static final int BODY_FIELD_NUMBER = 3;
    private String body_;
    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     * @return The body.
     */
    @Override
    public String getBody() {
      return body_;
    }
    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     * @return The bytes for body.
     */
    @Override
    public com.google.protobuf.ByteString
        getBodyBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(body_);
    }
    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     * @param value The body to set.
     */
    private void setBody(
        String value) {
      value.getClass();
  
      body_ = value;
    }
    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     */
    private void clearBody() {
      
      body_ = getDefaultInstance().getBody();
    }
    /**
     * <pre>
     * Body. Required. The body of the notification.
     * </pre>
     *
     * <code>string body = 3;</code>
     * @param value The bytes for body to set.
     */
    private void setBodyBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      body_ = value.toStringUtf8();
      
    }

    public static NotificationApi.Notification parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static NotificationApi.Notification parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static NotificationApi.Notification parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static NotificationApi.Notification parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static NotificationApi.Notification parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static NotificationApi.Notification parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static NotificationApi.Notification parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static NotificationApi.Notification parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static NotificationApi.Notification parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static NotificationApi.Notification parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static NotificationApi.Notification parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static NotificationApi.Notification parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(NotificationApi.Notification prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Notification is a message that can be sent to a user.
     * </pre>
     *
     * Protobuf type {@code notification.Notification}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          NotificationApi.Notification, Builder> implements
        // @@protoc_insertion_point(builder_implements:notification.Notification)
        NotificationApi.NotificationOrBuilder {
      // Construct using notification.NotificationApi.Notification.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * ID. Required. A unique identifier for the notification.
       * </pre>
       *
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @Override
      public int getId() {
        return instance.getId();
      }
      /**
       * <pre>
       * ID. Required. A unique identifier for the notification.
       * </pre>
       *
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <pre>
       * ID. Required. A unique identifier for the notification.
       * </pre>
       *
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <pre>
       * Title. Required. The title of the notification.
       * </pre>
       *
       * <code>string title = 2;</code>
       * @return The title.
       */
      @Override
      public String getTitle() {
        return instance.getTitle();
      }
      /**
       * <pre>
       * Title. Required. The title of the notification.
       * </pre>
       *
       * <code>string title = 2;</code>
       * @return The bytes for title.
       */
      @Override
      public com.google.protobuf.ByteString
          getTitleBytes() {
        return instance.getTitleBytes();
      }
      /**
       * <pre>
       * Title. Required. The title of the notification.
       * </pre>
       *
       * <code>string title = 2;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          String value) {
        copyOnWrite();
        instance.setTitle(value);
        return this;
      }
      /**
       * <pre>
       * Title. Required. The title of the notification.
       * </pre>
       *
       * <code>string title = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        copyOnWrite();
        instance.clearTitle();
        return this;
      }
      /**
       * <pre>
       * Title. Required. The title of the notification.
       * </pre>
       *
       * <code>string title = 2;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTitleBytes(value);
        return this;
      }

      /**
       * <pre>
       * Body. Required. The body of the notification.
       * </pre>
       *
       * <code>string body = 3;</code>
       * @return The body.
       */
      @Override
      public String getBody() {
        return instance.getBody();
      }
      /**
       * <pre>
       * Body. Required. The body of the notification.
       * </pre>
       *
       * <code>string body = 3;</code>
       * @return The bytes for body.
       */
      @Override
      public com.google.protobuf.ByteString
          getBodyBytes() {
        return instance.getBodyBytes();
      }
      /**
       * <pre>
       * Body. Required. The body of the notification.
       * </pre>
       *
       * <code>string body = 3;</code>
       * @param value The body to set.
       * @return This builder for chaining.
       */
      public Builder setBody(
          String value) {
        copyOnWrite();
        instance.setBody(value);
        return this;
      }
      /**
       * <pre>
       * Body. Required. The body of the notification.
       * </pre>
       *
       * <code>string body = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBody() {
        copyOnWrite();
        instance.clearBody();
        return this;
      }
      /**
       * <pre>
       * Body. Required. The body of the notification.
       * </pre>
       *
       * <code>string body = 3;</code>
       * @param value The bytes for body to set.
       * @return This builder for chaining.
       */
      public Builder setBodyBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setBodyBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:notification.Notification)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new NotificationApi.Notification();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            Object[] objects = new Object[] {
              "id_",
              "title_",
              "body_",
            };
            String info =
                "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0208" +
                "\u0003\u0208";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<NotificationApi.Notification> parser = PARSER;
          if (parser == null) {
            synchronized (NotificationApi.Notification.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<NotificationApi.Notification>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:notification.Notification)
    private static final NotificationApi.Notification DEFAULT_INSTANCE;
    static {
      Notification defaultInstance = new Notification();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Notification.class, defaultInstance);
    }

    public static NotificationApi.Notification getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Notification> PARSER;

    public static com.google.protobuf.Parser<Notification> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}