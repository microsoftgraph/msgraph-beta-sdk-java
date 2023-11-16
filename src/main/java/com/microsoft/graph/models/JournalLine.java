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
public class JournalLine implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new JournalLine and sets the default values.
     */
    public JournalLine() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JournalLine
     */
    @jakarta.annotation.Nonnull
    public static JournalLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JournalLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a Account
     */
    @jakarta.annotation.Nullable
    public Account getAccount() {
        return this.backingStore.get("account");
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAccountId() {
        return this.backingStore.get("accountId");
    }
    /**
     * Gets the accountNumber property value. The accountNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountNumber() {
        return this.backingStore.get("accountNumber");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the amount property value. The amount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmount() {
        return this.backingStore.get("amount");
    }
    /**
     * Gets the comment property value. The comment property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the documentNumber property value. The documentNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDocumentNumber() {
        return this.backingStore.get("documentNumber");
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this.backingStore.get("externalDocumentNumber");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getUUIDValue()); });
        deserializerMap.put("accountNumber", (n) -> { this.setAccountNumber(n.getStringValue()); });
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getBigDecimalValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("documentNumber", (n) -> { this.setDocumentNumber(n.getStringValue()); });
        deserializerMap.put("externalDocumentNumber", (n) -> { this.setExternalDocumentNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("journalDisplayName", (n) -> { this.setJournalDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lineNumber", (n) -> { this.setLineNumber(n.getIntegerValue()); });
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
        return this.backingStore.get("id");
    }
    /**
     * Gets the journalDisplayName property value. The journalDisplayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJournalDisplayName() {
        return this.backingStore.get("journalDisplayName");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lineNumber property value. The lineNumber property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLineNumber() {
        return this.backingStore.get("lineNumber");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the postingDate property value. The postingDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getPostingDate() {
        return this.backingStore.get("postingDate");
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
        writer.writeBigDecimalValue("amount", this.getAmount());
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("documentNumber", this.getDocumentNumber());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("journalDisplayName", this.getJournalDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("lineNumber", this.getLineNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalDateValue("postingDate", this.getPostingDate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final Account value) {
        this.backingStore.set("account", value);
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("accountId", value);
    }
    /**
     * Sets the accountNumber property value. The accountNumber property
     * @param value Value to set for the accountNumber property.
     */
    public void setAccountNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountNumber", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("amount", value);
    }
    /**
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the documentNumber property value. The documentNumber property
     * @param value Value to set for the documentNumber property.
     */
    public void setDocumentNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("documentNumber", value);
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     */
    public void setExternalDocumentNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalDocumentNumber", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the journalDisplayName property value. The journalDisplayName property
     * @param value Value to set for the journalDisplayName property.
     */
    public void setJournalDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("journalDisplayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lineNumber property value. The lineNumber property
     * @param value Value to set for the lineNumber property.
     */
    public void setLineNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("lineNumber", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the postingDate property value. The postingDate property
     * @param value Value to set for the postingDate property.
     */
    public void setPostingDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("postingDate", value);
    }
}
