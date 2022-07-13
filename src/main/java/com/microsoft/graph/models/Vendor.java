package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Vendor extends Entity implements Parsable {
    /** The address property */
    private PostalAddressType _address;
    /** The balance property */
    private BigDecimal _balance;
    /** The blocked property */
    private String _blocked;
    /** The currency property */
    private Currency _currency;
    /** The currencyCode property */
    private String _currencyCode;
    /** The currencyId property */
    private String _currencyId;
    /** The displayName property */
    private String _displayName;
    /** The email property */
    private String _email;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number property */
    private String _number;
    /** The paymentMethod property */
    private PaymentMethod _paymentMethod;
    /** The paymentMethodId property */
    private String _paymentMethodId;
    /** The paymentTerm property */
    private PaymentTerm _paymentTerm;
    /** The paymentTermsId property */
    private String _paymentTermsId;
    /** The phoneNumber property */
    private String _phoneNumber;
    /** The picture property */
    private java.util.List<Picture> _picture;
    /** The taxLiable property */
    private Boolean _taxLiable;
    /** The taxRegistrationNumber property */
    private String _taxRegistrationNumber;
    /** The website property */
    private String _website;
    /**
     * Instantiates a new vendor and sets the default values.
     * @return a void
     */
    public Vendor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vendor
     */
    @javax.annotation.Nonnull
    public static Vendor createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Vendor();
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
     * Gets the balance property value. The balance property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getBalance() {
        return this._balance;
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBlocked() {
        return this._blocked;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a currency
     */
    @javax.annotation.Nullable
    public Currency getCurrency() {
        return this._currency;
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
     * Gets the currencyId property value. The currencyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrencyId() {
        return this._currencyId;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Vendor currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("balance", (n) -> { currentObject.setBalance(n.getBigDecimalValue()); });
            this.put("blocked", (n) -> { currentObject.setBlocked(n.getStringValue()); });
            this.put("currency", (n) -> { currentObject.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
            this.put("currencyCode", (n) -> { currentObject.setCurrencyCode(n.getStringValue()); });
            this.put("currencyId", (n) -> { currentObject.setCurrencyId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("paymentMethod", (n) -> { currentObject.setPaymentMethod(n.getObjectValue(PaymentMethod::createFromDiscriminatorValue)); });
            this.put("paymentMethodId", (n) -> { currentObject.setPaymentMethodId(n.getStringValue()); });
            this.put("paymentTerm", (n) -> { currentObject.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
            this.put("paymentTermsId", (n) -> { currentObject.setPaymentTermsId(n.getStringValue()); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("picture", (n) -> { currentObject.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
            this.put("taxLiable", (n) -> { currentObject.setTaxLiable(n.getBooleanValue()); });
            this.put("taxRegistrationNumber", (n) -> { currentObject.setTaxRegistrationNumber(n.getStringValue()); });
            this.put("website", (n) -> { currentObject.setWebsite(n.getStringValue()); });
        }};
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
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this._number;
    }
    /**
     * Gets the paymentMethod property value. The paymentMethod property
     * @return a paymentMethod
     */
    @javax.annotation.Nullable
    public PaymentMethod getPaymentMethod() {
        return this._paymentMethod;
    }
    /**
     * Gets the paymentMethodId property value. The paymentMethodId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPaymentMethodId() {
        return this._paymentMethodId;
    }
    /**
     * Gets the paymentTerm property value. The paymentTerm property
     * @return a paymentTerm
     */
    @javax.annotation.Nullable
    public PaymentTerm getPaymentTerm() {
        return this._paymentTerm;
    }
    /**
     * Gets the paymentTermsId property value. The paymentTermsId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPaymentTermsId() {
        return this._paymentTermsId;
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
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this._picture;
    }
    /**
     * Gets the taxLiable property value. The taxLiable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTaxLiable() {
        return this._taxLiable;
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
        writer.writeBigDecimalValue("balance", this.getBalance());
        writer.writeStringValue("blocked", this.getBlocked());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeStringValue("currencyId", this.getCurrencyId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeObjectValue("paymentMethod", this.getPaymentMethod());
        writer.writeStringValue("paymentMethodId", this.getPaymentMethodId());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeStringValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeBooleanValue("taxLiable", this.getTaxLiable());
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
     * Sets the balance property value. The balance property
     * @param value Value to set for the balance property.
     * @return a void
     */
    public void setBalance(@javax.annotation.Nullable final BigDecimal value) {
        this._balance = value;
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     * @return a void
     */
    public void setBlocked(@javax.annotation.Nullable final String value) {
        this._blocked = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    public void setCurrency(@javax.annotation.Nullable final Currency value) {
        this._currency = value;
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
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     * @return a void
     */
    public void setCurrencyId(@javax.annotation.Nullable final String value) {
        this._currencyId = value;
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
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the paymentMethod property value. The paymentMethod property
     * @param value Value to set for the paymentMethod property.
     * @return a void
     */
    public void setPaymentMethod(@javax.annotation.Nullable final PaymentMethod value) {
        this._paymentMethod = value;
    }
    /**
     * Sets the paymentMethodId property value. The paymentMethodId property
     * @param value Value to set for the paymentMethodId property.
     * @return a void
     */
    public void setPaymentMethodId(@javax.annotation.Nullable final String value) {
        this._paymentMethodId = value;
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     * @return a void
     */
    public void setPaymentTerm(@javax.annotation.Nullable final PaymentTerm value) {
        this._paymentTerm = value;
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     * @return a void
     */
    public void setPaymentTermsId(@javax.annotation.Nullable final String value) {
        this._paymentTermsId = value;
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
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this._picture = value;
    }
    /**
     * Sets the taxLiable property value. The taxLiable property
     * @param value Value to set for the taxLiable property.
     * @return a void
     */
    public void setTaxLiable(@javax.annotation.Nullable final Boolean value) {
        this._taxLiable = value;
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
