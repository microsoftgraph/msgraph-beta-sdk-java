package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpReferenceData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The asn property
     */
    private Long asn;
    /**
     * The city property
     */
    private String city;
    /**
     * The countryOrRegionCode property
     */
    private String countryOrRegionCode;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The organization property
     */
    private String organization;
    /**
     * The state property
     */
    private String state;
    /**
     * The vendor property
     */
    private String vendor;
    /**
     * Instantiates a new ipReferenceData and sets the default values.
     */
    public IpReferenceData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipReferenceData
     */
    @jakarta.annotation.Nonnull
    public static IpReferenceData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpReferenceData();
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
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getAsn() {
        return this.asn;
    }
    /**
     * Gets the city property value. The city property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the countryOrRegionCode property value. The countryOrRegionCode property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCountryOrRegionCode() {
        return this.countryOrRegionCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("asn", (n) -> { this.setAsn(n.getLongValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("countryOrRegionCode", (n) -> { this.setCountryOrRegionCode(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("vendor", (n) -> { this.setVendor(n.getStringValue()); });
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
     * Gets the organization property value. The organization property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrganization() {
        return this.organization;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the vendor property value. The vendor property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVendor() {
        return this.vendor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("asn", this.getAsn());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryOrRegionCode", this.getCountryOrRegionCode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organization", this.getOrganization());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("vendor", this.getVendor());
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
     * Sets the asn property value. The asn property
     * @param value Value to set for the asn property.
     */
    public void setAsn(@jakarta.annotation.Nullable final Long value) {
        this.asn = value;
    }
    /**
     * Sets the city property value. The city property
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the countryOrRegionCode property value. The countryOrRegionCode property
     * @param value Value to set for the countryOrRegionCode property.
     */
    public void setCountryOrRegionCode(@jakarta.annotation.Nullable final String value) {
        this.countryOrRegionCode = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final String value) {
        this.organization = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     */
    public void setVendor(@jakarta.annotation.Nullable final String value) {
        this.vendor = value;
    }
}
