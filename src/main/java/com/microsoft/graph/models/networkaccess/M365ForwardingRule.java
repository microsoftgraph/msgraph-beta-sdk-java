package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class M365ForwardingRule extends ForwardingRule implements Parsable {
    /**
     * The category property
     */
    private ForwardingCategory category;
    /**
     * The port(s) used by a forwarding rule for M365 traffic are specified to determine the specific network port(s) through which the Microsoft 365 traffic is directed and forwarded.
     */
    private java.util.List<String> ports;
    /**
     * The protocol property
     */
    private NetworkingProtocol protocol;
    /**
     * Instantiates a new m365ForwardingRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public M365ForwardingRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.m365ForwardingRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a m365ForwardingRule
     */
    @javax.annotation.Nonnull
    public static M365ForwardingRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new M365ForwardingRule();
    }
    /**
     * Gets the category property value. The category property
     * @return a forwardingCategory
     */
    @javax.annotation.Nullable
    public ForwardingCategory getCategory() {
        return this.category;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ForwardingCategory.class)); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(NetworkingProtocol.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ports property value. The port(s) used by a forwarding rule for M365 traffic are specified to determine the specific network port(s) through which the Microsoft 365 traffic is directed and forwarded.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.ports;
    }
    /**
     * Gets the protocol property value. The protocol property
     * @return a networkingProtocol
     */
    @javax.annotation.Nullable
    public NetworkingProtocol getProtocol() {
        return this.protocol;
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
        writer.writeEnumValue("category", this.getCategory());
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
        writer.writeEnumValue("protocol", this.getProtocol());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final ForwardingCategory value) {
        this.category = value;
    }
    /**
     * Sets the ports property value. The port(s) used by a forwarding rule for M365 traffic are specified to determine the specific network port(s) through which the Microsoft 365 traffic is directed and forwarded.
     * @param value Value to set for the ports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPorts(@javax.annotation.Nullable final java.util.List<String> value) {
        this.ports = value;
    }
    /**
     * Sets the protocol property value. The protocol property
     * @param value Value to set for the protocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtocol(@javax.annotation.Nullable final NetworkingProtocol value) {
        this.protocol = value;
    }
}
