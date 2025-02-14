// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCookReq.proto

package emu.grasscutter.net.proto;

public final class PlayerCookReqOuterClass {
  private PlayerCookReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCookReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCookReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 assist_avatar = 3;</code>
     * @return The assistAvatar.
     */
    int getAssistAvatar();

    /**
     * <code>uint32 recipe_id = 6;</code>
     * @return The recipeId.
     */
    int getRecipeId();

    /**
     * <code>uint32 qte_quality = 10;</code>
     * @return The qteQuality.
     */
    int getQteQuality();

    /**
     * <code>uint32 cook_count = 13;</code>
     * @return The cookCount.
     */
    int getCookCount();
  }
  /**
   * Protobuf type {@code PlayerCookReq}
   */
  public static final class PlayerCookReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCookReq)
      PlayerCookReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCookReq.newBuilder() to construct.
    private PlayerCookReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCookReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCookReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerCookReq(
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
            case 24: {

              assistAvatar_ = input.readUInt32();
              break;
            }
            case 48: {

              recipeId_ = input.readUInt32();
              break;
            }
            case 80: {

              qteQuality_ = input.readUInt32();
              break;
            }
            case 104: {

              cookCount_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerCookReqOuterClass.internal_static_PlayerCookReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.class, emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.Builder.class);
    }

    public static final int ASSIST_AVATAR_FIELD_NUMBER = 3;
    private int assistAvatar_;
    /**
     * <code>uint32 assist_avatar = 3;</code>
     * @return The assistAvatar.
     */
    @java.lang.Override
    public int getAssistAvatar() {
      return assistAvatar_;
    }

    public static final int RECIPE_ID_FIELD_NUMBER = 6;
    private int recipeId_;
    /**
     * <code>uint32 recipe_id = 6;</code>
     * @return The recipeId.
     */
    @java.lang.Override
    public int getRecipeId() {
      return recipeId_;
    }

    public static final int QTE_QUALITY_FIELD_NUMBER = 10;
    private int qteQuality_;
    /**
     * <code>uint32 qte_quality = 10;</code>
     * @return The qteQuality.
     */
    @java.lang.Override
    public int getQteQuality() {
      return qteQuality_;
    }

    public static final int COOK_COUNT_FIELD_NUMBER = 13;
    private int cookCount_;
    /**
     * <code>uint32 cook_count = 13;</code>
     * @return The cookCount.
     */
    @java.lang.Override
    public int getCookCount() {
      return cookCount_;
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
      if (assistAvatar_ != 0) {
        output.writeUInt32(3, assistAvatar_);
      }
      if (recipeId_ != 0) {
        output.writeUInt32(6, recipeId_);
      }
      if (qteQuality_ != 0) {
        output.writeUInt32(10, qteQuality_);
      }
      if (cookCount_ != 0) {
        output.writeUInt32(13, cookCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (assistAvatar_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, assistAvatar_);
      }
      if (recipeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, recipeId_);
      }
      if (qteQuality_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, qteQuality_);
      }
      if (cookCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cookCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq other = (emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq) obj;

      if (getAssistAvatar()
          != other.getAssistAvatar()) return false;
      if (getRecipeId()
          != other.getRecipeId()) return false;
      if (getQteQuality()
          != other.getQteQuality()) return false;
      if (getCookCount()
          != other.getCookCount()) return false;
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
      hash = (37 * hash) + ASSIST_AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getAssistAvatar();
      hash = (37 * hash) + RECIPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecipeId();
      hash = (37 * hash) + QTE_QUALITY_FIELD_NUMBER;
      hash = (53 * hash) + getQteQuality();
      hash = (37 * hash) + COOK_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCookCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq prototype) {
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
     * Protobuf type {@code PlayerCookReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCookReq)
        emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerCookReqOuterClass.internal_static_PlayerCookReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.class, emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.newBuilder()
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
        assistAvatar_ = 0;

        recipeId_ = 0;

        qteQuality_ = 0;

        cookCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq build() {
        emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq buildPartial() {
        emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq result = new emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq(this);
        result.assistAvatar_ = assistAvatar_;
        result.recipeId_ = recipeId_;
        result.qteQuality_ = qteQuality_;
        result.cookCount_ = cookCount_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq other) {
        if (other == emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq.getDefaultInstance()) return this;
        if (other.getAssistAvatar() != 0) {
          setAssistAvatar(other.getAssistAvatar());
        }
        if (other.getRecipeId() != 0) {
          setRecipeId(other.getRecipeId());
        }
        if (other.getQteQuality() != 0) {
          setQteQuality(other.getQteQuality());
        }
        if (other.getCookCount() != 0) {
          setCookCount(other.getCookCount());
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
        emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int assistAvatar_ ;
      /**
       * <code>uint32 assist_avatar = 3;</code>
       * @return The assistAvatar.
       */
      @java.lang.Override
      public int getAssistAvatar() {
        return assistAvatar_;
      }
      /**
       * <code>uint32 assist_avatar = 3;</code>
       * @param value The assistAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setAssistAvatar(int value) {
        
        assistAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assist_avatar = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistAvatar() {
        
        assistAvatar_ = 0;
        onChanged();
        return this;
      }

      private int recipeId_ ;
      /**
       * <code>uint32 recipe_id = 6;</code>
       * @return The recipeId.
       */
      @java.lang.Override
      public int getRecipeId() {
        return recipeId_;
      }
      /**
       * <code>uint32 recipe_id = 6;</code>
       * @param value The recipeId to set.
       * @return This builder for chaining.
       */
      public Builder setRecipeId(int value) {
        
        recipeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 recipe_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecipeId() {
        
        recipeId_ = 0;
        onChanged();
        return this;
      }

      private int qteQuality_ ;
      /**
       * <code>uint32 qte_quality = 10;</code>
       * @return The qteQuality.
       */
      @java.lang.Override
      public int getQteQuality() {
        return qteQuality_;
      }
      /**
       * <code>uint32 qte_quality = 10;</code>
       * @param value The qteQuality to set.
       * @return This builder for chaining.
       */
      public Builder setQteQuality(int value) {
        
        qteQuality_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 qte_quality = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearQteQuality() {
        
        qteQuality_ = 0;
        onChanged();
        return this;
      }

      private int cookCount_ ;
      /**
       * <code>uint32 cook_count = 13;</code>
       * @return The cookCount.
       */
      @java.lang.Override
      public int getCookCount() {
        return cookCount_;
      }
      /**
       * <code>uint32 cook_count = 13;</code>
       * @param value The cookCount to set.
       * @return This builder for chaining.
       */
      public Builder setCookCount(int value) {
        
        cookCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cook_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCookCount() {
        
        cookCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCookReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCookReq)
    private static final emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq();
    }

    public static emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCookReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCookReq>() {
      @java.lang.Override
      public PlayerCookReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerCookReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerCookReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCookReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerCookReqOuterClass.PlayerCookReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCookReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCookReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PlayerCookReq.proto\"b\n\rPlayerCookReq\022\025" +
      "\n\rassist_avatar\030\003 \001(\r\022\021\n\trecipe_id\030\006 \001(\r" +
      "\022\023\n\013qte_quality\030\n \001(\r\022\022\n\ncook_count\030\r \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCookReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCookReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCookReq_descriptor,
        new java.lang.String[] { "AssistAvatar", "RecipeId", "QteQuality", "CookCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
