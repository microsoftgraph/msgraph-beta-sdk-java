package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint that enforces a particular required setting that is not null/undefined/empty string/not configured
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingRequiredConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new DeviceManagementSettingRequiredConstraint and sets the default values.
     */
    public DeviceManagementSettingRequiredConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingRequiredConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingRequiredConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingRequiredConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingRequiredConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("notConfiguredValue", (n) -> { this.setNotConfiguredValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notConfiguredValue property value. List of value which means not configured for the setting
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotConfiguredValue() {
        return this.backingStore.get("notConfiguredValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("notConfiguredValue", this.getNotConfiguredValue());
    }
    /**
     * Sets the notConfiguredValue property value. List of value which means not configured for the setting
     * @param value Value to set for the notConfiguredValue property.
     */
    public void setNotConfiguredValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notConfiguredValue", value);
    }
}
