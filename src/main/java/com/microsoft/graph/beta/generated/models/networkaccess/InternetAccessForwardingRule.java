package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InternetAccessForwardingRule extends ForwardingRule implements Parsable {
    /**
     * Instantiates a new {@link InternetAccessForwardingRule} and sets the default values.
     */
    public InternetAccessForwardingRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.internetAccessForwardingRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InternetAccessForwardingRule}
     */
    @jakarta.annotation.Nonnull
    public static InternetAccessForwardingRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InternetAccessForwardingRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ports property value. The ports property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.backingStore.get("ports");
    }
    /**
     * Gets the protocol property value. The protocol property
     * @return a {@link NetworkingProtocol}
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
        writer.writeEnumValue("protocol", this.getProtocol());
    }
    /**
     * Sets the ports property value. The ports property
     * @param value Value to set for the ports property.
     */
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ports", value);
    }
    /**
     * Sets the protocol property value. The protocol property
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.backingStore.set("protocol", value);
    }
}
