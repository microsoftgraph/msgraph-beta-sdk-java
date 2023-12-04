package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Choice Setting Value Constant Default Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate extends DeviceManagementConfigurationChoiceSettingValueDefaultTemplate implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate();
    }
    /**
     * Gets the children property value. Option Children
     * @return a java.util.List<DeviceManagementConfigurationSettingInstanceTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingInstanceTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("settingDefinitionOptionId", (n) -> { this.setSettingDefinitionOptionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the settingDefinitionOptionId property value. Default Constant Value
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingDefinitionOptionId() {
        return this.backingStore.get("settingDefinitionOptionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("settingDefinitionOptionId", this.getSettingDefinitionOptionId());
    }
    /**
     * Sets the children property value. Option Children
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the settingDefinitionOptionId property value. Default Constant Value
     * @param value Value to set for the settingDefinitionOptionId property.
     */
    public void setSettingDefinitionOptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingDefinitionOptionId", value);
    }
}
