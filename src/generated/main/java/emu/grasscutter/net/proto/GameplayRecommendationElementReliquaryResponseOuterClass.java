// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameplayRecommendationElementReliquaryResponse.proto

package emu.grasscutter.net.proto;

public final class GameplayRecommendationElementReliquaryResponseOuterClass {
  private GameplayRecommendationElementReliquaryResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GameplayRecommendationElementReliquaryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GameplayRecommendationElementReliquaryResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *repeated FKFPKCGAIGM OMJJDDGJOIJ = 2;
     *repeated GameplayRecommendationReliquaryMainPropData main_prop_data_list = 9; | doesnt matter
     * </pre>
     *
     * <code>uint32 equip_type = 15;</code>
     * @return The equipType.
     */
    int getEquipType();

    /**
     * <code>uint32 element_type = 7;</code>
     * @return The elementType.
     */
    int getElementType();
  }
  /**
   * Protobuf type {@code GameplayRecommendationElementReliquaryResponse}
   */
  public static final class GameplayRecommendationElementReliquaryResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GameplayRecommendationElementReliquaryResponse)
      GameplayRecommendationElementReliquaryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GameplayRecommendationElementReliquaryResponse.newBuilder() to construct.
    private GameplayRecommendationElementReliquaryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameplayRecommendationElementReliquaryResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GameplayRecommendationElementReliquaryResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GameplayRecommendationElementReliquaryResponse(
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
            case 56: {

              elementType_ = input.readUInt32();
              break;
            }
            case 120: {

              equipType_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.internal_static_GameplayRecommendationElementReliquaryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.internal_static_GameplayRecommendationElementReliquaryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.class, emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.Builder.class);
    }

    public static final int EQUIP_TYPE_FIELD_NUMBER = 15;
    private int equipType_;
    /**
     * <pre>
     *repeated FKFPKCGAIGM OMJJDDGJOIJ = 2;
     *repeated GameplayRecommendationReliquaryMainPropData main_prop_data_list = 9; | doesnt matter
     * </pre>
     *
     * <code>uint32 equip_type = 15;</code>
     * @return The equipType.
     */
    @java.lang.Override
    public int getEquipType() {
      return equipType_;
    }

    public static final int ELEMENT_TYPE_FIELD_NUMBER = 7;
    private int elementType_;
    /**
     * <code>uint32 element_type = 7;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
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
      if (elementType_ != 0) {
        output.writeUInt32(7, elementType_);
      }
      if (equipType_ != 0) {
        output.writeUInt32(15, equipType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, elementType_);
      }
      if (equipType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, equipType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse other = (emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse) obj;

      if (getEquipType()
          != other.getEquipType()) return false;
      if (getElementType()
          != other.getElementType()) return false;
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
      hash = (37 * hash) + EQUIP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEquipType();
      hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse prototype) {
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
     * Protobuf type {@code GameplayRecommendationElementReliquaryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GameplayRecommendationElementReliquaryResponse)
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.internal_static_GameplayRecommendationElementReliquaryResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.internal_static_GameplayRecommendationElementReliquaryResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.class, emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.newBuilder()
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
        equipType_ = 0;

        elementType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.internal_static_GameplayRecommendationElementReliquaryResponse_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse build() {
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse buildPartial() {
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse result = new emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse(this);
        result.equipType_ = equipType_;
        result.elementType_ = elementType_;
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
        if (other instanceof emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse) {
          return mergeFrom((emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse other) {
        if (other == emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse.getDefaultInstance()) return this;
        if (other.getEquipType() != 0) {
          setEquipType(other.getEquipType());
        }
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
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
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int equipType_ ;
      /**
       * <pre>
       *repeated FKFPKCGAIGM OMJJDDGJOIJ = 2;
       *repeated GameplayRecommendationReliquaryMainPropData main_prop_data_list = 9; | doesnt matter
       * </pre>
       *
       * <code>uint32 equip_type = 15;</code>
       * @return The equipType.
       */
      @java.lang.Override
      public int getEquipType() {
        return equipType_;
      }
      /**
       * <pre>
       *repeated FKFPKCGAIGM OMJJDDGJOIJ = 2;
       *repeated GameplayRecommendationReliquaryMainPropData main_prop_data_list = 9; | doesnt matter
       * </pre>
       *
       * <code>uint32 equip_type = 15;</code>
       * @param value The equipType to set.
       * @return This builder for chaining.
       */
      public Builder setEquipType(int value) {
        
        equipType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *repeated FKFPKCGAIGM OMJJDDGJOIJ = 2;
       *repeated GameplayRecommendationReliquaryMainPropData main_prop_data_list = 9; | doesnt matter
       * </pre>
       *
       * <code>uint32 equip_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipType() {
        
        equipType_ = 0;
        onChanged();
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 element_type = 7;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 element_type = 7;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        
        elementType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GameplayRecommendationElementReliquaryResponse)
    }

    // @@protoc_insertion_point(class_scope:GameplayRecommendationElementReliquaryResponse)
    private static final emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse();
    }

    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GameplayRecommendationElementReliquaryResponse>
        PARSER = new com.google.protobuf.AbstractParser<GameplayRecommendationElementReliquaryResponse>() {
      @java.lang.Override
      public GameplayRecommendationElementReliquaryResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameplayRecommendationElementReliquaryResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameplayRecommendationElementReliquaryResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameplayRecommendationElementReliquaryResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryResponseOuterClass.GameplayRecommendationElementReliquaryResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameplayRecommendationElementReliquaryResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameplayRecommendationElementReliquaryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4GameplayRecommendationElementReliquary" +
      "Response.proto\"Z\n.GameplayRecommendation" +
      "ElementReliquaryResponse\022\022\n\nequip_type\030\017" +
      " \001(\r\022\024\n\014element_type\030\007 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GameplayRecommendationElementReliquaryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GameplayRecommendationElementReliquaryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameplayRecommendationElementReliquaryResponse_descriptor,
        new java.lang.String[] { "EquipType", "ElementType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
