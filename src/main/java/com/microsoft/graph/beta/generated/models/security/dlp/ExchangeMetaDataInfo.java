package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeMetaDataInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExchangeMetaDataInfo} and sets the default values.
     */
    public ExchangeMetaDataInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeMetaDataInfo}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeMetaDataInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeMetaDataInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the attachmentDetails property value. The attachmentDetails property
     * @return a {@link java.util.List<AttachmentInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttachmentInfo> getAttachmentDetails() {
        return this.backingStore.get("attachmentDetails");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bccRecipients property value. The bccRecipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBccRecipients() {
        return this.backingStore.get("bccRecipients");
    }
    /**
     * Gets the ccRecipients property value. The ccRecipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCcRecipients() {
        return this.backingStore.get("ccRecipients");
    }
    /**
     * Gets the docId property value. The docId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocId() {
        return this.backingStore.get("docId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("attachmentDetails", (n) -> { this.setAttachmentDetails(n.getCollectionOfObjectValues(AttachmentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("bccRecipients", (n) -> { this.setBccRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ccRecipients", (n) -> { this.setCcRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("docId", (n) -> { this.setDocId(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getStringValue()); });
        deserializerMap.put("immutableEntryId", (n) -> { this.setImmutableEntryId(n.getStringValue()); });
        deserializerMap.put("isViewableByExternalUsers", (n) -> { this.setIsViewableByExternalUsers(n.getBooleanValue()); });
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipientCount", (n) -> { this.setRecipientCount(n.getIntegerValue()); });
        deserializerMap.put("sensitivityLabelIds", (n) -> { this.setSensitivityLabelIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivityLabelNames", (n) -> { this.setSensitivityLabelNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sentDate", (n) -> { this.setSentDate(n.getLocalDateValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("toRecipients", (n) -> { this.setToRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("uniqueId", (n) -> { this.setUniqueId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileSize property value. The fileSize property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFileSize() {
        return this.backingStore.get("fileSize");
    }
    /**
     * Gets the from property value. The from property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFrom() {
        return this.backingStore.get("from");
    }
    /**
     * Gets the immutableEntryId property value. The immutableEntryId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImmutableEntryId() {
        return this.backingStore.get("immutableEntryId");
    }
    /**
     * Gets the isViewableByExternalUsers property value. The isViewableByExternalUsers property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsViewableByExternalUsers() {
        return this.backingStore.get("isViewableByExternalUsers");
    }
    /**
     * Gets the messageId property value. The messageId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.backingStore.get("messageId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recipientCount property value. The recipientCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRecipientCount() {
        return this.backingStore.get("recipientCount");
    }
    /**
     * Gets the sensitivityLabelIds property value. The sensitivityLabelIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitivityLabelIds() {
        return this.backingStore.get("sensitivityLabelIds");
    }
    /**
     * Gets the sensitivityLabelNames property value. The sensitivityLabelNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitivityLabelNames() {
        return this.backingStore.get("sensitivityLabelNames");
    }
    /**
     * Gets the sentDate property value. The sentDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getSentDate() {
        return this.backingStore.get("sentDate");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the toRecipients property value. The toRecipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getToRecipients() {
        return this.backingStore.get("toRecipients");
    }
    /**
     * Gets the uniqueId property value. The uniqueId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueId() {
        return this.backingStore.get("uniqueId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attachmentDetails", this.getAttachmentDetails());
        writer.writeCollectionOfPrimitiveValues("bccRecipients", this.getBccRecipients());
        writer.writeCollectionOfPrimitiveValues("ccRecipients", this.getCcRecipients());
        writer.writeStringValue("docId", this.getDocId());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeStringValue("from", this.getFrom());
        writer.writeStringValue("immutableEntryId", this.getImmutableEntryId());
        writer.writeBooleanValue("isViewableByExternalUsers", this.getIsViewableByExternalUsers());
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("recipientCount", this.getRecipientCount());
        writer.writeCollectionOfPrimitiveValues("sensitivityLabelIds", this.getSensitivityLabelIds());
        writer.writeCollectionOfPrimitiveValues("sensitivityLabelNames", this.getSensitivityLabelNames());
        writer.writeLocalDateValue("sentDate", this.getSentDate());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfPrimitiveValues("toRecipients", this.getToRecipients());
        writer.writeStringValue("uniqueId", this.getUniqueId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the attachmentDetails property value. The attachmentDetails property
     * @param value Value to set for the attachmentDetails property.
     */
    public void setAttachmentDetails(@jakarta.annotation.Nullable final java.util.List<AttachmentInfo> value) {
        this.backingStore.set("attachmentDetails", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bccRecipients property value. The bccRecipients property
     * @param value Value to set for the bccRecipients property.
     */
    public void setBccRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("bccRecipients", value);
    }
    /**
     * Sets the ccRecipients property value. The ccRecipients property
     * @param value Value to set for the ccRecipients property.
     */
    public void setCcRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ccRecipients", value);
    }
    /**
     * Sets the docId property value. The docId property
     * @param value Value to set for the docId property.
     */
    public void setDocId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("docId", value);
    }
    /**
     * Sets the fileSize property value. The fileSize property
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("fileSize", value);
    }
    /**
     * Sets the from property value. The from property
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("from", value);
    }
    /**
     * Sets the immutableEntryId property value. The immutableEntryId property
     * @param value Value to set for the immutableEntryId property.
     */
    public void setImmutableEntryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("immutableEntryId", value);
    }
    /**
     * Sets the isViewableByExternalUsers property value. The isViewableByExternalUsers property
     * @param value Value to set for the isViewableByExternalUsers property.
     */
    public void setIsViewableByExternalUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isViewableByExternalUsers", value);
    }
    /**
     * Sets the messageId property value. The messageId property
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recipientCount property value. The recipientCount property
     * @param value Value to set for the recipientCount property.
     */
    public void setRecipientCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("recipientCount", value);
    }
    /**
     * Sets the sensitivityLabelIds property value. The sensitivityLabelIds property
     * @param value Value to set for the sensitivityLabelIds property.
     */
    public void setSensitivityLabelIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sensitivityLabelIds", value);
    }
    /**
     * Sets the sensitivityLabelNames property value. The sensitivityLabelNames property
     * @param value Value to set for the sensitivityLabelNames property.
     */
    public void setSensitivityLabelNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sensitivityLabelNames", value);
    }
    /**
     * Sets the sentDate property value. The sentDate property
     * @param value Value to set for the sentDate property.
     */
    public void setSentDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("sentDate", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the toRecipients property value. The toRecipients property
     * @param value Value to set for the toRecipients property.
     */
    public void setToRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("toRecipients", value);
    }
    /**
     * Sets the uniqueId property value. The uniqueId property
     * @param value Value to set for the uniqueId property.
     */
    public void setUniqueId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueId", value);
    }
}
