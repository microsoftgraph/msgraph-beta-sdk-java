package com.microsoft.graph.models;

import com.microsoft.graph.models.Windows10VpnProxyServer;
import com.microsoft.graph.models.Windows81VpnProxyServer;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN Proxy Server. */
public class VpnProxyServer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Address. */
    private String _address;
    /** Proxy's automatic configuration script url. */
    private String _automaticConfigurationScriptUrl;
    /** The OdataType property */
    private String _odataType;
    /** Port. Valid values 0 to 65535 */
    private Integer _port;
    /**
     * Instantiates a new vpnProxyServer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpnProxyServer() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.vpnProxyServer");
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
        return this._additionalData;
    }
    /**
     * Gets the address property value. Address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this._address;
    }
    /**
     * Gets the automaticConfigurationScriptUrl property value. Proxy's automatic configuration script url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAutomaticConfigurationScriptUrl() {
        return this._automaticConfigurationScriptUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnProxyServer currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
        deserializerMap.put("automaticConfigurationScriptUrl", (n) -> { currentObject.setAutomaticConfigurationScriptUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { currentObject.setPort(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the port property value. Port. Valid values 0 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this._port;
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the address property value. Address.
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
    }
    /**
     * Sets the automaticConfigurationScriptUrl property value. Proxy's automatic configuration script url.
     * @param value Value to set for the automaticConfigurationScriptUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticConfigurationScriptUrl(@javax.annotation.Nullable final String value) {
        this._automaticConfigurationScriptUrl = value;
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
     * Sets the port property value. Port. Valid values 0 to 65535
     * @param value Value to set for the port property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this._port = value;
    }
}
