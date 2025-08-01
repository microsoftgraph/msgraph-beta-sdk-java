package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcUserSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcUserSetting} and sets the default values.
     */
    public CloudPcUserSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserSetting}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSetting();
    }
    /**
     * Gets the assignments property value. Represents the set of Microsoft 365 groups and security groups in Microsoft Entra ID that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     * @return a {@link java.util.List<CloudPcUserSettingAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserSettingAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date and time the setting was created. The timestamp type represents the date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 looks like this: &apos;2014-01-01T00:00:00Z&apos;.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the crossRegionDisasterRecoverySetting property value. Defines whether the user&apos;s Cloud PC enables cross-region disaster recovery and specifies the network for the disaster recovery.
     * @return a {@link CloudPcCrossRegionDisasterRecoverySetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcCrossRegionDisasterRecoverySetting getCrossRegionDisasterRecoverySetting() {
        return this.backingStore.get("crossRegionDisasterRecoverySetting");
    }
    /**
     * Gets the displayName property value. The setting name displayed in the user interface.
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
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(CloudPcUserSettingAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("crossRegionDisasterRecoverySetting", (n) -> { this.setCrossRegionDisasterRecoverySetting(n.getObjectValue(CloudPcCrossRegionDisasterRecoverySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localAdminEnabled", (n) -> { this.setLocalAdminEnabled(n.getBooleanValue()); });
        deserializerMap.put("notificationSetting", (n) -> { this.setNotificationSetting(n.getObjectValue(CloudPcNotificationSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningSourceType", (n) -> { this.setProvisioningSourceType(n.getEnumValue(CloudPcProvisioningSourceType::forValue)); });
        deserializerMap.put("resetEnabled", (n) -> { this.setResetEnabled(n.getBooleanValue()); });
        deserializerMap.put("restorePointSetting", (n) -> { this.setRestorePointSetting(n.getObjectValue(CloudPcRestorePointSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("selfServiceEnabled", (n) -> { this.setSelfServiceEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last date and time the setting was modified. The timestamp type represents the date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 looks like this:&apos;2014-01-01T00:00:00Z&apos;.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the localAdminEnabled property value. Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalAdminEnabled() {
        return this.backingStore.get("localAdminEnabled");
    }
    /**
     * Gets the notificationSetting property value. Defines the setting of the Cloud PC notification prompts for the Cloud PC user.
     * @return a {@link CloudPcNotificationSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcNotificationSetting getNotificationSetting() {
        return this.backingStore.get("notificationSetting");
    }
    /**
     * Gets the provisioningSourceType property value. The provisioningSourceType property
     * @return a {@link CloudPcProvisioningSourceType}
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningSourceType getProvisioningSourceType() {
        return this.backingStore.get("provisioningSourceType");
    }
    /**
     * Gets the resetEnabled property value. Indicates whether an end user is allowed to reset their Cloud PC. When true, the user is allowed to reset their Cloud PC. When false, end-user initiated reset isn&apos;t allowed. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getResetEnabled() {
        return this.backingStore.get("resetEnabled");
    }
    /**
     * Gets the restorePointSetting property value. Defines how frequently a restore point is created that is, a snapshot is taken) for users&apos; provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     * @return a {@link CloudPcRestorePointSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcRestorePointSetting getRestorePointSetting() {
        return this.backingStore.get("restorePointSetting");
    }
    /**
     * Gets the selfServiceEnabled property value. Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true.If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal. The selfServiceEnabled property is deprecated and will stop returning data on December 1, 2023.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSelfServiceEnabled() {
        return this.backingStore.get("selfServiceEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("crossRegionDisasterRecoverySetting", this.getCrossRegionDisasterRecoverySetting());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeBooleanValue("localAdminEnabled", this.getLocalAdminEnabled());
        writer.writeObjectValue("notificationSetting", this.getNotificationSetting());
        writer.writeEnumValue("provisioningSourceType", this.getProvisioningSourceType());
        writer.writeBooleanValue("resetEnabled", this.getResetEnabled());
        writer.writeObjectValue("restorePointSetting", this.getRestorePointSetting());
        writer.writeBooleanValue("selfServiceEnabled", this.getSelfServiceEnabled());
    }
    /**
     * Sets the assignments property value. Represents the set of Microsoft 365 groups and security groups in Microsoft Entra ID that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<CloudPcUserSettingAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the setting was created. The timestamp type represents the date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 looks like this: &apos;2014-01-01T00:00:00Z&apos;.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the crossRegionDisasterRecoverySetting property value. Defines whether the user&apos;s Cloud PC enables cross-region disaster recovery and specifies the network for the disaster recovery.
     * @param value Value to set for the crossRegionDisasterRecoverySetting property.
     */
    public void setCrossRegionDisasterRecoverySetting(@jakarta.annotation.Nullable final CloudPcCrossRegionDisasterRecoverySetting value) {
        this.backingStore.set("crossRegionDisasterRecoverySetting", value);
    }
    /**
     * Sets the displayName property value. The setting name displayed in the user interface.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last date and time the setting was modified. The timestamp type represents the date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 looks like this:&apos;2014-01-01T00:00:00Z&apos;.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the localAdminEnabled property value. Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     * @param value Value to set for the localAdminEnabled property.
     */
    public void setLocalAdminEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localAdminEnabled", value);
    }
    /**
     * Sets the notificationSetting property value. Defines the setting of the Cloud PC notification prompts for the Cloud PC user.
     * @param value Value to set for the notificationSetting property.
     */
    public void setNotificationSetting(@jakarta.annotation.Nullable final CloudPcNotificationSetting value) {
        this.backingStore.set("notificationSetting", value);
    }
    /**
     * Sets the provisioningSourceType property value. The provisioningSourceType property
     * @param value Value to set for the provisioningSourceType property.
     */
    public void setProvisioningSourceType(@jakarta.annotation.Nullable final CloudPcProvisioningSourceType value) {
        this.backingStore.set("provisioningSourceType", value);
    }
    /**
     * Sets the resetEnabled property value. Indicates whether an end user is allowed to reset their Cloud PC. When true, the user is allowed to reset their Cloud PC. When false, end-user initiated reset isn&apos;t allowed. The default value is false.
     * @param value Value to set for the resetEnabled property.
     */
    public void setResetEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("resetEnabled", value);
    }
    /**
     * Sets the restorePointSetting property value. Defines how frequently a restore point is created that is, a snapshot is taken) for users&apos; provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     * @param value Value to set for the restorePointSetting property.
     */
    public void setRestorePointSetting(@jakarta.annotation.Nullable final CloudPcRestorePointSetting value) {
        this.backingStore.set("restorePointSetting", value);
    }
    /**
     * Sets the selfServiceEnabled property value. Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true.If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal. The selfServiceEnabled property is deprecated and will stop returning data on December 1, 2023.
     * @param value Value to set for the selfServiceEnabled property.
     */
    public void setSelfServiceEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("selfServiceEnabled", value);
    }
}
