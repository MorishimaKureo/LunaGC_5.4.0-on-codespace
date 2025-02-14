// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestUpdateQuestVarNotify.proto

package emu.grasscutter.net.proto;

public final class QuestUpdateQuestVarNotifyOuterClass {
  private QuestUpdateQuestVarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestUpdateQuestVarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestUpdateQuestVarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parent_quest_var_seq = 8;</code>
     * @return The parentQuestVarSeq.
     */
    int getParentQuestVarSeq();

    /**
     * <code>uint32 parent_quest_id = 11;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>repeated int32 quest_var = 13;</code>
     * @return A list containing the questVar.
     */
    java.util.List<java.lang.Integer> getQuestVarList();
    /**
     * <code>repeated int32 quest_var = 13;</code>
     * @return The count of questVar.
     */
    int getQuestVarCount();
    /**
     * <code>repeated int32 quest_var = 13;</code>
     * @param index The index of the element to return.
     * @return The questVar at the given index.
     */
    int getQuestVar(int index);
  }
  /**
   * Protobuf type {@code QuestUpdateQuestVarNotify}
   */
  public static final class QuestUpdateQuestVarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestUpdateQuestVarNotify)
      QuestUpdateQuestVarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestUpdateQuestVarNotify.newBuilder() to construct.
    private QuestUpdateQuestVarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestUpdateQuestVarNotify() {
      questVar_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestUpdateQuestVarNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestUpdateQuestVarNotify(
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
            case 64: {

              parentQuestVarSeq_ = input.readUInt32();
              break;
            }
            case 88: {

              parentQuestId_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                questVar_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              questVar_.addInt(input.readInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                questVar_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                questVar_.addInt(input.readInt32());
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
          questVar_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.class, emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.Builder.class);
    }

    public static final int PARENT_QUEST_VAR_SEQ_FIELD_NUMBER = 8;
    private int parentQuestVarSeq_;
    /**
     * <code>uint32 parent_quest_var_seq = 8;</code>
     * @return The parentQuestVarSeq.
     */
    @java.lang.Override
    public int getParentQuestVarSeq() {
      return parentQuestVarSeq_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 11;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 11;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int QUEST_VAR_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList questVar_;
    /**
     * <code>repeated int32 quest_var = 13;</code>
     * @return A list containing the questVar.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getQuestVarList() {
      return questVar_;
    }
    /**
     * <code>repeated int32 quest_var = 13;</code>
     * @return The count of questVar.
     */
    public int getQuestVarCount() {
      return questVar_.size();
    }
    /**
     * <code>repeated int32 quest_var = 13;</code>
     * @param index The index of the element to return.
     * @return The questVar at the given index.
     */
    public int getQuestVar(int index) {
      return questVar_.getInt(index);
    }
    private int questVarMemoizedSerializedSize = -1;

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
      if (parentQuestVarSeq_ != 0) {
        output.writeUInt32(8, parentQuestVarSeq_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(11, parentQuestId_);
      }
      if (getQuestVarList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(questVarMemoizedSerializedSize);
      }
      for (int i = 0; i < questVar_.size(); i++) {
        output.writeInt32NoTag(questVar_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestVarSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, parentQuestVarSeq_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, parentQuestId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < questVar_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(questVar_.getInt(i));
        }
        size += dataSize;
        if (!getQuestVarList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        questVarMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify other = (emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify) obj;

      if (getParentQuestVarSeq()
          != other.getParentQuestVarSeq()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (!getQuestVarList()
          .equals(other.getQuestVarList())) return false;
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
      hash = (37 * hash) + PARENT_QUEST_VAR_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestVarSeq();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      if (getQuestVarCount() > 0) {
        hash = (37 * hash) + QUEST_VAR_FIELD_NUMBER;
        hash = (53 * hash) + getQuestVarList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify prototype) {
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
     * Protobuf type {@code QuestUpdateQuestVarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestUpdateQuestVarNotify)
        emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.class, emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.newBuilder()
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
        parentQuestVarSeq_ = 0;

        parentQuestId_ = 0;

        questVar_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify build() {
        emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify buildPartial() {
        emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify result = new emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify(this);
        int from_bitField0_ = bitField0_;
        result.parentQuestVarSeq_ = parentQuestVarSeq_;
        result.parentQuestId_ = parentQuestId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          questVar_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.questVar_ = questVar_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify) {
          return mergeFrom((emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify other) {
        if (other == emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify.getDefaultInstance()) return this;
        if (other.getParentQuestVarSeq() != 0) {
          setParentQuestVarSeq(other.getParentQuestVarSeq());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (!other.questVar_.isEmpty()) {
          if (questVar_.isEmpty()) {
            questVar_ = other.questVar_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQuestVarIsMutable();
            questVar_.addAll(other.questVar_);
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
        emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int parentQuestVarSeq_ ;
      /**
       * <code>uint32 parent_quest_var_seq = 8;</code>
       * @return The parentQuestVarSeq.
       */
      @java.lang.Override
      public int getParentQuestVarSeq() {
        return parentQuestVarSeq_;
      }
      /**
       * <code>uint32 parent_quest_var_seq = 8;</code>
       * @param value The parentQuestVarSeq to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestVarSeq(int value) {
        
        parentQuestVarSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_var_seq = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestVarSeq() {
        
        parentQuestVarSeq_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 11;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 11;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList questVar_ = emptyIntList();
      private void ensureQuestVarIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          questVar_ = mutableCopy(questVar_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @return A list containing the questVar.
       */
      public java.util.List<java.lang.Integer>
          getQuestVarList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(questVar_) : questVar_;
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @return The count of questVar.
       */
      public int getQuestVarCount() {
        return questVar_.size();
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @param index The index of the element to return.
       * @return The questVar at the given index.
       */
      public int getQuestVar(int index) {
        return questVar_.getInt(index);
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @param index The index to set the value at.
       * @param value The questVar to set.
       * @return This builder for chaining.
       */
      public Builder setQuestVar(
          int index, int value) {
        ensureQuestVarIsMutable();
        questVar_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @param value The questVar to add.
       * @return This builder for chaining.
       */
      public Builder addQuestVar(int value) {
        ensureQuestVarIsMutable();
        questVar_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @param values The questVar to add.
       * @return This builder for chaining.
       */
      public Builder addAllQuestVar(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureQuestVarIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, questVar_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 quest_var = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestVar() {
        questVar_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:QuestUpdateQuestVarNotify)
    }

    // @@protoc_insertion_point(class_scope:QuestUpdateQuestVarNotify)
    private static final emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify();
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestUpdateQuestVarNotify>
        PARSER = new com.google.protobuf.AbstractParser<QuestUpdateQuestVarNotify>() {
      @java.lang.Override
      public QuestUpdateQuestVarNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestUpdateQuestVarNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestUpdateQuestVarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestUpdateQuestVarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestUpdateQuestVarNotifyOuterClass.QuestUpdateQuestVarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestUpdateQuestVarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037QuestUpdateQuestVarNotify.proto\"e\n\031Que" +
      "stUpdateQuestVarNotify\022\034\n\024parent_quest_v" +
      "ar_seq\030\010 \001(\r\022\027\n\017parent_quest_id\030\013 \001(\r\022\021\n" +
      "\tquest_var\030\r \003(\005B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestUpdateQuestVarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestUpdateQuestVarNotify_descriptor,
        new java.lang.String[] { "ParentQuestVarSeq", "ParentQuestId", "QuestVar", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
