package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PeerConnectivityConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The asn property
     */
    private Integer asn;
    /**
     * The bgpAddress property
     */
    private String bgpAddress;
    /**
     * The endpoint property
     */
    private String endpoint;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new peerConnectivityConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PeerConnectivityConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a peerConnectivityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static PeerConnectivityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PeerConnectivityConfiguration();
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
     * Gets the asn property value. The asn property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAsn() {
        return this.asn;
    }
    /**
     * Gets the bgpAddress property value. The bgpAddress property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBgpAddress() {
        return this.bgpAddress;
    }
    /**
     * Gets the endpoint property value. The endpoint property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("asn", (n) -> { this.setAsn(n.getIntegerValue()); });
        deserializerMap.put("bgpAddress", (n) -> { this.setBgpAddress(n.getStringValue()); });
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("asn", this.getAsn());
        writer.writeStringValue("bgpAddress", this.getBgpAddress());
        writer.writeStringValue("endpoint", this.getEndpoint());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the asn property value. The asn property
     * @param value Value to set for the asn property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAsn(@jakarta.annotation.Nullable final Integer value) {
        this.asn = value;
    }
    /**
     * Sets the bgpAddress property value. The bgpAddress property
     * @param value Value to set for the bgpAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBgpAddress(@jakarta.annotation.Nullable final String value) {
        this.bgpAddress = value;
    }
    /**
     * Sets the endpoint property value. The endpoint property
     * @param value Value to set for the endpoint property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndpoint(@jakarta.annotation.Nullable final String value) {
        this.endpoint = value;
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
}
