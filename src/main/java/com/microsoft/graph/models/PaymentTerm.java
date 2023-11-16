package com.microsoft.graph.models;

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
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentTerm implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new PaymentTerm and sets the default values.
     */
    public PaymentTerm() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PaymentTerm
     */
    @jakarta.annotation.Nonnull
    public static PaymentTerm createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentTerm();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the calculateDiscountOnCreditMemos property value. The calculateDiscountOnCreditMemos property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCalculateDiscountOnCreditMemos() {
        return this.BackingStore.get("calculateDiscountOnCreditMemos");
    }
    /**
     * Gets the code property value. The code property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.BackingStore.get("code");
    }
    /**
     * Gets the discountDateCalculation property value. The discountDateCalculation property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDiscountDateCalculation() {
        return this.BackingStore.get("discountDateCalculation");
    }
    /**
     * Gets the discountPercent property value. The discountPercent property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this.BackingStore.get("discountPercent");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the dueDateCalculation property value. The dueDateCalculation property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDueDateCalculation() {
        return this.BackingStore.get("dueDateCalculation");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("calculateDiscountOnCreditMemos", (n) -> { this.setCalculateDiscountOnCreditMemos(n.getBooleanValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("discountDateCalculation", (n) -> { this.setDiscountDateCalculation(n.getStringValue()); });
        deserializerMap.put("discountPercent", (n) -> { this.setDiscountPercent(n.getBigDecimalValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateCalculation", (n) -> { this.setDueDateCalculation(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.BackingStore.get("id");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("calculateDiscountOnCreditMemos", this.getCalculateDiscountOnCreditMemos());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("discountDateCalculation", this.getDiscountDateCalculation());
        writer.writeBigDecimalValue("discountPercent", this.getDiscountPercent());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("dueDateCalculation", this.getDueDateCalculation());
        writer.writeUUIDValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the calculateDiscountOnCreditMemos property value. The calculateDiscountOnCreditMemos property
     * @param value Value to set for the calculateDiscountOnCreditMemos property.
     */
    public void setCalculateDiscountOnCreditMemos(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("calculateDiscountOnCreditMemos", value);
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("code", value);
    }
    /**
     * Sets the discountDateCalculation property value. The discountDateCalculation property
     * @param value Value to set for the discountDateCalculation property.
     */
    public void setDiscountDateCalculation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("discountDateCalculation", value);
    }
    /**
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     */
    public void setDiscountPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("discountPercent", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the dueDateCalculation property value. The dueDateCalculation property
     * @param value Value to set for the dueDateCalculation property.
     */
    public void setDueDateCalculation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("dueDateCalculation", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("id", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
