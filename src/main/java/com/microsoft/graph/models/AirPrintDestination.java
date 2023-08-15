package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an AirPrint destination.
 */
public class AirPrintDestination implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later.
     */
    private Boolean forceTls;
    /**
     * The IP Address of the AirPrint destination.
     */
    private String ipAddress;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later.
     */
    private Integer port;
    /**
     * The Resource Path associated with the printer. This corresponds to the rp parameter of the ipps.tcp Bonjour record. For example: printers/CanonMG5300series, printers/XeroxPhaser7600, ipp/print, EpsonIPPPrinter.
     */
    private String resourcePath;
    /**
     * Instantiates a new airPrintDestination and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AirPrintDestination() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a airPrintDestination
     */
    @jakarta.annotation.Nonnull
    public static AirPrintDestination createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AirPrintDestination();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("forceTls", (n) -> { this.setForceTls(n.getBooleanValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("resourcePath", (n) -> { this.setResourcePath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forceTls property value. If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getForceTls() {
        return this.forceTls;
    }
    /**
     * Gets the ipAddress property value. The IP Address of the AirPrint destination.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the port property value. The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the resourcePath property value. The Resource Path associated with the printer. This corresponds to the rp parameter of the ipps.tcp Bonjour record. For example: printers/CanonMG5300series, printers/XeroxPhaser7600, ipp/print, EpsonIPPPrinter.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourcePath() {
        return this.resourcePath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("forceTls", this.getForceTls());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeStringValue("resourcePath", this.getResourcePath());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the forceTls property value. If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later.
     * @param value Value to set for the forceTls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setForceTls(@jakarta.annotation.Nullable final Boolean value) {
        this.forceTls = value;
    }
    /**
     * Sets the ipAddress property value. The IP Address of the AirPrint destination.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the port property value. The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later.
     * @param value Value to set for the port property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the resourcePath property value. The Resource Path associated with the printer. This corresponds to the rp parameter of the ipps.tcp Bonjour record. For example: printers/CanonMG5300series, printers/XeroxPhaser7600, ipp/print, EpsonIPPPrinter.
     * @param value Value to set for the resourcePath property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourcePath(@jakarta.annotation.Nullable final String value) {
        this.resourcePath = value;
    }
}
