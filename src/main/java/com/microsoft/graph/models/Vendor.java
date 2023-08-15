package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class Vendor implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The address property
     */
    private PostalAddressType address;
    /**
     * The balance property
     */
    private BigDecimal balance;
    /**
     * The blocked property
     */
    private String blocked;
    /**
     * The currency property
     */
    private Currency currency;
    /**
     * The currencyCode property
     */
    private String currencyCode;
    /**
     * The currencyId property
     */
    private UUID currencyId;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The email property
     */
    private String email;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The number property
     */
    private String number;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The paymentMethod property
     */
    private PaymentMethod paymentMethod;
    /**
     * The paymentMethodId property
     */
    private UUID paymentMethodId;
    /**
     * The paymentTerm property
     */
    private PaymentTerm paymentTerm;
    /**
     * The paymentTermsId property
     */
    private UUID paymentTermsId;
    /**
     * The phoneNumber property
     */
    private String phoneNumber;
    /**
     * The picture property
     */
    private java.util.List<Picture> picture;
    /**
     * The taxLiable property
     */
    private Boolean taxLiable;
    /**
     * The taxRegistrationNumber property
     */
    private String taxRegistrationNumber;
    /**
     * The website property
     */
    private String website;
    /**
     * Instantiates a new vendor and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Vendor() {
        this.setAdditionalData(new HashMap<>());
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
     * Gets the balance property value. The balance property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getBalance() {
        return this.balance;
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBlocked() {
        return this.blocked;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a currency
     */
    @javax.annotation.Nullable
    public Currency getCurrency() {
        return this.currency;
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
     * Gets the currencyId property value. The currencyId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getCurrencyId() {
        return this.currencyId;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("balance", (n) -> { this.setBalance(n.getBigDecimalValue()); });
        deserializerMap.put("blocked", (n) -> { this.setBlocked(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currencyId", (n) -> { this.setCurrencyId(n.getUUIDValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("paymentMethod", (n) -> { this.setPaymentMethod(n.getObjectValue(PaymentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentMethodId", (n) -> { this.setPaymentMethodId(n.getUUIDValue()); });
        deserializerMap.put("paymentTerm", (n) -> { this.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentTermsId", (n) -> { this.setPaymentTermsId(n.getUUIDValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("picture", (n) -> { this.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
        deserializerMap.put("taxLiable", (n) -> { this.setTaxLiable(n.getBooleanValue()); });
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
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this.number;
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
     * Gets the paymentMethod property value. The paymentMethod property
     * @return a paymentMethod
     */
    @javax.annotation.Nullable
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }
    /**
     * Gets the paymentMethodId property value. The paymentMethodId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Gets the paymentTerm property value. The paymentTerm property
     * @return a paymentTerm
     */
    @javax.annotation.Nullable
    public PaymentTerm getPaymentTerm() {
        return this.paymentTerm;
    }
    /**
     * Gets the paymentTermsId property value. The paymentTermsId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getPaymentTermsId() {
        return this.paymentTermsId;
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
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.picture;
    }
    /**
     * Gets the taxLiable property value. The taxLiable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTaxLiable() {
        return this.taxLiable;
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
        writer.writeBigDecimalValue("balance", this.getBalance());
        writer.writeStringValue("blocked", this.getBlocked());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeUUIDValue("currencyId", this.getCurrencyId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeUUIDValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("paymentMethod", this.getPaymentMethod());
        writer.writeUUIDValue("paymentMethodId", this.getPaymentMethodId());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeUUIDValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeBooleanValue("taxLiable", this.getTaxLiable());
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
     * Sets the balance property value. The balance property
     * @param value Value to set for the balance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBalance(@javax.annotation.Nullable final BigDecimal value) {
        this.balance = value;
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlocked(@javax.annotation.Nullable final String value) {
        this.blocked = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final Currency value) {
        this.currency = value;
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
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencyId(@javax.annotation.Nullable final UUID value) {
        this.currencyId = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final UUID value) {
        this.id = value;
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
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this.number = value;
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
     * Sets the paymentMethod property value. The paymentMethod property
     * @param value Value to set for the paymentMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentMethod(@javax.annotation.Nullable final PaymentMethod value) {
        this.paymentMethod = value;
    }
    /**
     * Sets the paymentMethodId property value. The paymentMethodId property
     * @param value Value to set for the paymentMethodId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentMethodId(@javax.annotation.Nullable final UUID value) {
        this.paymentMethodId = value;
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTerm(@javax.annotation.Nullable final PaymentTerm value) {
        this.paymentTerm = value;
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTermsId(@javax.annotation.Nullable final UUID value) {
        this.paymentTermsId = value;
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
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this.picture = value;
    }
    /**
     * Sets the taxLiable property value. The taxLiable property
     * @param value Value to set for the taxLiable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxLiable(@javax.annotation.Nullable final Boolean value) {
        this.taxLiable = value;
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
