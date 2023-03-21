package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting instance within policy
 */
public class DeviceManagementConfigurationSetting extends Entity implements Parsable {
    /** List of related Setting Definitions */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> settingDefinitions;
    /** Setting instance within policy */
    private DeviceManagementConfigurationSettingInstance settingInstance;
    /**
     * Instantiates a new deviceManagementConfigurationSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSetting
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settingDefinitions", (n) -> { this.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("settingInstance", (n) -> { this.setSettingInstance(n.getObjectValue(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settingDefinitions property value. List of related Setting Definitions
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getSettingDefinitions() {
        return this.settingDefinitions;
    }
    /**
     * Gets the settingInstance property value. Setting instance within policy
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstance getSettingInstance() {
        return this.settingInstance;
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
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settingInstance", this.getSettingInstance());
    }
    /**
     * Sets the settingDefinitions property value. List of related Setting Definitions
     * @param value Value to set for the settingDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitions(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.settingDefinitions = value;
    }
    /**
     * Sets the settingInstance property value. Setting instance within policy
     * @param value Value to set for the settingInstance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingInstance(@javax.annotation.Nullable final DeviceManagementConfigurationSettingInstance value) {
        this.settingInstance = value;
    }
}
