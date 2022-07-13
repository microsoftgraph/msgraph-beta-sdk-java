package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementIntent extends Entity implements Parsable {
    /** Collection of assignments */
    private java.util.List<DeviceManagementIntentAssignment> _assignments;
    /** Collection of setting categories within the intent */
    private java.util.List<DeviceManagementIntentSettingCategory> _categories;
    /** The user given description */
    private String _description;
    /** Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent */
    private java.util.List<DeviceManagementIntentDeviceSettingStateSummary> _deviceSettingStateSummaries;
    /** Collection of states of all devices that the intent is applied to */
    private java.util.List<DeviceManagementIntentDeviceState> _deviceStates;
    /** A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to */
    private DeviceManagementIntentDeviceStateSummary _deviceStateSummary;
    /** The user given display name */
    private String _displayName;
    /** Signifies whether or not the intent is assigned to users */
    private Boolean _isAssigned;
    /** When the intent was last modified */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Collection of all settings to be applied */
    private java.util.List<DeviceManagementSettingInstance> _settings;
    /** The ID of the template this intent was created from (if any) */
    private String _templateId;
    /** Collection of states of all users that the intent is applied to */
    private java.util.List<DeviceManagementIntentUserState> _userStates;
    /** A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to */
    private DeviceManagementIntentUserStateSummary _userStateSummary;
    /**
     * Instantiates a new DeviceManagementIntent and sets the default values.
     * @return a void
     */
    public DeviceManagementIntent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntent
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntent();
    }
    /**
     * Gets the assignments property value. Collection of assignments
     * @return a deviceManagementIntentAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the categories property value. Collection of setting categories within the intent
     * @return a deviceManagementIntentSettingCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentSettingCategory> getCategories() {
        return this._categories;
    }
    /**
     * Gets the description property value. The user given description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     * @return a deviceManagementIntentDeviceSettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentDeviceSettingStateSummary> getDeviceSettingStateSummaries() {
        return this._deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStates property value. Collection of states of all devices that the intent is applied to
     * @return a deviceManagementIntentDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentDeviceState> getDeviceStates() {
        return this._deviceStates;
    }
    /**
     * Gets the deviceStateSummary property value. A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     * @return a deviceManagementIntentDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentDeviceStateSummary getDeviceStateSummary() {
        return this._deviceStateSummary;
    }
    /**
     * Gets the displayName property value. The user given display name
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
        final DeviceManagementIntent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceManagementIntentAssignment::createFromDiscriminatorValue)); });
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfObjectValues(DeviceManagementIntentSettingCategory::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceSettingStateSummaries", (n) -> { currentObject.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(DeviceManagementIntentDeviceSettingStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceStates", (n) -> { currentObject.setDeviceStates(n.getCollectionOfObjectValues(DeviceManagementIntentDeviceState::createFromDiscriminatorValue)); });
            this.put("deviceStateSummary", (n) -> { currentObject.setDeviceStateSummary(n.getObjectValue(DeviceManagementIntentDeviceStateSummary::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
            this.put("userStates", (n) -> { currentObject.setUserStates(n.getCollectionOfObjectValues(DeviceManagementIntentUserState::createFromDiscriminatorValue)); });
            this.put("userStateSummary", (n) -> { currentObject.setUserStateSummary(n.getObjectValue(DeviceManagementIntentUserStateSummary::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isAssigned property value. Signifies whether or not the intent is assigned to users
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the intent was last modified
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the settings property value. Collection of all settings to be applied
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this._settings;
    }
    /**
     * Gets the templateId property value. The ID of the template this intent was created from (if any)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Gets the userStates property value. Collection of states of all users that the intent is applied to
     * @return a deviceManagementIntentUserState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentUserState> getUserStates() {
        return this._userStates;
    }
    /**
     * Gets the userStateSummary property value. A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     * @return a deviceManagementIntentUserStateSummary
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentUserStateSummary getUserStateSummary() {
        return this._userStateSummary;
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
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceSettingStateSummaries", this.getDeviceSettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeObjectValue("deviceStateSummary", this.getDeviceStateSummary());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeCollectionOfObjectValues("userStates", this.getUserStates());
        writer.writeObjectValue("userStateSummary", this.getUserStateSummary());
    }
    /**
     * Sets the assignments property value. Collection of assignments
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the categories property value. Collection of setting categories within the intent
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentSettingCategory> value) {
        this._categories = value;
    }
    /**
     * Sets the description property value. The user given description
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    public void setDeviceSettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentDeviceSettingStateSummary> value) {
        this._deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStates property value. Collection of states of all devices that the intent is applied to
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentDeviceState> value) {
        this._deviceStates = value;
    }
    /**
     * Sets the deviceStateSummary property value. A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     * @param value Value to set for the deviceStateSummary property.
     * @return a void
     */
    public void setDeviceStateSummary(@javax.annotation.Nullable final DeviceManagementIntentDeviceStateSummary value) {
        this._deviceStateSummary = value;
    }
    /**
     * Sets the displayName property value. The user given display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isAssigned property value. Signifies whether or not the intent is assigned to users
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the intent was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the settings property value. Collection of all settings to be applied
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this._settings = value;
    }
    /**
     * Sets the templateId property value. The ID of the template this intent was created from (if any)
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
    /**
     * Sets the userStates property value. Collection of states of all users that the intent is applied to
     * @param value Value to set for the userStates property.
     * @return a void
     */
    public void setUserStates(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentUserState> value) {
        this._userStates = value;
    }
    /**
     * Sets the userStateSummary property value. A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     * @param value Value to set for the userStateSummary property.
     * @return a void
     */
    public void setUserStateSummary(@javax.annotation.Nullable final DeviceManagementIntentUserStateSummary value) {
        this._userStateSummary = value;
    }
}
