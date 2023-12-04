package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing the defintion for a collection setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementCollectionSettingDefinition extends DeviceManagementSettingDefinition implements Parsable {
    /**
     * Instantiates a new DeviceManagementCollectionSettingDefinition and sets the default values.
     */
    public DeviceManagementCollectionSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementCollectionSettingDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementCollectionSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementCollectionSettingDefinition();
    }
    /**
     * Gets the elementDefinitionId property value. The Setting Definition ID that describes what each element of the collection looks like
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getElementDefinitionId() {
        return this.backingStore.get("elementDefinitionId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("elementDefinitionId", (n) -> { this.setElementDefinitionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("elementDefinitionId", this.getElementDefinitionId());
    }
    /**
     * Sets the elementDefinitionId property value. The Setting Definition ID that describes what each element of the collection looks like
     * @param value Value to set for the elementDefinitionId property.
     */
    public void setElementDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("elementDefinitionId", value);
    }
}
