package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class CompanyInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The address property
     */
    private PostalAddressType address;
    /**
     * The currencyCode property
     */
    private String currencyCode;
    /**
     * The currentFiscalYearStartDate property
     */
    private LocalDate currentFiscalYearStartDate;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The email property
     */
    private String email;
    /**
     * The faxNumber property
     */
    private String faxNumber;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The industry property
     */
    private String industry;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The phoneNumber property
     */
    private String phoneNumber;
    /**
     * The picture property
     */
    private byte[] picture;
    /**
     * The taxRegistrationNumber property
     */
    private String taxRegistrationNumber;
    /**
     * The website property
     */
    private String website;
    /**
     * Instantiates a new companyInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanyInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a companyInformation
     */
    @javax.annotation.Nonnull
    public static CompanyInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanyInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. The address property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getAddress() {
        return this.address;
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Gets the currentFiscalYearStartDate property value. The currentFiscalYearStartDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getCurrentFiscalYearStartDate() {
        return this.currentFiscalYearStartDate;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the faxNumber property value. The faxNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFaxNumber() {
        return this.faxNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currentFiscalYearStartDate", (n) -> { this.setCurrentFiscalYearStartDate(n.getLocalDateValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("faxNumber", (n) -> { this.setFaxNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("picture", (n) -> { this.setPicture(n.getByteArrayValue()); });
        deserializerMap.put("taxRegistrationNumber", (n) -> { this.setTaxRegistrationNumber(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the industry property value. The industry property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getPicture() {
        return this.picture;
    }
    /**
     * Gets the taxRegistrationNumber property value. The taxRegistrationNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }
    /**
     * Gets the website property value. The website property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeLocalDateValue("currentFiscalYearStartDate", this.getCurrentFiscalYearStartDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("faxNumber", this.getFaxNumber());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeByteArrayValue("picture", this.getPicture());
        writer.writeStringValue("taxRegistrationNumber", this.getTaxRegistrationNumber());
        writer.writeStringValue("website", this.getWebsite());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.address = value;
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencyCode(@javax.annotation.Nullable final String value) {
        this.currencyCode = value;
    }
    /**
     * Sets the currentFiscalYearStartDate property value. The currentFiscalYearStartDate property
     * @param value Value to set for the currentFiscalYearStartDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentFiscalYearStartDate(@javax.annotation.Nullable final LocalDate value) {
        this.currentFiscalYearStartDate = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the faxNumber property value. The faxNumber property
     * @param value Value to set for the faxNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFaxNumber(@javax.annotation.Nullable final String value) {
        this.faxNumber = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the industry property value. The industry property
     * @param value Value to set for the industry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndustry(@javax.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final byte[] value) {
        this.picture = value;
    }
    /**
     * Sets the taxRegistrationNumber property value. The taxRegistrationNumber property
     * @param value Value to set for the taxRegistrationNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxRegistrationNumber(@javax.annotation.Nullable final String value) {
        this.taxRegistrationNumber = value;
    }
    /**
     * Sets the website property value. The website property
     * @param value Value to set for the website property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebsite(@javax.annotation.Nullable final String value) {
        this.website = value;
    }
}
