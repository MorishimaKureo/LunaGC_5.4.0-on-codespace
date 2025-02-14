// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonDieOptionReq.proto

package emu.grasscutter.net.proto;

public final class DungeonDieOptionReqOuterClass {
  private DungeonDieOptionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonDieOptionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonDieOptionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_quit_immediately = 1;</code>
     * @return The isQuitImmediately.
     */
    boolean getIsQuitImmediately();

    /**
     * <code>.PlayerDieOption die_option = 12;</code>
     * @return The enum numeric value on the wire for dieOption.
     */
    int getDieOptionValue();
    /**
     * <code>.PlayerDieOption die_option = 12;</code>
     * @return The dieOption.
     */
    emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption getDieOption();
  }
  /**
   * Protobuf type {@code DungeonDieOptionReq}
   */
  public static final class DungeonDieOptionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonDieOptionReq)
      DungeonDieOptionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonDieOptionReq.newBuilder() to construct.
    private DungeonDieOptionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonDieOptionReq() {
      dieOption_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonDieOptionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonDieOptionReq(
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
            case 8: {

              isQuitImmediately_ = input.readBool();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              dieOption_ = rawValue;
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
      return emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.internal_static_DungeonDieOptionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.internal_static_DungeonDieOptionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.class, emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.Builder.class);
    }

    public static final int IS_QUIT_IMMEDIATELY_FIELD_NUMBER = 1;
    private boolean isQuitImmediately_;
    /**
     * <code>bool is_quit_immediately = 1;</code>
     * @return The isQuitImmediately.
     */
    @java.lang.Override
    public boolean getIsQuitImmediately() {
      return isQuitImmediately_;
    }

    public static final int DIE_OPTION_FIELD_NUMBER = 12;
    private int dieOption_;
    /**
     * <code>.PlayerDieOption die_option = 12;</code>
     * @return The enum numeric value on the wire for dieOption.
     */
    @java.lang.Override public int getDieOptionValue() {
      return dieOption_;
    }
    /**
     * <code>.PlayerDieOption die_option = 12;</code>
     * @return The dieOption.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption getDieOption() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption result = emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.valueOf(dieOption_);
      return result == null ? emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.UNRECOGNIZED : result;
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
      if (isQuitImmediately_ != false) {
        output.writeBool(1, isQuitImmediately_);
      }
      if (dieOption_ != emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.DIE_OPT_NONE.getNumber()) {
        output.writeEnum(12, dieOption_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isQuitImmediately_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isQuitImmediately_);
      }
      if (dieOption_ != emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.DIE_OPT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, dieOption_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq other = (emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq) obj;

      if (getIsQuitImmediately()
          != other.getIsQuitImmediately()) return false;
      if (dieOption_ != other.dieOption_) return false;
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
      hash = (37 * hash) + IS_QUIT_IMMEDIATELY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsQuitImmediately());
      hash = (37 * hash) + DIE_OPTION_FIELD_NUMBER;
      hash = (53 * hash) + dieOption_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq prototype) {
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
     * Protobuf type {@code DungeonDieOptionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonDieOptionReq)
        emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.internal_static_DungeonDieOptionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.internal_static_DungeonDieOptionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.class, emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.newBuilder()
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
        isQuitImmediately_ = false;

        dieOption_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.internal_static_DungeonDieOptionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq build() {
        emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq buildPartial() {
        emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq result = new emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq(this);
        result.isQuitImmediately_ = isQuitImmediately_;
        result.dieOption_ = dieOption_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq other) {
        if (other == emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq.getDefaultInstance()) return this;
        if (other.getIsQuitImmediately() != false) {
          setIsQuitImmediately(other.getIsQuitImmediately());
        }
        if (other.dieOption_ != 0) {
          setDieOptionValue(other.getDieOptionValue());
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
        emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isQuitImmediately_ ;
      /**
       * <code>bool is_quit_immediately = 1;</code>
       * @return The isQuitImmediately.
       */
      @java.lang.Override
      public boolean getIsQuitImmediately() {
        return isQuitImmediately_;
      }
      /**
       * <code>bool is_quit_immediately = 1;</code>
       * @param value The isQuitImmediately to set.
       * @return This builder for chaining.
       */
      public Builder setIsQuitImmediately(boolean value) {
        
        isQuitImmediately_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_quit_immediately = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsQuitImmediately() {
        
        isQuitImmediately_ = false;
        onChanged();
        return this;
      }

      private int dieOption_ = 0;
      /**
       * <code>.PlayerDieOption die_option = 12;</code>
       * @return The enum numeric value on the wire for dieOption.
       */
      @java.lang.Override public int getDieOptionValue() {
        return dieOption_;
      }
      /**
       * <code>.PlayerDieOption die_option = 12;</code>
       * @param value The enum numeric value on the wire for dieOption to set.
       * @return This builder for chaining.
       */
      public Builder setDieOptionValue(int value) {
        
        dieOption_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieOption die_option = 12;</code>
       * @return The dieOption.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption getDieOption() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption result = emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.valueOf(dieOption_);
        return result == null ? emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerDieOption die_option = 12;</code>
       * @param value The dieOption to set.
       * @return This builder for chaining.
       */
      public Builder setDieOption(emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dieOption_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieOption die_option = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieOption() {
        
        dieOption_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonDieOptionReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonDieOptionReq)
    private static final emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq();
    }

    public static emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonDieOptionReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonDieOptionReq>() {
      @java.lang.Override
      public DungeonDieOptionReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonDieOptionReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonDieOptionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonDieOptionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonDieOptionReqOuterClass.DungeonDieOptionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonDieOptionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonDieOptionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DungeonDieOptionReq.proto\032\025PlayerDieOp" +
      "tion.proto\"X\n\023DungeonDieOptionReq\022\033\n\023is_" +
      "quit_immediately\030\001 \001(\010\022$\n\ndie_option\030\014 \001" +
      "(\0162\020.PlayerDieOptionB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerDieOptionOuterClass.getDescriptor(),
        });
    internal_static_DungeonDieOptionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonDieOptionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonDieOptionReq_descriptor,
        new java.lang.String[] { "IsQuitImmediately", "DieOption", });
    emu.grasscutter.net.proto.PlayerDieOptionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
