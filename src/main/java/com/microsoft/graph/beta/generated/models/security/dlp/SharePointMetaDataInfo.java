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
public class SharePointMetaDataInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharePointMetaDataInfo} and sets the default values.
     */
    public SharePointMetaDataInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMetaDataInfo}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMetaDataInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMetaDataInfo();
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
     * Gets the aiFileActions property value. The aiFileActions property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAiFileActions() {
        return this.backingStore.get("aiFileActions");
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
     * Gets the blockedUserForFileAccess property value. The blockedUserForFileAccess property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBlockedUserForFileAccess() {
        return this.backingStore.get("blockedUserForFileAccess");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(25);
        deserializerMap.put("aiFileActions", (n) -> { this.setAiFileActions(n.getStringValue()); });
        deserializerMap.put("blockedUserForFileAccess", (n) -> { this.setBlockedUserForFileAccess(n.getStringValue()); });
        deserializerMap.put("fileId", (n) -> { this.setFileId(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("fileOwner", (n) -> { this.setFileOwner(n.getStringValue()); });
        deserializerMap.put("filePathUrl", (n) -> { this.setFilePathUrl(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getStringValue()); });
        deserializerMap.put("isJitTriggered", (n) -> { this.setIsJitTriggered(n.getBooleanValue()); });
        deserializerMap.put("isViewableByExternalUsers", (n) -> { this.setIsViewableByExternalUsers(n.getBooleanValue()); });
        deserializerMap.put("isVisibleOnlyToOdbOwner", (n) -> { this.setIsVisibleOnlyToOdbOwner(n.getBooleanValue()); });
        deserializerMap.put("itemCreatedDate", (n) -> { this.setItemCreatedDate(n.getLocalDateValue()); });
        deserializerMap.put("itemLastModifiedDate", (n) -> { this.setItemLastModifiedDate(n.getLocalDateValue()); });
        deserializerMap.put("itemLastSharedDate", (n) -> { this.setItemLastSharedDate(n.getLocalDateValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("quarantineLocationFileUrl", (n) -> { this.setQuarantineLocationFileUrl(n.getStringValue()); });
        deserializerMap.put("sensitivityLabelIds", (n) -> { this.setSensitivityLabelIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivityLabelNames", (n) -> { this.setSensitivityLabelNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sharedBy", (n) -> { this.setSharedBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sharedWith", (n) -> { this.setSharedWith(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("siteAdmins", (n) -> { this.setSiteAdmins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("siteCollectionGuid", (n) -> { this.setSiteCollectionGuid(n.getStringValue()); });
        deserializerMap.put("siteCollectionUrl", (n) -> { this.setSiteCollectionUrl(n.getStringValue()); });
        deserializerMap.put("uniqueId", (n) -> { this.setUniqueId(n.getStringValue()); });
        deserializerMap.put("violatingAction", (n) -> { this.setViolatingAction(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileId property value. The fileId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileId() {
        return this.backingStore.get("fileId");
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the fileOwner property value. The fileOwner property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileOwner() {
        return this.backingStore.get("fileOwner");
    }
    /**
     * Gets the filePathUrl property value. The filePathUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilePathUrl() {
        return this.backingStore.get("filePathUrl");
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
     * Gets the isJitTriggered property value. The isJitTriggered property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsJitTriggered() {
        return this.backingStore.get("isJitTriggered");
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
     * Gets the isVisibleOnlyToOdbOwner property value. The isVisibleOnlyToOdbOwner property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVisibleOnlyToOdbOwner() {
        return this.backingStore.get("isVisibleOnlyToOdbOwner");
    }
    /**
     * Gets the itemCreatedDate property value. The itemCreatedDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getItemCreatedDate() {
        return this.backingStore.get("itemCreatedDate");
    }
    /**
     * Gets the itemLastModifiedDate property value. The itemLastModifiedDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getItemLastModifiedDate() {
        return this.backingStore.get("itemLastModifiedDate");
    }
    /**
     * Gets the itemLastSharedDate property value. The itemLastSharedDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getItemLastSharedDate() {
        return this.backingStore.get("itemLastSharedDate");
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
     * Gets the quarantineLocationFileUrl property value. The quarantineLocationFileUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuarantineLocationFileUrl() {
        return this.backingStore.get("quarantineLocationFileUrl");
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
     * Gets the sharedBy property value. The sharedBy property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSharedBy() {
        return this.backingStore.get("sharedBy");
    }
    /**
     * Gets the sharedWith property value. The sharedWith property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSharedWith() {
        return this.backingStore.get("sharedWith");
    }
    /**
     * Gets the siteAdmins property value. The siteAdmins property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSiteAdmins() {
        return this.backingStore.get("siteAdmins");
    }
    /**
     * Gets the siteCollectionGuid property value. The siteCollectionGuid property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteCollectionGuid() {
        return this.backingStore.get("siteCollectionGuid");
    }
    /**
     * Gets the siteCollectionUrl property value. The siteCollectionUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteCollectionUrl() {
        return this.backingStore.get("siteCollectionUrl");
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
     * Gets the violatingAction property value. The violatingAction property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getViolatingAction() {
        return this.backingStore.get("violatingAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aiFileActions", this.getAiFileActions());
        writer.writeStringValue("blockedUserForFileAccess", this.getBlockedUserForFileAccess());
        writer.writeStringValue("fileId", this.getFileId());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("fileOwner", this.getFileOwner());
        writer.writeStringValue("filePathUrl", this.getFilePathUrl());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeStringValue("from", this.getFrom());
        writer.writeBooleanValue("isJitTriggered", this.getIsJitTriggered());
        writer.writeBooleanValue("isViewableByExternalUsers", this.getIsViewableByExternalUsers());
        writer.writeBooleanValue("isVisibleOnlyToOdbOwner", this.getIsVisibleOnlyToOdbOwner());
        writer.writeLocalDateValue("itemCreatedDate", this.getItemCreatedDate());
        writer.writeLocalDateValue("itemLastModifiedDate", this.getItemLastModifiedDate());
        writer.writeLocalDateValue("itemLastSharedDate", this.getItemLastSharedDate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("quarantineLocationFileUrl", this.getQuarantineLocationFileUrl());
        writer.writeCollectionOfPrimitiveValues("sensitivityLabelIds", this.getSensitivityLabelIds());
        writer.writeCollectionOfPrimitiveValues("sensitivityLabelNames", this.getSensitivityLabelNames());
        writer.writeCollectionOfPrimitiveValues("sharedBy", this.getSharedBy());
        writer.writeCollectionOfPrimitiveValues("sharedWith", this.getSharedWith());
        writer.writeCollectionOfPrimitiveValues("siteAdmins", this.getSiteAdmins());
        writer.writeStringValue("siteCollectionGuid", this.getSiteCollectionGuid());
        writer.writeStringValue("siteCollectionUrl", this.getSiteCollectionUrl());
        writer.writeStringValue("uniqueId", this.getUniqueId());
        writer.writeStringValue("violatingAction", this.getViolatingAction());
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
     * Sets the aiFileActions property value. The aiFileActions property
     * @param value Value to set for the aiFileActions property.
     */
    public void setAiFileActions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aiFileActions", value);
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
     * Sets the blockedUserForFileAccess property value. The blockedUserForFileAccess property
     * @param value Value to set for the blockedUserForFileAccess property.
     */
    public void setBlockedUserForFileAccess(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("blockedUserForFileAccess", value);
    }
    /**
     * Sets the fileId property value. The fileId property
     * @param value Value to set for the fileId property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileId", value);
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the fileOwner property value. The fileOwner property
     * @param value Value to set for the fileOwner property.
     */
    public void setFileOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileOwner", value);
    }
    /**
     * Sets the filePathUrl property value. The filePathUrl property
     * @param value Value to set for the filePathUrl property.
     */
    public void setFilePathUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePathUrl", value);
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
     * Sets the isJitTriggered property value. The isJitTriggered property
     * @param value Value to set for the isJitTriggered property.
     */
    public void setIsJitTriggered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isJitTriggered", value);
    }
    /**
     * Sets the isViewableByExternalUsers property value. The isViewableByExternalUsers property
     * @param value Value to set for the isViewableByExternalUsers property.
     */
    public void setIsViewableByExternalUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isViewableByExternalUsers", value);
    }
    /**
     * Sets the isVisibleOnlyToOdbOwner property value. The isVisibleOnlyToOdbOwner property
     * @param value Value to set for the isVisibleOnlyToOdbOwner property.
     */
    public void setIsVisibleOnlyToOdbOwner(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVisibleOnlyToOdbOwner", value);
    }
    /**
     * Sets the itemCreatedDate property value. The itemCreatedDate property
     * @param value Value to set for the itemCreatedDate property.
     */
    public void setItemCreatedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("itemCreatedDate", value);
    }
    /**
     * Sets the itemLastModifiedDate property value. The itemLastModifiedDate property
     * @param value Value to set for the itemLastModifiedDate property.
     */
    public void setItemLastModifiedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("itemLastModifiedDate", value);
    }
    /**
     * Sets the itemLastSharedDate property value. The itemLastSharedDate property
     * @param value Value to set for the itemLastSharedDate property.
     */
    public void setItemLastSharedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("itemLastSharedDate", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the quarantineLocationFileUrl property value. The quarantineLocationFileUrl property
     * @param value Value to set for the quarantineLocationFileUrl property.
     */
    public void setQuarantineLocationFileUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("quarantineLocationFileUrl", value);
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
     * Sets the sharedBy property value. The sharedBy property
     * @param value Value to set for the sharedBy property.
     */
    public void setSharedBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sharedBy", value);
    }
    /**
     * Sets the sharedWith property value. The sharedWith property
     * @param value Value to set for the sharedWith property.
     */
    public void setSharedWith(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sharedWith", value);
    }
    /**
     * Sets the siteAdmins property value. The siteAdmins property
     * @param value Value to set for the siteAdmins property.
     */
    public void setSiteAdmins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("siteAdmins", value);
    }
    /**
     * Sets the siteCollectionGuid property value. The siteCollectionGuid property
     * @param value Value to set for the siteCollectionGuid property.
     */
    public void setSiteCollectionGuid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteCollectionGuid", value);
    }
    /**
     * Sets the siteCollectionUrl property value. The siteCollectionUrl property
     * @param value Value to set for the siteCollectionUrl property.
     */
    public void setSiteCollectionUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteCollectionUrl", value);
    }
    /**
     * Sets the uniqueId property value. The uniqueId property
     * @param value Value to set for the uniqueId property.
     */
    public void setUniqueId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueId", value);
    }
    /**
     * Sets the violatingAction property value. The violatingAction property
     * @param value Value to set for the violatingAction property.
     */
    public void setViolatingAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("violatingAction", value);
    }
}
