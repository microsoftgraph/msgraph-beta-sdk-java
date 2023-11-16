package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing the setting contains only vaild app types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingAppConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new DeviceManagementSettingAppConstraint and sets the default values.
     */
    public DeviceManagementSettingAppConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingAppConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingAppConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingAppConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingAppConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("supportedTypes", (n) -> { this.setSupportedTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the supportedTypes property value. Acceptable app types to allow for this setting
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedTypes() {
        return this.BackingStore.get("supportedTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("supportedTypes", this.getSupportedTypes());
    }
    /**
     * Sets the supportedTypes property value. Acceptable app types to allow for this setting
     * @param value Value to set for the supportedTypes property.
     */
    public void setSupportedTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("supportedTypes", value);
    }
}
