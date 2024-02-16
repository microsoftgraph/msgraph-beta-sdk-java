package com.microsoft.graph.beta.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsLogRow implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SmsLogRow} and sets the default values.
     */
    public SmsLogRow() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsLogRow}
     */
    @jakarta.annotation.Nonnull
    public static SmsLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsLogRow();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the callCharge property value. Amount of money or cost of the SMS that is charged.
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getCallCharge() {
        return this.backingStore.get("callCharge");
    }
    /**
     * Gets the currency property value. Currency used to calculate the cost of the call. For details, see ISO 4217.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.backingStore.get("currency");
    }
    /**
     * Gets the destinationContext property value. Indicates whether the SMS was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationContext() {
        return this.backingStore.get("destinationContext");
    }
    /**
     * Gets the destinationName property value. Country or region of a phone number that received the SMS.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationName() {
        return this.backingStore.get("destinationName");
    }
    /**
     * Gets the destinationNumber property value. Partially obfuscated phone number that received the SMS. For details, see E.164.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationNumber() {
        return this.backingStore.get("destinationNumber");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("callCharge", (n) -> { this.setCallCharge(n.getBigDecimalValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("destinationContext", (n) -> { this.setDestinationContext(n.getStringValue()); });
        deserializerMap.put("destinationName", (n) -> { this.setDestinationName(n.getStringValue()); });
        deserializerMap.put("destinationNumber", (n) -> { this.setDestinationNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("licenseCapability", (n) -> { this.setLicenseCapability(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("otherPartyCountryCode", (n) -> { this.setOtherPartyCountryCode(n.getStringValue()); });
        deserializerMap.put("sentDateTime", (n) -> { this.setSentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsId", (n) -> { this.setSmsId(n.getStringValue()); });
        deserializerMap.put("smsType", (n) -> { this.setSmsType(n.getStringValue()); });
        deserializerMap.put("smsUnits", (n) -> { this.setSmsUnits(n.getIntegerValue()); });
        deserializerMap.put("sourceNumber", (n) -> { this.setSourceNumber(n.getStringValue()); });
        deserializerMap.put("tenantCountryCode", (n) -> { this.setTenantCountryCode(n.getStringValue()); });
        deserializerMap.put("userCountryCode", (n) -> { this.setUserCountryCode(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier (GUID) for the SMS.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the licenseCapability property value. The license used for the SMS.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLicenseCapability() {
        return this.backingStore.get("licenseCapability");
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
     * Gets the otherPartyCountryCode property value. For an outbound SMS, the country code of the receiver; otherwise (inbound SMS) the country code of the sender. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOtherPartyCountryCode() {
        return this.backingStore.get("otherPartyCountryCode");
    }
    /**
     * Gets the sentDateTime property value. The date and time when the SMS was sent.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentDateTime() {
        return this.backingStore.get("sentDateTime");
    }
    /**
     * Gets the smsId property value. SMS identifier. Not guaranteed to be unique.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmsId() {
        return this.backingStore.get("smsId");
    }
    /**
     * Gets the smsType property value. Type of SMS such as outbound or inbound.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmsType() {
        return this.backingStore.get("smsType");
    }
    /**
     * Gets the smsUnits property value. Number of SMS units sent/received.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsUnits() {
        return this.backingStore.get("smsUnits");
    }
    /**
     * Gets the sourceNumber property value. Partially obfuscated phone number that sent the SMS. For details, see E.164.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceNumber() {
        return this.backingStore.get("sourceNumber");
    }
    /**
     * Gets the tenantCountryCode property value. Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantCountryCode() {
        return this.backingStore.get("tenantCountryCode");
    }
    /**
     * Gets the userCountryCode property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserCountryCode() {
        return this.backingStore.get("userCountryCode");
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userId property value. The unique identifier (GUID) of the user in Microsoft Entra ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (sign-in name) in Microsoft Entra ID. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBigDecimalValue("callCharge", this.getCallCharge());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("destinationContext", this.getDestinationContext());
        writer.writeStringValue("destinationName", this.getDestinationName());
        writer.writeStringValue("destinationNumber", this.getDestinationNumber());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("licenseCapability", this.getLicenseCapability());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("otherPartyCountryCode", this.getOtherPartyCountryCode());
        writer.writeOffsetDateTimeValue("sentDateTime", this.getSentDateTime());
        writer.writeStringValue("smsId", this.getSmsId());
        writer.writeStringValue("smsType", this.getSmsType());
        writer.writeIntegerValue("smsUnits", this.getSmsUnits());
        writer.writeStringValue("sourceNumber", this.getSourceNumber());
        writer.writeStringValue("tenantCountryCode", this.getTenantCountryCode());
        writer.writeStringValue("userCountryCode", this.getUserCountryCode());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the callCharge property value. Amount of money or cost of the SMS that is charged.
     * @param value Value to set for the callCharge property.
     */
    public void setCallCharge(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("callCharge", value);
    }
    /**
     * Sets the currency property value. Currency used to calculate the cost of the call. For details, see ISO 4217.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currency", value);
    }
    /**
     * Sets the destinationContext property value. Indicates whether the SMS was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     * @param value Value to set for the destinationContext property.
     */
    public void setDestinationContext(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationContext", value);
    }
    /**
     * Sets the destinationName property value. Country or region of a phone number that received the SMS.
     * @param value Value to set for the destinationName property.
     */
    public void setDestinationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationName", value);
    }
    /**
     * Sets the destinationNumber property value. Partially obfuscated phone number that received the SMS. For details, see E.164.
     * @param value Value to set for the destinationNumber property.
     */
    public void setDestinationNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationNumber", value);
    }
    /**
     * Sets the id property value. Unique identifier (GUID) for the SMS.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the licenseCapability property value. The license used for the SMS.
     * @param value Value to set for the licenseCapability property.
     */
    public void setLicenseCapability(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("licenseCapability", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the otherPartyCountryCode property value. For an outbound SMS, the country code of the receiver; otherwise (inbound SMS) the country code of the sender. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the otherPartyCountryCode property.
     */
    public void setOtherPartyCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("otherPartyCountryCode", value);
    }
    /**
     * Sets the sentDateTime property value. The date and time when the SMS was sent.
     * @param value Value to set for the sentDateTime property.
     */
    public void setSentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sentDateTime", value);
    }
    /**
     * Sets the smsId property value. SMS identifier. Not guaranteed to be unique.
     * @param value Value to set for the smsId property.
     */
    public void setSmsId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("smsId", value);
    }
    /**
     * Sets the smsType property value. Type of SMS such as outbound or inbound.
     * @param value Value to set for the smsType property.
     */
    public void setSmsType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("smsType", value);
    }
    /**
     * Sets the smsUnits property value. Number of SMS units sent/received.
     * @param value Value to set for the smsUnits property.
     */
    public void setSmsUnits(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("smsUnits", value);
    }
    /**
     * Sets the sourceNumber property value. Partially obfuscated phone number that sent the SMS. For details, see E.164.
     * @param value Value to set for the sourceNumber property.
     */
    public void setSourceNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceNumber", value);
    }
    /**
     * Sets the tenantCountryCode property value. Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the tenantCountryCode property.
     */
    public void setTenantCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantCountryCode", value);
    }
    /**
     * Sets the userCountryCode property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the userCountryCode property.
     */
    public void setUserCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userCountryCode", value);
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userId property value. The unique identifier (GUID) of the user in Microsoft Entra ID.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (sign-in name) in Microsoft Entra ID. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
