package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN DNS Rule definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpnDnsRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automatically connect to the VPN when the device connects to this domain: Default False.
     */
    private Boolean autoTrigger;
    /**
     * Name.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Keep this rule active even when the VPN is not connected: Default False
     */
    private Boolean persistent;
    /**
     * Proxy Server Uri.
     */
    private String proxyServerUri;
    /**
     * Servers.
     */
    private java.util.List<String> servers;
    /**
     * Instantiates a new VpnDnsRule and sets the default values.
     */
    public VpnDnsRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpnDnsRule
     */
    @jakarta.annotation.Nonnull
    public static VpnDnsRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnDnsRule();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the autoTrigger property value. Automatically connect to the VPN when the device connects to this domain: Default False.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoTrigger() {
        return this.autoTrigger;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("autoTrigger", (n) -> { this.setAutoTrigger(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("persistent", (n) -> { this.setPersistent(n.getBooleanValue()); });
        deserializerMap.put("proxyServerUri", (n) -> { this.setProxyServerUri(n.getStringValue()); });
        deserializerMap.put("servers", (n) -> { this.setServers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the persistent property value. Keep this rule active even when the VPN is not connected: Default False
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPersistent() {
        return this.persistent;
    }
    /**
     * Gets the proxyServerUri property value. Proxy Server Uri.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyServerUri() {
        return this.proxyServerUri;
    }
    /**
     * Gets the servers property value. Servers.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getServers() {
        return this.servers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the autoTrigger property value. Automatically connect to the VPN when the device connects to this domain: Default False.
     * @param value Value to set for the autoTrigger property.
     */
    public void setAutoTrigger(@jakarta.annotation.Nullable final Boolean value) {
        this.autoTrigger = value;
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the persistent property value. Keep this rule active even when the VPN is not connected: Default False
     * @param value Value to set for the persistent property.
     */
    public void setPersistent(@jakarta.annotation.Nullable final Boolean value) {
        this.persistent = value;
    }
    /**
     * Sets the proxyServerUri property value. Proxy Server Uri.
     * @param value Value to set for the proxyServerUri property.
     */
    public void setProxyServerUri(@jakarta.annotation.Nullable final String value) {
        this.proxyServerUri = value;
    }
    /**
     * Sets the servers property value. Servers.
     * @param value Value to set for the servers property.
     */
    public void setServers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.servers = value;
    }
}
