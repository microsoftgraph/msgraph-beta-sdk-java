package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DomainRegistrant implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
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
     * The url property
     */
    private String url;
    /**
     * The vendor property
     */
    private String vendor;
    /**
     * Instantiates a new domainRegistrant and sets the default values.
     */
    public DomainRegistrant() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainRegistrant
     */
    @jakarta.annotation.Nonnull
    public static DomainRegistrant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainRegistrant();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("countryOrRegionCode", (n) -> { this.setCountryOrRegionCode(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
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
     * Gets the url property value. The url property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeStringValue("countryOrRegionCode", this.getCountryOrRegionCode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organization", this.getOrganization());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     */
    public void setVendor(@jakarta.annotation.Nullable final String value) {
        this.vendor = value;
    }
}
