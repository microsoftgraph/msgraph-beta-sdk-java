package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10VpnProxyServer extends VpnProxyServer implements Parsable {
    /** Bypass proxy server for local address. */
    private Boolean _bypassProxyServerForLocalAddress;
    /**
     * Instantiates a new Windows10VpnProxyServer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10VpnProxyServer() {
        super();
        this.setOdataType("#microsoft.graph.windows10VpnProxyServer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10VpnProxyServer
     */
    @javax.annotation.Nonnull
    public static Windows10VpnProxyServer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10VpnProxyServer();
    }
    /**
     * Gets the bypassProxyServerForLocalAddress property value. Bypass proxy server for local address.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBypassProxyServerForLocalAddress() {
        return this._bypassProxyServerForLocalAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bypassProxyServerForLocalAddress", (n) -> { this.setBypassProxyServerForLocalAddress(n.getBooleanValue()); });
        return deserializerMap;
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
        writer.writeBooleanValue("bypassProxyServerForLocalAddress", this.getBypassProxyServerForLocalAddress());
    }
    /**
     * Sets the bypassProxyServerForLocalAddress property value. Bypass proxy server for local address.
     * @param value Value to set for the bypassProxyServerForLocalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBypassProxyServerForLocalAddress(@javax.annotation.Nullable final Boolean value) {
        this._bypassProxyServerForLocalAddress = value;
    }
}
