// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaAddAbility.proto

package emu.grasscutter.net.proto;

public final class AbilityMetaAddAbilityOuterClass {
  private AbilityMetaAddAbilityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaAddAbilityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaAddAbility)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilityAppliedAbility ability = 7;</code>
     * @return Whether the ability field is set.
     */
    boolean hasAbility();
    /**
     * <code>.AbilityAppliedAbility ability = 7;</code>
     * @return The ability.
     */
    emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility getAbility();
    /**
     * <code>.AbilityAppliedAbility ability = 7;</code>
     */
    emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder getAbilityOrBuilder();
  }
  /**
   * Protobuf type {@code AbilityMetaAddAbility}
   */
  public static final class AbilityMetaAddAbility extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaAddAbility)
      AbilityMetaAddAbilityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaAddAbility.newBuilder() to construct.
    private AbilityMetaAddAbility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaAddAbility() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaAddAbility();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMetaAddAbility(
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
            case 58: {
              emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder subBuilder = null;
              if (ability_ != null) {
                subBuilder = ability_.toBuilder();
              }
              ability_ = input.readMessage(emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ability_);
                ability_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.internal_static_AbilityMetaAddAbility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.internal_static_AbilityMetaAddAbility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.class, emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.Builder.class);
    }

    public static final int ABILITY_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility ability_;
    /**
     * <code>.AbilityAppliedAbility ability = 7;</code>
     * @return Whether the ability field is set.
     */
    @java.lang.Override
    public boolean hasAbility() {
      return ability_ != null;
    }
    /**
     * <code>.AbilityAppliedAbility ability = 7;</code>
     * @return The ability.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility getAbility() {
      return ability_ == null ? emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.getDefaultInstance() : ability_;
    }
    /**
     * <code>.AbilityAppliedAbility ability = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder getAbilityOrBuilder() {
      return getAbility();
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
      if (ability_ != null) {
        output.writeMessage(7, getAbility());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ability_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getAbility());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility other = (emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility) obj;

      if (hasAbility() != other.hasAbility()) return false;
      if (hasAbility()) {
        if (!getAbility()
            .equals(other.getAbility())) return false;
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
      if (hasAbility()) {
        hash = (37 * hash) + ABILITY_FIELD_NUMBER;
        hash = (53 * hash) + getAbility().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility prototype) {
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
     * Protobuf type {@code AbilityMetaAddAbility}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaAddAbility)
        emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbilityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.internal_static_AbilityMetaAddAbility_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.internal_static_AbilityMetaAddAbility_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.class, emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.newBuilder()
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
        if (abilityBuilder_ == null) {
          ability_ = null;
        } else {
          ability_ = null;
          abilityBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.internal_static_AbilityMetaAddAbility_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility build() {
        emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility buildPartial() {
        emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility result = new emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility(this);
        if (abilityBuilder_ == null) {
          result.ability_ = ability_;
        } else {
          result.ability_ = abilityBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility other) {
        if (other == emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.getDefaultInstance()) return this;
        if (other.hasAbility()) {
          mergeAbility(other.getAbility());
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
        emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility ability_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility, emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder, emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> abilityBuilder_;
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       * @return Whether the ability field is set.
       */
      public boolean hasAbility() {
        return abilityBuilder_ != null || ability_ != null;
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       * @return The ability.
       */
      public emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility getAbility() {
        if (abilityBuilder_ == null) {
          return ability_ == null ? emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.getDefaultInstance() : ability_;
        } else {
          return abilityBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      public Builder setAbility(emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility value) {
        if (abilityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ability_ = value;
          onChanged();
        } else {
          abilityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      public Builder setAbility(
          emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder builderForValue) {
        if (abilityBuilder_ == null) {
          ability_ = builderForValue.build();
          onChanged();
        } else {
          abilityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      public Builder mergeAbility(emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility value) {
        if (abilityBuilder_ == null) {
          if (ability_ != null) {
            ability_ =
              emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.newBuilder(ability_).mergeFrom(value).buildPartial();
          } else {
            ability_ = value;
          }
          onChanged();
        } else {
          abilityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      public Builder clearAbility() {
        if (abilityBuilder_ == null) {
          ability_ = null;
          onChanged();
        } else {
          ability_ = null;
          abilityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      public emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder getAbilityBuilder() {
        
        onChanged();
        return getAbilityFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      public emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder getAbilityOrBuilder() {
        if (abilityBuilder_ != null) {
          return abilityBuilder_.getMessageOrBuilder();
        } else {
          return ability_ == null ?
              emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.getDefaultInstance() : ability_;
        }
      }
      /**
       * <code>.AbilityAppliedAbility ability = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility, emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder, emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> 
          getAbilityFieldBuilder() {
        if (abilityBuilder_ == null) {
          abilityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility, emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder, emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder>(
                  getAbility(),
                  getParentForChildren(),
                  isClean());
          ability_ = null;
        }
        return abilityBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaAddAbility)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaAddAbility)
    private static final emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility();
    }

    public static emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaAddAbility>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaAddAbility>() {
      @java.lang.Override
      public AbilityMetaAddAbility parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMetaAddAbility(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMetaAddAbility> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaAddAbility> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaAddAbility_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaAddAbility_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AbilityMetaAddAbility.proto\032\033AbilityAp" +
      "pliedAbility.proto\"@\n\025AbilityMetaAddAbil" +
      "ity\022\'\n\007ability\030\007 \001(\0132\026.AbilityAppliedAbi" +
      "lityB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.getDescriptor(),
        });
    internal_static_AbilityMetaAddAbility_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaAddAbility_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaAddAbility_descriptor,
        new java.lang.String[] { "Ability", });
    emu.grasscutter.net.proto.AbilityAppliedAbilityOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
