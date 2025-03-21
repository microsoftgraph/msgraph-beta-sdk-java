package com.microsoft.graph.beta.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PstnOnlineMeetingDialoutReport implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PstnOnlineMeetingDialoutReport} and sets the default values.
     */
    public PstnOnlineMeetingDialoutReport() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PstnOnlineMeetingDialoutReport}
     */
    @jakarta.annotation.Nonnull
    public static PstnOnlineMeetingDialoutReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnOnlineMeetingDialoutReport();
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
     * Gets the currency property value. Currency used to calculate the cost of the call. For details, see ISO 4217.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.backingStore.get("currency");
    }
    /**
     * Gets the destinationContext property value. Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user&apos;s location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationContext() {
        return this.backingStore.get("destinationContext");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("destinationContext", (n) -> { this.setDestinationContext(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalCallCharge", (n) -> { this.setTotalCallCharge(n.getBigDecimalValue()); });
        deserializerMap.put("totalCalls", (n) -> { this.setTotalCalls(n.getIntegerValue()); });
        deserializerMap.put("totalCallSeconds", (n) -> { this.setTotalCallSeconds(n.getIntegerValue()); });
        deserializerMap.put("usageLocation", (n) -> { this.setUsageLocation(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the totalCallCharge property value. Total costs of all the calls within the selected time range, including call charges and connection fees.
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTotalCallCharge() {
        return this.backingStore.get("totalCallCharge");
    }
    /**
     * Gets the totalCalls property value. Total number of dial-out calls within the selected time range.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCalls() {
        return this.backingStore.get("totalCalls");
    }
    /**
     * Gets the totalCallSeconds property value. Total duration of all the calls within the selected time range, in seconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCallSeconds() {
        return this.backingStore.get("totalCallSeconds");
    }
    /**
     * Gets the usageLocation property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsageLocation() {
        return this.backingStore.get("usageLocation");
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
     * Gets the userPrincipalName property value. The user principal name (sign-in name) in Microsoft Entra ID. This is usually the same as the user&apos;s SIP address, and can be same as the user&apos;s e-mail address.
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
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("destinationContext", this.getDestinationContext());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBigDecimalValue("totalCallCharge", this.getTotalCallCharge());
        writer.writeIntegerValue("totalCalls", this.getTotalCalls());
        writer.writeIntegerValue("totalCallSeconds", this.getTotalCallSeconds());
        writer.writeStringValue("usageLocation", this.getUsageLocation());
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
     * Sets the currency property value. Currency used to calculate the cost of the call. For details, see ISO 4217.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currency", value);
    }
    /**
     * Sets the destinationContext property value. Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user&apos;s location.
     * @param value Value to set for the destinationContext property.
     */
    public void setDestinationContext(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationContext", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the totalCallCharge property value. Total costs of all the calls within the selected time range, including call charges and connection fees.
     * @param value Value to set for the totalCallCharge property.
     */
    public void setTotalCallCharge(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("totalCallCharge", value);
    }
    /**
     * Sets the totalCalls property value. Total number of dial-out calls within the selected time range.
     * @param value Value to set for the totalCalls property.
     */
    public void setTotalCalls(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalCalls", value);
    }
    /**
     * Sets the totalCallSeconds property value. Total duration of all the calls within the selected time range, in seconds.
     * @param value Value to set for the totalCallSeconds property.
     */
    public void setTotalCallSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalCallSeconds", value);
    }
    /**
     * Sets the usageLocation property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the usageLocation property.
     */
    public void setUsageLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("usageLocation", value);
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
     * Sets the userPrincipalName property value. The user principal name (sign-in name) in Microsoft Entra ID. This is usually the same as the user&apos;s SIP address, and can be same as the user&apos;s e-mail address.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
