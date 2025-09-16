package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardingPolicy extends Policy implements Parsable {
    /**
     * Instantiates a new {@link ForwardingPolicy} and sets the default values.
     */
    public ForwardingPolicy() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.forwardingPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardingPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ForwardingPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardingPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("privateAccessAppId", (n) -> { this.setPrivateAccessAppId(n.getStringValue()); });
        deserializerMap.put("trafficForwardingType", (n) -> { this.setTrafficForwardingType(n.getEnumValue(TrafficForwardingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the privateAccessAppId property value. The privateAccessAppId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivateAccessAppId() {
        return this.backingStore.get("privateAccessAppId");
    }
    /**
     * Gets the trafficForwardingType property value. The trafficForwardingType property
     * @return a {@link TrafficForwardingType}
     */
    @jakarta.annotation.Nullable
    public TrafficForwardingType getTrafficForwardingType() {
        return this.backingStore.get("trafficForwardingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("privateAccessAppId", this.getPrivateAccessAppId());
        writer.writeEnumValue("trafficForwardingType", this.getTrafficForwardingType());
    }
    /**
     * Sets the privateAccessAppId property value. The privateAccessAppId property
     * @param value Value to set for the privateAccessAppId property.
     */
    public void setPrivateAccessAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privateAccessAppId", value);
    }
    /**
     * Sets the trafficForwardingType property value. The trafficForwardingType property
     * @param value Value to set for the trafficForwardingType property.
     */
    public void setTrafficForwardingType(@jakarta.annotation.Nullable final TrafficForwardingType value) {
        this.backingStore.set("trafficForwardingType", value);
    }
}
