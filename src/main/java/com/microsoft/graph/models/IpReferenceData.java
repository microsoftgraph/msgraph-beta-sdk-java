package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpReferenceData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The asn property */
    private Long _asn;
    /** The city property */
    private String _city;
    /** The countryOrRegionCode property */
    private String _countryOrRegionCode;
    /** The OdataType property */
    private String _odataType;
    /** The organization property */
    private String _organization;
    /** The state property */
    private String _state;
    /** The vendor property */
    private String _vendor;
    /**
     * Instantiates a new ipReferenceData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IpReferenceData() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.ipReferenceData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipReferenceData
     */
    @javax.annotation.Nonnull
    public static IpReferenceData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpReferenceData();
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
     * Gets the asn property value. The asn property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getAsn() {
        return this._asn;
    }
    /**
     * Gets the city property value. The city property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the countryOrRegionCode property value. The countryOrRegionCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegionCode() {
        return this._countryOrRegionCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IpReferenceData currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
        deserializerMap.put("asn", (n) -> { currentObject.setAsn(n.getLongValue()); });
        deserializerMap.put("city", (n) -> { currentObject.setCity(n.getStringValue()); });
        deserializerMap.put("countryOrRegionCode", (n) -> { currentObject.setCountryOrRegionCode(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { currentObject.setOrganization(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
        deserializerMap.put("vendor", (n) -> { currentObject.setVendor(n.getStringValue()); });
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
     * Gets the organization property value. The organization property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganization() {
        return this._organization;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the vendor property value. The vendor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendor() {
        return this._vendor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the asn property value. The asn property
     * @param value Value to set for the asn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAsn(@javax.annotation.Nullable final Long value) {
        this._asn = value;
    }
    /**
     * Sets the city property value. The city property
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the countryOrRegionCode property value. The countryOrRegionCode property
     * @param value Value to set for the countryOrRegionCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryOrRegionCode(@javax.annotation.Nullable final String value) {
        this._countryOrRegionCode = value;
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
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganization(@javax.annotation.Nullable final String value) {
        this._organization = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendor(@javax.annotation.Nullable final String value) {
        this._vendor = value;
    }
}
