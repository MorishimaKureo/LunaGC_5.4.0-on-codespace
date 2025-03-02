// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayRewardInfo.proto

package emu.grasscutter.net.proto;

public final class MpPlayRewardInfoOuterClass {
  private MpPlayRewardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayRewardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayRewardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 qualify_uid_list = 3;</code>
     * @return A list containing the qualifyUidList.
     */
    java.util.List<java.lang.Integer> getQualifyUidListList();
    /**
     * <code>repeated uint32 qualify_uid_list = 3;</code>
     * @return The count of qualifyUidList.
     */
    int getQualifyUidListCount();
    /**
     * <code>repeated uint32 qualify_uid_list = 3;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    int getQualifyUidList(int index);

    /**
     * <code>repeated uint32 remain_uid_list = 2;</code>
     * @return A list containing the remainUidList.
     */
    java.util.List<java.lang.Integer> getRemainUidListList();
    /**
     * <code>repeated uint32 remain_uid_list = 2;</code>
     * @return The count of remainUidList.
     */
    int getRemainUidListCount();
    /**
     * <code>repeated uint32 remain_uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The remainUidList at the given index.
     */
    int getRemainUidList(int index);

    /**
     * <code>uint32 resin = 1;</code>
     * @return The resin.
     */
    int getResin();
  }
  /**
   * Protobuf type {@code MpPlayRewardInfo}
   */
  public static final class MpPlayRewardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayRewardInfo)
      MpPlayRewardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayRewardInfo.newBuilder() to construct.
    private MpPlayRewardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayRewardInfo() {
      qualifyUidList_ = emptyIntList();
      remainUidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayRewardInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MpPlayRewardInfo(
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
            case 8: {

              resin_ = input.readUInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                remainUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              remainUidList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                remainUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                remainUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                qualifyUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              qualifyUidList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                qualifyUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                qualifyUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          remainUidList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.class, emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder.class);
    }

    public static final int QUALIFY_UID_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList qualifyUidList_;
    /**
     * <code>repeated uint32 qualify_uid_list = 3;</code>
     * @return A list containing the qualifyUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getQualifyUidListList() {
      return qualifyUidList_;
    }
    /**
     * <code>repeated uint32 qualify_uid_list = 3;</code>
     * @return The count of qualifyUidList.
     */
    public int getQualifyUidListCount() {
      return qualifyUidList_.size();
    }
    /**
     * <code>repeated uint32 qualify_uid_list = 3;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    public int getQualifyUidList(int index) {
      return qualifyUidList_.getInt(index);
    }
    private int qualifyUidListMemoizedSerializedSize = -1;

    public static final int REMAIN_UID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList remainUidList_;
    /**
     * <code>repeated uint32 remain_uid_list = 2;</code>
     * @return A list containing the remainUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRemainUidListList() {
      return remainUidList_;
    }
    /**
     * <code>repeated uint32 remain_uid_list = 2;</code>
     * @return The count of remainUidList.
     */
    public int getRemainUidListCount() {
      return remainUidList_.size();
    }
    /**
     * <code>repeated uint32 remain_uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The remainUidList at the given index.
     */
    public int getRemainUidList(int index) {
      return remainUidList_.getInt(index);
    }
    private int remainUidListMemoizedSerializedSize = -1;

    public static final int RESIN_FIELD_NUMBER = 1;
    private int resin_;
    /**
     * <code>uint32 resin = 1;</code>
     * @return The resin.
     */
    @java.lang.Override
    public int getResin() {
      return resin_;
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
      if (resin_ != 0) {
        output.writeUInt32(1, resin_);
      }
      if (getRemainUidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(remainUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < remainUidList_.size(); i++) {
        output.writeUInt32NoTag(remainUidList_.getInt(i));
      }
      if (getQualifyUidListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(qualifyUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < qualifyUidList_.size(); i++) {
        output.writeUInt32NoTag(qualifyUidList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, resin_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < remainUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(remainUidList_.getInt(i));
        }
        size += dataSize;
        if (!getRemainUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        remainUidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < qualifyUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(qualifyUidList_.getInt(i));
        }
        size += dataSize;
        if (!getQualifyUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        qualifyUidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo other = (emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo) obj;

      if (!getQualifyUidListList()
          .equals(other.getQualifyUidListList())) return false;
      if (!getRemainUidListList()
          .equals(other.getRemainUidListList())) return false;
      if (getResin()
          != other.getResin()) return false;
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
      if (getQualifyUidListCount() > 0) {
        hash = (37 * hash) + QUALIFY_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getQualifyUidListList().hashCode();
      }
      if (getRemainUidListCount() > 0) {
        hash = (37 * hash) + REMAIN_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRemainUidListList().hashCode();
      }
      hash = (37 * hash) + RESIN_FIELD_NUMBER;
      hash = (53 * hash) + getResin();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo prototype) {
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
     * Protobuf type {@code MpPlayRewardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayRewardInfo)
        emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.class, emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.newBuilder()
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
        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        remainUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        resin_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo build() {
        emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo buildPartial() {
        emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo result = new emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.qualifyUidList_ = qualifyUidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          remainUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.remainUidList_ = remainUidList_;
        result.resin_ = resin_;
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
        if (other instanceof emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo other) {
        if (other == emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance()) return this;
        if (!other.qualifyUidList_.isEmpty()) {
          if (qualifyUidList_.isEmpty()) {
            qualifyUidList_ = other.qualifyUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQualifyUidListIsMutable();
            qualifyUidList_.addAll(other.qualifyUidList_);
          }
          onChanged();
        }
        if (!other.remainUidList_.isEmpty()) {
          if (remainUidList_.isEmpty()) {
            remainUidList_ = other.remainUidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRemainUidListIsMutable();
            remainUidList_.addAll(other.remainUidList_);
          }
          onChanged();
        }
        if (other.getResin() != 0) {
          setResin(other.getResin());
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
        emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList qualifyUidList_ = emptyIntList();
      private void ensureQualifyUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_ = mutableCopy(qualifyUidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @return A list containing the qualifyUidList.
       */
      public java.util.List<java.lang.Integer>
          getQualifyUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(qualifyUidList_) : qualifyUidList_;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @return The count of qualifyUidList.
       */
      public int getQualifyUidListCount() {
        return qualifyUidList_.size();
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @param index The index of the element to return.
       * @return The qualifyUidList at the given index.
       */
      public int getQualifyUidList(int index) {
        return qualifyUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The qualifyUidList to set.
       * @return This builder for chaining.
       */
      public Builder setQualifyUidList(
          int index, int value) {
        ensureQualifyUidListIsMutable();
        qualifyUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @param value The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addQualifyUidList(int value) {
        ensureQualifyUidListIsMutable();
        qualifyUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @param values The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllQualifyUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureQualifyUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, qualifyUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQualifyUidList() {
        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList remainUidList_ = emptyIntList();
      private void ensureRemainUidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          remainUidList_ = mutableCopy(remainUidList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @return A list containing the remainUidList.
       */
      public java.util.List<java.lang.Integer>
          getRemainUidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(remainUidList_) : remainUidList_;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @return The count of remainUidList.
       */
      public int getRemainUidListCount() {
        return remainUidList_.size();
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @param index The index of the element to return.
       * @return The remainUidList at the given index.
       */
      public int getRemainUidList(int index) {
        return remainUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The remainUidList to set.
       * @return This builder for chaining.
       */
      public Builder setRemainUidList(
          int index, int value) {
        ensureRemainUidListIsMutable();
        remainUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @param value The remainUidList to add.
       * @return This builder for chaining.
       */
      public Builder addRemainUidList(int value) {
        ensureRemainUidListIsMutable();
        remainUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @param values The remainUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRemainUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRemainUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, remainUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainUidList() {
        remainUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int resin_ ;
      /**
       * <code>uint32 resin = 1;</code>
       * @return The resin.
       */
      @java.lang.Override
      public int getResin() {
        return resin_;
      }
      /**
       * <code>uint32 resin = 1;</code>
       * @param value The resin to set.
       * @return This builder for chaining.
       */
      public Builder setResin(int value) {
        
        resin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 resin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResin() {
        
        resin_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MpPlayRewardInfo)
    }

    // @@protoc_insertion_point(class_scope:MpPlayRewardInfo)
    private static final emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo();
    }

    public static emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayRewardInfo>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayRewardInfo>() {
      @java.lang.Override
      public MpPlayRewardInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MpPlayRewardInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MpPlayRewardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayRewardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MpPlayRewardInfoOuterClass.MpPlayRewardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayRewardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayRewardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MpPlayRewardInfo.proto\"T\n\020MpPlayReward" +
      "Info\022\030\n\020qualify_uid_list\030\003 \003(\r\022\027\n\017remain" +
      "_uid_list\030\002 \003(\r\022\r\n\005resin\030\001 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayRewardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayRewardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayRewardInfo_descriptor,
        new java.lang.String[] { "QualifyUidList", "RemainUidList", "Resin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
