package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing a given profile metadata
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingProfileConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new DeviceManagementSettingProfileConstraint and sets the default values.
     */
    public DeviceManagementSettingProfileConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingProfileConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingProfileConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingProfileConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingProfileConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("types", (n) -> { this.setTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. The source of the entity
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.BackingStore.get("source");
    }
    /**
     * Gets the types property value. A collection of types this entity carries
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTypes() {
        return this.BackingStore.get("types");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("source", this.getSource());
        writer.writeCollectionOfPrimitiveValues("types", this.getTypes());
    }
    /**
     * Sets the source property value. The source of the entity
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("source", value);
    }
    /**
     * Sets the types property value. A collection of types this entity carries
     * @param value Value to set for the types property.
     */
    public void setTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("types", value);
    }
}
