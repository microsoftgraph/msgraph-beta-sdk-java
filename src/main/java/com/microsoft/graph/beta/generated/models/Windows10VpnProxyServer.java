package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN Proxy Server.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10VpnProxyServer extends VpnProxyServer implements Parsable {
    /**
     * Instantiates a new {@link Windows10VpnProxyServer} and sets the default values.
     */
    public Windows10VpnProxyServer() {
        super();
        this.setOdataType("#microsoft.graph.windows10VpnProxyServer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows10VpnProxyServer}
     */
    @jakarta.annotation.Nonnull
    public static Windows10VpnProxyServer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10VpnProxyServer();
    }
    /**
     * Gets the bypassProxyServerForLocalAddress property value. Bypass proxy server for local address.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBypassProxyServerForLocalAddress() {
        return this.backingStore.get("bypassProxyServerForLocalAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bypassProxyServerForLocalAddress", (n) -> { this.setBypassProxyServerForLocalAddress(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("bypassProxyServerForLocalAddress", this.getBypassProxyServerForLocalAddress());
    }
    /**
     * Sets the bypassProxyServerForLocalAddress property value. Bypass proxy server for local address.
     * @param value Value to set for the bypassProxyServerForLocalAddress property.
     */
    public void setBypassProxyServerForLocalAddress(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bypassProxyServerForLocalAddress", value);
    }
}
