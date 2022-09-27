package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Management Configuration Policy */
public class DeviceManagementConfigurationPolicy extends Entity implements Parsable {
    /** Policy assignments */
    private java.util.List<DeviceManagementConfigurationPolicyAssignment> _assignments;
    /** Policy creation date and time */
    private OffsetDateTime _createdDateTime;
    /** Policy creation source */
    private String _creationSource;
    /** Policy description */
    private String _description;
    /** Policy assignment status. This property is read-only. */
    private Boolean _isAssigned;
    /** Policy last modification date and time */
    private OffsetDateTime _lastModifiedDateTime;
    /** Policy name */
    private String _name;
    /** Supported platform types. */
    private DeviceManagementConfigurationPlatforms _platforms;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Number of settings */
    private Integer _settingCount;
    /** Policy settings */
    private java.util.List<DeviceManagementConfigurationSetting> _settings;
    /** Describes which technology this setting can be deployed with */
    private DeviceManagementConfigurationTechnologies _technologies;
    /** Template reference information */
    private DeviceManagementConfigurationPolicyTemplateReference _templateReference;
    /**
     * Instantiates a new deviceManagementConfigurationPolicy and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationPolicy
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicy();
    }
    /**
     * Gets the assignments property value. Policy assignments
     * @return a deviceManagementConfigurationPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. Policy creation date and time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the creationSource property value. Policy creation source
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreationSource() {
        return this._creationSource;
    }
    /**
     * Gets the description property value. Policy description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("creationSource", (n) -> { currentObject.setCreationSource(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("platforms", (n) -> { currentObject.setPlatforms(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("settingCount", (n) -> { currentObject.setSettingCount(n.getIntegerValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSetting::createFromDiscriminatorValue)); });
            this.put("technologies", (n) -> { currentObject.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
            this.put("templateReference", (n) -> { currentObject.setTemplateReference(n.getObjectValue(DeviceManagementConfigurationPolicyTemplateReference::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isAssigned property value. Policy assignment status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Gets the lastModifiedDateTime property value. Policy last modification date and time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the name property value. Policy name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the platforms property value. Supported platform types.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatforms() {
        return this._platforms;
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
     * Gets the settingCount property value. Number of settings
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingCount() {
        return this._settingCount;
    }
    /**
     * Gets the settings property value. Policy settings
     * @return a deviceManagementConfigurationSetting
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSetting> getSettings() {
        return this._settings;
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this._technologies;
    }
    /**
     * Gets the templateReference property value. Template reference information
     * @return a deviceManagementConfigurationPolicyTemplateReference
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPolicyTemplateReference getTemplateReference() {
        return this._templateReference;
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
        writer.writeStringValue("creationSource", this.getCreationSource());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("platforms", this.getPlatforms());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeIntegerValue("settingCount", this.getSettingCount());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeEnumValue("technologies", this.getTechnologies());
        writer.writeObjectValue("templateReference", this.getTemplateReference());
    }
    /**
     * Sets the assignments property value. Policy assignments
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Policy creation date and time
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the creationSource property value. Policy creation source
     * @param value Value to set for the creationSource property.
     * @return a void
     */
    public void setCreationSource(@javax.annotation.Nullable final String value) {
        this._creationSource = value;
    }
    /**
     * Sets the description property value. Policy description
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the isAssigned property value. Policy assignment status. This property is read-only.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Policy last modification date and time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Policy name
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    public void setPlatforms(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this._platforms = value;
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
     * Sets the settingCount property value. Number of settings
     * @param value Value to set for the settingCount property.
     * @return a void
     */
    public void setSettingCount(@javax.annotation.Nullable final Integer value) {
        this._settingCount = value;
    }
    /**
     * Sets the settings property value. Policy settings
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSetting> value) {
        this._settings = value;
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     * @return a void
     */
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this._technologies = value;
    }
    /**
     * Sets the templateReference property value. Template reference information
     * @param value Value to set for the templateReference property.
     * @return a void
     */
    public void setTemplateReference(@javax.annotation.Nullable final DeviceManagementConfigurationPolicyTemplateReference value) {
        this._templateReference = value;
    }
}
