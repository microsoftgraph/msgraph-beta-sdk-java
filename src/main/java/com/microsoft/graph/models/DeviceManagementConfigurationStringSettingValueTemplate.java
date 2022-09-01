package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationStringSettingValueTemplate extends DeviceManagementConfigurationSimpleSettingValueTemplate implements Parsable {
    /** String Setting Value Default Template. */
    private DeviceManagementConfigurationStringSettingValueDefaultTemplate _defaultValue;
    /**
     * Instantiates a new DeviceManagementConfigurationStringSettingValueTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationStringSettingValueTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValueTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationStringSettingValueTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValueTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationStringSettingValueTemplate();
    }
    /**
     * Gets the defaultValue property value. String Setting Value Default Template.
     * @return a deviceManagementConfigurationStringSettingValueDefaultTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationStringSettingValueDefaultTemplate getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationStringSettingValueTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationStringSettingValueDefaultTemplate::createFromDiscriminatorValue)); });
        }};
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
    }
    /**
     * Sets the defaultValue property value. String Setting Value Default Template.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    public void setDefaultValue(@javax.annotation.Nullable final DeviceManagementConfigurationStringSettingValueDefaultTemplate value) {
        this._defaultValue = value;
    }
}
