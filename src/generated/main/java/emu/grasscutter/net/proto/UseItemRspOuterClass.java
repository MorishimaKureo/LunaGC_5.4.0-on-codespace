// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UseItemRsp.proto

package emu.grasscutter.net.proto;

public final class UseItemRspOuterClass {
  private UseItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UseItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
     * @return A list containing the aEOBGGBIOEA.
     */
    java.util.List<java.lang.Integer> getAEOBGGBIOEAList();
    /**
     * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
     * @return The count of aEOBGGBIOEA.
     */
    int getAEOBGGBIOEACount();
    /**
     * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
     * @param index The index of the element to return.
     * @return The aEOBGGBIOEA at the given index.
     */
    int getAEOBGGBIOEA(int index);

    /**
     * <code>uint32 item_id = 15;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 guid = 9;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 option_idx = 7;</code>
     * @return The optionIdx.
     */
    int getOptionIdx();

    /**
     * <code>uint64 target_guid = 14;</code>
     * @return The targetGuid.
     */
    long getTargetGuid();
  }
  /**
   * Protobuf type {@code UseItemRsp}
   */
  public static final class UseItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UseItemRsp)
      UseItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UseItemRsp.newBuilder() to construct.
    private UseItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UseItemRsp() {
      aEOBGGBIOEA_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UseItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UseItemRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 56: {

              optionIdx_ = input.readUInt32();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 72: {

              guid_ = input.readUInt64();
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aEOBGGBIOEA_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              aEOBGGBIOEA_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                aEOBGGBIOEA_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                aEOBGGBIOEA_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              targetGuid_ = input.readUInt64();
              break;
            }
            case 120: {

              itemId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          aEOBGGBIOEA_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.class, emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.Builder.class);
    }

    public static final int AEOBGGBIOEA_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList aEOBGGBIOEA_;
    /**
     * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
     * @return A list containing the aEOBGGBIOEA.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAEOBGGBIOEAList() {
      return aEOBGGBIOEA_;
    }
    /**
     * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
     * @return The count of aEOBGGBIOEA.
     */
    public int getAEOBGGBIOEACount() {
      return aEOBGGBIOEA_.size();
    }
    /**
     * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
     * @param index The index of the element to return.
     * @return The aEOBGGBIOEA at the given index.
     */
    public int getAEOBGGBIOEA(int index) {
      return aEOBGGBIOEA_.getInt(index);
    }
    private int aEOBGGBIOEAMemoizedSerializedSize = -1;

    public static final int ITEM_ID_FIELD_NUMBER = 15;
    private int itemId_;
    /**
     * <code>uint32 item_id = 15;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int GUID_FIELD_NUMBER = 9;
    private long guid_;
    /**
     * <code>uint64 guid = 9;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OPTION_IDX_FIELD_NUMBER = 7;
    private int optionIdx_;
    /**
     * <code>uint32 option_idx = 7;</code>
     * @return The optionIdx.
     */
    @java.lang.Override
    public int getOptionIdx() {
      return optionIdx_;
    }

    public static final int TARGET_GUID_FIELD_NUMBER = 14;
    private long targetGuid_;
    /**
     * <code>uint64 target_guid = 14;</code>
     * @return The targetGuid.
     */
    @java.lang.Override
    public long getTargetGuid() {
      return targetGuid_;
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
      getSerializedSize();
      if (optionIdx_ != 0) {
        output.writeUInt32(7, optionIdx_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(9, guid_);
      }
      if (getAEOBGGBIOEAList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(aEOBGGBIOEAMemoizedSerializedSize);
      }
      for (int i = 0; i < aEOBGGBIOEA_.size(); i++) {
        output.writeUInt32NoTag(aEOBGGBIOEA_.getInt(i));
      }
      if (targetGuid_ != 0L) {
        output.writeUInt64(14, targetGuid_);
      }
      if (itemId_ != 0) {
        output.writeUInt32(15, itemId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (optionIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, optionIdx_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, guid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < aEOBGGBIOEA_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(aEOBGGBIOEA_.getInt(i));
        }
        size += dataSize;
        if (!getAEOBGGBIOEAList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        aEOBGGBIOEAMemoizedSerializedSize = dataSize;
      }
      if (targetGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, targetGuid_);
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, itemId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp other = (emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp) obj;

      if (!getAEOBGGBIOEAList()
          .equals(other.getAEOBGGBIOEAList())) return false;
      if (getItemId()
          != other.getItemId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getOptionIdx()
          != other.getOptionIdx()) return false;
      if (getTargetGuid()
          != other.getTargetGuid()) return false;
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
      if (getAEOBGGBIOEACount() > 0) {
        hash = (37 * hash) + AEOBGGBIOEA_FIELD_NUMBER;
        hash = (53 * hash) + getAEOBGGBIOEAList().hashCode();
      }
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + OPTION_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getOptionIdx();
      hash = (37 * hash) + TARGET_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp prototype) {
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
     * Protobuf type {@code UseItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseItemRsp)
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.class, emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.newBuilder()
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
        aEOBGGBIOEA_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        itemId_ = 0;

        guid_ = 0L;

        retcode_ = 0;

        optionIdx_ = 0;

        targetGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp build() {
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp buildPartial() {
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp result = new emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          aEOBGGBIOEA_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aEOBGGBIOEA_ = aEOBGGBIOEA_;
        result.itemId_ = itemId_;
        result.guid_ = guid_;
        result.retcode_ = retcode_;
        result.optionIdx_ = optionIdx_;
        result.targetGuid_ = targetGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp other) {
        if (other == emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.getDefaultInstance()) return this;
        if (!other.aEOBGGBIOEA_.isEmpty()) {
          if (aEOBGGBIOEA_.isEmpty()) {
            aEOBGGBIOEA_ = other.aEOBGGBIOEA_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAEOBGGBIOEAIsMutable();
            aEOBGGBIOEA_.addAll(other.aEOBGGBIOEA_);
          }
          onChanged();
        }
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getOptionIdx() != 0) {
          setOptionIdx(other.getOptionIdx());
        }
        if (other.getTargetGuid() != 0L) {
          setTargetGuid(other.getTargetGuid());
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
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList aEOBGGBIOEA_ = emptyIntList();
      private void ensureAEOBGGBIOEAIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          aEOBGGBIOEA_ = mutableCopy(aEOBGGBIOEA_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @return A list containing the aEOBGGBIOEA.
       */
      public java.util.List<java.lang.Integer>
          getAEOBGGBIOEAList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(aEOBGGBIOEA_) : aEOBGGBIOEA_;
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @return The count of aEOBGGBIOEA.
       */
      public int getAEOBGGBIOEACount() {
        return aEOBGGBIOEA_.size();
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @param index The index of the element to return.
       * @return The aEOBGGBIOEA at the given index.
       */
      public int getAEOBGGBIOEA(int index) {
        return aEOBGGBIOEA_.getInt(index);
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @param index The index to set the value at.
       * @param value The aEOBGGBIOEA to set.
       * @return This builder for chaining.
       */
      public Builder setAEOBGGBIOEA(
          int index, int value) {
        ensureAEOBGGBIOEAIsMutable();
        aEOBGGBIOEA_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @param value The aEOBGGBIOEA to add.
       * @return This builder for chaining.
       */
      public Builder addAEOBGGBIOEA(int value) {
        ensureAEOBGGBIOEAIsMutable();
        aEOBGGBIOEA_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @param values The aEOBGGBIOEA to add.
       * @return This builder for chaining.
       */
      public Builder addAllAEOBGGBIOEA(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAEOBGGBIOEAIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aEOBGGBIOEA_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AEOBGGBIOEA = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAEOBGGBIOEA() {
        aEOBGGBIOEA_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 15;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 15;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 9;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 9;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int optionIdx_ ;
      /**
       * <code>uint32 option_idx = 7;</code>
       * @return The optionIdx.
       */
      @java.lang.Override
      public int getOptionIdx() {
        return optionIdx_;
      }
      /**
       * <code>uint32 option_idx = 7;</code>
       * @param value The optionIdx to set.
       * @return This builder for chaining.
       */
      public Builder setOptionIdx(int value) {
        
        optionIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_idx = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionIdx() {
        
        optionIdx_ = 0;
        onChanged();
        return this;
      }

      private long targetGuid_ ;
      /**
       * <code>uint64 target_guid = 14;</code>
       * @return The targetGuid.
       */
      @java.lang.Override
      public long getTargetGuid() {
        return targetGuid_;
      }
      /**
       * <code>uint64 target_guid = 14;</code>
       * @param value The targetGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGuid(long value) {
        
        targetGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGuid() {
        
        targetGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:UseItemRsp)
    }

    // @@protoc_insertion_point(class_scope:UseItemRsp)
    private static final emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp();
    }

    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UseItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<UseItemRsp>() {
      @java.lang.Override
      public UseItemRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UseItemRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UseItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UseItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UseItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020UseItemRsp.proto\"z\n\nUseItemRsp\022\023\n\013AEOB" +
      "GGBIOEA\030\013 \003(\r\022\017\n\007item_id\030\017 \001(\r\022\014\n\004guid\030\t" +
      " \001(\004\022\017\n\007retcode\030\010 \001(\005\022\022\n\noption_idx\030\007 \001(" +
      "\r\022\023\n\013target_guid\030\016 \001(\004B\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UseItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UseItemRsp_descriptor,
        new java.lang.String[] { "AEOBGGBIOEA", "ItemId", "Guid", "Retcode", "OptionIdx", "TargetGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
