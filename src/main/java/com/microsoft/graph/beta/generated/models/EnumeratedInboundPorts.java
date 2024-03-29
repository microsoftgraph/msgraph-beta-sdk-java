package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnumeratedInboundPorts extends InboundPorts implements Parsable {
    /**
     * Instantiates a new {@link EnumeratedInboundPorts} and sets the default values.
     */
    public EnumeratedInboundPorts() {
        super();
        this.setOdataType("#microsoft.graph.enumeratedInboundPorts");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnumeratedInboundPorts}
     */
    @jakarta.annotation.Nonnull
    public static EnumeratedInboundPorts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnumeratedInboundPorts();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ports property value. Collection of ports that allow inbound traffic.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.backingStore.get("ports");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
    }
    /**
     * Sets the ports property value. Collection of ports that allow inbound traffic.
     * @param value Value to set for the ports property.
     */
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ports", value);
    }
}
