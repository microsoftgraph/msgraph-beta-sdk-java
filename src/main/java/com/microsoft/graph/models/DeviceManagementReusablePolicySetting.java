package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Graph model for a reusable setting
 */
public class DeviceManagementReusablePolicySetting extends Entity implements Parsable {
    /**
     * reusable setting creation date and time. This property is read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * reusable setting description supplied by user.
     */
    private String description;
    /**
     * reusable setting display name supplied by user.
     */
    private String displayName;
    /**
     * date and time when reusable setting was last modified. This property is read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * configuration policies referencing the current reusable setting. This property is read-only.
     */
    private java.util.List<DeviceManagementConfigurationPolicy> referencingConfigurationPolicies;
    /**
     * count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     */
    private Integer referencingConfigurationPolicyCount;
    /**
     * setting definition id associated with this reusable setting.
     */
    private String settingDefinitionId;
    /**
     * reusable setting configuration instance
     */
    private DeviceManagementConfigurationSettingInstance settingInstance;
    /**
     * version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     */
    private Integer version;
    /**
     * Instantiates a new deviceManagementReusablePolicySetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementReusablePolicySetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementReusablePolicySetting
     */
    @javax.annotation.Nonnull
    public static DeviceManagementReusablePolicySetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementReusablePolicySetting();
    }
    /**
     * Gets the createdDateTime property value. reusable setting creation date and time. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. reusable setting description supplied by user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. reusable setting display name supplied by user.
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("referencingConfigurationPolicies", (n) -> { this.setReferencingConfigurationPolicies(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("referencingConfigurationPolicyCount", (n) -> { this.setReferencingConfigurationPolicyCount(n.getIntegerValue()); });
        deserializerMap.put("settingDefinitionId", (n) -> { this.setSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingInstance", (n) -> { this.setSettingInstance(n.getObjectValue(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. date and time when reusable setting was last modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the referencingConfigurationPolicies property value. configuration policies referencing the current reusable setting. This property is read-only.
     * @return a deviceManagementConfigurationPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicy> getReferencingConfigurationPolicies() {
        return this.referencingConfigurationPolicies;
    }
    /**
     * Gets the referencingConfigurationPolicyCount property value. count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReferencingConfigurationPolicyCount() {
        return this.referencingConfigurationPolicyCount;
    }
    /**
     * Gets the settingDefinitionId property value. setting definition id associated with this reusable setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDefinitionId() {
        return this.settingDefinitionId;
    }
    /**
     * Gets the settingInstance property value. reusable setting configuration instance
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstance getSettingInstance() {
        return this.settingInstance;
    }
    /**
     * Gets the version property value. version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this.version;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("referencingConfigurationPolicies", this.getReferencingConfigurationPolicies());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeObjectValue("settingInstance", this.getSettingInstance());
    }
    /**
     * Sets the createdDateTime property value. reusable setting creation date and time. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. reusable setting description supplied by user.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. reusable setting display name supplied by user.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. date and time when reusable setting was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the referencingConfigurationPolicies property value. configuration policies referencing the current reusable setting. This property is read-only.
     * @param value Value to set for the referencingConfigurationPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferencingConfigurationPolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicy> value) {
        this.referencingConfigurationPolicies = value;
    }
    /**
     * Sets the referencingConfigurationPolicyCount property value. count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the referencingConfigurationPolicyCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferencingConfigurationPolicyCount(@javax.annotation.Nullable final Integer value) {
        this.referencingConfigurationPolicyCount = value;
    }
    /**
     * Sets the settingDefinitionId property value. setting definition id associated with this reusable setting.
     * @param value Value to set for the settingDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this.settingDefinitionId = value;
    }
    /**
     * Sets the settingInstance property value. reusable setting configuration instance
     * @param value Value to set for the settingInstance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingInstance(@javax.annotation.Nullable final DeviceManagementConfigurationSettingInstance value) {
        this.settingInstance = value;
    }
    /**
     * Sets the version property value. version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
