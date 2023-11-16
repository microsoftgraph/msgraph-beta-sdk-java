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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementReusablePolicySetting extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementReusablePolicySetting and sets the default values.
     */
    public DeviceManagementReusablePolicySetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementReusablePolicySetting
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementReusablePolicySetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementReusablePolicySetting();
    }
    /**
     * Gets the createdDateTime property value. reusable setting creation date and time. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. reusable setting description supplied by user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. reusable setting display name supplied by user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the referencingConfigurationPolicies property value. configuration policies referencing the current reusable setting. This property is read-only.
     * @return a java.util.List<DeviceManagementConfigurationPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicy> getReferencingConfigurationPolicies() {
        return this.BackingStore.get("referencingConfigurationPolicies");
    }
    /**
     * Gets the referencingConfigurationPolicyCount property value. count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReferencingConfigurationPolicyCount() {
        return this.BackingStore.get("referencingConfigurationPolicyCount");
    }
    /**
     * Gets the settingDefinitionId property value. setting definition id associated with this reusable setting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingDefinitionId() {
        return this.BackingStore.get("settingDefinitionId");
    }
    /**
     * Gets the settingInstance property value. reusable setting configuration instance
     * @return a DeviceManagementConfigurationSettingInstance
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingInstance getSettingInstance() {
        return this.BackingStore.get("settingInstance");
    }
    /**
     * Gets the version property value. version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.BackingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. reusable setting description supplied by user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. reusable setting display name supplied by user.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. date and time when reusable setting was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the referencingConfigurationPolicies property value. configuration policies referencing the current reusable setting. This property is read-only.
     * @param value Value to set for the referencingConfigurationPolicies property.
     */
    public void setReferencingConfigurationPolicies(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicy> value) {
        this.BackingStore.set("referencingConfigurationPolicies", value);
    }
    /**
     * Sets the referencingConfigurationPolicyCount property value. count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the referencingConfigurationPolicyCount property.
     */
    public void setReferencingConfigurationPolicyCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("referencingConfigurationPolicyCount", value);
    }
    /**
     * Sets the settingDefinitionId property value. setting definition id associated with this reusable setting.
     * @param value Value to set for the settingDefinitionId property.
     */
    public void setSettingDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("settingDefinitionId", value);
    }
    /**
     * Sets the settingInstance property value. reusable setting configuration instance
     * @param value Value to set for the settingInstance property.
     */
    public void setSettingInstance(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingInstance value) {
        this.BackingStore.set("settingInstance", value);
    }
    /**
     * Sets the version property value. version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("version", value);
    }
}
