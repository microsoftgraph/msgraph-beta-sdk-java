package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BgpConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies the ASN of the BGP.
     */
    private Integer asn;
    /**
     * The ipAddress property
     */
    private String ipAddress;
    /**
     * Specifies the BGP IP address of peer (Microsoft, in this case).
     */
    private String localIpAddress;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the BGP IP address of customer's on-premise VPN router configuration.
     */
    private String peerIpAddress;
    /**
     * Instantiates a new bgpConfiguration and sets the default values.
     */
    public BgpConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bgpConfiguration
     */
    @jakarta.annotation.Nonnull
    public static BgpConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BgpConfiguration();
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
     * Gets the asn property value. Specifies the ASN of the BGP.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAsn() {
        return this.asn;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("asn", (n) -> { this.setAsn(n.getIntegerValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("localIpAddress", (n) -> { this.setLocalIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("peerIpAddress", (n) -> { this.setPeerIpAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the localIpAddress property value. Specifies the BGP IP address of peer (Microsoft, in this case).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLocalIpAddress() {
        return this.localIpAddress;
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
     * Gets the peerIpAddress property value. Specifies the BGP IP address of customer's on-premise VPN router configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("asn", this.getAsn());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("localIpAddress", this.getLocalIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("peerIpAddress", this.getPeerIpAddress());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the asn property value. Specifies the ASN of the BGP.
     * @param value Value to set for the asn property.
     */
    public void setAsn(@jakarta.annotation.Nullable final Integer value) {
        this.asn = value;
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the localIpAddress property value. Specifies the BGP IP address of peer (Microsoft, in this case).
     * @param value Value to set for the localIpAddress property.
     */
    public void setLocalIpAddress(@jakarta.annotation.Nullable final String value) {
        this.localIpAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the peerIpAddress property value. Specifies the BGP IP address of customer's on-premise VPN router configuration.
     * @param value Value to set for the peerIpAddress property.
     */
    public void setPeerIpAddress(@jakarta.annotation.Nullable final String value) {
        this.peerIpAddress = value;
    }
}
