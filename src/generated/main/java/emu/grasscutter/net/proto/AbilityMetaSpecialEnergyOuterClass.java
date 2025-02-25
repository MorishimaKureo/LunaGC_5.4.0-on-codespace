// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaSpecialEnergy.proto

package emu.grasscutter.net.proto;

public final class AbilityMetaSpecialEnergyOuterClass {
  private AbilityMetaSpecialEnergyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaSpecialEnergyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaSpecialEnergy)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float value = 13;</code>
     * @return The value.
     */
    float getValue();
  }
  /**
   * <pre>
   *5.3.0
   * </pre>
   *
   * Protobuf type {@code AbilityMetaSpecialEnergy}
   */
  public static final class AbilityMetaSpecialEnergy extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaSpecialEnergy)
      AbilityMetaSpecialEnergyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaSpecialEnergy.newBuilder() to construct.
    private AbilityMetaSpecialEnergy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaSpecialEnergy() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaSpecialEnergy();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMetaSpecialEnergy(
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
            case 109: {

              value_ = input.readFloat();
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
      return emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.internal_static_AbilityMetaSpecialEnergy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.internal_static_AbilityMetaSpecialEnergy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.class, emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 13;
    private float value_;
    /**
     * <code>float value = 13;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
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
      if (value_ != 0F) {
        output.writeFloat(13, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, value_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy other = (emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy) obj;

      if (java.lang.Float.floatToIntBits(getValue())
          != java.lang.Float.floatToIntBits(
              other.getValue())) return false;
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getValue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy prototype) {
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
     *5.3.0
     * </pre>
     *
     * Protobuf type {@code AbilityMetaSpecialEnergy}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaSpecialEnergy)
        emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.internal_static_AbilityMetaSpecialEnergy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.internal_static_AbilityMetaSpecialEnergy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.class, emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.newBuilder()
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
        value_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.internal_static_AbilityMetaSpecialEnergy_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy build() {
        emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy buildPartial() {
        emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy result = new emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy(this);
        result.value_ = value_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy other) {
        if (other == emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy.getDefaultInstance()) return this;
        if (other.getValue() != 0F) {
          setValue(other.getValue());
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
        emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float value_ ;
      /**
       * <code>float value = 13;</code>
       * @return The value.
       */
      @java.lang.Override
      public float getValue() {
        return value_;
      }
      /**
       * <code>float value = 13;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(float value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float value = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaSpecialEnergy)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaSpecialEnergy)
    private static final emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy();
    }

    public static emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaSpecialEnergy>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaSpecialEnergy>() {
      @java.lang.Override
      public AbilityMetaSpecialEnergy parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMetaSpecialEnergy(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMetaSpecialEnergy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaSpecialEnergy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityMetaSpecialEnergyOuterClass.AbilityMetaSpecialEnergy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaSpecialEnergy_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaSpecialEnergy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AbilityMetaSpecialEnergy.proto\")\n\030Abil" +
      "ityMetaSpecialEnergy\022\r\n\005value\030\r \001(\002B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMetaSpecialEnergy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaSpecialEnergy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaSpecialEnergy_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
