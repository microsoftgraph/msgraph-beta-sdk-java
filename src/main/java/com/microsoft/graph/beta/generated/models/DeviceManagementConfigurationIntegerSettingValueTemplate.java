package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Integer Setting Value Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationIntegerSettingValueTemplate extends DeviceManagementConfigurationSimpleSettingValueTemplate implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationIntegerSettingValueTemplate} and sets the default values.
     */
    public DeviceManagementConfigurationIntegerSettingValueTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationIntegerSettingValueTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationIntegerSettingValueTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationIntegerSettingValueTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationIntegerSettingValueTemplate();
    }
    /**
     * Gets the defaultValue property value. Integer Setting Value Default Template.
     * @return a {@link DeviceManagementConfigurationIntegerSettingValueDefaultTemplate}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefaultTemplate getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationIntegerSettingValueDefaultTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendedValueDefinition", (n) -> { this.setRecommendedValueDefinition(n.getObjectValue(DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("requiredValueDefinition", (n) -> { this.setRequiredValueDefinition(n.getObjectValue(DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recommendedValueDefinition property value. Recommended value definition.
     * @return a {@link DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate getRecommendedValueDefinition() {
        return this.backingStore.get("recommendedValueDefinition");
    }
    /**
     * Gets the requiredValueDefinition property value. Required value definition.
     * @return a {@link DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate getRequiredValueDefinition() {
        return this.backingStore.get("requiredValueDefinition");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultValue", this.getDefaultValue());
        writer.writeObjectValue("recommendedValueDefinition", this.getRecommendedValueDefinition());
        writer.writeObjectValue("requiredValueDefinition", this.getRequiredValueDefinition());
    }
    /**
     * Sets the defaultValue property value. Integer Setting Value Default Template.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationIntegerSettingValueDefaultTemplate value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the recommendedValueDefinition property value. Recommended value definition.
     * @param value Value to set for the recommendedValueDefinition property.
     */
    public void setRecommendedValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate value) {
        this.backingStore.set("recommendedValueDefinition", value);
    }
    /**
     * Sets the requiredValueDefinition property value. Required value definition.
     * @param value Value to set for the requiredValueDefinition property.
     */
    public void setRequiredValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate value) {
        this.backingStore.set("requiredValueDefinition", value);
    }
}
