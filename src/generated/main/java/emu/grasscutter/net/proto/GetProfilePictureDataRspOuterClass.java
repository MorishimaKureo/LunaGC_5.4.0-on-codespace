// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetProfilePictureDataRsp.proto

package emu.grasscutter.net.proto;

public final class GetProfilePictureDataRspOuterClass {
  private GetProfilePictureDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetProfilePictureDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetProfilePictureDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 special_profile_picture_list = 15;</code>
     * @return A list containing the specialProfilePictureList.
     */
    java.util.List<java.lang.Integer> getSpecialProfilePictureListList();
    /**
     * <code>repeated uint32 special_profile_picture_list = 15;</code>
     * @return The count of specialProfilePictureList.
     */
    int getSpecialProfilePictureListCount();
    /**
     * <code>repeated uint32 special_profile_picture_list = 15;</code>
     * @param index The index of the element to return.
     * @return The specialProfilePictureList at the given index.
     */
    int getSpecialProfilePictureList(int index);
  }
  /**
   * Protobuf type {@code GetProfilePictureDataRsp}
   */
  public static final class GetProfilePictureDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetProfilePictureDataRsp)
      GetProfilePictureDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetProfilePictureDataRsp.newBuilder() to construct.
    private GetProfilePictureDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetProfilePictureDataRsp() {
      specialProfilePictureList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetProfilePictureDataRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetProfilePictureDataRsp(
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
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                specialProfilePictureList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              specialProfilePictureList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                specialProfilePictureList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                specialProfilePictureList_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          specialProfilePictureList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.internal_static_GetProfilePictureDataRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.internal_static_GetProfilePictureDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.class, emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SPECIAL_PROFILE_PICTURE_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList specialProfilePictureList_;
    /**
     * <code>repeated uint32 special_profile_picture_list = 15;</code>
     * @return A list containing the specialProfilePictureList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSpecialProfilePictureListList() {
      return specialProfilePictureList_;
    }
    /**
     * <code>repeated uint32 special_profile_picture_list = 15;</code>
     * @return The count of specialProfilePictureList.
     */
    public int getSpecialProfilePictureListCount() {
      return specialProfilePictureList_.size();
    }
    /**
     * <code>repeated uint32 special_profile_picture_list = 15;</code>
     * @param index The index of the element to return.
     * @return The specialProfilePictureList at the given index.
     */
    public int getSpecialProfilePictureList(int index) {
      return specialProfilePictureList_.getInt(index);
    }
    private int specialProfilePictureListMemoizedSerializedSize = -1;

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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (getSpecialProfilePictureListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(specialProfilePictureListMemoizedSerializedSize);
      }
      for (int i = 0; i < specialProfilePictureList_.size(); i++) {
        output.writeUInt32NoTag(specialProfilePictureList_.getInt(i));
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
          .computeInt32Size(9, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < specialProfilePictureList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(specialProfilePictureList_.getInt(i));
        }
        size += dataSize;
        if (!getSpecialProfilePictureListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        specialProfilePictureListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp other = (emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getSpecialProfilePictureListList()
          .equals(other.getSpecialProfilePictureListList())) return false;
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
      if (getSpecialProfilePictureListCount() > 0) {
        hash = (37 * hash) + SPECIAL_PROFILE_PICTURE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSpecialProfilePictureListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp prototype) {
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
     * Protobuf type {@code GetProfilePictureDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetProfilePictureDataRsp)
        emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.internal_static_GetProfilePictureDataRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.internal_static_GetProfilePictureDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.class, emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.newBuilder()
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

        specialProfilePictureList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.internal_static_GetProfilePictureDataRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp build() {
        emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp buildPartial() {
        emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp result = new emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          specialProfilePictureList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.specialProfilePictureList_ = specialProfilePictureList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp other) {
        if (other == emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.specialProfilePictureList_.isEmpty()) {
          if (specialProfilePictureList_.isEmpty()) {
            specialProfilePictureList_ = other.specialProfilePictureList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSpecialProfilePictureListIsMutable();
            specialProfilePictureList_.addAll(other.specialProfilePictureList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList specialProfilePictureList_ = emptyIntList();
      private void ensureSpecialProfilePictureListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          specialProfilePictureList_ = mutableCopy(specialProfilePictureList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @return A list containing the specialProfilePictureList.
       */
      public java.util.List<java.lang.Integer>
          getSpecialProfilePictureListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(specialProfilePictureList_) : specialProfilePictureList_;
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @return The count of specialProfilePictureList.
       */
      public int getSpecialProfilePictureListCount() {
        return specialProfilePictureList_.size();
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @param index The index of the element to return.
       * @return The specialProfilePictureList at the given index.
       */
      public int getSpecialProfilePictureList(int index) {
        return specialProfilePictureList_.getInt(index);
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The specialProfilePictureList to set.
       * @return This builder for chaining.
       */
      public Builder setSpecialProfilePictureList(
          int index, int value) {
        ensureSpecialProfilePictureListIsMutable();
        specialProfilePictureList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @param value The specialProfilePictureList to add.
       * @return This builder for chaining.
       */
      public Builder addSpecialProfilePictureList(int value) {
        ensureSpecialProfilePictureListIsMutable();
        specialProfilePictureList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @param values The specialProfilePictureList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSpecialProfilePictureList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSpecialProfilePictureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, specialProfilePictureList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 special_profile_picture_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpecialProfilePictureList() {
        specialProfilePictureList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GetProfilePictureDataRsp)
    }

    // @@protoc_insertion_point(class_scope:GetProfilePictureDataRsp)
    private static final emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp();
    }

    public static emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetProfilePictureDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetProfilePictureDataRsp>() {
      @java.lang.Override
      public GetProfilePictureDataRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetProfilePictureDataRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetProfilePictureDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetProfilePictureDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetProfilePictureDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetProfilePictureDataRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetProfilePictureDataRsp.proto\"Q\n\030GetP" +
      "rofilePictureDataRsp\022\017\n\007retcode\030\t \001(\005\022$\n" +
      "\034special_profile_picture_list\030\017 \003(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetProfilePictureDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetProfilePictureDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetProfilePictureDataRsp_descriptor,
        new java.lang.String[] { "Retcode", "SpecialProfilePictureList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
