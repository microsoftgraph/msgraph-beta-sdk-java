package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN Proxy Server.
 */
public class VpnProxyServer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Address.
     */
    private String address;
    /**
     * Proxy's automatic configuration script url.
     */
    private String automaticConfigurationScriptUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Port. Valid values 0 to 65535
     */
    private Integer port;
    /**
     * Instantiates a new vpnProxyServer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpnProxyServer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnProxyServer
     */
    @javax.annotation.Nonnull
    public static VpnProxyServer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windows10VpnProxyServer": return new Windows10VpnProxyServer();
                case "#microsoft.graph.windows81VpnProxyServer": return new Windows81VpnProxyServer();
            }
        }
        return new VpnProxyServer();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. Address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this.address;
    }
    /**
     * Gets the automaticConfigurationScriptUrl property value. Proxy's automatic configuration script url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAutomaticConfigurationScriptUrl() {
        return this.automaticConfigurationScriptUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getStringValue()); });
        deserializerMap.put("automaticConfigurationScriptUrl", (n) -> { this.setAutomaticConfigurationScriptUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the port property value. Port. Valid values 0 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("automaticConfigurationScriptUrl", this.getAutomaticConfigurationScriptUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. Address.
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final String value) {
        this.address = value;
    }
    /**
     * Sets the automaticConfigurationScriptUrl property value. Proxy's automatic configuration script url.
     * @param value Value to set for the automaticConfigurationScriptUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticConfigurationScriptUrl(@javax.annotation.Nullable final String value) {
        this.automaticConfigurationScriptUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the port property value. Port. Valid values 0 to 65535
     * @param value Value to set for the port property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this.port = value;
    }
}
