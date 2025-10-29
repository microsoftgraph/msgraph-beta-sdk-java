package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcSnapshotImportActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcSnapshotImportActionResult} and sets the default values.
     */
    public CloudPcSnapshotImportActionResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcSnapshotImportActionResult}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSnapshotImportActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSnapshotImportActionResult();
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
     * Gets the additionalDetail property value. More details about the snapshot import action. For example, The snapshot import has failed because the file format is incorrect. This property only contains a value when errors occur during the process. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdditionalDetail() {
        return this.backingStore.get("additionalDetail");
    }
    /**
     * Gets the assignedUserPrincipalName property value. The assigned user&apos;s principal name. For example, ryan@contoso.com.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedUserPrincipalName() {
        return this.backingStore.get("assignedUserPrincipalName");
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
     * Gets the endDateTime property value. The end time of the snapshot import action. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appear as 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("additionalDetail", (n) -> { this.setAdditionalDetail(n.getStringValue()); });
        deserializerMap.put("assignedUserPrincipalName", (n) -> { this.setAssignedUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("filename", (n) -> { this.setFilename(n.getStringValue()); });
        deserializerMap.put("importStatus", (n) -> { this.setImportStatus(n.getEnumValue(CloudPcSnapshotImportActionStatus::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("snapshotId", (n) -> { this.setSnapshotId(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("usageStatus", (n) -> { this.setUsageStatus(n.getEnumValue(CloudPcImportedSnapshotState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filename property value. The file name for the imported snapshot. For example: MyCloudPc.vhd. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilename() {
        return this.backingStore.get("filename");
    }
    /**
     * Gets the importStatus property value. The importStatus property
     * @return a {@link CloudPcSnapshotImportActionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotImportActionStatus getImportStatus() {
        return this.backingStore.get("importStatus");
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
     * Gets the policyName property value. The name of the assigned provisioning policy for the upload action. This policy takes effect if a new Cloud PC is provisioned. For example, MyProvisioningPolicy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the snapshotId property value. The unique identifier for the imported snapshot. For example, d09ae73d-b70f-4836-95c1-59652c947e1c. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSnapshotId() {
        return this.backingStore.get("snapshotId");
    }
    /**
     * Gets the startDateTime property value. The start time of the snapshot import action. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appear as 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the usageStatus property value. The usageStatus property
     * @return a {@link CloudPcImportedSnapshotState}
     */
    @jakarta.annotation.Nullable
    public CloudPcImportedSnapshotState getUsageStatus() {
        return this.backingStore.get("usageStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalDetail", this.getAdditionalDetail());
        writer.writeStringValue("assignedUserPrincipalName", this.getAssignedUserPrincipalName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("filename", this.getFilename());
        writer.writeEnumValue("importStatus", this.getImportStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeStringValue("snapshotId", this.getSnapshotId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("usageStatus", this.getUsageStatus());
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
     * Sets the additionalDetail property value. More details about the snapshot import action. For example, The snapshot import has failed because the file format is incorrect. This property only contains a value when errors occur during the process. Read-only.
     * @param value Value to set for the additionalDetail property.
     */
    public void setAdditionalDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalDetail", value);
    }
    /**
     * Sets the assignedUserPrincipalName property value. The assigned user&apos;s principal name. For example, ryan@contoso.com.
     * @param value Value to set for the assignedUserPrincipalName property.
     */
    public void setAssignedUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedUserPrincipalName", value);
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
     * Sets the endDateTime property value. The end time of the snapshot import action. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appear as 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the filename property value. The file name for the imported snapshot. For example: MyCloudPc.vhd. Read-only.
     * @param value Value to set for the filename property.
     */
    public void setFilename(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filename", value);
    }
    /**
     * Sets the importStatus property value. The importStatus property
     * @param value Value to set for the importStatus property.
     */
    public void setImportStatus(@jakarta.annotation.Nullable final CloudPcSnapshotImportActionStatus value) {
        this.backingStore.set("importStatus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyName property value. The name of the assigned provisioning policy for the upload action. This policy takes effect if a new Cloud PC is provisioned. For example, MyProvisioningPolicy. Read-only.
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the snapshotId property value. The unique identifier for the imported snapshot. For example, d09ae73d-b70f-4836-95c1-59652c947e1c. Read-only.
     * @param value Value to set for the snapshotId property.
     */
    public void setSnapshotId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("snapshotId", value);
    }
    /**
     * Sets the startDateTime property value. The start time of the snapshot import action. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appear as 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the usageStatus property value. The usageStatus property
     * @param value Value to set for the usageStatus property.
     */
    public void setUsageStatus(@jakarta.annotation.Nullable final CloudPcImportedSnapshotState value) {
        this.backingStore.set("usageStatus", value);
    }
}
