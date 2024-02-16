package com.microsoft.graph.beta.models;

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
public class CustomerPayment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CustomerPayment} and sets the default values.
     */
    public CustomerPayment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerPayment}
     */
    @jakarta.annotation.Nonnull
    public static CustomerPayment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerPayment();
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
     * Gets the amount property value. The amount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmount() {
        return this.backingStore.get("amount");
    }
    /**
     * Gets the appliesToInvoiceId property value. The appliesToInvoiceId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getAppliesToInvoiceId() {
        return this.backingStore.get("appliesToInvoiceId");
    }
    /**
     * Gets the appliesToInvoiceNumber property value. The appliesToInvoiceNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppliesToInvoiceNumber() {
        return this.backingStore.get("appliesToInvoiceNumber");
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
     * Gets the comment property value. The comment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * Gets the contactId property value. The contactId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactId() {
        return this.backingStore.get("contactId");
    }
    /**
     * Gets the customer property value. The customer property
     * @return a {@link Customer}
     */
    @jakarta.annotation.Nullable
    public Customer getCustomer() {
        return this.backingStore.get("customer");
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getCustomerId() {
        return this.backingStore.get("customerId");
    }
    /**
     * Gets the customerNumber property value. The customerNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerNumber() {
        return this.backingStore.get("customerNumber");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the documentNumber property value. The documentNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentNumber() {
        return this.backingStore.get("documentNumber");
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this.backingStore.get("externalDocumentNumber");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getBigDecimalValue()); });
        deserializerMap.put("appliesToInvoiceId", (n) -> { this.setAppliesToInvoiceId(n.getUUIDValue()); });
        deserializerMap.put("appliesToInvoiceNumber", (n) -> { this.setAppliesToInvoiceNumber(n.getStringValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("contactId", (n) -> { this.setContactId(n.getStringValue()); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(Customer::createFromDiscriminatorValue)); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getUUIDValue()); });
        deserializerMap.put("customerNumber", (n) -> { this.setCustomerNumber(n.getStringValue()); });
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
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the journalDisplayName property value. The journalDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJournalDisplayName() {
        return this.backingStore.get("journalDisplayName");
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
     * Gets the lineNumber property value. The lineNumber property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLineNumber() {
        return this.backingStore.get("lineNumber");
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
     * Gets the postingDate property value. The postingDate property
     * @return a {@link LocalDate}
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
        writer.writeBigDecimalValue("amount", this.getAmount());
        writer.writeUUIDValue("appliesToInvoiceId", this.getAppliesToInvoiceId());
        writer.writeStringValue("appliesToInvoiceNumber", this.getAppliesToInvoiceNumber());
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("contactId", this.getContactId());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeUUIDValue("customerId", this.getCustomerId());
        writer.writeStringValue("customerNumber", this.getCustomerNumber());
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
     * Sets the appliesToInvoiceId property value. The appliesToInvoiceId property
     * @param value Value to set for the appliesToInvoiceId property.
     */
    public void setAppliesToInvoiceId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("appliesToInvoiceId", value);
    }
    /**
     * Sets the appliesToInvoiceNumber property value. The appliesToInvoiceNumber property
     * @param value Value to set for the appliesToInvoiceNumber property.
     */
    public void setAppliesToInvoiceNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appliesToInvoiceNumber", value);
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
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the contactId property value. The contactId property
     * @param value Value to set for the contactId property.
     */
    public void setContactId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contactId", value);
    }
    /**
     * Sets the customer property value. The customer property
     * @param value Value to set for the customer property.
     */
    public void setCustomer(@jakarta.annotation.Nullable final Customer value) {
        this.backingStore.set("customer", value);
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     */
    public void setCustomerId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("customerId", value);
    }
    /**
     * Sets the customerNumber property value. The customerNumber property
     * @param value Value to set for the customerNumber property.
     */
    public void setCustomerNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerNumber", value);
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
