package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents an AirPrint destination. */
public class AirPrintDestination implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later. */
    private Boolean _forceTls;
    /** The IP Address of the AirPrint destination. */
    private String _ipAddress;
    /** The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later. */
    private Integer _port;
    /** The Resource Path associated with the printer. This corresponds to the rp parameter of the ipps.tcp Bonjour record. For example: printers/Canon_MG5300_series, printers/Xerox_Phaser_7600, ipp/print, Epson_IPP_Printer. */
    private String _resourcePath;
    /**
     * Instantiates a new airPrintDestination and sets the default values.
     * @return a void
     */
    public AirPrintDestination() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a airPrintDestination
     */
    @javax.annotation.Nonnull
    public static AirPrintDestination createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AirPrintDestination();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AirPrintDestination currentObject = this;
        return new HashMap<>(4) {{
            this.put("forceTls", (n) -> { currentObject.setForceTls(n.getBooleanValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("port", (n) -> { currentObject.setPort(n.getIntegerValue()); });
            this.put("resourcePath", (n) -> { currentObject.setResourcePath(n.getStringValue()); });
        }};
    }
    /**
     * Gets the forceTls property value. If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getForceTls() {
        return this._forceTls;
    }
    /**
     * Gets the ipAddress property value. The IP Address of the AirPrint destination.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the port property value. The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this._port;
    }
    /**
     * Gets the resourcePath property value. The Resource Path associated with the printer. This corresponds to the rp parameter of the ipps.tcp Bonjour record. For example: printers/Canon_MG5300_series, printers/Xerox_Phaser_7600, ipp/print, Epson_IPP_Printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourcePath() {
        return this._resourcePath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("forceTls", this.getForceTls());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeStringValue("resourcePath", this.getResourcePath());
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
     * Sets the forceTls property value. If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later.
     * @param value Value to set for the forceTls property.
     * @return a void
     */
    public void setForceTls(@javax.annotation.Nullable final Boolean value) {
        this._forceTls = value;
    }
    /**
     * Sets the ipAddress property value. The IP Address of the AirPrint destination.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the port property value. The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later.
     * @param value Value to set for the port property.
     * @return a void
     */
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this._port = value;
    }
    /**
     * Sets the resourcePath property value. The Resource Path associated with the printer. This corresponds to the rp parameter of the ipps.tcp Bonjour record. For example: printers/Canon_MG5300_series, printers/Xerox_Phaser_7600, ipp/print, Epson_IPP_Printer.
     * @param value Value to set for the resourcePath property.
     * @return a void
     */
    public void setResourcePath(@javax.annotation.Nullable final String value) {
        this._resourcePath = value;
    }
}
