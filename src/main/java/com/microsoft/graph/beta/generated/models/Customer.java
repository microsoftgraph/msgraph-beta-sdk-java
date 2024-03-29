package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Customer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Customer} and sets the default values.
     */
    public Customer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Customer}
     */
    @jakarta.annotation.Nonnull
    public static Customer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Customer();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the address property value. The address property
     * @return a {@link PostalAddressType}
     */
    @jakarta.annotation.Nullable
    public PostalAddressType getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBlocked() {
        return this.backingStore.get("blocked");
    }
    /**
     * Gets the currency property value. The currency property
     * @return a {@link Currency}
     */
    @jakarta.annotation.Nullable
    public Currency getCurrency() {
        return this.backingStore.get("currency");
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrencyCode() {
        return this.backingStore.get("currencyCode");
    }
    /**
     * Gets the currencyId property value. The currencyId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getCurrencyId() {
        return this.backingStore.get("currencyId");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(25);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
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
        deserializerMap.put("shipmentMethod", (n) -> { this.setShipmentMethod(n.getObjectValue(ShipmentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentMethodId", (n) -> { this.setShipmentMethodId(n.getUUIDValue()); });
        deserializerMap.put("taxAreaDisplayName", (n) -> { this.setTaxAreaDisplayName(n.getStringValue()); });
        deserializerMap.put("taxAreaId", (n) -> { this.setTaxAreaId(n.getUUIDValue()); });
        deserializerMap.put("taxLiable", (n) -> { this.setTaxLiable(n.getBooleanValue()); });
        deserializerMap.put("taxRegistrationNumber", (n) -> { this.setTaxRegistrationNumber(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the number property value. The number property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.backingStore.get("number");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the paymentMethod property value. The paymentMethod property
     * @return a {@link PaymentMethod}
     */
    @jakarta.annotation.Nullable
    public PaymentMethod getPaymentMethod() {
        return this.backingStore.get("paymentMethod");
    }
    /**
     * Gets the paymentMethodId property value. The paymentMethodId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getPaymentMethodId() {
        return this.backingStore.get("paymentMethodId");
    }
    /**
     * Gets the paymentTerm property value. The paymentTerm property
     * @return a {@link PaymentTerm}
     */
    @jakarta.annotation.Nullable
    public PaymentTerm getPaymentTerm() {
        return this.backingStore.get("paymentTerm");
    }
    /**
     * Gets the paymentTermsId property value. The paymentTermsId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getPaymentTermsId() {
        return this.backingStore.get("paymentTermsId");
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the picture property value. The picture property
     * @return a {@link java.util.List<Picture>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.backingStore.get("picture");
    }
    /**
     * Gets the shipmentMethod property value. The shipmentMethod property
     * @return a {@link ShipmentMethod}
     */
    @jakarta.annotation.Nullable
    public ShipmentMethod getShipmentMethod() {
        return this.backingStore.get("shipmentMethod");
    }
    /**
     * Gets the shipmentMethodId property value. The shipmentMethodId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getShipmentMethodId() {
        return this.backingStore.get("shipmentMethodId");
    }
    /**
     * Gets the taxAreaDisplayName property value. The taxAreaDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxAreaDisplayName() {
        return this.backingStore.get("taxAreaDisplayName");
    }
    /**
     * Gets the taxAreaId property value. The taxAreaId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getTaxAreaId() {
        return this.backingStore.get("taxAreaId");
    }
    /**
     * Gets the taxLiable property value. The taxLiable property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTaxLiable() {
        return this.backingStore.get("taxLiable");
    }
    /**
     * Gets the taxRegistrationNumber property value. The taxRegistrationNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxRegistrationNumber() {
        return this.backingStore.get("taxRegistrationNumber");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the website property value. The website property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.backingStore.get("website");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
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
        writer.writeObjectValue("shipmentMethod", this.getShipmentMethod());
        writer.writeUUIDValue("shipmentMethodId", this.getShipmentMethodId());
        writer.writeStringValue("taxAreaDisplayName", this.getTaxAreaDisplayName());
        writer.writeUUIDValue("taxAreaId", this.getTaxAreaId());
        writer.writeBooleanValue("taxLiable", this.getTaxLiable());
        writer.writeStringValue("taxRegistrationNumber", this.getTaxRegistrationNumber());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("website", this.getWebsite());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PostalAddressType value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     */
    public void setBlocked(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("blocked", value);
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final Currency value) {
        this.backingStore.set("currency", value);
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     */
    public void setCurrencyCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currencyCode", value);
    }
    /**
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     */
    public void setCurrencyId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("currencyId", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("number", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the paymentMethod property value. The paymentMethod property
     * @param value Value to set for the paymentMethod property.
     */
    public void setPaymentMethod(@jakarta.annotation.Nullable final PaymentMethod value) {
        this.backingStore.set("paymentMethod", value);
    }
    /**
     * Sets the paymentMethodId property value. The paymentMethodId property
     * @param value Value to set for the paymentMethodId property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("paymentMethodId", value);
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     */
    public void setPaymentTerm(@jakarta.annotation.Nullable final PaymentTerm value) {
        this.backingStore.set("paymentTerm", value);
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     */
    public void setPaymentTermsId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("paymentTermsId", value);
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     */
    public void setPicture(@jakarta.annotation.Nullable final java.util.List<Picture> value) {
        this.backingStore.set("picture", value);
    }
    /**
     * Sets the shipmentMethod property value. The shipmentMethod property
     * @param value Value to set for the shipmentMethod property.
     */
    public void setShipmentMethod(@jakarta.annotation.Nullable final ShipmentMethod value) {
        this.backingStore.set("shipmentMethod", value);
    }
    /**
     * Sets the shipmentMethodId property value. The shipmentMethodId property
     * @param value Value to set for the shipmentMethodId property.
     */
    public void setShipmentMethodId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("shipmentMethodId", value);
    }
    /**
     * Sets the taxAreaDisplayName property value. The taxAreaDisplayName property
     * @param value Value to set for the taxAreaDisplayName property.
     */
    public void setTaxAreaDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taxAreaDisplayName", value);
    }
    /**
     * Sets the taxAreaId property value. The taxAreaId property
     * @param value Value to set for the taxAreaId property.
     */
    public void setTaxAreaId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("taxAreaId", value);
    }
    /**
     * Sets the taxLiable property value. The taxLiable property
     * @param value Value to set for the taxLiable property.
     */
    public void setTaxLiable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("taxLiable", value);
    }
    /**
     * Sets the taxRegistrationNumber property value. The taxRegistrationNumber property
     * @param value Value to set for the taxRegistrationNumber property.
     */
    public void setTaxRegistrationNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taxRegistrationNumber", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the website property value. The website property
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("website", value);
    }
}
