package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing the defintion for a complex setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementComplexSettingDefinition extends DeviceManagementSettingDefinition implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementComplexSettingDefinition} and sets the default values.
     */
    public DeviceManagementComplexSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementComplexSettingDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementComplexSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementComplexSettingDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("propertyDefinitionIds", (n) -> { this.setPropertyDefinitionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the propertyDefinitionIds property value. The definitions of each property of the complex setting
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPropertyDefinitionIds() {
        return this.backingStore.get("propertyDefinitionIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("propertyDefinitionIds", this.getPropertyDefinitionIds());
    }
    /**
     * Sets the propertyDefinitionIds property value. The definitions of each property of the complex setting
     * @param value Value to set for the propertyDefinitionIds property.
     */
    public void setPropertyDefinitionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("propertyDefinitionIds", value);
    }
}
