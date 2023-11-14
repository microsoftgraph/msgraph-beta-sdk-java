package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocalConnectivityConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies ASN of one end of IPSec tunnel (local or peer).
     */
    private Integer asn;
    /**
     * Specifies BGP IPv4 address of one end of IPSec tunnel (local or peer).
     */
    private String bgpAddress;
    /**
     * Specifies public IPv4 address of one end of IPSec tunnel (local or peer).
     */
    private String endpoint;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The region property
     */
    private Region region;
    /**
     * Instantiates a new LocalConnectivityConfiguration and sets the default values.
     */
    public LocalConnectivityConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LocalConnectivityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static LocalConnectivityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocalConnectivityConfiguration();
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
     * Gets the asn property value. Specifies ASN of one end of IPSec tunnel (local or peer).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAsn() {
        return this.asn;
    }
    /**
     * Gets the bgpAddress property value. Specifies BGP IPv4 address of one end of IPSec tunnel (local or peer).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBgpAddress() {
        return this.bgpAddress;
    }
    /**
     * Gets the endpoint property value. Specifies public IPv4 address of one end of IPSec tunnel (local or peer).
     * @return a String
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("asn", (n) -> { this.setAsn(n.getIntegerValue()); });
        deserializerMap.put("bgpAddress", (n) -> { this.setBgpAddress(n.getStringValue()); });
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getEnumValue(Region.class)); });
        return deserializerMap;
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
     * Gets the region property value. The region property
     * @return a Region
     */
    @jakarta.annotation.Nullable
    public Region getRegion() {
        return this.region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("asn", this.getAsn());
        writer.writeStringValue("bgpAddress", this.getBgpAddress());
        writer.writeStringValue("endpoint", this.getEndpoint());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("region", this.getRegion());
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
     * Sets the asn property value. Specifies ASN of one end of IPSec tunnel (local or peer).
     * @param value Value to set for the asn property.
     */
    public void setAsn(@jakarta.annotation.Nullable final Integer value) {
        this.asn = value;
    }
    /**
     * Sets the bgpAddress property value. Specifies BGP IPv4 address of one end of IPSec tunnel (local or peer).
     * @param value Value to set for the bgpAddress property.
     */
    public void setBgpAddress(@jakarta.annotation.Nullable final String value) {
        this.bgpAddress = value;
    }
    /**
     * Sets the endpoint property value. Specifies public IPv4 address of one end of IPSec tunnel (local or peer).
     * @param value Value to set for the endpoint property.
     */
    public void setEndpoint(@jakarta.annotation.Nullable final String value) {
        this.endpoint = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final Region value) {
        this.region = value;
    }
}
