package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GeneralLedgerEntry implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new GeneralLedgerEntry and sets the default values.
     */
    public GeneralLedgerEntry() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GeneralLedgerEntry
     */
    @jakarta.annotation.Nonnull
    public static GeneralLedgerEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GeneralLedgerEntry();
    }
    /**
     * Gets the account property value. The account property
     * @return a Account
     */
    @jakarta.annotation.Nullable
    public Account getAccount() {
        return this.BackingStore.get("account");
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAccountId() {
        return this.BackingStore.get("accountId");
    }
    /**
     * Gets the accountNumber property value. The accountNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountNumber() {
        return this.BackingStore.get("accountNumber");
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
     * Gets the creditAmount property value. The creditAmount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getCreditAmount() {
        return this.BackingStore.get("creditAmount");
    }
    /**
     * Gets the debitAmount property value. The debitAmount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDebitAmount() {
        return this.BackingStore.get("debitAmount");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the documentNumber property value. The documentNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDocumentNumber() {
        return this.BackingStore.get("documentNumber");
    }
    /**
     * Gets the documentType property value. The documentType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDocumentType() {
        return this.BackingStore.get("documentType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getUUIDValue()); });
        deserializerMap.put("accountNumber", (n) -> { this.setAccountNumber(n.getStringValue()); });
        deserializerMap.put("creditAmount", (n) -> { this.setCreditAmount(n.getBigDecimalValue()); });
        deserializerMap.put("debitAmount", (n) -> { this.setDebitAmount(n.getBigDecimalValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("documentNumber", (n) -> { this.setDocumentNumber(n.getStringValue()); });
        deserializerMap.put("documentType", (n) -> { this.setDocumentType(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("postingDate", (n) -> { this.setPostingDate(n.getLocalDateValue()); });
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
     * Gets the postingDate property value. The postingDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getPostingDate() {
        return this.BackingStore.get("postingDate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeUUIDValue("accountId", this.getAccountId());
        writer.writeStringValue("accountNumber", this.getAccountNumber());
        writer.writeBigDecimalValue("creditAmount", this.getCreditAmount());
        writer.writeBigDecimalValue("debitAmount", this.getDebitAmount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("documentNumber", this.getDocumentNumber());
        writer.writeStringValue("documentType", this.getDocumentType());
        writer.writeUUIDValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalDateValue("postingDate", this.getPostingDate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final Account value) {
        this.BackingStore.set("account", value);
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("accountId", value);
    }
    /**
     * Sets the accountNumber property value. The accountNumber property
     * @param value Value to set for the accountNumber property.
     */
    public void setAccountNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("accountNumber", value);
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
     * Sets the creditAmount property value. The creditAmount property
     * @param value Value to set for the creditAmount property.
     */
    public void setCreditAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("creditAmount", value);
    }
    /**
     * Sets the debitAmount property value. The debitAmount property
     * @param value Value to set for the debitAmount property.
     */
    public void setDebitAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("debitAmount", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the documentNumber property value. The documentNumber property
     * @param value Value to set for the documentNumber property.
     */
    public void setDocumentNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("documentNumber", value);
    }
    /**
     * Sets the documentType property value. The documentType property
     * @param value Value to set for the documentType property.
     */
    public void setDocumentType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("documentType", value);
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
    /**
     * Sets the postingDate property value. The postingDate property
     * @param value Value to set for the postingDate property.
     */
    public void setPostingDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("postingDate", value);
    }
}
