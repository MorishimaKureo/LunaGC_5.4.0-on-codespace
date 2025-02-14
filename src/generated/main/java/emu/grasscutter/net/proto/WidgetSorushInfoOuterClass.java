// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetSorushInfo.proto

package emu.grasscutter.net.proto;

public final class WidgetSorushInfoOuterClass {
  private WidgetSorushInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetSorushInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetSorushInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool MKGAGCIDJAO = 4;</code>
     * @return The mKGAGCIDJAO.
     */
    boolean getMKGAGCIDJAO();

    /**
     * <code>.Vector pos = 5;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 5;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 5;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 slot = 8;</code>
     * @return The slot.
     */
    int getSlot();

    /**
     * <code>bool CBBPMBBFAOO = 11;</code>
     * @return The cBBPMBBFAOO.
     */
    boolean getCBBPMBBFAOO();

    /**
     * <code>bool is_enter = 13;</code>
     * @return The isEnter.
     */
    boolean getIsEnter();

    /**
     * <code>.Vector rot = 15;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 15;</code>
     * @return The rot.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 15;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * Protobuf type {@code WidgetSorushInfo}
   */
  public static final class WidgetSorushInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetSorushInfo)
      WidgetSorushInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetSorushInfo.newBuilder() to construct.
    private WidgetSorushInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetSorushInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetSorushInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetSorushInfo(
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
            case 32: {

              mKGAGCIDJAO_ = input.readBool();
              break;
            }
            case 42: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 64: {

              slot_ = input.readUInt32();
              break;
            }
            case 88: {

              cBBPMBBFAOO_ = input.readBool();
              break;
            }
            case 104: {

              isEnter_ = input.readBool();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (rot_ != null) {
                subBuilder = rot_.toBuilder();
              }
              rot_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rot_);
                rot_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.internal_static_WidgetSorushInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.internal_static_WidgetSorushInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.class, emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.Builder.class);
    }

    public static final int MKGAGCIDJAO_FIELD_NUMBER = 4;
    private boolean mKGAGCIDJAO_;
    /**
     * <code>bool MKGAGCIDJAO = 4;</code>
     * @return The mKGAGCIDJAO.
     */
    @java.lang.Override
    public boolean getMKGAGCIDJAO() {
      return mKGAGCIDJAO_;
    }

    public static final int POS_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 5;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 5;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int SLOT_FIELD_NUMBER = 8;
    private int slot_;
    /**
     * <code>uint32 slot = 8;</code>
     * @return The slot.
     */
    @java.lang.Override
    public int getSlot() {
      return slot_;
    }

    public static final int CBBPMBBFAOO_FIELD_NUMBER = 11;
    private boolean cBBPMBBFAOO_;
    /**
     * <code>bool CBBPMBBFAOO = 11;</code>
     * @return The cBBPMBBFAOO.
     */
    @java.lang.Override
    public boolean getCBBPMBBFAOO() {
      return cBBPMBBFAOO_;
    }

    public static final int IS_ENTER_FIELD_NUMBER = 13;
    private boolean isEnter_;
    /**
     * <code>bool is_enter = 13;</code>
     * @return The isEnter.
     */
    @java.lang.Override
    public boolean getIsEnter() {
      return isEnter_;
    }

    public static final int ROT_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 15;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 15;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
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
      if (mKGAGCIDJAO_ != false) {
        output.writeBool(4, mKGAGCIDJAO_);
      }
      if (pos_ != null) {
        output.writeMessage(5, getPos());
      }
      if (slot_ != 0) {
        output.writeUInt32(8, slot_);
      }
      if (cBBPMBBFAOO_ != false) {
        output.writeBool(11, cBBPMBBFAOO_);
      }
      if (isEnter_ != false) {
        output.writeBool(13, isEnter_);
      }
      if (rot_ != null) {
        output.writeMessage(15, getRot());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mKGAGCIDJAO_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, mKGAGCIDJAO_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getPos());
      }
      if (slot_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, slot_);
      }
      if (cBBPMBBFAOO_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, cBBPMBBFAOO_);
      }
      if (isEnter_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isEnter_);
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getRot());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo other = (emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo) obj;

      if (getMKGAGCIDJAO()
          != other.getMKGAGCIDJAO()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getSlot()
          != other.getSlot()) return false;
      if (getCBBPMBBFAOO()
          != other.getCBBPMBBFAOO()) return false;
      if (getIsEnter()
          != other.getIsEnter()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
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
      hash = (37 * hash) + MKGAGCIDJAO_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMKGAGCIDJAO());
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + SLOT_FIELD_NUMBER;
      hash = (53 * hash) + getSlot();
      hash = (37 * hash) + CBBPMBBFAOO_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCBBPMBBFAOO());
      hash = (37 * hash) + IS_ENTER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnter());
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo prototype) {
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
     * Protobuf type {@code WidgetSorushInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetSorushInfo)
        emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.internal_static_WidgetSorushInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.internal_static_WidgetSorushInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.class, emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.newBuilder()
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
        mKGAGCIDJAO_ = false;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        slot_ = 0;

        cBBPMBBFAOO_ = false;

        isEnter_ = false;

        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.internal_static_WidgetSorushInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo build() {
        emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo buildPartial() {
        emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo result = new emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo(this);
        result.mKGAGCIDJAO_ = mKGAGCIDJAO_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.slot_ = slot_;
        result.cBBPMBBFAOO_ = cBBPMBBFAOO_;
        result.isEnter_ = isEnter_;
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo other) {
        if (other == emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo.getDefaultInstance()) return this;
        if (other.getMKGAGCIDJAO() != false) {
          setMKGAGCIDJAO(other.getMKGAGCIDJAO());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getSlot() != 0) {
          setSlot(other.getSlot());
        }
        if (other.getCBBPMBBFAOO() != false) {
          setCBBPMBBFAOO(other.getCBBPMBBFAOO());
        }
        if (other.getIsEnter() != false) {
          setIsEnter(other.getIsEnter());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
        emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean mKGAGCIDJAO_ ;
      /**
       * <code>bool MKGAGCIDJAO = 4;</code>
       * @return The mKGAGCIDJAO.
       */
      @java.lang.Override
      public boolean getMKGAGCIDJAO() {
        return mKGAGCIDJAO_;
      }
      /**
       * <code>bool MKGAGCIDJAO = 4;</code>
       * @param value The mKGAGCIDJAO to set.
       * @return This builder for chaining.
       */
      public Builder setMKGAGCIDJAO(boolean value) {
        
        mKGAGCIDJAO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool MKGAGCIDJAO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMKGAGCIDJAO() {
        
        mKGAGCIDJAO_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 5;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 5;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int slot_ ;
      /**
       * <code>uint32 slot = 8;</code>
       * @return The slot.
       */
      @java.lang.Override
      public int getSlot() {
        return slot_;
      }
      /**
       * <code>uint32 slot = 8;</code>
       * @param value The slot to set.
       * @return This builder for chaining.
       */
      public Builder setSlot(int value) {
        
        slot_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlot() {
        
        slot_ = 0;
        onChanged();
        return this;
      }

      private boolean cBBPMBBFAOO_ ;
      /**
       * <code>bool CBBPMBBFAOO = 11;</code>
       * @return The cBBPMBBFAOO.
       */
      @java.lang.Override
      public boolean getCBBPMBBFAOO() {
        return cBBPMBBFAOO_;
      }
      /**
       * <code>bool CBBPMBBFAOO = 11;</code>
       * @param value The cBBPMBBFAOO to set.
       * @return This builder for chaining.
       */
      public Builder setCBBPMBBFAOO(boolean value) {
        
        cBBPMBBFAOO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool CBBPMBBFAOO = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCBBPMBBFAOO() {
        
        cBBPMBBFAOO_ = false;
        onChanged();
        return this;
      }

      private boolean isEnter_ ;
      /**
       * <code>bool is_enter = 13;</code>
       * @return The isEnter.
       */
      @java.lang.Override
      public boolean getIsEnter() {
        return isEnter_;
      }
      /**
       * <code>bool is_enter = 13;</code>
       * @param value The isEnter to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnter(boolean value) {
        
        isEnter_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_enter = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnter() {
        
        isEnter_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 15;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 15;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      public Builder setRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WidgetSorushInfo)
    }

    // @@protoc_insertion_point(class_scope:WidgetSorushInfo)
    private static final emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo();
    }

    public static emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetSorushInfo>
        PARSER = new com.google.protobuf.AbstractParser<WidgetSorushInfo>() {
      @java.lang.Override
      public WidgetSorushInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetSorushInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetSorushInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetSorushInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSorushInfoOuterClass.WidgetSorushInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetSorushInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetSorushInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WidgetSorushInfo.proto\032\014Vector.proto\"\210" +
      "\001\n\020WidgetSorushInfo\022\023\n\013MKGAGCIDJAO\030\004 \001(\010" +
      "\022\024\n\003pos\030\005 \001(\0132\007.Vector\022\014\n\004slot\030\010 \001(\r\022\023\n\013" +
      "CBBPMBBFAOO\030\013 \001(\010\022\020\n\010is_enter\030\r \001(\010\022\024\n\003r" +
      "ot\030\017 \001(\0132\007.VectorB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_WidgetSorushInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetSorushInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetSorushInfo_descriptor,
        new java.lang.String[] { "MKGAGCIDJAO", "Pos", "Slot", "CBBPMBBFAOO", "IsEnter", "Rot", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
