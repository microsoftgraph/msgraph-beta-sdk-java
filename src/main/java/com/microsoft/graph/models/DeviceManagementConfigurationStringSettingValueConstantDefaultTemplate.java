package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate extends DeviceManagementConfigurationStringSettingValueDefaultTemplate implements Parsable {
    /** Default Constant Value */
    private String constantValue;
    /**
     * Instantiates a new DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.constantValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("constantValue", (n) -> { this.setConstantValue(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("constantValue", this.getConstantValue());
    }
    /**
     * Sets the constantValue property value. Default Constant Value
     * @param value Value to set for the constantValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConstantValue(@javax.annotation.Nullable final String value) {
        this.constantValue = value;
    }
}
