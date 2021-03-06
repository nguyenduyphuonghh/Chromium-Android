// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ProcessedActionProto}
 */
public  final class ProcessedActionProto extends
    com.google.protobuf.GeneratedMessageLite<
        ProcessedActionProto, ProcessedActionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ProcessedActionProto)
    ProcessedActionProtoOrBuilder {
  private ProcessedActionProto() {
  }
  private int bitField0_;
  private int resultDataCase_ = 0;
  private java.lang.Object resultData_;
  public enum ResultDataCase
      implements com.google.protobuf.Internal.EnumLite {
    PROMPT_CHOICE(5),
    HTML_SOURCE(12),
    PAYMENT_DETAILS(15),
    RESULTDATA_NOT_SET(0);
    private final int value;
    private ResultDataCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultDataCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultDataCase forNumber(int value) {
      switch (value) {
        case 5: return PROMPT_CHOICE;
        case 12: return HTML_SOURCE;
        case 15: return PAYMENT_DETAILS;
        case 0: return RESULTDATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResultDataCase
  getResultDataCase() {
    return ResultDataCase.forNumber(
        resultDataCase_);
  }

  private void clearResultData() {
    resultDataCase_ = 0;
    resultData_ = null;
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ActionProto action_;
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  public boolean hasAction() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ActionProto getAction() {
    return action_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.getDefaultInstance() : action_;
  }
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  private void setAction(org.chromium.chrome.browser.autofill_assistant.proto.ActionProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    action_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  private void setAction(
      org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.Builder builderForValue) {
    action_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  private void mergeAction(org.chromium.chrome.browser.autofill_assistant.proto.ActionProto value) {
    if (action_ != null &&
        action_ != org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.getDefaultInstance()) {
      action_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.newBuilder(action_).mergeFrom(value).buildPartial();
    } else {
      action_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  private void clearAction() {  action_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   */
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getStatus() {
    org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto result = org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto.forNumber(status_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto.UNKNOWN_ACTION_STATUS : result;
  }
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   */
  private void setStatus(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bitField0_ |= 0x00000002;
    status_ = value.getNumber();
  }
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   */
  private void clearStatus() {
    bitField0_ = (bitField0_ & ~0x00000002);
    status_ = 0;
  }

  public static final int PROMPT_CHOICE_FIELD_NUMBER = 5;
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  public boolean hasPromptChoice() {
    return resultDataCase_ == 5;
  }
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice getPromptChoice() {
    if (resultDataCase_ == 5) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice) resultData_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.getDefaultInstance();
  }
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  private void setPromptChoice(org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice value) {
    if (value == null) {
      throw new NullPointerException();
    }
    resultData_ = value;
    resultDataCase_ = 5;
  }
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  private void setPromptChoice(
      org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.Builder builderForValue) {
    resultData_ = builderForValue.build();
    resultDataCase_ = 5;
  }
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  private void mergePromptChoice(org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice value) {
    if (resultDataCase_ == 5 &&
        resultData_ != org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.getDefaultInstance()) {
      resultData_ = org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice) resultData_)
          .mergeFrom(value).buildPartial();
    } else {
      resultData_ = value;
    }
    resultDataCase_ = 5;
  }
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  private void clearPromptChoice() {
    if (resultDataCase_ == 5) {
      resultDataCase_ = 0;
      resultData_ = null;
    }
  }

  public static final int HTML_SOURCE_FIELD_NUMBER = 12;
  /**
   * <code>optional string html_source = 12;</code>
   */
  public boolean hasHtmlSource() {
    return resultDataCase_ == 12;
  }
  /**
   * <code>optional string html_source = 12;</code>
   */
  public java.lang.String getHtmlSource() {
    java.lang.String ref = "";
    if (resultDataCase_ == 12) {
      ref = (java.lang.String) resultData_;
    }
    return ref;
  }
  /**
   * <code>optional string html_source = 12;</code>
   */
  public com.google.protobuf.ByteString
      getHtmlSourceBytes() {
    java.lang.String ref = "";
    if (resultDataCase_ == 12) {
      ref = (java.lang.String) resultData_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <code>optional string html_source = 12;</code>
   */
  private void setHtmlSource(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  resultDataCase_ = 12;
    resultData_ = value;
  }
  /**
   * <code>optional string html_source = 12;</code>
   */
  private void clearHtmlSource() {
    if (resultDataCase_ == 12) {
      resultDataCase_ = 0;
      resultData_ = null;
    }
  }
  /**
   * <code>optional string html_source = 12;</code>
   */
  private void setHtmlSourceBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  resultDataCase_ = 12;
    resultData_ = value.toStringUtf8();
  }

  public static final int PAYMENT_DETAILS_FIELD_NUMBER = 15;
  /**
   * <pre>
   * Should be set as a result of GetPaymentInformationAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
   */
  public boolean hasPaymentDetails() {
    return resultDataCase_ == 15;
  }
  /**
   * <pre>
   * Should be set as a result of GetPaymentInformationAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails getPaymentDetails() {
    if (resultDataCase_ == 15) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails) resultData_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.getDefaultInstance();
  }
  /**
   * <pre>
   * Should be set as a result of GetPaymentInformationAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
   */
  private void setPaymentDetails(org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails value) {
    if (value == null) {
      throw new NullPointerException();
    }
    resultData_ = value;
    resultDataCase_ = 15;
  }
  /**
   * <pre>
   * Should be set as a result of GetPaymentInformationAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
   */
  private void setPaymentDetails(
      org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.Builder builderForValue) {
    resultData_ = builderForValue.build();
    resultDataCase_ = 15;
  }
  /**
   * <pre>
   * Should be set as a result of GetPaymentInformationAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
   */
  private void mergePaymentDetails(org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails value) {
    if (resultDataCase_ == 15 &&
        resultData_ != org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.getDefaultInstance()) {
      resultData_ = org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails) resultData_)
          .mergeFrom(value).buildPartial();
    } else {
      resultData_ = value;
    }
    resultDataCase_ = 15;
  }
  /**
   * <pre>
   * Should be set as a result of GetPaymentInformationAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
   */
  private void clearPaymentDetails() {
    if (resultDataCase_ == 15) {
      resultDataCase_ = 0;
      resultData_ = null;
    }
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getAction());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeEnum(2, status_);
    }
    if (resultDataCase_ == 5) {
      output.writeMessage(5, (org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice) resultData_);
    }
    if (resultDataCase_ == 12) {
      output.writeString(12, getHtmlSource());
    }
    if (resultDataCase_ == 15) {
      output.writeMessage(15, (org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails) resultData_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAction());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    if (resultDataCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice) resultData_);
    }
    if (resultDataCase_ == 12) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(12, getHtmlSource());
    }
    if (resultDataCase_ == 15) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(15, (org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails) resultData_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ProcessedActionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ProcessedActionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    public ResultDataCase
        getResultDataCase() {
      return instance.getResultDataCase();
    }

    public Builder clearResultData() {
      copyOnWrite();
      instance.clearResultData();
      return this;
    }


    /**
     * <pre>
     * The action that was processed.
     * </pre>
     *
     * <code>optional .autofill_assistant.ActionProto action = 1;</code>
     */
    public boolean hasAction() {
      return instance.hasAction();
    }
    /**
     * <pre>
     * The action that was processed.
     * </pre>
     *
     * <code>optional .autofill_assistant.ActionProto action = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ActionProto getAction() {
      return instance.getAction();
    }
    /**
     * <pre>
     * The action that was processed.
     * </pre>
     *
     * <code>optional .autofill_assistant.ActionProto action = 1;</code>
     */
    public Builder setAction(org.chromium.chrome.browser.autofill_assistant.proto.ActionProto value) {
      copyOnWrite();
      instance.setAction(value);
      return this;
      }
    /**
     * <pre>
     * The action that was processed.
     * </pre>
     *
     * <code>optional .autofill_assistant.ActionProto action = 1;</code>
     */
    public Builder setAction(
        org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setAction(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The action that was processed.
     * </pre>
     *
     * <code>optional .autofill_assistant.ActionProto action = 1;</code>
     */
    public Builder mergeAction(org.chromium.chrome.browser.autofill_assistant.proto.ActionProto value) {
      copyOnWrite();
      instance.mergeAction(value);
      return this;
    }
    /**
     * <pre>
     * The action that was processed.
     * </pre>
     *
     * <code>optional .autofill_assistant.ActionProto action = 1;</code>
     */
    public Builder clearAction() {  copyOnWrite();
      instance.clearAction();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
     */
    public boolean hasStatus() {
      return instance.hasStatus();
    }
    /**
     * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getStatus() {
      return instance.getStatus();
    }
    /**
     * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
     */
    public Builder setStatus(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto value) {
      copyOnWrite();
      instance.setStatus(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
     */
    public Builder clearStatus() {
      copyOnWrite();
      instance.clearStatus();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
     */
    public boolean hasPromptChoice() {
      return instance.hasPromptChoice();
    }
    /**
     * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice getPromptChoice() {
      return instance.getPromptChoice();
    }
    /**
     * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
     */
    public Builder setPromptChoice(org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice value) {
      copyOnWrite();
      instance.setPromptChoice(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
     */
    public Builder setPromptChoice(
        org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.Builder builderForValue) {
      copyOnWrite();
      instance.setPromptChoice(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
     */
    public Builder mergePromptChoice(org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice value) {
      copyOnWrite();
      instance.mergePromptChoice(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
     */
    public Builder clearPromptChoice() {
      copyOnWrite();
      instance.clearPromptChoice();
      return this;
    }

    /**
     * <code>optional string html_source = 12;</code>
     */
    public boolean hasHtmlSource() {
      return instance.hasHtmlSource();
    }
    /**
     * <code>optional string html_source = 12;</code>
     */
    public java.lang.String getHtmlSource() {
      return instance.getHtmlSource();
    }
    /**
     * <code>optional string html_source = 12;</code>
     */
    public com.google.protobuf.ByteString
        getHtmlSourceBytes() {
      return instance.getHtmlSourceBytes();
    }
    /**
     * <code>optional string html_source = 12;</code>
     */
    public Builder setHtmlSource(
        java.lang.String value) {
      copyOnWrite();
      instance.setHtmlSource(value);
      return this;
    }
    /**
     * <code>optional string html_source = 12;</code>
     */
    public Builder clearHtmlSource() {
      copyOnWrite();
      instance.clearHtmlSource();
      return this;
    }
    /**
     * <code>optional string html_source = 12;</code>
     */
    public Builder setHtmlSourceBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHtmlSourceBytes(value);
      return this;
    }

    /**
     * <pre>
     * Should be set as a result of GetPaymentInformationAction.
     * </pre>
     *
     * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
     */
    public boolean hasPaymentDetails() {
      return instance.hasPaymentDetails();
    }
    /**
     * <pre>
     * Should be set as a result of GetPaymentInformationAction.
     * </pre>
     *
     * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails getPaymentDetails() {
      return instance.getPaymentDetails();
    }
    /**
     * <pre>
     * Should be set as a result of GetPaymentInformationAction.
     * </pre>
     *
     * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
     */
    public Builder setPaymentDetails(org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails value) {
      copyOnWrite();
      instance.setPaymentDetails(value);
      return this;
    }
    /**
     * <pre>
     * Should be set as a result of GetPaymentInformationAction.
     * </pre>
     *
     * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
     */
    public Builder setPaymentDetails(
        org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.Builder builderForValue) {
      copyOnWrite();
      instance.setPaymentDetails(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Should be set as a result of GetPaymentInformationAction.
     * </pre>
     *
     * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
     */
    public Builder mergePaymentDetails(org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails value) {
      copyOnWrite();
      instance.mergePaymentDetails(value);
      return this;
    }
    /**
     * <pre>
     * Should be set as a result of GetPaymentInformationAction.
     * </pre>
     *
     * <code>optional .autofill_assistant.PaymentDetails payment_details = 15;</code>
     */
    public Builder clearPaymentDetails() {
      copyOnWrite();
      instance.clearPaymentDetails();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ProcessedActionProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto other = (org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto) arg1;
        action_ = visitor.visitMessage(action_, other.action_);
        status_ = visitor.visitInt(hasStatus(), status_,
            other.hasStatus(), other.status_);
        switch (other.getResultDataCase()) {
          case PROMPT_CHOICE: {
            resultData_ = visitor.visitOneofMessage(
                resultDataCase_ == 5,
                resultData_,
                other.resultData_);
            break;
          }
          case HTML_SOURCE: {
            resultData_ = visitor.visitOneofString(
               resultDataCase_ == 12, resultData_, other.resultData_);
            break;
          }
          case PAYMENT_DETAILS: {
            resultData_ = visitor.visitOneofMessage(
                resultDataCase_ == 15,
                resultData_,
                other.resultData_);
            break;
          }
          case RESULTDATA_NOT_SET: {
            visitor.visitOneofNotSet(resultDataCase_ != 0);
            break;
          }
        }
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          if (other.resultDataCase_ != 0) {
            resultDataCase_ = other.resultDataCase_;
          }
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = action_.toBuilder();
                }
                action_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ActionProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(action_);
                  action_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();
                org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto value = org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto.forNumber(rawValue);
                if (value == null) {
                  super.mergeVarintField(2, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  status_ = rawValue;
                }
                break;
              }
              case 42: {
                org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.Builder subBuilder = null;
                if (resultDataCase_ == 5) {
                  subBuilder = ((org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice) resultData_).toBuilder();
                }
                resultData_ =
                     input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice) resultData_);
                  resultData_ = subBuilder.buildPartial();
                }
                resultDataCase_ = 5;
                break;
              }
              case 98: {
                String s = input.readString();
                resultDataCase_ = 12;
                resultData_ = s;
                break;
              }
              case 122: {
                org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.Builder subBuilder = null;
                if (resultDataCase_ == 15) {
                  subBuilder = ((org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails) resultData_).toBuilder();
                }
                resultData_ =
                     input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((org.chromium.chrome.browser.autofill_assistant.proto.PaymentDetails) resultData_);
                  resultData_ = subBuilder.buildPartial();
                }
                resultDataCase_ = 15;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ProcessedActionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ProcessedActionProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ProcessedActionProto> PARSER;

  public static com.google.protobuf.Parser<ProcessedActionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

