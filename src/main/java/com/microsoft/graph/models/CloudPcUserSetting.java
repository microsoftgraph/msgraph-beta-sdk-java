package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcUserSetting extends Entity implements Parsable {
    /** Represents the set of Microsoft 365 groups and security groups in Azure AD that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample. */
    private java.util.List<CloudPcUserSettingAssignment> _assignments;
    /** The date and time the setting was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'. */
    private OffsetDateTime _createdDateTime;
    /** The setting name displayed in the user interface. */
    private String _displayName;
    /** The last date and time the setting was modified. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device. */
    private Boolean _localAdminEnabled;
    /** Defines how frequently a restore point is created that is, a snapshot is taken) for users' provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time. */
    private CloudPcRestorePointSetting _restorePointSetting;
    /** Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true. If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal. */
    private Boolean _selfServiceEnabled;
    /**
     * Instantiates a new CloudPcUserSetting and sets the default values.
     * @return a void
     */
    public CloudPcUserSetting() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcUserSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcUserSetting
     */
    @javax.annotation.Nonnull
    public static CloudPcUserSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSetting();
    }
    /**
     * Gets the assignments property value. Represents the set of Microsoft 365 groups and security groups in Azure AD that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     * @return a cloudPcUserSettingAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcUserSettingAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time the setting was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The setting name displayed in the user interface.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcUserSetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(CloudPcUserSettingAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("localAdminEnabled", (n) -> { currentObject.setLocalAdminEnabled(n.getBooleanValue()); });
            this.put("restorePointSetting", (n) -> { currentObject.setRestorePointSetting(n.getObjectValue(CloudPcRestorePointSetting::createFromDiscriminatorValue)); });
            this.put("selfServiceEnabled", (n) -> { currentObject.setSelfServiceEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The last date and time the setting was modified. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the localAdminEnabled property value. Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalAdminEnabled() {
        return this._localAdminEnabled;
    }
    /**
     * Gets the restorePointSetting property value. Defines how frequently a restore point is created that is, a snapshot is taken) for users' provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     * @return a cloudPcRestorePointSetting
     */
    @javax.annotation.Nullable
    public CloudPcRestorePointSetting getRestorePointSetting() {
        return this._restorePointSetting;
    }
    /**
     * Gets the selfServiceEnabled property value. Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true. If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSelfServiceEnabled() {
        return this._selfServiceEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the assignments property value. Represents the set of Microsoft 365 groups and security groups in Azure AD that have cloudPCUserSetting assigned. Returned only on $expand. For an example, see Get cloudPcUserSettingample.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<CloudPcUserSettingAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the setting was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The setting name displayed in the user interface.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last date and time the setting was modified. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the localAdminEnabled property value. Indicates whether the local admin option is enabled. Default value is false. To enable the local admin option, change the setting to true. If the local admin option is enabled, the end user can be an admin of the Cloud PC device.
     * @param value Value to set for the localAdminEnabled property.
     * @return a void
     */
    public void setLocalAdminEnabled(@javax.annotation.Nullable final Boolean value) {
        this._localAdminEnabled = value;
    }
    /**
     * Sets the restorePointSetting property value. Defines how frequently a restore point is created that is, a snapshot is taken) for users' provisioned Cloud PCs (default is 12 hours), and whether the user is allowed to restore their own Cloud PCs to a backup made at a specific point in time.
     * @param value Value to set for the restorePointSetting property.
     * @return a void
     */
    public void setRestorePointSetting(@javax.annotation.Nullable final CloudPcRestorePointSetting value) {
        this._restorePointSetting = value;
    }
    /**
     * Sets the selfServiceEnabled property value. Indicates whether the self-service option is enabled. Default value is false. To enable the self-service option, change the setting to true. If the self-service option is enabled, the end user is allowed to perform some self-service operations, such as upgrading the Cloud PC through the end user portal.
     * @param value Value to set for the selfServiceEnabled property.
     * @return a void
     */
    public void setSelfServiceEnabled(@javax.annotation.Nullable final Boolean value) {
        this._selfServiceEnabled = value;
    }
}
