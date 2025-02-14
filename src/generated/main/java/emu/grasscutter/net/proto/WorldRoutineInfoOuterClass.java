// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldRoutineInfo.proto

package emu.grasscutter.net.proto;

public final class WorldRoutineInfoOuterClass {
  private WorldRoutineInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldRoutineInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldRoutineInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 JJMCELOOIAF = 2;</code>
     * @return The jJMCELOOIAF.
     */
    int getJJMCELOOIAF();

    /**
     * <code>uint32 finish_progress = 3;</code>
     * @return The finishProgress.
     */
    int getFinishProgress();

    /**
     * <code>bool is_finished = 6;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * Protobuf type {@code WorldRoutineInfo}
   */
  public static final class WorldRoutineInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldRoutineInfo)
      WorldRoutineInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldRoutineInfo.newBuilder() to construct.
    private WorldRoutineInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldRoutineInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldRoutineInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldRoutineInfo(
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
            case 16: {

              jJMCELOOIAF_ = input.readUInt32();
              break;
            }
            case 24: {

              finishProgress_ = input.readUInt32();
              break;
            }
            case 48: {

              isFinished_ = input.readBool();
              break;
            }
            case 104: {

              progress_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.class, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder.class);
    }

    public static final int JJMCELOOIAF_FIELD_NUMBER = 2;
    private int jJMCELOOIAF_;
    /**
     * <code>uint32 JJMCELOOIAF = 2;</code>
     * @return The jJMCELOOIAF.
     */
    @java.lang.Override
    public int getJJMCELOOIAF() {
      return jJMCELOOIAF_;
    }

    public static final int FINISH_PROGRESS_FIELD_NUMBER = 3;
    private int finishProgress_;
    /**
     * <code>uint32 finish_progress = 3;</code>
     * @return The finishProgress.
     */
    @java.lang.Override
    public int getFinishProgress() {
      return finishProgress_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 6;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 6;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 13;
    private int progress_;
    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (jJMCELOOIAF_ != 0) {
        output.writeUInt32(2, jJMCELOOIAF_);
      }
      if (finishProgress_ != 0) {
        output.writeUInt32(3, finishProgress_);
      }
      if (isFinished_ != false) {
        output.writeBool(6, isFinished_);
      }
      if (progress_ != 0) {
        output.writeUInt32(13, progress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jJMCELOOIAF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, jJMCELOOIAF_);
      }
      if (finishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, finishProgress_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isFinished_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, progress_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo other = (emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo) obj;

      if (getJJMCELOOIAF()
          != other.getJJMCELOOIAF()) return false;
      if (getFinishProgress()
          != other.getFinishProgress()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + JJMCELOOIAF_FIELD_NUMBER;
      hash = (53 * hash) + getJJMCELOOIAF();
      hash = (37 * hash) + FINISH_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFinishProgress();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo prototype) {
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
     * Protobuf type {@code WorldRoutineInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldRoutineInfo)
        emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.class, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.newBuilder()
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
        jJMCELOOIAF_ = 0;

        finishProgress_ = 0;

        isFinished_ = false;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo build() {
        emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo buildPartial() {
        emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo result = new emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo(this);
        result.jJMCELOOIAF_ = jJMCELOOIAF_;
        result.finishProgress_ = finishProgress_;
        result.isFinished_ = isFinished_;
        result.progress_ = progress_;
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
        if (other instanceof emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo other) {
        if (other == emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance()) return this;
        if (other.getJJMCELOOIAF() != 0) {
          setJJMCELOOIAF(other.getJJMCELOOIAF());
        }
        if (other.getFinishProgress() != 0) {
          setFinishProgress(other.getFinishProgress());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
        emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int jJMCELOOIAF_ ;
      /**
       * <code>uint32 JJMCELOOIAF = 2;</code>
       * @return The jJMCELOOIAF.
       */
      @java.lang.Override
      public int getJJMCELOOIAF() {
        return jJMCELOOIAF_;
      }
      /**
       * <code>uint32 JJMCELOOIAF = 2;</code>
       * @param value The jJMCELOOIAF to set.
       * @return This builder for chaining.
       */
      public Builder setJJMCELOOIAF(int value) {
        
        jJMCELOOIAF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JJMCELOOIAF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearJJMCELOOIAF() {
        
        jJMCELOOIAF_ = 0;
        onChanged();
        return this;
      }

      private int finishProgress_ ;
      /**
       * <code>uint32 finish_progress = 3;</code>
       * @return The finishProgress.
       */
      @java.lang.Override
      public int getFinishProgress() {
        return finishProgress_;
      }
      /**
       * <code>uint32 finish_progress = 3;</code>
       * @param value The finishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setFinishProgress(int value) {
        
        finishProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_progress = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishProgress() {
        
        finishProgress_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 6;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 6;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 13;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WorldRoutineInfo)
    }

    // @@protoc_insertion_point(class_scope:WorldRoutineInfo)
    private static final emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo();
    }

    public static emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldRoutineInfo>
        PARSER = new com.google.protobuf.AbstractParser<WorldRoutineInfo>() {
      @java.lang.Override
      public WorldRoutineInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldRoutineInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldRoutineInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldRoutineInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldRoutineInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldRoutineInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WorldRoutineInfo.proto\"g\n\020WorldRoutine" +
      "Info\022\023\n\013JJMCELOOIAF\030\002 \001(\r\022\027\n\017finish_prog" +
      "ress\030\003 \001(\r\022\023\n\013is_finished\030\006 \001(\010\022\020\n\010progr" +
      "ess\030\r \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WorldRoutineInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldRoutineInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldRoutineInfo_descriptor,
        new java.lang.String[] { "JJMCELOOIAF", "FinishProgress", "IsFinished", "Progress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
