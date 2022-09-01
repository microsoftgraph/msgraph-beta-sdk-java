package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN Server definition. */
public class VpnServer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Address (IP address, FQDN or URL) */
    private String _address;
    /** Description. */
    private String _description;
    /** Default server. */
    private Boolean _isDefaultServer;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new vpnServer and sets the default values.
     * @return a void
     */
    public VpnServer() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.vpnServer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnServer
     */
    @javax.annotation.Nonnull
    public static VpnServer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnServer();
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
     * Gets the address property value. Address (IP address, FQDN or URL)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this._address;
    }
    /**
     * Gets the description property value. Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnServer currentObject = this;
        return new HashMap<>(4) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("isDefaultServer", (n) -> { currentObject.setIsDefaultServer(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefaultServer property value. Default server.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultServer() {
        return this._isDefaultServer;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isDefaultServer", this.getIsDefaultServer());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the address property value. Address (IP address, FQDN or URL)
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
    }
    /**
     * Sets the description property value. Description.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the isDefaultServer property value. Default server.
     * @param value Value to set for the isDefaultServer property.
     * @return a void
     */
    public void setIsDefaultServer(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultServer = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
