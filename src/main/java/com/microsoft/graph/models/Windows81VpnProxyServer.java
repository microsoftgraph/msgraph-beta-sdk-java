package com.microsoft.graph.models;

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
public class Windows81VpnProxyServer extends VpnProxyServer implements Parsable {
    /**
     * Instantiates a new Windows81VpnProxyServer and sets the default values.
     */
    public Windows81VpnProxyServer() {
        super();
        this.setOdataType("#microsoft.graph.windows81VpnProxyServer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows81VpnProxyServer
     */
    @jakarta.annotation.Nonnull
    public static Windows81VpnProxyServer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81VpnProxyServer();
    }
    /**
     * Gets the automaticallyDetectProxySettings property value. Automatically detect proxy settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutomaticallyDetectProxySettings() {
        return this.BackingStore.get("automaticallyDetectProxySettings");
    }
    /**
     * Gets the bypassProxyServerForLocalAddress property value. Bypass proxy server for local address.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBypassProxyServerForLocalAddress() {
        return this.BackingStore.get("bypassProxyServerForLocalAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("automaticallyDetectProxySettings", (n) -> { this.setAutomaticallyDetectProxySettings(n.getBooleanValue()); });
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
        writer.writeBooleanValue("automaticallyDetectProxySettings", this.getAutomaticallyDetectProxySettings());
        writer.writeBooleanValue("bypassProxyServerForLocalAddress", this.getBypassProxyServerForLocalAddress());
    }
    /**
     * Sets the automaticallyDetectProxySettings property value. Automatically detect proxy settings.
     * @param value Value to set for the automaticallyDetectProxySettings property.
     */
    public void setAutomaticallyDetectProxySettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("automaticallyDetectProxySettings", value);
    }
    /**
     * Sets the bypassProxyServerForLocalAddress property value. Bypass proxy server for local address.
     * @param value Value to set for the bypassProxyServerForLocalAddress property.
     */
    public void setBypassProxyServerForLocalAddress(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("bypassProxyServerForLocalAddress", value);
    }
}
