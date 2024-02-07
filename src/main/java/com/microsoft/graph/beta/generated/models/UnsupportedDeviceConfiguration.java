package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UnsupportedDeviceConfiguration is used when an entity cannot be mapped to another model-compliant subtype of deviceConfiguration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnsupportedDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new UnsupportedDeviceConfiguration and sets the default values.
     */
    public UnsupportedDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.unsupportedDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnsupportedDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static UnsupportedDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnsupportedDeviceConfiguration();
    }
    /**
     * Gets the details property value. Details describing why the entity is unsupported. This collection can contain a maximum of 1000 elements.
     * @return a java.util.List<UnsupportedDeviceConfigurationDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnsupportedDeviceConfigurationDetail> getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(UnsupportedDeviceConfigurationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("originalEntityTypeName", (n) -> { this.setOriginalEntityTypeName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the originalEntityTypeName property value. The type of entity that would be returned otherwise.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginalEntityTypeName() {
        return this.backingStore.get("originalEntityTypeName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeStringValue("originalEntityTypeName", this.getOriginalEntityTypeName());
    }
    /**
     * Sets the details property value. Details describing why the entity is unsupported. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<UnsupportedDeviceConfigurationDetail> value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the originalEntityTypeName property value. The type of entity that would be returned otherwise.
     * @param value Value to set for the originalEntityTypeName property.
     */
    public void setOriginalEntityTypeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originalEntityTypeName", value);
    }
}
