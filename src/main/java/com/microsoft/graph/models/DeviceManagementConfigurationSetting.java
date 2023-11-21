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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSetting extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationSetting and sets the default values.
     */
    public DeviceManagementConfigurationSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSetting
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settingDefinitions", (n) -> { this.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("settingInstance", (n) -> { this.setSettingInstance(n.getObjectValue(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settingDefinitions property value. List of related Setting Definitions. This property is read-only.
     * @return a java.util.List<DeviceManagementConfigurationSettingDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getSettingDefinitions() {
        return this.backingStore.get("settingDefinitions");
    }
    /**
     * Gets the settingInstance property value. Setting instance within policy
     * @return a DeviceManagementConfigurationSettingInstance
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingInstance getSettingInstance() {
        return this.backingStore.get("settingInstance");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settingInstance", this.getSettingInstance());
    }
    /**
     * Sets the settingDefinitions property value. List of related Setting Definitions. This property is read-only.
     * @param value Value to set for the settingDefinitions property.
     */
    public void setSettingDefinitions(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.backingStore.set("settingDefinitions", value);
    }
    /**
     * Sets the settingInstance property value. Setting instance within policy
     * @param value Value to set for the settingInstance property.
     */
    public void setSettingInstance(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingInstance value) {
        this.backingStore.set("settingInstance", value);
    }
}
