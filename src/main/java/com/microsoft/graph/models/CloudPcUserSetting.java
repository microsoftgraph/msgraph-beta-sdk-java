package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcUserSetting extends Entity implements Parsable {
    /**
     * Represents the set of Microsoft 365 groups and security groups in Azure Active Directory that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     */
    private java.util.List<CloudPcUserSettingAssignment> assignments;
    /**
     * The date and time the setting was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The setting name displayed in the user interface.
     */
    private String displayName;
    /**
     * The last date and time the setting was modified. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this:'2014-01-01T00:00:00Z'.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     */
    private Boolean localAdminEnabled;
    /**
     * Defines how frequently a restore point is created that is, a snapshot is taken) for users' provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     */
    private CloudPcRestorePointSetting restorePointSetting;
    /**
     * Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true.If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal.
     */
    private Boolean selfServiceEnabled;
    /**
     * Instantiates a new cloudPcUserSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcUserSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcUserSetting
     */
    @javax.annotation.Nonnull
    public static CloudPcUserSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSetting();
    }
    /**
     * Gets the assignments property value. Represents the set of Microsoft 365 groups and security groups in Azure Active Directory that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     * @return a cloudPcUserSettingAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcUserSettingAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time the setting was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The setting name displayed in the user interface.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(CloudPcUserSettingAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localAdminEnabled", (n) -> { this.setLocalAdminEnabled(n.getBooleanValue()); });
        deserializerMap.put("restorePointSetting", (n) -> { this.setRestorePointSetting(n.getObjectValue(CloudPcRestorePointSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("selfServiceEnabled", (n) -> { this.setSelfServiceEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last date and time the setting was modified. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this:'2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the localAdminEnabled property value. Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalAdminEnabled() {
        return this.localAdminEnabled;
    }
    /**
     * Gets the restorePointSetting property value. Defines how frequently a restore point is created that is, a snapshot is taken) for users' provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     * @return a cloudPcRestorePointSetting
     */
    @javax.annotation.Nullable
    public CloudPcRestorePointSetting getRestorePointSetting() {
        return this.restorePointSetting;
    }
    /**
     * Gets the selfServiceEnabled property value. Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true.If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSelfServiceEnabled() {
        return this.selfServiceEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeBooleanValue("localAdminEnabled", this.getLocalAdminEnabled());
        writer.writeObjectValue("restorePointSetting", this.getRestorePointSetting());
        writer.writeBooleanValue("selfServiceEnabled", this.getSelfServiceEnabled());
    }
    /**
     * Sets the assignments property value. Represents the set of Microsoft 365 groups and security groups in Azure Active Directory that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<CloudPcUserSettingAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the setting was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The setting name displayed in the user interface.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last date and time the setting was modified. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this:'2014-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the localAdminEnabled property value. Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     * @param value Value to set for the localAdminEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalAdminEnabled(@javax.annotation.Nullable final Boolean value) {
        this.localAdminEnabled = value;
    }
    /**
     * Sets the restorePointSetting property value. Defines how frequently a restore point is created that is, a snapshot is taken) for users' provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     * @param value Value to set for the restorePointSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestorePointSetting(@javax.annotation.Nullable final CloudPcRestorePointSetting value) {
        this.restorePointSetting = value;
    }
    /**
     * Sets the selfServiceEnabled property value. Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true.If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal.
     * @param value Value to set for the selfServiceEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelfServiceEnabled(@javax.annotation.Nullable final Boolean value) {
        this.selfServiceEnabled = value;
    }
}
