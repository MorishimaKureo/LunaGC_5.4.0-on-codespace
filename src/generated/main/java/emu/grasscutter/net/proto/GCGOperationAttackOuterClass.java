// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationAttack.proto

package emu.grasscutter.net.proto;

public final class GCGOperationAttackOuterClass {
  private GCGOperationAttackOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationAttackOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationAttack)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skill_id = 15;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>repeated uint32 cost_dice_index_list = 14;</code>
     * @return A list containing the costDiceIndexList.
     */
    java.util.List<java.lang.Integer> getCostDiceIndexListList();
    /**
     * <code>repeated uint32 cost_dice_index_list = 14;</code>
     * @return The count of costDiceIndexList.
     */
    int getCostDiceIndexListCount();
    /**
     * <code>repeated uint32 cost_dice_index_list = 14;</code>
     * @param index The index of the element to return.
     * @return The costDiceIndexList at the given index.
     */
    int getCostDiceIndexList(int index);
  }
  /**
   * <pre>
   * Obf: FCNFPIDIMGI
   * </pre>
   *
   * Protobuf type {@code GCGOperationAttack}
   */
  public static final class GCGOperationAttack extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationAttack)
      GCGOperationAttackOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationAttack.newBuilder() to construct.
    private GCGOperationAttack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationAttack() {
      costDiceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationAttack();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGOperationAttack(
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
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                costDiceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              costDiceIndexList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                costDiceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                costDiceIndexList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              skillId_ = input.readUInt32();
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
          costDiceIndexList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGOperationAttackOuterClass.internal_static_GCGOperationAttack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGOperationAttackOuterClass.internal_static_GCGOperationAttack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.class, emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.Builder.class);
    }

    public static final int SKILL_ID_FIELD_NUMBER = 15;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 15;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int COST_DICE_INDEX_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList costDiceIndexList_;
    /**
     * <code>repeated uint32 cost_dice_index_list = 14;</code>
     * @return A list containing the costDiceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCostDiceIndexListList() {
      return costDiceIndexList_;
    }
    /**
     * <code>repeated uint32 cost_dice_index_list = 14;</code>
     * @return The count of costDiceIndexList.
     */
    public int getCostDiceIndexListCount() {
      return costDiceIndexList_.size();
    }
    /**
     * <code>repeated uint32 cost_dice_index_list = 14;</code>
     * @param index The index of the element to return.
     * @return The costDiceIndexList at the given index.
     */
    public int getCostDiceIndexList(int index) {
      return costDiceIndexList_.getInt(index);
    }
    private int costDiceIndexListMemoizedSerializedSize = -1;

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
      if (getCostDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(costDiceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < costDiceIndexList_.size(); i++) {
        output.writeUInt32NoTag(costDiceIndexList_.getInt(i));
      }
      if (skillId_ != 0) {
        output.writeUInt32(15, skillId_);
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
        for (int i = 0; i < costDiceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(costDiceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getCostDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        costDiceIndexListMemoizedSerializedSize = dataSize;
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, skillId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack other = (emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (!getCostDiceIndexListList()
          .equals(other.getCostDiceIndexListList())) return false;
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
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      if (getCostDiceIndexListCount() > 0) {
        hash = (37 * hash) + COST_DICE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCostDiceIndexListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack prototype) {
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
     * Obf: FCNFPIDIMGI
     * </pre>
     *
     * Protobuf type {@code GCGOperationAttack}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationAttack)
        emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttackOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGOperationAttackOuterClass.internal_static_GCGOperationAttack_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGOperationAttackOuterClass.internal_static_GCGOperationAttack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.class, emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.newBuilder()
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
        skillId_ = 0;

        costDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGOperationAttackOuterClass.internal_static_GCGOperationAttack_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack build() {
        emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack buildPartial() {
        emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack result = new emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack(this);
        int from_bitField0_ = bitField0_;
        result.skillId_ = skillId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          costDiceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.costDiceIndexList_ = costDiceIndexList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack) {
          return mergeFrom((emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack other) {
        if (other == emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (!other.costDiceIndexList_.isEmpty()) {
          if (costDiceIndexList_.isEmpty()) {
            costDiceIndexList_ = other.costDiceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCostDiceIndexListIsMutable();
            costDiceIndexList_.addAll(other.costDiceIndexList_);
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
        emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 15;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 15;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList costDiceIndexList_ = emptyIntList();
      private void ensureCostDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          costDiceIndexList_ = mutableCopy(costDiceIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @return A list containing the costDiceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getCostDiceIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(costDiceIndexList_) : costDiceIndexList_;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @return The count of costDiceIndexList.
       */
      public int getCostDiceIndexListCount() {
        return costDiceIndexList_.size();
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @param index The index of the element to return.
       * @return The costDiceIndexList at the given index.
       */
      public int getCostDiceIndexList(int index) {
        return costDiceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The costDiceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setCostDiceIndexList(
          int index, int value) {
        ensureCostDiceIndexListIsMutable();
        costDiceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @param value The costDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addCostDiceIndexList(int value) {
        ensureCostDiceIndexListIsMutable();
        costDiceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @param values The costDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCostDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCostDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, costDiceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostDiceIndexList() {
        costDiceIndexList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGOperationAttack)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationAttack)
    private static final emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack();
    }

    public static emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationAttack>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationAttack>() {
      @java.lang.Override
      public GCGOperationAttack parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGOperationAttack(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGOperationAttack> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationAttack> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGOperationAttackOuterClass.GCGOperationAttack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationAttack_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationAttack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGOperationAttack.proto\"D\n\022GCGOperati" +
      "onAttack\022\020\n\010skill_id\030\017 \001(\r\022\034\n\024cost_dice_" +
      "index_list\030\016 \003(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGOperationAttack_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationAttack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationAttack_descriptor,
        new java.lang.String[] { "SkillId", "CostDiceIndexList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
