// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gsubnetlookup.proto

package gsubnetlookupproto;

public final class Gsubnetlookup {
  private Gsubnetlookup() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubnetIDRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gsubnetlookupproto.SubnetIDRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes chainID = 1;</code>
     */
    com.google.protobuf.ByteString getChainID();
  }
  /**
   * Protobuf type {@code gsubnetlookupproto.SubnetIDRequest}
   */
  public  static final class SubnetIDRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gsubnetlookupproto.SubnetIDRequest)
      SubnetIDRequestOrBuilder {
    // Use SubnetIDRequest.newBuilder() to construct.
    private SubnetIDRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubnetIDRequest() {
      chainID_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SubnetIDRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              chainID_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.class, gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.Builder.class);
    }

    public static final int CHAINID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString chainID_;
    /**
     * <code>bytes chainID = 1;</code>
     */
    public com.google.protobuf.ByteString getChainID() {
      return chainID_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!chainID_.isEmpty()) {
        output.writeBytes(1, chainID_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!chainID_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, chainID_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest)) {
        return super.equals(obj);
      }
      gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest other = (gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest) obj;

      boolean result = true;
      result = result && getChainID()
          .equals(other.getChainID());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CHAINID_FIELD_NUMBER;
      hash = (53 * hash) + getChainID().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gsubnetlookupproto.SubnetIDRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gsubnetlookupproto.SubnetIDRequest)
        gsubnetlookupproto.Gsubnetlookup.SubnetIDRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.class, gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.Builder.class);
      }

      // Construct using gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        chainID_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDRequest_descriptor;
      }

      public gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest getDefaultInstanceForType() {
        return gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.getDefaultInstance();
      }

      public gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest build() {
        gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest buildPartial() {
        gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest result = new gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest(this);
        result.chainID_ = chainID_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest) {
          return mergeFrom((gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest other) {
        if (other == gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest.getDefaultInstance()) return this;
        if (other.getChainID() != com.google.protobuf.ByteString.EMPTY) {
          setChainID(other.getChainID());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString chainID_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes chainID = 1;</code>
       */
      public com.google.protobuf.ByteString getChainID() {
        return chainID_;
      }
      /**
       * <code>bytes chainID = 1;</code>
       */
      public Builder setChainID(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        chainID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes chainID = 1;</code>
       */
      public Builder clearChainID() {
        
        chainID_ = getDefaultInstance().getChainID();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:gsubnetlookupproto.SubnetIDRequest)
    }

    // @@protoc_insertion_point(class_scope:gsubnetlookupproto.SubnetIDRequest)
    private static final gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest();
    }

    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubnetIDRequest>
        PARSER = new com.google.protobuf.AbstractParser<SubnetIDRequest>() {
      public SubnetIDRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SubnetIDRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubnetIDRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubnetIDRequest> getParserForType() {
      return PARSER;
    }

    public gsubnetlookupproto.Gsubnetlookup.SubnetIDRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SubnetIDResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gsubnetlookupproto.SubnetIDResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes id = 1;</code>
     */
    com.google.protobuf.ByteString getId();
  }
  /**
   * Protobuf type {@code gsubnetlookupproto.SubnetIDResponse}
   */
  public  static final class SubnetIDResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gsubnetlookupproto.SubnetIDResponse)
      SubnetIDResponseOrBuilder {
    // Use SubnetIDResponse.newBuilder() to construct.
    private SubnetIDResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubnetIDResponse() {
      id_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SubnetIDResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              id_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.class, gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString id_;
    /**
     * <code>bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!id_.isEmpty()) {
        output.writeBytes(1, id_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!id_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, id_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse)) {
        return super.equals(obj);
      }
      gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse other = (gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gsubnetlookupproto.SubnetIDResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gsubnetlookupproto.SubnetIDResponse)
        gsubnetlookupproto.Gsubnetlookup.SubnetIDResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.class, gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.Builder.class);
      }

      // Construct using gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        id_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gsubnetlookupproto.Gsubnetlookup.internal_static_gsubnetlookupproto_SubnetIDResponse_descriptor;
      }

      public gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse getDefaultInstanceForType() {
        return gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.getDefaultInstance();
      }

      public gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse build() {
        gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse buildPartial() {
        gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse result = new gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse(this);
        result.id_ = id_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse) {
          return mergeFrom((gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse other) {
        if (other == gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse.getDefaultInstance()) return this;
        if (other.getId() != com.google.protobuf.ByteString.EMPTY) {
          setId(other.getId());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes id = 1;</code>
       */
      public com.google.protobuf.ByteString getId() {
        return id_;
      }
      /**
       * <code>bytes id = 1;</code>
       */
      public Builder setId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:gsubnetlookupproto.SubnetIDResponse)
    }

    // @@protoc_insertion_point(class_scope:gsubnetlookupproto.SubnetIDResponse)
    private static final gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse();
    }

    public static gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubnetIDResponse>
        PARSER = new com.google.protobuf.AbstractParser<SubnetIDResponse>() {
      public SubnetIDResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SubnetIDResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubnetIDResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubnetIDResponse> getParserForType() {
      return PARSER;
    }

    public gsubnetlookupproto.Gsubnetlookup.SubnetIDResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gsubnetlookupproto_SubnetIDRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gsubnetlookupproto_SubnetIDRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gsubnetlookupproto_SubnetIDResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gsubnetlookupproto_SubnetIDResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023gsubnetlookup.proto\022\022gsubnetlookupprot" +
      "o\"\"\n\017SubnetIDRequest\022\017\n\007chainID\030\001 \001(\014\"\036\n" +
      "\020SubnetIDResponse\022\n\n\002id\030\001 \001(\0142e\n\014SubnetL" +
      "ookup\022U\n\010SubnetID\022#.gsubnetlookupproto.S" +
      "ubnetIDRequest\032$.gsubnetlookupproto.Subn" +
      "etIDResponseBMZKgithub.com/ava-labs/aval" +
      "anchego/rpcchainvm/gsubnetlookup/gsubnet" +
      "lookupprotob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_gsubnetlookupproto_SubnetIDRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gsubnetlookupproto_SubnetIDRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gsubnetlookupproto_SubnetIDRequest_descriptor,
        new java.lang.String[] { "ChainID", });
    internal_static_gsubnetlookupproto_SubnetIDResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gsubnetlookupproto_SubnetIDResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gsubnetlookupproto_SubnetIDResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
