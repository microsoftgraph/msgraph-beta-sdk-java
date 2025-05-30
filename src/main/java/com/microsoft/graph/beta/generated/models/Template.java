package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Template extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Template} and sets the default values.
     */
    public Template() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Template}
     */
    @jakarta.annotation.Nonnull
    public static Template createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Template();
    }
    /**
     * Gets the deviceTemplates property value. Defines the templates that are common to a set of device objects, such as IoT devices.
     * @return a {@link java.util.List<DeviceTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceTemplate> getDeviceTemplates() {
        return this.backingStore.get("deviceTemplates");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceTemplates", (n) -> { this.setDeviceTemplates(n.getCollectionOfObjectValues(DeviceTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deviceTemplates", this.getDeviceTemplates());
    }
    /**
     * Sets the deviceTemplates property value. Defines the templates that are common to a set of device objects, such as IoT devices.
     * @param value Value to set for the deviceTemplates property.
     */
    public void setDeviceTemplates(@jakarta.annotation.Nullable final java.util.List<DeviceTemplate> value) {
        this.backingStore.set("deviceTemplates", value);
    }
}
