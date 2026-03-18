package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndpointMetaDataInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EndpointMetaDataInfo} and sets the default values.
     */
    public EndpointMetaDataInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndpointMetaDataInfo}
     */
    @jakarta.annotation.Nonnull
    public static EndpointMetaDataInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndpointMetaDataInfo();
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
     * Gets the application property value. The application property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplication() {
        return this.backingStore.get("application");
    }
    /**
     * Gets the applicationSourceExecutableName property value. The applicationSourceExecutableName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationSourceExecutableName() {
        return this.backingStore.get("applicationSourceExecutableName");
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
     * Gets the destinationLocationType property value. The destinationLocationType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationLocationType() {
        return this.backingStore.get("destinationLocationType");
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the dlpAuditEventMetadata property value. The dlpAuditEventMetadata property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDlpAuditEventMetadata() {
        return this.backingStore.get("dlpAuditEventMetadata");
    }
    /**
     * Gets the endpointOperation property value. The endpointOperation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndpointOperation() {
        return this.backingStore.get("endpointOperation");
    }
    /**
     * Gets the enforcementMode property value. The enforcementMode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnforcementMode() {
        return this.backingStore.get("enforcementMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(39);
        deserializerMap.put("application", (n) -> { this.setApplication(n.getStringValue()); });
        deserializerMap.put("applicationSourceExecutableName", (n) -> { this.setApplicationSourceExecutableName(n.getStringValue()); });
        deserializerMap.put("destinationLocationType", (n) -> { this.setDestinationLocationType(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("dlpAuditEventMetadata", (n) -> { this.setDlpAuditEventMetadata(n.getStringValue()); });
        deserializerMap.put("endpointOperation", (n) -> { this.setEndpointOperation(n.getStringValue()); });
        deserializerMap.put("enforcementMode", (n) -> { this.setEnforcementMode(n.getStringValue()); });
        deserializerMap.put("fileExtension", (n) -> { this.setFileExtension(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("isEaV2Enriched", (n) -> { this.setIsEaV2Enriched(n.getBooleanValue()); });
        deserializerMap.put("isHidden", (n) -> { this.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("isJitTriggered", (n) -> { this.setIsJitTriggered(n.getBooleanValue()); });
        deserializerMap.put("isRmseEncrypted", (n) -> { this.setIsRmseEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isViewableByExternalUsers", (n) -> { this.setIsViewableByExternalUsers(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("markOfTheWebData", (n) -> { this.setMarkOfTheWebData(n.getStringValue()); });
        deserializerMap.put("mdatpDeviceId", (n) -> { this.setMdatpDeviceId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("originatingDomain", (n) -> { this.setOriginatingDomain(n.getStringValue()); });
        deserializerMap.put("parentArchiveHash", (n) -> { this.setParentArchiveHash(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("policyMatchDetails", (n) -> { this.setPolicyMatchDetails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("policyMatchInfo", (n) -> { this.setPolicyMatchInfo(n.getStringValue()); });
        deserializerMap.put("previousFileName", (n) -> { this.setPreviousFileName(n.getStringValue()); });
        deserializerMap.put("removableMediaDeviceAttributes", (n) -> { this.setRemovableMediaDeviceAttributes(n.getStringValue()); });
        deserializerMap.put("sensitiveInfoTypeData", (n) -> { this.setSensitiveInfoTypeData(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivityLabelEventData", (n) -> { this.setSensitivityLabelEventData(n.getStringValue()); });
        deserializerMap.put("sensitivityLabelIds", (n) -> { this.setSensitivityLabelIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivityLabelNames", (n) -> { this.setSensitivityLabelNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sha1", (n) -> { this.setSha1(n.getStringValue()); });
        deserializerMap.put("sha256", (n) -> { this.setSha256(n.getStringValue()); });
        deserializerMap.put("sourceLocationType", (n) -> { this.setSourceLocationType(n.getStringValue()); });
        deserializerMap.put("targetDomain", (n) -> { this.setTargetDomain(n.getStringValue()); });
        deserializerMap.put("targetFilePath", (n) -> { this.setTargetFilePath(n.getStringValue()); });
        deserializerMap.put("targetPrinterName", (n) -> { this.setTargetPrinterName(n.getStringValue()); });
        deserializerMap.put("targetUrl", (n) -> { this.setTargetUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileExtension property value. The fileExtension property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileExtension() {
        return this.backingStore.get("fileExtension");
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
     * Gets the fileType property value. The fileType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.backingStore.get("fileType");
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the groupName property value. The groupName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.backingStore.get("groupName");
    }
    /**
     * Gets the isEaV2Enriched property value. The isEaV2Enriched property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEaV2Enriched() {
        return this.backingStore.get("isEaV2Enriched");
    }
    /**
     * Gets the isHidden property value. The isHidden property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHidden() {
        return this.backingStore.get("isHidden");
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
     * Gets the isRmseEncrypted property value. The isRmseEncrypted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRmseEncrypted() {
        return this.backingStore.get("isRmseEncrypted");
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
     * Gets the justification property value. The justification property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the markOfTheWebData property value. The markOfTheWebData property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarkOfTheWebData() {
        return this.backingStore.get("markOfTheWebData");
    }
    /**
     * Gets the mdatpDeviceId property value. The mdatpDeviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdatpDeviceId() {
        return this.backingStore.get("mdatpDeviceId");
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
     * Gets the originatingDomain property value. The originatingDomain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginatingDomain() {
        return this.backingStore.get("originatingDomain");
    }
    /**
     * Gets the parentArchiveHash property value. The parentArchiveHash property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentArchiveHash() {
        return this.backingStore.get("parentArchiveHash");
    }
    /**
     * Gets the platform property value. The platform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the policyMatchDetails property value. The policyMatchDetails property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPolicyMatchDetails() {
        return this.backingStore.get("policyMatchDetails");
    }
    /**
     * Gets the policyMatchInfo property value. The policyMatchInfo property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyMatchInfo() {
        return this.backingStore.get("policyMatchInfo");
    }
    /**
     * Gets the previousFileName property value. The previousFileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreviousFileName() {
        return this.backingStore.get("previousFileName");
    }
    /**
     * Gets the removableMediaDeviceAttributes property value. The removableMediaDeviceAttributes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemovableMediaDeviceAttributes() {
        return this.backingStore.get("removableMediaDeviceAttributes");
    }
    /**
     * Gets the sensitiveInfoTypeData property value. The sensitiveInfoTypeData property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitiveInfoTypeData() {
        return this.backingStore.get("sensitiveInfoTypeData");
    }
    /**
     * Gets the sensitivityLabelEventData property value. The sensitivityLabelEventData property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensitivityLabelEventData() {
        return this.backingStore.get("sensitivityLabelEventData");
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
     * Gets the sha1 property value. The sha1 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha1() {
        return this.backingStore.get("sha1");
    }
    /**
     * Gets the sha256 property value. The sha256 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha256() {
        return this.backingStore.get("sha256");
    }
    /**
     * Gets the sourceLocationType property value. The sourceLocationType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceLocationType() {
        return this.backingStore.get("sourceLocationType");
    }
    /**
     * Gets the targetDomain property value. The targetDomain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetDomain() {
        return this.backingStore.get("targetDomain");
    }
    /**
     * Gets the targetFilePath property value. The targetFilePath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetFilePath() {
        return this.backingStore.get("targetFilePath");
    }
    /**
     * Gets the targetPrinterName property value. The targetPrinterName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetPrinterName() {
        return this.backingStore.get("targetPrinterName");
    }
    /**
     * Gets the targetUrl property value. The targetUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetUrl() {
        return this.backingStore.get("targetUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("application", this.getApplication());
        writer.writeStringValue("applicationSourceExecutableName", this.getApplicationSourceExecutableName());
        writer.writeStringValue("destinationLocationType", this.getDestinationLocationType());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("dlpAuditEventMetadata", this.getDlpAuditEventMetadata());
        writer.writeStringValue("endpointOperation", this.getEndpointOperation());
        writer.writeStringValue("enforcementMode", this.getEnforcementMode());
        writer.writeStringValue("fileExtension", this.getFileExtension());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("groupName", this.getGroupName());
        writer.writeBooleanValue("isEaV2Enriched", this.getIsEaV2Enriched());
        writer.writeBooleanValue("isHidden", this.getIsHidden());
        writer.writeBooleanValue("isJitTriggered", this.getIsJitTriggered());
        writer.writeBooleanValue("isRmseEncrypted", this.getIsRmseEncrypted());
        writer.writeBooleanValue("isViewableByExternalUsers", this.getIsViewableByExternalUsers());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("markOfTheWebData", this.getMarkOfTheWebData());
        writer.writeStringValue("mdatpDeviceId", this.getMdatpDeviceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("originatingDomain", this.getOriginatingDomain());
        writer.writeStringValue("parentArchiveHash", this.getParentArchiveHash());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeCollectionOfPrimitiveValues("policyMatchDetails", this.getPolicyMatchDetails());
        writer.writeStringValue("policyMatchInfo", this.getPolicyMatchInfo());
        writer.writeStringValue("previousFileName", this.getPreviousFileName());
        writer.writeStringValue("removableMediaDeviceAttributes", this.getRemovableMediaDeviceAttributes());
        writer.writeCollectionOfPrimitiveValues("sensitiveInfoTypeData", this.getSensitiveInfoTypeData());
        writer.writeStringValue("sensitivityLabelEventData", this.getSensitivityLabelEventData());
        writer.writeCollectionOfPrimitiveValues("sensitivityLabelIds", this.getSensitivityLabelIds());
        writer.writeCollectionOfPrimitiveValues("sensitivityLabelNames", this.getSensitivityLabelNames());
        writer.writeStringValue("sha1", this.getSha1());
        writer.writeStringValue("sha256", this.getSha256());
        writer.writeStringValue("sourceLocationType", this.getSourceLocationType());
        writer.writeStringValue("targetDomain", this.getTargetDomain());
        writer.writeStringValue("targetFilePath", this.getTargetFilePath());
        writer.writeStringValue("targetPrinterName", this.getTargetPrinterName());
        writer.writeStringValue("targetUrl", this.getTargetUrl());
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
     * Sets the application property value. The application property
     * @param value Value to set for the application property.
     */
    public void setApplication(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("application", value);
    }
    /**
     * Sets the applicationSourceExecutableName property value. The applicationSourceExecutableName property
     * @param value Value to set for the applicationSourceExecutableName property.
     */
    public void setApplicationSourceExecutableName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationSourceExecutableName", value);
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
     * Sets the destinationLocationType property value. The destinationLocationType property
     * @param value Value to set for the destinationLocationType property.
     */
    public void setDestinationLocationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationLocationType", value);
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the dlpAuditEventMetadata property value. The dlpAuditEventMetadata property
     * @param value Value to set for the dlpAuditEventMetadata property.
     */
    public void setDlpAuditEventMetadata(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dlpAuditEventMetadata", value);
    }
    /**
     * Sets the endpointOperation property value. The endpointOperation property
     * @param value Value to set for the endpointOperation property.
     */
    public void setEndpointOperation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("endpointOperation", value);
    }
    /**
     * Sets the enforcementMode property value. The enforcementMode property
     * @param value Value to set for the enforcementMode property.
     */
    public void setEnforcementMode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enforcementMode", value);
    }
    /**
     * Sets the fileExtension property value. The fileExtension property
     * @param value Value to set for the fileExtension property.
     */
    public void setFileExtension(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileExtension", value);
    }
    /**
     * Sets the fileSize property value. The fileSize property
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("fileSize", value);
    }
    /**
     * Sets the fileType property value. The fileType property
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileType", value);
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the groupName property value. The groupName property
     * @param value Value to set for the groupName property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupName", value);
    }
    /**
     * Sets the isEaV2Enriched property value. The isEaV2Enriched property
     * @param value Value to set for the isEaV2Enriched property.
     */
    public void setIsEaV2Enriched(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEaV2Enriched", value);
    }
    /**
     * Sets the isHidden property value. The isHidden property
     * @param value Value to set for the isHidden property.
     */
    public void setIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHidden", value);
    }
    /**
     * Sets the isJitTriggered property value. The isJitTriggered property
     * @param value Value to set for the isJitTriggered property.
     */
    public void setIsJitTriggered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isJitTriggered", value);
    }
    /**
     * Sets the isRmseEncrypted property value. The isRmseEncrypted property
     * @param value Value to set for the isRmseEncrypted property.
     */
    public void setIsRmseEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRmseEncrypted", value);
    }
    /**
     * Sets the isViewableByExternalUsers property value. The isViewableByExternalUsers property
     * @param value Value to set for the isViewableByExternalUsers property.
     */
    public void setIsViewableByExternalUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isViewableByExternalUsers", value);
    }
    /**
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the markOfTheWebData property value. The markOfTheWebData property
     * @param value Value to set for the markOfTheWebData property.
     */
    public void setMarkOfTheWebData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("markOfTheWebData", value);
    }
    /**
     * Sets the mdatpDeviceId property value. The mdatpDeviceId property
     * @param value Value to set for the mdatpDeviceId property.
     */
    public void setMdatpDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdatpDeviceId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the originatingDomain property value. The originatingDomain property
     * @param value Value to set for the originatingDomain property.
     */
    public void setOriginatingDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originatingDomain", value);
    }
    /**
     * Sets the parentArchiveHash property value. The parentArchiveHash property
     * @param value Value to set for the parentArchiveHash property.
     */
    public void setParentArchiveHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentArchiveHash", value);
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the policyMatchDetails property value. The policyMatchDetails property
     * @param value Value to set for the policyMatchDetails property.
     */
    public void setPolicyMatchDetails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("policyMatchDetails", value);
    }
    /**
     * Sets the policyMatchInfo property value. The policyMatchInfo property
     * @param value Value to set for the policyMatchInfo property.
     */
    public void setPolicyMatchInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyMatchInfo", value);
    }
    /**
     * Sets the previousFileName property value. The previousFileName property
     * @param value Value to set for the previousFileName property.
     */
    public void setPreviousFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("previousFileName", value);
    }
    /**
     * Sets the removableMediaDeviceAttributes property value. The removableMediaDeviceAttributes property
     * @param value Value to set for the removableMediaDeviceAttributes property.
     */
    public void setRemovableMediaDeviceAttributes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("removableMediaDeviceAttributes", value);
    }
    /**
     * Sets the sensitiveInfoTypeData property value. The sensitiveInfoTypeData property
     * @param value Value to set for the sensitiveInfoTypeData property.
     */
    public void setSensitiveInfoTypeData(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sensitiveInfoTypeData", value);
    }
    /**
     * Sets the sensitivityLabelEventData property value. The sensitivityLabelEventData property
     * @param value Value to set for the sensitivityLabelEventData property.
     */
    public void setSensitivityLabelEventData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensitivityLabelEventData", value);
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
     * Sets the sha1 property value. The sha1 property
     * @param value Value to set for the sha1 property.
     */
    public void setSha1(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha1", value);
    }
    /**
     * Sets the sha256 property value. The sha256 property
     * @param value Value to set for the sha256 property.
     */
    public void setSha256(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha256", value);
    }
    /**
     * Sets the sourceLocationType property value. The sourceLocationType property
     * @param value Value to set for the sourceLocationType property.
     */
    public void setSourceLocationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceLocationType", value);
    }
    /**
     * Sets the targetDomain property value. The targetDomain property
     * @param value Value to set for the targetDomain property.
     */
    public void setTargetDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetDomain", value);
    }
    /**
     * Sets the targetFilePath property value. The targetFilePath property
     * @param value Value to set for the targetFilePath property.
     */
    public void setTargetFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetFilePath", value);
    }
    /**
     * Sets the targetPrinterName property value. The targetPrinterName property
     * @param value Value to set for the targetPrinterName property.
     */
    public void setTargetPrinterName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetPrinterName", value);
    }
    /**
     * Sets the targetUrl property value. The targetUrl property
     * @param value Value to set for the targetUrl property.
     */
    public void setTargetUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetUrl", value);
    }
}
