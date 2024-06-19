package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompliantNetworkNamedLocation extends NamedLocation implements Parsable {
    /**
     * Instantiates a new {@link CompliantNetworkNamedLocation} and sets the default values.
     */
    public CompliantNetworkNamedLocation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompliantNetworkNamedLocation}
     */
    @jakarta.annotation.Nonnull
    public static CompliantNetworkNamedLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompliantNetworkNamedLocation();
    }
    /**
     * Gets the compliantNetworkType property value. The compliantNetworkType property
     * @return a {@link CompliantNetworkType}
     */
    @jakarta.annotation.Nullable
    public CompliantNetworkType getCompliantNetworkType() {
        return this.backingStore.get("compliantNetworkType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantNetworkType", (n) -> { this.setCompliantNetworkType(n.getEnumValue(CompliantNetworkType::forValue)); });
        deserializerMap.put("isTrusted", (n) -> { this.setIsTrusted(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTrusted property value. true if this location is explicitly trusted. Optional. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTrusted() {
        return this.backingStore.get("isTrusted");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("compliantNetworkType", this.getCompliantNetworkType());
        writer.writeBooleanValue("isTrusted", this.getIsTrusted());
    }
    /**
     * Sets the compliantNetworkType property value. The compliantNetworkType property
     * @param value Value to set for the compliantNetworkType property.
     */
    public void setCompliantNetworkType(@jakarta.annotation.Nullable final CompliantNetworkType value) {
        this.backingStore.set("compliantNetworkType", value);
    }
    /**
     * Sets the isTrusted property value. true if this location is explicitly trusted. Optional. Default value is false.
     * @param value Value to set for the isTrusted property.
     */
    public void setIsTrusted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTrusted", value);
    }
}
