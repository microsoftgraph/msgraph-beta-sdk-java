package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class M365ForwardingRule extends ForwardingRule implements Parsable {
    /**
     * Instantiates a new M365ForwardingRule and sets the default values.
     */
    public M365ForwardingRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.m365ForwardingRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a M365ForwardingRule
     */
    @jakarta.annotation.Nonnull
    public static M365ForwardingRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new M365ForwardingRule();
    }
    /**
     * Gets the category property value. The category property
     * @return a ForwardingCategory
     */
    @jakarta.annotation.Nullable
    public ForwardingCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ForwardingCategory::forValue)); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ports property value. The port(s) used by a forwarding rule for Microsoft 365 traffic are specified to determine the specific network port(s) through which the Microsoft 365 traffic is directed and forwarded.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.backingStore.get("ports");
    }
    /**
     * Gets the protocol property value. The protocol property
     * @return a NetworkingProtocol
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
        writer.writeEnumValue("category", this.getCategory());
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
        writer.writeEnumValue("protocol", this.getProtocol());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ForwardingCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the ports property value. The port(s) used by a forwarding rule for Microsoft 365 traffic are specified to determine the specific network port(s) through which the Microsoft 365 traffic is directed and forwarded.
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
