// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientAbilityInitFinishNotify.proto

package emu.grasscutter.net.proto;

public final class ClientAbilityInitFinishNotifyOuterClass {
  private ClientAbilityInitFinishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientAbilityInitFinishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientAbilityInitFinishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> 
        getInvokesList();
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(int index);
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    int getInvokesCount();
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
        getInvokesOrBuilderList();
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(
        int index);

    /**
     * <code>uint32 entity_id = 9;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code ClientAbilityInitFinishNotify}
   */
  public static final class ClientAbilityInitFinishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientAbilityInitFinishNotify)
      ClientAbilityInitFinishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientAbilityInitFinishNotify.newBuilder() to construct.
    private ClientAbilityInitFinishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientAbilityInitFinishNotify() {
      invokes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientAbilityInitFinishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientAbilityInitFinishNotify(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                invokes_ = new java.util.ArrayList<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry>();
                mutable_bitField0_ |= 0x00000001;
              }
              invokes_.add(
                  input.readMessage(emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.parser(), extensionRegistry));
              break;
            }
            case 72: {

              entityId_ = input.readUInt32();
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
          invokes_ = java.util.Collections.unmodifiableList(invokes_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.internal_static_ClientAbilityInitFinishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.internal_static_ClientAbilityInitFinishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.class, emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.Builder.class);
    }

    public static final int INVOKES_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> invokes_;
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList() {
      return invokes_;
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
        getInvokesOrBuilderList() {
      return invokes_;
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    @java.lang.Override
    public int getInvokesCount() {
      return invokes_.size();
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(int index) {
      return invokes_.get(index);
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(
        int index) {
      return invokes_.get(index);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 9;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 9;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      for (int i = 0; i < invokes_.size(); i++) {
        output.writeMessage(5, invokes_.get(i));
      }
      if (entityId_ != 0) {
        output.writeUInt32(9, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < invokes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, invokes_.get(i));
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify other = (emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify) obj;

      if (!getInvokesList()
          .equals(other.getInvokesList())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (getInvokesCount() > 0) {
        hash = (37 * hash) + INVOKES_FIELD_NUMBER;
        hash = (53 * hash) + getInvokesList().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify prototype) {
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
     * Protobuf type {@code ClientAbilityInitFinishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientAbilityInitFinishNotify)
        emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.internal_static_ClientAbilityInitFinishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.internal_static_ClientAbilityInitFinishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.class, emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.newBuilder()
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
          getInvokesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (invokesBuilder_ == null) {
          invokes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          invokesBuilder_.clear();
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.internal_static_ClientAbilityInitFinishNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify build() {
        emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify buildPartial() {
        emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify result = new emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify(this);
        int from_bitField0_ = bitField0_;
        if (invokesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            invokes_ = java.util.Collections.unmodifiableList(invokes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.invokes_ = invokes_;
        } else {
          result.invokes_ = invokesBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify other) {
        if (other == emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify.getDefaultInstance()) return this;
        if (invokesBuilder_ == null) {
          if (!other.invokes_.isEmpty()) {
            if (invokes_.isEmpty()) {
              invokes_ = other.invokes_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInvokesIsMutable();
              invokes_.addAll(other.invokes_);
            }
            onChanged();
          }
        } else {
          if (!other.invokes_.isEmpty()) {
            if (invokesBuilder_.isEmpty()) {
              invokesBuilder_.dispose();
              invokesBuilder_ = null;
              invokes_ = other.invokes_;
              bitField0_ = (bitField0_ & ~0x00000001);
              invokesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInvokesFieldBuilder() : null;
            } else {
              invokesBuilder_.addAllMessages(other.invokes_);
            }
          }
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> invokes_ =
        java.util.Collections.emptyList();
      private void ensureInvokesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          invokes_ = new java.util.ArrayList<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry>(invokes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> invokesBuilder_;

      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList() {
        if (invokesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(invokes_);
        } else {
          return invokesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public int getInvokesCount() {
        if (invokesBuilder_ == null) {
          return invokes_.size();
        } else {
          return invokesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(int index) {
        if (invokesBuilder_ == null) {
          return invokes_.get(index);
        } else {
          return invokesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder setInvokes(
          int index, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokesIsMutable();
          invokes_.set(index, value);
          onChanged();
        } else {
          invokesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder setInvokes(
          int index, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.set(index, builderForValue.build());
          onChanged();
        } else {
          invokesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder addInvokes(emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokesIsMutable();
          invokes_.add(value);
          onChanged();
        } else {
          invokesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder addInvokes(
          int index, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokesIsMutable();
          invokes_.add(index, value);
          onChanged();
        } else {
          invokesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder addInvokes(
          emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.add(builderForValue.build());
          onChanged();
        } else {
          invokesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder addInvokes(
          int index, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.add(index, builderForValue.build());
          onChanged();
        } else {
          invokesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder addAllInvokes(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> values) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, invokes_);
          onChanged();
        } else {
          invokesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder clearInvokes() {
        if (invokesBuilder_ == null) {
          invokes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          invokesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public Builder removeInvokes(int index) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.remove(index);
          onChanged();
        } else {
          invokesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder getInvokesBuilder(
          int index) {
        return getInvokesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(
          int index) {
        if (invokesBuilder_ == null) {
          return invokes_.get(index);  } else {
          return invokesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
           getInvokesOrBuilderList() {
        if (invokesBuilder_ != null) {
          return invokesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(invokes_);
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder addInvokesBuilder() {
        return getInvokesFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder addInvokesBuilder(
          int index) {
        return getInvokesFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder> 
           getInvokesBuilderList() {
        return getInvokesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
          getInvokesFieldBuilder() {
        if (invokesBuilder_ == null) {
          invokesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder>(
                  invokes_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          invokes_ = null;
        }
        return invokesBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 9;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 9;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientAbilityInitFinishNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientAbilityInitFinishNotify)
    private static final emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify();
    }

    public static emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientAbilityInitFinishNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientAbilityInitFinishNotify>() {
      @java.lang.Override
      public ClientAbilityInitFinishNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientAbilityInitFinishNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientAbilityInitFinishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientAbilityInitFinishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientAbilityInitFinishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientAbilityInitFinishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#ClientAbilityInitFinishNotify.proto\032\030A" +
      "bilityInvokeEntry.proto\"X\n\035ClientAbility" +
      "InitFinishNotify\022$\n\007invokes\030\005 \003(\0132\023.Abil" +
      "ityInvokeEntry\022\021\n\tentity_id\030\t \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.getDescriptor(),
        });
    internal_static_ClientAbilityInitFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientAbilityInitFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientAbilityInitFinishNotify_descriptor,
        new java.lang.String[] { "Invokes", "EntityId", });
    emu.grasscutter.net.proto.AbilityInvokeEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
