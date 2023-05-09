package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Management Configuration Policy
 */
public class DeviceManagementConfigurationPolicy extends Entity implements Parsable {
    /** Policy assignments */
    private java.util.List<DeviceManagementConfigurationPolicyAssignment> assignments;
    /** Policy creation date and time */
    private OffsetDateTime createdDateTime;
    /** Policy creation source */
    private String creationSource;
    /** Policy description */
    private String description;
    /** Policy assignment status. This property is read-only. */
    private Boolean isAssigned;
    /** Policy last modification date and time */
    private OffsetDateTime lastModifiedDateTime;
    /** Policy name */
    private String name;
    /** Supported platform types. */
    private DeviceManagementConfigurationPlatforms platforms;
    /** Indicates the priority of each policies that are selected by the admin during enrollment process */
    private DeviceManagementPriorityMetaData priorityMetaData;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> roleScopeTagIds;
    /** Number of settings */
    private Integer settingCount;
    /** Policy settings */
    private java.util.List<DeviceManagementConfigurationSetting> settings;
    /** Describes which technology this setting can be deployed with */
    private DeviceManagementConfigurationTechnologies technologies;
    /** Template reference information */
    private DeviceManagementConfigurationPolicyTemplateReference templateReference;
    /**
     * Instantiates a new deviceManagementConfigurationPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPolicy() {
        super();
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
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. Policy creation date and time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the creationSource property value. Policy creation source
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreationSource() {
        return this.creationSource;
    }
    /**
     * Gets the description property value. Policy description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationSource", (n) -> { this.setCreationSource(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
        deserializerMap.put("priorityMetaData", (n) -> { this.setPriorityMetaData(n.getObjectValue(DeviceManagementPriorityMetaData::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("settingCount", (n) -> { this.setSettingCount(n.getIntegerValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
        deserializerMap.put("templateReference", (n) -> { this.setTemplateReference(n.getObjectValue(DeviceManagementConfigurationPolicyTemplateReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. Policy assignment status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.isAssigned;
    }
    /**
     * Gets the lastModifiedDateTime property value. Policy last modification date and time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the name property value. Policy name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the platforms property value. Supported platform types.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatforms() {
        return this.platforms;
    }
    /**
     * Gets the priorityMetaData property value. Indicates the priority of each policies that are selected by the admin during enrollment process
     * @return a deviceManagementPriorityMetaData
     */
    @javax.annotation.Nullable
    public DeviceManagementPriorityMetaData getPriorityMetaData() {
        return this.priorityMetaData;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the settingCount property value. Number of settings
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingCount() {
        return this.settingCount;
    }
    /**
     * Gets the settings property value. Policy settings
     * @return a deviceManagementConfigurationSetting
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSetting> getSettings() {
        return this.settings;
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this.technologies;
    }
    /**
     * Gets the templateReference property value. Template reference information
     * @return a deviceManagementConfigurationPolicyTemplateReference
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPolicyTemplateReference getTemplateReference() {
        return this.templateReference;
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
        writer.writeStringValue("creationSource", this.getCreationSource());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("platforms", this.getPlatforms());
        writer.writeObjectValue("priorityMetaData", this.getPriorityMetaData());
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
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicyAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Policy creation date and time
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the creationSource property value. Policy creation source
     * @param value Value to set for the creationSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationSource(@javax.annotation.Nullable final String value) {
        this.creationSource = value;
    }
    /**
     * Sets the description property value. Policy description
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the isAssigned property value. Policy assignment status. This property is read-only.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this.isAssigned = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Policy last modification date and time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Policy name
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatforms(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this.platforms = value;
    }
    /**
     * Sets the priorityMetaData property value. Indicates the priority of each policies that are selected by the admin during enrollment process
     * @param value Value to set for the priorityMetaData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriorityMetaData(@javax.annotation.Nullable final DeviceManagementPriorityMetaData value) {
        this.priorityMetaData = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the settingCount property value. Number of settings
     * @param value Value to set for the settingCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingCount(@javax.annotation.Nullable final Integer value) {
        this.settingCount = value;
    }
    /**
     * Sets the settings property value. Policy settings
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSetting> value) {
        this.settings = value;
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this.technologies = value;
    }
    /**
     * Sets the templateReference property value. Template reference information
     * @param value Value to set for the templateReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateReference(@javax.annotation.Nullable final DeviceManagementConfigurationPolicyTemplateReference value) {
        this.templateReference = value;
    }
}
