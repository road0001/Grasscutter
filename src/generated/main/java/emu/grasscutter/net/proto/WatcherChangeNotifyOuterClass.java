// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WatcherChangeNotify.proto

package emu.grasscutter.net.proto;

public final class WatcherChangeNotifyOuterClass {
  private WatcherChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WatcherChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WatcherChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
     * @return A list containing the lJOHAPLDDIA.
     */
    java.util.List<java.lang.Integer> getLJOHAPLDDIAList();
    /**
     * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
     * @return The count of lJOHAPLDDIA.
     */
    int getLJOHAPLDDIACount();
    /**
     * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
     * @param index The index of the element to return.
     * @return The lJOHAPLDDIA at the given index.
     */
    int getLJOHAPLDDIA(int index);

    /**
     * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
     * @return A list containing the nEHBGOHNHLJ.
     */
    java.util.List<java.lang.Integer> getNEHBGOHNHLJList();
    /**
     * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
     * @return The count of nEHBGOHNHLJ.
     */
    int getNEHBGOHNHLJCount();
    /**
     * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
     * @param index The index of the element to return.
     * @return The nEHBGOHNHLJ at the given index.
     */
    int getNEHBGOHNHLJ(int index);
  }
  /**
   * <pre>
   * CmdId: 2296
   * Obf: BJBFEMJBFOA
   * </pre>
   *
   * Protobuf type {@code WatcherChangeNotify}
   */
  public static final class WatcherChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WatcherChangeNotify)
      WatcherChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WatcherChangeNotify.newBuilder() to construct.
    private WatcherChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WatcherChangeNotify() {
      lJOHAPLDDIA_ = emptyIntList();
      nEHBGOHNHLJ_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WatcherChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WatcherChangeNotify(
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
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                lJOHAPLDDIA_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              lJOHAPLDDIA_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                lJOHAPLDDIA_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                lJOHAPLDDIA_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                nEHBGOHNHLJ_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              nEHBGOHNHLJ_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                nEHBGOHNHLJ_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                nEHBGOHNHLJ_.addInt(input.readUInt32());
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
          lJOHAPLDDIA_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          nEHBGOHNHLJ_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.class, emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.Builder.class);
    }

    public static final int LJOHAPLDDIA_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList lJOHAPLDDIA_;
    /**
     * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
     * @return A list containing the lJOHAPLDDIA.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLJOHAPLDDIAList() {
      return lJOHAPLDDIA_;
    }
    /**
     * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
     * @return The count of lJOHAPLDDIA.
     */
    public int getLJOHAPLDDIACount() {
      return lJOHAPLDDIA_.size();
    }
    /**
     * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
     * @param index The index of the element to return.
     * @return The lJOHAPLDDIA at the given index.
     */
    public int getLJOHAPLDDIA(int index) {
      return lJOHAPLDDIA_.getInt(index);
    }
    private int lJOHAPLDDIAMemoizedSerializedSize = -1;

    public static final int NEHBGOHNHLJ_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList nEHBGOHNHLJ_;
    /**
     * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
     * @return A list containing the nEHBGOHNHLJ.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getNEHBGOHNHLJList() {
      return nEHBGOHNHLJ_;
    }
    /**
     * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
     * @return The count of nEHBGOHNHLJ.
     */
    public int getNEHBGOHNHLJCount() {
      return nEHBGOHNHLJ_.size();
    }
    /**
     * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
     * @param index The index of the element to return.
     * @return The nEHBGOHNHLJ at the given index.
     */
    public int getNEHBGOHNHLJ(int index) {
      return nEHBGOHNHLJ_.getInt(index);
    }
    private int nEHBGOHNHLJMemoizedSerializedSize = -1;

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
      if (getLJOHAPLDDIAList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(lJOHAPLDDIAMemoizedSerializedSize);
      }
      for (int i = 0; i < lJOHAPLDDIA_.size(); i++) {
        output.writeUInt32NoTag(lJOHAPLDDIA_.getInt(i));
      }
      if (getNEHBGOHNHLJList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(nEHBGOHNHLJMemoizedSerializedSize);
      }
      for (int i = 0; i < nEHBGOHNHLJ_.size(); i++) {
        output.writeUInt32NoTag(nEHBGOHNHLJ_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < lJOHAPLDDIA_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(lJOHAPLDDIA_.getInt(i));
        }
        size += dataSize;
        if (!getLJOHAPLDDIAList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lJOHAPLDDIAMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < nEHBGOHNHLJ_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(nEHBGOHNHLJ_.getInt(i));
        }
        size += dataSize;
        if (!getNEHBGOHNHLJList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        nEHBGOHNHLJMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify other = (emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify) obj;

      if (!getLJOHAPLDDIAList()
          .equals(other.getLJOHAPLDDIAList())) return false;
      if (!getNEHBGOHNHLJList()
          .equals(other.getNEHBGOHNHLJList())) return false;
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
      if (getLJOHAPLDDIACount() > 0) {
        hash = (37 * hash) + LJOHAPLDDIA_FIELD_NUMBER;
        hash = (53 * hash) + getLJOHAPLDDIAList().hashCode();
      }
      if (getNEHBGOHNHLJCount() > 0) {
        hash = (37 * hash) + NEHBGOHNHLJ_FIELD_NUMBER;
        hash = (53 * hash) + getNEHBGOHNHLJList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify prototype) {
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
     * CmdId: 2296
     * Obf: BJBFEMJBFOA
     * </pre>
     *
     * Protobuf type {@code WatcherChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WatcherChangeNotify)
        emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.class, emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.newBuilder()
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
        lJOHAPLDDIA_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        nEHBGOHNHLJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify build() {
        emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify buildPartial() {
        emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify result = new emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          lJOHAPLDDIA_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lJOHAPLDDIA_ = lJOHAPLDDIA_;
        if (((bitField0_ & 0x00000002) != 0)) {
          nEHBGOHNHLJ_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.nEHBGOHNHLJ_ = nEHBGOHNHLJ_;
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
        if (other instanceof emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify other) {
        if (other == emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.getDefaultInstance()) return this;
        if (!other.lJOHAPLDDIA_.isEmpty()) {
          if (lJOHAPLDDIA_.isEmpty()) {
            lJOHAPLDDIA_ = other.lJOHAPLDDIA_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLJOHAPLDDIAIsMutable();
            lJOHAPLDDIA_.addAll(other.lJOHAPLDDIA_);
          }
          onChanged();
        }
        if (!other.nEHBGOHNHLJ_.isEmpty()) {
          if (nEHBGOHNHLJ_.isEmpty()) {
            nEHBGOHNHLJ_ = other.nEHBGOHNHLJ_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNEHBGOHNHLJIsMutable();
            nEHBGOHNHLJ_.addAll(other.nEHBGOHNHLJ_);
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
        emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList lJOHAPLDDIA_ = emptyIntList();
      private void ensureLJOHAPLDDIAIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          lJOHAPLDDIA_ = mutableCopy(lJOHAPLDDIA_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @return A list containing the lJOHAPLDDIA.
       */
      public java.util.List<java.lang.Integer>
          getLJOHAPLDDIAList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(lJOHAPLDDIA_) : lJOHAPLDDIA_;
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @return The count of lJOHAPLDDIA.
       */
      public int getLJOHAPLDDIACount() {
        return lJOHAPLDDIA_.size();
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @param index The index of the element to return.
       * @return The lJOHAPLDDIA at the given index.
       */
      public int getLJOHAPLDDIA(int index) {
        return lJOHAPLDDIA_.getInt(index);
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @param index The index to set the value at.
       * @param value The lJOHAPLDDIA to set.
       * @return This builder for chaining.
       */
      public Builder setLJOHAPLDDIA(
          int index, int value) {
        ensureLJOHAPLDDIAIsMutable();
        lJOHAPLDDIA_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @param value The lJOHAPLDDIA to add.
       * @return This builder for chaining.
       */
      public Builder addLJOHAPLDDIA(int value) {
        ensureLJOHAPLDDIAIsMutable();
        lJOHAPLDDIA_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @param values The lJOHAPLDDIA to add.
       * @return This builder for chaining.
       */
      public Builder addAllLJOHAPLDDIA(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLJOHAPLDDIAIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lJOHAPLDDIA_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LJOHAPLDDIA = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLJOHAPLDDIA() {
        lJOHAPLDDIA_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList nEHBGOHNHLJ_ = emptyIntList();
      private void ensureNEHBGOHNHLJIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          nEHBGOHNHLJ_ = mutableCopy(nEHBGOHNHLJ_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @return A list containing the nEHBGOHNHLJ.
       */
      public java.util.List<java.lang.Integer>
          getNEHBGOHNHLJList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(nEHBGOHNHLJ_) : nEHBGOHNHLJ_;
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @return The count of nEHBGOHNHLJ.
       */
      public int getNEHBGOHNHLJCount() {
        return nEHBGOHNHLJ_.size();
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @param index The index of the element to return.
       * @return The nEHBGOHNHLJ at the given index.
       */
      public int getNEHBGOHNHLJ(int index) {
        return nEHBGOHNHLJ_.getInt(index);
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @param index The index to set the value at.
       * @param value The nEHBGOHNHLJ to set.
       * @return This builder for chaining.
       */
      public Builder setNEHBGOHNHLJ(
          int index, int value) {
        ensureNEHBGOHNHLJIsMutable();
        nEHBGOHNHLJ_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @param value The nEHBGOHNHLJ to add.
       * @return This builder for chaining.
       */
      public Builder addNEHBGOHNHLJ(int value) {
        ensureNEHBGOHNHLJIsMutable();
        nEHBGOHNHLJ_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @param values The nEHBGOHNHLJ to add.
       * @return This builder for chaining.
       */
      public Builder addAllNEHBGOHNHLJ(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNEHBGOHNHLJIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nEHBGOHNHLJ_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 NEHBGOHNHLJ = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearNEHBGOHNHLJ() {
        nEHBGOHNHLJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:WatcherChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WatcherChangeNotify)
    private static final emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify();
    }

    public static emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WatcherChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WatcherChangeNotify>() {
      @java.lang.Override
      public WatcherChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WatcherChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WatcherChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WatcherChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WatcherChangeNotifyOuterClass.WatcherChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WatcherChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WatcherChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031WatcherChangeNotify.proto\"?\n\023WatcherCh" +
      "angeNotify\022\023\n\013LJOHAPLDDIA\030\t \003(\r\022\023\n\013NEHBG" +
      "OHNHLJ\030\014 \003(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WatcherChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WatcherChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WatcherChangeNotify_descriptor,
        new java.lang.String[] { "LJOHAPLDDIA", "NEHBGOHNHLJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
