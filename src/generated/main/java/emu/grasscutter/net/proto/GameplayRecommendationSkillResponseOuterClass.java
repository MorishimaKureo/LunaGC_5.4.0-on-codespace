// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameplayRecommendationSkillResponse.proto

package emu.grasscutter.net.proto;

public final class GameplayRecommendationSkillResponseOuterClass {
  private GameplayRecommendationSkillResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GameplayRecommendationSkillResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GameplayRecommendationSkillResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 skill_id_list = 2;</code>
     * @return A list containing the skillIdList.
     */
    java.util.List<java.lang.Integer> getSkillIdListList();
    /**
     * <code>repeated uint32 skill_id_list = 2;</code>
     * @return The count of skillIdList.
     */
    int getSkillIdListCount();
    /**
     * <code>repeated uint32 skill_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    int getSkillIdList(int index);

    /**
     * <code>uint32 skill_depot_id = 15;</code>
     * @return The skillDepotId.
     */
    int getSkillDepotId();
  }
  /**
   * <pre>
   * Obf: FEHIOGLMGBH
   * </pre>
   *
   * Protobuf type {@code GameplayRecommendationSkillResponse}
   */
  public static final class GameplayRecommendationSkillResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GameplayRecommendationSkillResponse)
      GameplayRecommendationSkillResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GameplayRecommendationSkillResponse.newBuilder() to construct.
    private GameplayRecommendationSkillResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameplayRecommendationSkillResponse() {
      skillIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GameplayRecommendationSkillResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GameplayRecommendationSkillResponse(
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
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                skillIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              skillIdList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                skillIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                skillIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              skillDepotId_ = input.readUInt32();
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
          skillIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.internal_static_GameplayRecommendationSkillResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.internal_static_GameplayRecommendationSkillResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.class, emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.Builder.class);
    }

    public static final int SKILL_ID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList skillIdList_;
    /**
     * <code>repeated uint32 skill_id_list = 2;</code>
     * @return A list containing the skillIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillIdListList() {
      return skillIdList_;
    }
    /**
     * <code>repeated uint32 skill_id_list = 2;</code>
     * @return The count of skillIdList.
     */
    public int getSkillIdListCount() {
      return skillIdList_.size();
    }
    /**
     * <code>repeated uint32 skill_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    public int getSkillIdList(int index) {
      return skillIdList_.getInt(index);
    }
    private int skillIdListMemoizedSerializedSize = -1;

    public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 15;
    private int skillDepotId_;
    /**
     * <code>uint32 skill_depot_id = 15;</code>
     * @return The skillDepotId.
     */
    @java.lang.Override
    public int getSkillDepotId() {
      return skillDepotId_;
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
      if (getSkillIdListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(skillIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillIdList_.size(); i++) {
        output.writeUInt32NoTag(skillIdList_.getInt(i));
      }
      if (skillDepotId_ != 0) {
        output.writeUInt32(15, skillDepotId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < skillIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillIdListMemoizedSerializedSize = dataSize;
      }
      if (skillDepotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, skillDepotId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse other = (emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse) obj;

      if (!getSkillIdListList()
          .equals(other.getSkillIdListList())) return false;
      if (getSkillDepotId()
          != other.getSkillDepotId()) return false;
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
      if (getSkillIdListCount() > 0) {
        hash = (37 * hash) + SKILL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillIdListList().hashCode();
      }
      hash = (37 * hash) + SKILL_DEPOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillDepotId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse prototype) {
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
     * <pre>
     * Obf: FEHIOGLMGBH
     * </pre>
     *
     * Protobuf type {@code GameplayRecommendationSkillResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GameplayRecommendationSkillResponse)
        emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.internal_static_GameplayRecommendationSkillResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.internal_static_GameplayRecommendationSkillResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.class, emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.newBuilder()
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
        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        skillDepotId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.internal_static_GameplayRecommendationSkillResponse_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse build() {
        emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse buildPartial() {
        emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse result = new emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          skillIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillIdList_ = skillIdList_;
        result.skillDepotId_ = skillDepotId_;
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
        if (other instanceof emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse) {
          return mergeFrom((emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse other) {
        if (other == emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse.getDefaultInstance()) return this;
        if (!other.skillIdList_.isEmpty()) {
          if (skillIdList_.isEmpty()) {
            skillIdList_ = other.skillIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillIdListIsMutable();
            skillIdList_.addAll(other.skillIdList_);
          }
          onChanged();
        }
        if (other.getSkillDepotId() != 0) {
          setSkillDepotId(other.getSkillDepotId());
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
        emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList skillIdList_ = emptyIntList();
      private void ensureSkillIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillIdList_ = mutableCopy(skillIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @return A list containing the skillIdList.
       */
      public java.util.List<java.lang.Integer>
          getSkillIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(skillIdList_) : skillIdList_;
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @return The count of skillIdList.
       */
      public int getSkillIdListCount() {
        return skillIdList_.size();
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @param index The index of the element to return.
       * @return The skillIdList at the given index.
       */
      public int getSkillIdList(int index) {
        return skillIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The skillIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillIdList(
          int index, int value) {
        ensureSkillIdListIsMutable();
        skillIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @param value The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSkillIdList(int value) {
        ensureSkillIdListIsMutable();
        skillIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @param values The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillIdList() {
        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int skillDepotId_ ;
      /**
       * <code>uint32 skill_depot_id = 15;</code>
       * @return The skillDepotId.
       */
      @java.lang.Override
      public int getSkillDepotId() {
        return skillDepotId_;
      }
      /**
       * <code>uint32 skill_depot_id = 15;</code>
       * @param value The skillDepotId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillDepotId(int value) {
        
        skillDepotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_depot_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillDepotId() {
        
        skillDepotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GameplayRecommendationSkillResponse)
    }

    // @@protoc_insertion_point(class_scope:GameplayRecommendationSkillResponse)
    private static final emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse();
    }

    public static emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GameplayRecommendationSkillResponse>
        PARSER = new com.google.protobuf.AbstractParser<GameplayRecommendationSkillResponse>() {
      @java.lang.Override
      public GameplayRecommendationSkillResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameplayRecommendationSkillResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameplayRecommendationSkillResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameplayRecommendationSkillResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GameplayRecommendationSkillResponseOuterClass.GameplayRecommendationSkillResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameplayRecommendationSkillResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameplayRecommendationSkillResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)GameplayRecommendationSkillResponse.pr" +
      "oto\"T\n#GameplayRecommendationSkillRespon" +
      "se\022\025\n\rskill_id_list\030\002 \003(\r\022\026\n\016skill_depot" +
      "_id\030\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GameplayRecommendationSkillResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GameplayRecommendationSkillResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameplayRecommendationSkillResponse_descriptor,
        new java.lang.String[] { "SkillIdList", "SkillDepotId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
