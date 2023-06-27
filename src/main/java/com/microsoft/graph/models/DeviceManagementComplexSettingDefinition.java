package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementComplexSettingDefinition extends DeviceManagementSettingDefinition implements Parsable {
    /**
     * The definitions of each property of the complex setting
     */
    private java.util.List<String> propertyDefinitionIds;
    /**
     * Instantiates a new DeviceManagementComplexSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementComplexSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementComplexSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementComplexSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementComplexSettingDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("propertyDefinitionIds", (n) -> { this.setPropertyDefinitionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the propertyDefinitionIds property value. The definitions of each property of the complex setting
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPropertyDefinitionIds() {
        return this.propertyDefinitionIds;
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
        writer.writeCollectionOfPrimitiveValues("propertyDefinitionIds", this.getPropertyDefinitionIds());
    }
    /**
     * Sets the propertyDefinitionIds property value. The definitions of each property of the complex setting
     * @param value Value to set for the propertyDefinitionIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropertyDefinitionIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.propertyDefinitionIds = value;
    }
}
