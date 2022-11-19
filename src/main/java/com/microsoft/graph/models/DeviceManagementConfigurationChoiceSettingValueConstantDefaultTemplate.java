package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate extends DeviceManagementConfigurationChoiceSettingValueDefaultTemplate implements Parsable {
    /** Option Children */
    private java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> _children;
    /** Default Constant Value */
    private String _settingDefinitionOptionId;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate();
    }
    /**
     * Gets the children property value. Option Children
     * @return a deviceManagementConfigurationSettingInstanceTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> getChildren() {
        return this._children;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingValueConstantDefaultTemplate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingInstanceTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("settingDefinitionOptionId", (n) -> { currentObject.setSettingDefinitionOptionId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the settingDefinitionOptionId property value. Default Constant Value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDefinitionOptionId() {
        return this._settingDefinitionOptionId;
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
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("settingDefinitionOptionId", this.getSettingDefinitionOptionId());
    }
    /**
     * Sets the children property value. Option Children
     * @param value Value to set for the children property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildren(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> value) {
        this._children = value;
    }
    /**
     * Sets the settingDefinitionOptionId property value. Default Constant Value
     * @param value Value to set for the settingDefinitionOptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitionOptionId(@javax.annotation.Nullable final String value) {
        this._settingDefinitionOptionId = value;
    }
}
