// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code dummy.PrimeNumberDecompositionRequest}
 */
public final class PrimeNumberDecompositionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dummy.PrimeNumberDecompositionRequest)
    PrimeNumberDecompositionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrimeNumberDecompositionRequest.newBuilder() to construct.
  private PrimeNumberDecompositionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrimeNumberDecompositionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrimeNumberDecompositionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrimeNumberDecompositionRequest(
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
          case 10: {
            com.proto.calculator.PrimeNumber.Builder subBuilder = null;
            if (primeNumber_ != null) {
              subBuilder = primeNumber_.toBuilder();
            }
            primeNumber_ = input.readMessage(com.proto.calculator.PrimeNumber.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(primeNumber_);
              primeNumber_ = subBuilder.buildPartial();
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
    return com.proto.calculator.CalculatorOuterClass.internal_static_dummy_PrimeNumberDecompositionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.calculator.CalculatorOuterClass.internal_static_dummy_PrimeNumberDecompositionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.calculator.PrimeNumberDecompositionRequest.class, com.proto.calculator.PrimeNumberDecompositionRequest.Builder.class);
  }

  public static final int PRIMENUMBER_FIELD_NUMBER = 1;
  private com.proto.calculator.PrimeNumber primeNumber_;
  /**
   * <code>.dummy.PrimeNumber primeNumber = 1;</code>
   * @return Whether the primeNumber field is set.
   */
  @java.lang.Override
  public boolean hasPrimeNumber() {
    return primeNumber_ != null;
  }
  /**
   * <code>.dummy.PrimeNumber primeNumber = 1;</code>
   * @return The primeNumber.
   */
  @java.lang.Override
  public com.proto.calculator.PrimeNumber getPrimeNumber() {
    return primeNumber_ == null ? com.proto.calculator.PrimeNumber.getDefaultInstance() : primeNumber_;
  }
  /**
   * <code>.dummy.PrimeNumber primeNumber = 1;</code>
   */
  @java.lang.Override
  public com.proto.calculator.PrimeNumberOrBuilder getPrimeNumberOrBuilder() {
    return getPrimeNumber();
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
    if (primeNumber_ != null) {
      output.writeMessage(1, getPrimeNumber());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primeNumber_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPrimeNumber());
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
    if (!(obj instanceof com.proto.calculator.PrimeNumberDecompositionRequest)) {
      return super.equals(obj);
    }
    com.proto.calculator.PrimeNumberDecompositionRequest other = (com.proto.calculator.PrimeNumberDecompositionRequest) obj;

    if (hasPrimeNumber() != other.hasPrimeNumber()) return false;
    if (hasPrimeNumber()) {
      if (!getPrimeNumber()
          .equals(other.getPrimeNumber())) return false;
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
    if (hasPrimeNumber()) {
      hash = (37 * hash) + PRIMENUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getPrimeNumber().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
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
  public static Builder newBuilder(com.proto.calculator.PrimeNumberDecompositionRequest prototype) {
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
   * Protobuf type {@code dummy.PrimeNumberDecompositionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dummy.PrimeNumberDecompositionRequest)
      com.proto.calculator.PrimeNumberDecompositionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.calculator.CalculatorOuterClass.internal_static_dummy_PrimeNumberDecompositionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.calculator.CalculatorOuterClass.internal_static_dummy_PrimeNumberDecompositionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.calculator.PrimeNumberDecompositionRequest.class, com.proto.calculator.PrimeNumberDecompositionRequest.Builder.class);
    }

    // Construct using com.proto.calculator.PrimeNumberDecompositionRequest.newBuilder()
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
      if (primeNumberBuilder_ == null) {
        primeNumber_ = null;
      } else {
        primeNumber_ = null;
        primeNumberBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.calculator.CalculatorOuterClass.internal_static_dummy_PrimeNumberDecompositionRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.calculator.PrimeNumberDecompositionRequest getDefaultInstanceForType() {
      return com.proto.calculator.PrimeNumberDecompositionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.calculator.PrimeNumberDecompositionRequest build() {
      com.proto.calculator.PrimeNumberDecompositionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.calculator.PrimeNumberDecompositionRequest buildPartial() {
      com.proto.calculator.PrimeNumberDecompositionRequest result = new com.proto.calculator.PrimeNumberDecompositionRequest(this);
      if (primeNumberBuilder_ == null) {
        result.primeNumber_ = primeNumber_;
      } else {
        result.primeNumber_ = primeNumberBuilder_.build();
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
      if (other instanceof com.proto.calculator.PrimeNumberDecompositionRequest) {
        return mergeFrom((com.proto.calculator.PrimeNumberDecompositionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.calculator.PrimeNumberDecompositionRequest other) {
      if (other == com.proto.calculator.PrimeNumberDecompositionRequest.getDefaultInstance()) return this;
      if (other.hasPrimeNumber()) {
        mergePrimeNumber(other.getPrimeNumber());
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
      com.proto.calculator.PrimeNumberDecompositionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.calculator.PrimeNumberDecompositionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.calculator.PrimeNumber primeNumber_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.calculator.PrimeNumber, com.proto.calculator.PrimeNumber.Builder, com.proto.calculator.PrimeNumberOrBuilder> primeNumberBuilder_;
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     * @return Whether the primeNumber field is set.
     */
    public boolean hasPrimeNumber() {
      return primeNumberBuilder_ != null || primeNumber_ != null;
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     * @return The primeNumber.
     */
    public com.proto.calculator.PrimeNumber getPrimeNumber() {
      if (primeNumberBuilder_ == null) {
        return primeNumber_ == null ? com.proto.calculator.PrimeNumber.getDefaultInstance() : primeNumber_;
      } else {
        return primeNumberBuilder_.getMessage();
      }
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    public Builder setPrimeNumber(com.proto.calculator.PrimeNumber value) {
      if (primeNumberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        primeNumber_ = value;
        onChanged();
      } else {
        primeNumberBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    public Builder setPrimeNumber(
        com.proto.calculator.PrimeNumber.Builder builderForValue) {
      if (primeNumberBuilder_ == null) {
        primeNumber_ = builderForValue.build();
        onChanged();
      } else {
        primeNumberBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    public Builder mergePrimeNumber(com.proto.calculator.PrimeNumber value) {
      if (primeNumberBuilder_ == null) {
        if (primeNumber_ != null) {
          primeNumber_ =
            com.proto.calculator.PrimeNumber.newBuilder(primeNumber_).mergeFrom(value).buildPartial();
        } else {
          primeNumber_ = value;
        }
        onChanged();
      } else {
        primeNumberBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    public Builder clearPrimeNumber() {
      if (primeNumberBuilder_ == null) {
        primeNumber_ = null;
        onChanged();
      } else {
        primeNumber_ = null;
        primeNumberBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    public com.proto.calculator.PrimeNumber.Builder getPrimeNumberBuilder() {
      
      onChanged();
      return getPrimeNumberFieldBuilder().getBuilder();
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    public com.proto.calculator.PrimeNumberOrBuilder getPrimeNumberOrBuilder() {
      if (primeNumberBuilder_ != null) {
        return primeNumberBuilder_.getMessageOrBuilder();
      } else {
        return primeNumber_ == null ?
            com.proto.calculator.PrimeNumber.getDefaultInstance() : primeNumber_;
      }
    }
    /**
     * <code>.dummy.PrimeNumber primeNumber = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.calculator.PrimeNumber, com.proto.calculator.PrimeNumber.Builder, com.proto.calculator.PrimeNumberOrBuilder> 
        getPrimeNumberFieldBuilder() {
      if (primeNumberBuilder_ == null) {
        primeNumberBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.calculator.PrimeNumber, com.proto.calculator.PrimeNumber.Builder, com.proto.calculator.PrimeNumberOrBuilder>(
                getPrimeNumber(),
                getParentForChildren(),
                isClean());
        primeNumber_ = null;
      }
      return primeNumberBuilder_;
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


    // @@protoc_insertion_point(builder_scope:dummy.PrimeNumberDecompositionRequest)
  }

  // @@protoc_insertion_point(class_scope:dummy.PrimeNumberDecompositionRequest)
  private static final com.proto.calculator.PrimeNumberDecompositionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.calculator.PrimeNumberDecompositionRequest();
  }

  public static com.proto.calculator.PrimeNumberDecompositionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrimeNumberDecompositionRequest>
      PARSER = new com.google.protobuf.AbstractParser<PrimeNumberDecompositionRequest>() {
    @java.lang.Override
    public PrimeNumberDecompositionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrimeNumberDecompositionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrimeNumberDecompositionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrimeNumberDecompositionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.calculator.PrimeNumberDecompositionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

