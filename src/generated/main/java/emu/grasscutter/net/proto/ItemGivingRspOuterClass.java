// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemGivingRsp.proto

package emu.grasscutter.net.proto;

public final class ItemGivingRspOuterClass {
  private ItemGivingRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ItemGivingRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemGivingRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 giving_group_id = 4;</code>
     * @return The givingGroupId.
     */
    int getGivingGroupId();

    /**
     * <code>uint32 giving_id = 10;</code>
     * @return The givingId.
     */
    int getGivingId();
  }
  /**
   * Protobuf type {@code ItemGivingRsp}
   */
  public static final class ItemGivingRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ItemGivingRsp)
      ItemGivingRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ItemGivingRsp.newBuilder() to construct.
    private ItemGivingRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ItemGivingRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ItemGivingRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ItemGivingRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 32: {

              givingGroupId_ = input.readUInt32();
              break;
            }
            case 80: {

              givingId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.class, emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GIVING_GROUP_ID_FIELD_NUMBER = 4;
    private int givingGroupId_;
    /**
     * <code>uint32 giving_group_id = 4;</code>
     * @return The givingGroupId.
     */
    @java.lang.Override
    public int getGivingGroupId() {
      return givingGroupId_;
    }

    public static final int GIVING_ID_FIELD_NUMBER = 10;
    private int givingId_;
    /**
     * <code>uint32 giving_id = 10;</code>
     * @return The givingId.
     */
    @java.lang.Override
    public int getGivingId() {
      return givingId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (givingGroupId_ != 0) {
        output.writeUInt32(4, givingGroupId_);
      }
      if (givingId_ != 0) {
        output.writeUInt32(10, givingId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (givingGroupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, givingGroupId_);
      }
      if (givingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, givingId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp other = (emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGivingGroupId()
          != other.getGivingGroupId()) return false;
      if (getGivingId()
          != other.getGivingId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GIVING_GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGivingGroupId();
      hash = (37 * hash) + GIVING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGivingId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code ItemGivingRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemGivingRsp)
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.class, emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        givingGroupId_ = 0;

        givingId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp build() {
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp buildPartial() {
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp result = new emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp(this);
        result.retcode_ = retcode_;
        result.givingGroupId_ = givingGroupId_;
        result.givingId_ = givingId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp other) {
        if (other == emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGivingGroupId() != 0) {
          setGivingGroupId(other.getGivingGroupId());
        }
        if (other.getGivingId() != 0) {
          setGivingId(other.getGivingId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int givingGroupId_ ;
      /**
       * <code>uint32 giving_group_id = 4;</code>
       * @return The givingGroupId.
       */
      @java.lang.Override
      public int getGivingGroupId() {
        return givingGroupId_;
      }
      /**
       * <code>uint32 giving_group_id = 4;</code>
       * @param value The givingGroupId to set.
       * @return This builder for chaining.
       */
      public Builder setGivingGroupId(int value) {
        
        givingGroupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 giving_group_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGivingGroupId() {
        
        givingGroupId_ = 0;
        onChanged();
        return this;
      }

      private int givingId_ ;
      /**
       * <code>uint32 giving_id = 10;</code>
       * @return The givingId.
       */
      @java.lang.Override
      public int getGivingId() {
        return givingId_;
      }
      /**
       * <code>uint32 giving_id = 10;</code>
       * @param value The givingId to set.
       * @return This builder for chaining.
       */
      public Builder setGivingId(int value) {
        
        givingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 giving_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGivingId() {
        
        givingId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ItemGivingRsp)
    }

    // @@protoc_insertion_point(class_scope:ItemGivingRsp)
    private static final emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp();
    }

    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ItemGivingRsp>
        PARSER = new com.google.protobuf.AbstractParser<ItemGivingRsp>() {
      @java.lang.Override
      public ItemGivingRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ItemGivingRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ItemGivingRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ItemGivingRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemGivingRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ItemGivingRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ItemGivingRsp.proto\"L\n\rItemGivingRsp\022\017" +
      "\n\007retcode\030\003 \001(\005\022\027\n\017giving_group_id\030\004 \001(\r" +
      "\022\021\n\tgiving_id\030\n \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ItemGivingRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemGivingRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ItemGivingRsp_descriptor,
        new java.lang.String[] { "Retcode", "GivingGroupId", "GivingId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
