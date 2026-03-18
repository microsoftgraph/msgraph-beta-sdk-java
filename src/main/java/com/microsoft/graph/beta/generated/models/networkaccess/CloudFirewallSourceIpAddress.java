package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudFirewallSourceIpAddress extends CloudFirewallSourceAddress implements Parsable {
    /**
     * Instantiates a new {@link CloudFirewallSourceIpAddress} and sets the default values.
     */
    public CloudFirewallSourceIpAddress() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.cloudFirewallSourceIpAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudFirewallSourceIpAddress}
     */
    @jakarta.annotation.Nonnull
    public static CloudFirewallSourceIpAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudFirewallSourceIpAddress();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the values property value. A collection of IP addresses. Supports IPv4, IPv6, CIDR notation (for example, 192.168.0.0/16), and IP ranges (for example, 172.16.0.0-172.16.255.255). The collection must not be empty. Required.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
    }
    /**
     * Sets the values property value. A collection of IP addresses. Supports IPv4, IPv6, CIDR notation (for example, 192.168.0.0/16), and IP ranges (for example, 172.16.0.0-172.16.255.255). The collection must not be empty. Required.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("values", value);
    }
}
