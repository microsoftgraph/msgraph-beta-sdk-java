package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate extends DeviceManagementConfigurationStringSettingValueDefaultTemplate implements Parsable {
    /** Default Constant Value */
    private String _constantValue;
    /**
     * Instantiates a new DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValueConstantDefaultTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate();
    }
    /**
     * Gets the constantValue property value. Default Constant Value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConstantValue() {
        return this._constantValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("constantValue", (n) -> { currentObject.setConstantValue(n.getStringValue()); });
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
        writer.writeStringValue("constantValue", this.getConstantValue());
    }
    /**
     * Sets the constantValue property value. Default Constant Value
     * @param value Value to set for the constantValue property.
     * @return a void
     */
    public void setConstantValue(@javax.annotation.Nullable final String value) {
        this._constantValue = value;
    }
}
