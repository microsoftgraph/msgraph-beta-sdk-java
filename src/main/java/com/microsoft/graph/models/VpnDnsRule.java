package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN DNS Rule definition. */
public class VpnDnsRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Automatically connect to the VPN when the device connects to this domain: Default False. */
    private Boolean _autoTrigger;
    /** Name. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Keep this rule active even when the VPN is not connected: Default False */
    private Boolean _persistent;
    /** Proxy Server Uri. */
    private String _proxyServerUri;
    /** Servers. */
    private java.util.List<String> _servers;
    /**
     * Instantiates a new vpnDnsRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpnDnsRule() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.vpnDnsRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnDnsRule
     */
    @javax.annotation.Nonnull
    public static VpnDnsRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnDnsRule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the autoTrigger property value. Automatically connect to the VPN when the device connects to this domain: Default False.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoTrigger() {
        return this._autoTrigger;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnDnsRule currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("autoTrigger", (n) -> { currentObject.setAutoTrigger(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("persistent", (n) -> { currentObject.setPersistent(n.getBooleanValue()); });
        deserializerMap.put("proxyServerUri", (n) -> { currentObject.setProxyServerUri(n.getStringValue()); });
        deserializerMap.put("servers", (n) -> { currentObject.setServers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the persistent property value. Keep this rule active even when the VPN is not connected: Default False
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersistent() {
        return this._persistent;
    }
    /**
     * Gets the proxyServerUri property value. Proxy Server Uri.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyServerUri() {
        return this._proxyServerUri;
    }
    /**
     * Gets the servers property value. Servers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getServers() {
        return this._servers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("autoTrigger", this.getAutoTrigger());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("persistent", this.getPersistent());
        writer.writeStringValue("proxyServerUri", this.getProxyServerUri());
        writer.writeCollectionOfPrimitiveValues("servers", this.getServers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the autoTrigger property value. Automatically connect to the VPN when the device connects to this domain: Default False.
     * @param value Value to set for the autoTrigger property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoTrigger(@javax.annotation.Nullable final Boolean value) {
        this._autoTrigger = value;
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the persistent property value. Keep this rule active even when the VPN is not connected: Default False
     * @param value Value to set for the persistent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersistent(@javax.annotation.Nullable final Boolean value) {
        this._persistent = value;
    }
    /**
     * Sets the proxyServerUri property value. Proxy Server Uri.
     * @param value Value to set for the proxyServerUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyServerUri(@javax.annotation.Nullable final String value) {
        this._proxyServerUri = value;
    }
    /**
     * Sets the servers property value. Servers.
     * @param value Value to set for the servers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._servers = value;
    }
}
