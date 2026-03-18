package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudFirewallDestinationFqdnAddress extends CloudFirewallDestinationAddress implements Parsable {
    /**
     * Instantiates a new {@link CloudFirewallDestinationFqdnAddress} and sets the default values.
     */
    public CloudFirewallDestinationFqdnAddress() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.cloudFirewallDestinationFqdnAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudFirewallDestinationFqdnAddress}
     */
    @jakarta.annotation.Nonnull
    public static CloudFirewallDestinationFqdnAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudFirewallDestinationFqdnAddress();
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
     * Gets the values property value. A collection of FQDNs for destination address matching (for example, example.com, api.contoso.com). Empty collections are not allowed. Required.
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
     * Sets the values property value. A collection of FQDNs for destination address matching (for example, example.com, api.contoso.com). Empty collections are not allowed. Required.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("values", value);
    }
}
