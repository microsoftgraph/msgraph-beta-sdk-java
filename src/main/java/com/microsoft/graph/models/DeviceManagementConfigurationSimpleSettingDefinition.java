package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementConfigurationSimpleSettingCollectionDefinition;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /** Default setting value for this setting */
    private DeviceManagementConfigurationSettingValue _defaultValue;
    /** list of child settings that depend on this setting */
    private java.util.List<DeviceManagementConfigurationSettingDependedOnBy> _dependedOnBy;
    /** list of parent settings this setting is dependent on */
    private java.util.List<DeviceManagementConfigurationDependentOn> _dependentOn;
    /** Definition of the value for this setting */
    private DeviceManagementConfigurationSettingValueDefinition _valueDefinition;
    /**
     * Instantiates a new DeviceManagementConfigurationSimpleSettingDefinition and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSimpleSettingDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSimpleSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingValue getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * Gets the dependedOnBy property value. list of child settings that depend on this setting
     * @return a deviceManagementConfigurationSettingDependedOnBy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> getDependedOnBy() {
        return this._dependedOnBy;
    }
    /**
     * Gets the dependentOn property value. list of parent settings this setting is dependent on
     * @return a deviceManagementConfigurationDependentOn
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> getDependentOn() {
        return this._dependentOn;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSimpleSettingDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationSettingValue::createFromDiscriminatorValue)); });
            this.put("dependedOnBy", (n) -> { currentObject.setDependedOnBy(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDependedOnBy::createFromDiscriminatorValue)); });
            this.put("dependentOn", (n) -> { currentObject.setDependentOn(n.getCollectionOfObjectValues(DeviceManagementConfigurationDependentOn::createFromDiscriminatorValue)); });
            this.put("valueDefinition", (n) -> { currentObject.setValueDefinition(n.getObjectValue(DeviceManagementConfigurationSettingValueDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the valueDefinition property value. Definition of the value for this setting
     * @return a deviceManagementConfigurationSettingValueDefinition
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingValueDefinition getValueDefinition() {
        return this._valueDefinition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setDefaultValue(@javax.annotation.Nullable final DeviceManagementConfigurationSettingValue value) {
        this._defaultValue = value;
    }
    /**
     * Sets the dependedOnBy property value. list of child settings that depend on this setting
     * @param value Value to set for the dependedOnBy property.
     * @return a void
     */
    public void setDependedOnBy(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDependedOnBy> value) {
        this._dependedOnBy = value;
    }
    /**
     * Sets the dependentOn property value. list of parent settings this setting is dependent on
     * @param value Value to set for the dependentOn property.
     * @return a void
     */
    public void setDependentOn(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationDependentOn> value) {
        this._dependentOn = value;
    }
    /**
     * Sets the valueDefinition property value. Definition of the value for this setting
     * @param value Value to set for the valueDefinition property.
     * @return a void
     */
    public void setValueDefinition(@javax.annotation.Nullable final DeviceManagementConfigurationSettingValueDefinition value) {
        this._valueDefinition = value;
    }
}
