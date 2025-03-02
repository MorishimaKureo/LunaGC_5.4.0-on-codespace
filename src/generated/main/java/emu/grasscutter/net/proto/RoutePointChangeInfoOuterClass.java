// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoutePointChangeInfo.proto

package emu.grasscutter.net.proto;

public final class RoutePointChangeInfoOuterClass {
  private RoutePointChangeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoutePointChangeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoutePointChangeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float DMBPNFCDAGK = 13;</code>
     * @return The dMBPNFCDAGK.
     */
    float getDMBPNFCDAGK();

    /**
     * <code>float ICKDCIMPDHH = 8;</code>
     * @return The iCKDCIMPDHH.
     */
    float getICKDCIMPDHH();

    /**
     * <code>uint32 EIFACCCOKAL = 10;</code>
     * @return The eIFACCCOKAL.
     */
    int getEIFACCCOKAL();
  }
  /**
   * Protobuf type {@code RoutePointChangeInfo}
   */
  public static final class RoutePointChangeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoutePointChangeInfo)
      RoutePointChangeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoutePointChangeInfo.newBuilder() to construct.
    private RoutePointChangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoutePointChangeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoutePointChangeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoutePointChangeInfo(
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
            case 69: {

              iCKDCIMPDHH_ = input.readFloat();
              break;
            }
            case 80: {

              eIFACCCOKAL_ = input.readUInt32();
              break;
            }
            case 109: {

              dMBPNFCDAGK_ = input.readFloat();
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
      return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.class, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder.class);
    }

    public static final int DMBPNFCDAGK_FIELD_NUMBER = 13;
    private float dMBPNFCDAGK_;
    /**
     * <code>float DMBPNFCDAGK = 13;</code>
     * @return The dMBPNFCDAGK.
     */
    @java.lang.Override
    public float getDMBPNFCDAGK() {
      return dMBPNFCDAGK_;
    }

    public static final int ICKDCIMPDHH_FIELD_NUMBER = 8;
    private float iCKDCIMPDHH_;
    /**
     * <code>float ICKDCIMPDHH = 8;</code>
     * @return The iCKDCIMPDHH.
     */
    @java.lang.Override
    public float getICKDCIMPDHH() {
      return iCKDCIMPDHH_;
    }

    public static final int EIFACCCOKAL_FIELD_NUMBER = 10;
    private int eIFACCCOKAL_;
    /**
     * <code>uint32 EIFACCCOKAL = 10;</code>
     * @return The eIFACCCOKAL.
     */
    @java.lang.Override
    public int getEIFACCCOKAL() {
      return eIFACCCOKAL_;
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
      if (iCKDCIMPDHH_ != 0F) {
        output.writeFloat(8, iCKDCIMPDHH_);
      }
      if (eIFACCCOKAL_ != 0) {
        output.writeUInt32(10, eIFACCCOKAL_);
      }
      if (dMBPNFCDAGK_ != 0F) {
        output.writeFloat(13, dMBPNFCDAGK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iCKDCIMPDHH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(8, iCKDCIMPDHH_);
      }
      if (eIFACCCOKAL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, eIFACCCOKAL_);
      }
      if (dMBPNFCDAGK_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, dMBPNFCDAGK_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo other = (emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo) obj;

      if (java.lang.Float.floatToIntBits(getDMBPNFCDAGK())
          != java.lang.Float.floatToIntBits(
              other.getDMBPNFCDAGK())) return false;
      if (java.lang.Float.floatToIntBits(getICKDCIMPDHH())
          != java.lang.Float.floatToIntBits(
              other.getICKDCIMPDHH())) return false;
      if (getEIFACCCOKAL()
          != other.getEIFACCCOKAL()) return false;
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
      hash = (37 * hash) + DMBPNFCDAGK_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDMBPNFCDAGK());
      hash = (37 * hash) + ICKDCIMPDHH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getICKDCIMPDHH());
      hash = (37 * hash) + EIFACCCOKAL_FIELD_NUMBER;
      hash = (53 * hash) + getEIFACCCOKAL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo prototype) {
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
     * Protobuf type {@code RoutePointChangeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoutePointChangeInfo)
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.class, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.newBuilder()
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
        dMBPNFCDAGK_ = 0F;

        iCKDCIMPDHH_ = 0F;

        eIFACCCOKAL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo build() {
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo buildPartial() {
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo result = new emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo(this);
        result.dMBPNFCDAGK_ = dMBPNFCDAGK_;
        result.iCKDCIMPDHH_ = iCKDCIMPDHH_;
        result.eIFACCCOKAL_ = eIFACCCOKAL_;
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
        if (other instanceof emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo other) {
        if (other == emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance()) return this;
        if (other.getDMBPNFCDAGK() != 0F) {
          setDMBPNFCDAGK(other.getDMBPNFCDAGK());
        }
        if (other.getICKDCIMPDHH() != 0F) {
          setICKDCIMPDHH(other.getICKDCIMPDHH());
        }
        if (other.getEIFACCCOKAL() != 0) {
          setEIFACCCOKAL(other.getEIFACCCOKAL());
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
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float dMBPNFCDAGK_ ;
      /**
       * <code>float DMBPNFCDAGK = 13;</code>
       * @return The dMBPNFCDAGK.
       */
      @java.lang.Override
      public float getDMBPNFCDAGK() {
        return dMBPNFCDAGK_;
      }
      /**
       * <code>float DMBPNFCDAGK = 13;</code>
       * @param value The dMBPNFCDAGK to set.
       * @return This builder for chaining.
       */
      public Builder setDMBPNFCDAGK(float value) {
        
        dMBPNFCDAGK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float DMBPNFCDAGK = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDMBPNFCDAGK() {
        
        dMBPNFCDAGK_ = 0F;
        onChanged();
        return this;
      }

      private float iCKDCIMPDHH_ ;
      /**
       * <code>float ICKDCIMPDHH = 8;</code>
       * @return The iCKDCIMPDHH.
       */
      @java.lang.Override
      public float getICKDCIMPDHH() {
        return iCKDCIMPDHH_;
      }
      /**
       * <code>float ICKDCIMPDHH = 8;</code>
       * @param value The iCKDCIMPDHH to set.
       * @return This builder for chaining.
       */
      public Builder setICKDCIMPDHH(float value) {
        
        iCKDCIMPDHH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float ICKDCIMPDHH = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearICKDCIMPDHH() {
        
        iCKDCIMPDHH_ = 0F;
        onChanged();
        return this;
      }

      private int eIFACCCOKAL_ ;
      /**
       * <code>uint32 EIFACCCOKAL = 10;</code>
       * @return The eIFACCCOKAL.
       */
      @java.lang.Override
      public int getEIFACCCOKAL() {
        return eIFACCCOKAL_;
      }
      /**
       * <code>uint32 EIFACCCOKAL = 10;</code>
       * @param value The eIFACCCOKAL to set.
       * @return This builder for chaining.
       */
      public Builder setEIFACCCOKAL(int value) {
        
        eIFACCCOKAL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EIFACCCOKAL = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEIFACCCOKAL() {
        
        eIFACCCOKAL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoutePointChangeInfo)
    }

    // @@protoc_insertion_point(class_scope:RoutePointChangeInfo)
    private static final emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo();
    }

    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoutePointChangeInfo>
        PARSER = new com.google.protobuf.AbstractParser<RoutePointChangeInfo>() {
      @java.lang.Override
      public RoutePointChangeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoutePointChangeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoutePointChangeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoutePointChangeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoutePointChangeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoutePointChangeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032RoutePointChangeInfo.proto\"U\n\024RoutePoi" +
      "ntChangeInfo\022\023\n\013DMBPNFCDAGK\030\r \001(\002\022\023\n\013ICK" +
      "DCIMPDHH\030\010 \001(\002\022\023\n\013EIFACCCOKAL\030\n \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoutePointChangeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoutePointChangeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoutePointChangeInfo_descriptor,
        new java.lang.String[] { "DMBPNFCDAGK", "ICKDCIMPDHH", "EIFACCCOKAL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
