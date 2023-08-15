package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /**
     * Default setting value for this setting
     */
    private DeviceManagementConfigurationSettingValue defaultValue;
    /**
     * list of child settings that depend on this setting
     */
    private java.util.List<DeviceManagementConfigurationSettingDependedOnBy> dependedOnBy;
    /**
     * list of parent settings this setting is dependent on
     */
    private java.util.List<DeviceManagementConfigurationDependentOn> dependentOn;
    /**
     * Definition of the value for this setting
     */
    private DeviceManagementConfigurationSettingValueDefinition valueDefinition;
    /**
     * Instantiates a new deviceManagementConfigurationSimpleSettingDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSimpleSettingDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionDefinition": return new DeviceManagementConfigurationSimpleSettingCollectionDefinition();
            }
        }
        return new DeviceManagementConfigurationSimpleSettingDefinition();
    }
    /**
     * Gets the defaultValue property value. Default setting value for this setting
     * @return a deviceManagementConfigurationSettingValue
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingValue getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Gets the dependedOnBy property value. list of child settings that depend on this setting
     * @return a deviceManagementConfigurationSettingDependedOnBy
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> getDependedOnBy() {
        return this.dependedOnBy;
    }
    /**
     * Gets the dependentOn property value. list of parent settings this setting is dependent on
     * @return a deviceManagementConfigurationDependentOn
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> getDependentOn() {
        return this.dependentOn;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationSettingValue::createFromDiscriminatorValue)); });
        deserializerMap.put("dependedOnBy", (n) -> { this.setDependedOnBy(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDependedOnBy::createFromDiscriminatorValue)); });
        deserializerMap.put("dependentOn", (n) -> { this.setDependentOn(n.getCollectionOfObjectValues(DeviceManagementConfigurationDependentOn::createFromDiscriminatorValue)); });
        deserializerMap.put("valueDefinition", (n) -> { this.setValueDefinition(n.getObjectValue(DeviceManagementConfigurationSettingValueDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the valueDefinition property value. Definition of the value for this setting
     * @return a deviceManagementConfigurationSettingValueDefinition
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingValueDefinition getValueDefinition() {
        return this.valueDefinition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultValue", this.getDefaultValue());
        writer.writeCollectionOfObjectValues("dependedOnBy", this.getDependedOnBy());
        writer.writeCollectionOfObjectValues("dependentOn", this.getDependentOn());
        writer.writeObjectValue("valueDefinition", this.getValueDefinition());
    }
    /**
     * Sets the defaultValue property value. Default setting value for this setting
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingValue value) {
        this.defaultValue = value;
    }
    /**
     * Sets the dependedOnBy property value. list of child settings that depend on this setting
     * @param value Value to set for the dependedOnBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDependedOnBy(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDependedOnBy> value) {
        this.dependedOnBy = value;
    }
    /**
     * Sets the dependentOn property value. list of parent settings this setting is dependent on
     * @param value Value to set for the dependentOn property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDependentOn(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationDependentOn> value) {
        this.dependentOn = value;
    }
    /**
     * Sets the valueDefinition property value. Definition of the value for this setting
     * @param value Value to set for the valueDefinition property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingValueDefinition value) {
        this.valueDefinition = value;
    }
}
