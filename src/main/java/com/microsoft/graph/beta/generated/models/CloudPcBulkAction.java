package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkAction extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkAction} and sets the default values.
     */
    public CloudPcBulkAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkAction}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.cloudPcBulkCreateSnapshot": return new CloudPcBulkCreateSnapshot();
                case "#microsoft.graph.cloudPcBulkDisasterRecoveryFailback": return new CloudPcBulkDisasterRecoveryFailback();
                case "#microsoft.graph.cloudPcBulkDisasterRecoveryFailover": return new CloudPcBulkDisasterRecoveryFailover();
                case "#microsoft.graph.cloudPcBulkModifyDiskEncryptionType": return new CloudPcBulkModifyDiskEncryptionType();
                case "#microsoft.graph.cloudPcBulkPowerOff": return new CloudPcBulkPowerOff();
                case "#microsoft.graph.cloudPcBulkPowerOn": return new CloudPcBulkPowerOn();
                case "#microsoft.graph.cloudPcBulkReprovision": return new CloudPcBulkReprovision();
                case "#microsoft.graph.cloudPcBulkResize": return new CloudPcBulkResize();
                case "#microsoft.graph.cloudPcBulkRestart": return new CloudPcBulkRestart();
                case "#microsoft.graph.cloudPcBulkRestore": return new CloudPcBulkRestore();
                case "#microsoft.graph.cloudPcBulkSetReviewStatus": return new CloudPcBulkSetReviewStatus();
                case "#microsoft.graph.cloudPcBulkTroubleshoot": return new CloudPcBulkTroubleshoot();
            }
        }
        return new CloudPcBulkAction();
    }
    /**
     * Gets the actionSummary property value. Run summary of this bulk action.
     * @return a {@link CloudPcBulkActionSummary}
     */
    @jakarta.annotation.Nullable
    public CloudPcBulkActionSummary getActionSummary() {
        return this.backingStore.get("actionSummary");
    }
    /**
     * Gets the cloudPcIds property value. The cloudPcIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCloudPcIds() {
        return this.backingStore.get("cloudPcIds");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the bulk action was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. Name of the bulk action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getObjectValue(CloudPcBulkActionSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcIds", (n) -> { this.setCloudPcIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("initiatedByUserPrincipalName", (n) -> { this.setInitiatedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("scheduledDuringMaintenanceWindow", (n) -> { this.setScheduledDuringMaintenanceWindow(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcBulkActionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedByUserPrincipalName property value. Indicates the user principal name (UPN) of the user who initiated this bulk action. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this.backingStore.get("initiatedByUserPrincipalName");
    }
    /**
     * Gets the scheduledDuringMaintenanceWindow property value. Indicates whether the bulk action is scheduled according to the maintenance window. When true, the bulk action uses the maintenance window to schedule the action; false means that the bulk action doesn't use the maintenance window. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getScheduledDuringMaintenanceWindow() {
        return this.backingStore.get("scheduledDuringMaintenanceWindow");
    }
    /**
     * Gets the status property value. Indicates the status of bulk actions. Possible values are pending, succeeded, failed, unknownFutureValue. The default value is pending. Read-only.
     * @return a {@link CloudPcBulkActionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcBulkActionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actionSummary", this.getActionSummary());
        writer.writeCollectionOfPrimitiveValues("cloudPcIds", this.getCloudPcIds());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("initiatedByUserPrincipalName", this.getInitiatedByUserPrincipalName());
        writer.writeBooleanValue("scheduledDuringMaintenanceWindow", this.getScheduledDuringMaintenanceWindow());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the actionSummary property value. Run summary of this bulk action.
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final CloudPcBulkActionSummary value) {
        this.backingStore.set("actionSummary", value);
    }
    /**
     * Sets the cloudPcIds property value. The cloudPcIds property
     * @param value Value to set for the cloudPcIds property.
     */
    public void setCloudPcIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("cloudPcIds", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the bulk action was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. Name of the bulk action.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. Indicates the user principal name (UPN) of the user who initiated this bulk action. Read-only.
     * @param value Value to set for the initiatedByUserPrincipalName property.
     */
    public void setInitiatedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedByUserPrincipalName", value);
    }
    /**
     * Sets the scheduledDuringMaintenanceWindow property value. Indicates whether the bulk action is scheduled according to the maintenance window. When true, the bulk action uses the maintenance window to schedule the action; false means that the bulk action doesn't use the maintenance window. The default value is false.
     * @param value Value to set for the scheduledDuringMaintenanceWindow property.
     */
    public void setScheduledDuringMaintenanceWindow(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("scheduledDuringMaintenanceWindow", value);
    }
    /**
     * Sets the status property value. Indicates the status of bulk actions. Possible values are pending, succeeded, failed, unknownFutureValue. The default value is pending. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcBulkActionStatus value) {
        this.backingStore.set("status", value);
    }
}
