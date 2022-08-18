package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class CompanyInformation extends Entity implements Parsable {
    /** The address property */
    private PostalAddressType _address;
    /** The currencyCode property */
    private String _currencyCode;
    /** The currentFiscalYearStartDate property */
    private LocalDate _currentFiscalYearStartDate;
    /** The displayName property */
    private String _displayName;
    /** The email property */
    private String _email;
    /** The faxNumber property */
    private String _faxNumber;
    /** The industry property */
    private String _industry;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The phoneNumber property */
    private String _phoneNumber;
    /** The picture property */
    private byte[] _picture;
    /** The taxRegistrationNumber property */
    private String _taxRegistrationNumber;
    /** The website property */
    private String _website;
    /**
     * Instantiates a new companyInformation and sets the default values.
     * @return a void
     */
    public CompanyInformation() {
        super();
        this.setOdataType("#microsoft.graph.companyInformation");
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
     * Gets the address property value. The address property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getAddress() {
        return this._address;
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrencyCode() {
        return this._currencyCode;
    }
    /**
     * Gets the currentFiscalYearStartDate property value. The currentFiscalYearStartDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getCurrentFiscalYearStartDate() {
        return this._currentFiscalYearStartDate;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * Gets the faxNumber property value. The faxNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFaxNumber() {
        return this._faxNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CompanyInformation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("currencyCode", (n) -> { currentObject.setCurrencyCode(n.getStringValue()); });
            this.put("currentFiscalYearStartDate", (n) -> { currentObject.setCurrentFiscalYearStartDate(n.getLocalDateValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("faxNumber", (n) -> { currentObject.setFaxNumber(n.getStringValue()); });
            this.put("industry", (n) -> { currentObject.setIndustry(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("picture", (n) -> { currentObject.setPicture(n.getByteArrayValue()); });
            this.put("taxRegistrationNumber", (n) -> { currentObject.setTaxRegistrationNumber(n.getStringValue()); });
            this.put("website", (n) -> { currentObject.setWebsite(n.getStringValue()); });
        }};
    }
    /**
     * Gets the industry property value. The industry property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIndustry() {
        return this._industry;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPicture() {
        return this._picture;
    }
    /**
     * Gets the taxRegistrationNumber property value. The taxRegistrationNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxRegistrationNumber() {
        return this._taxRegistrationNumber;
    }
    /**
     * Gets the website property value. The website property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebsite() {
        return this._website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeLocalDateValue("currentFiscalYearStartDate", this.getCurrentFiscalYearStartDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("faxNumber", this.getFaxNumber());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeByteArrayValue("picture", this.getPicture());
        writer.writeStringValue("taxRegistrationNumber", this.getTaxRegistrationNumber());
        writer.writeStringValue("website", this.getWebsite());
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._address = value;
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     * @return a void
     */
    public void setCurrencyCode(@javax.annotation.Nullable final String value) {
        this._currencyCode = value;
    }
    /**
     * Sets the currentFiscalYearStartDate property value. The currentFiscalYearStartDate property
     * @param value Value to set for the currentFiscalYearStartDate property.
     * @return a void
     */
    public void setCurrentFiscalYearStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._currentFiscalYearStartDate = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the faxNumber property value. The faxNumber property
     * @param value Value to set for the faxNumber property.
     * @return a void
     */
    public void setFaxNumber(@javax.annotation.Nullable final String value) {
        this._faxNumber = value;
    }
    /**
     * Sets the industry property value. The industry property
     * @param value Value to set for the industry property.
     * @return a void
     */
    public void setIndustry(@javax.annotation.Nullable final String value) {
        this._industry = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    public void setPicture(@javax.annotation.Nullable final byte[] value) {
        this._picture = value;
    }
    /**
     * Sets the taxRegistrationNumber property value. The taxRegistrationNumber property
     * @param value Value to set for the taxRegistrationNumber property.
     * @return a void
     */
    public void setTaxRegistrationNumber(@javax.annotation.Nullable final String value) {
        this._taxRegistrationNumber = value;
    }
    /**
     * Sets the website property value. The website property
     * @param value Value to set for the website property.
     * @return a void
     */
    public void setWebsite(@javax.annotation.Nullable final String value) {
        this._website = value;
    }
}
