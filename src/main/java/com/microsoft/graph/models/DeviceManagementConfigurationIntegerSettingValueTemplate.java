package com.microsoft.graph.models;

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
     * Integer Setting Value Default Template.
     */
    private DeviceManagementConfigurationIntegerSettingValueDefaultTemplate defaultValue;
    /**
     * Recommended value definition.
     */
    private DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate recommendedValueDefinition;
    /**
     * Required value definition.
     */
    private DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate requiredValueDefinition;
    /**
     * Instantiates a new deviceManagementConfigurationIntegerSettingValueTemplate and sets the default values.
     */
    public DeviceManagementConfigurationIntegerSettingValueTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationIntegerSettingValueTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationIntegerSettingValueTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationIntegerSettingValueTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationIntegerSettingValueTemplate();
    }
    /**
     * Gets the defaultValue property value. Integer Setting Value Default Template.
     * @return a deviceManagementConfigurationIntegerSettingValueDefaultTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefaultTemplate getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a deviceManagementConfigurationIntegerSettingValueDefinitionTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate getRecommendedValueDefinition() {
        return this.recommendedValueDefinition;
    }
    /**
     * Gets the requiredValueDefinition property value. Required value definition.
     * @return a deviceManagementConfigurationIntegerSettingValueDefinitionTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate getRequiredValueDefinition() {
        return this.requiredValueDefinition;
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
        this.defaultValue = value;
    }
    /**
     * Sets the recommendedValueDefinition property value. Recommended value definition.
     * @param value Value to set for the recommendedValueDefinition property.
     */
    public void setRecommendedValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate value) {
        this.recommendedValueDefinition = value;
    }
    /**
     * Sets the requiredValueDefinition property value. Required value definition.
     * @param value Value to set for the requiredValueDefinition property.
     */
    public void setRequiredValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate value) {
        this.requiredValueDefinition = value;
    }
}
