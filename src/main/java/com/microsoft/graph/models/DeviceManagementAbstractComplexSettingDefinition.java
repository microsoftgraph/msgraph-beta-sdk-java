package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing the defintion for an abstract complex setting
 */
public class DeviceManagementAbstractComplexSettingDefinition extends DeviceManagementSettingDefinition implements Parsable {
    /**
     * List of definition IDs for all possible implementations of this abstract complex setting
     */
    private java.util.List<String> implementations;
    /**
     * Instantiates a new deviceManagementAbstractComplexSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementAbstractComplexSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementAbstractComplexSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementAbstractComplexSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAbstractComplexSettingDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("implementations", (n) -> { this.setImplementations(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the implementations property value. List of definition IDs for all possible implementations of this abstract complex setting
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getImplementations() {
        return this.implementations;
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
        writer.writeCollectionOfPrimitiveValues("implementations", this.getImplementations());
    }
    /**
     * Sets the implementations property value. List of definition IDs for all possible implementations of this abstract complex setting
     * @param value Value to set for the implementations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImplementations(@javax.annotation.Nullable final java.util.List<String> value) {
        this.implementations = value;
    }
}
