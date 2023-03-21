package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class GeneralLedgerEntry extends Entity implements Parsable {
    /** The account property */
    private Account account;
    /** The accountId property */
    private UUID accountId;
    /** The accountNumber property */
    private String accountNumber;
    /** The creditAmount property */
    private BigDecimal creditAmount;
    /** The debitAmount property */
    private BigDecimal debitAmount;
    /** The description property */
    private String description;
    /** The documentNumber property */
    private String documentNumber;
    /** The documentType property */
    private String documentType;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The postingDate property */
    private LocalDate postingDate;
    /**
     * Instantiates a new GeneralLedgerEntry and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GeneralLedgerEntry() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GeneralLedgerEntry
     */
    @javax.annotation.Nonnull
    public static GeneralLedgerEntry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GeneralLedgerEntry();
    }
    /**
     * Gets the account property value. The account property
     * @return a account
     */
    @javax.annotation.Nullable
    public Account getAccount() {
        return this.account;
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the accountNumber property value. The accountNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountNumber() {
        return this.accountNumber;
    }
    /**
     * Gets the creditAmount property value. The creditAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getCreditAmount() {
        return this.creditAmount;
    }
    /**
     * Gets the debitAmount property value. The debitAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDebitAmount() {
        return this.debitAmount;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the documentNumber property value. The documentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentNumber() {
        return this.documentNumber;
    }
    /**
     * Gets the documentType property value. The documentType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentType() {
        return this.documentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getUUIDValue()); });
        deserializerMap.put("accountNumber", (n) -> { this.setAccountNumber(n.getStringValue()); });
        deserializerMap.put("creditAmount", (n) -> { this.setCreditAmount(n.getBigDecimalValue()); });
        deserializerMap.put("debitAmount", (n) -> { this.setDebitAmount(n.getBigDecimalValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("documentNumber", (n) -> { this.setDocumentNumber(n.getStringValue()); });
        deserializerMap.put("documentType", (n) -> { this.setDocumentType(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("postingDate", (n) -> { this.setPostingDate(n.getLocalDateValue()); });
        return deserializerMap;
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
     * Gets the postingDate property value. The postingDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getPostingDate() {
        return this.postingDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeUUIDValue("accountId", this.getAccountId());
        writer.writeStringValue("accountNumber", this.getAccountNumber());
        writer.writeBigDecimalValue("creditAmount", this.getCreditAmount());
        writer.writeBigDecimalValue("debitAmount", this.getDebitAmount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("documentNumber", this.getDocumentNumber());
        writer.writeStringValue("documentType", this.getDocumentType());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeLocalDateValue("postingDate", this.getPostingDate());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccount(@javax.annotation.Nullable final Account value) {
        this.account = value;
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final UUID value) {
        this.accountId = value;
    }
    /**
     * Sets the accountNumber property value. The accountNumber property
     * @param value Value to set for the accountNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountNumber(@javax.annotation.Nullable final String value) {
        this.accountNumber = value;
    }
    /**
     * Sets the creditAmount property value. The creditAmount property
     * @param value Value to set for the creditAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreditAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.creditAmount = value;
    }
    /**
     * Sets the debitAmount property value. The debitAmount property
     * @param value Value to set for the debitAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDebitAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.debitAmount = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the documentNumber property value. The documentNumber property
     * @param value Value to set for the documentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentNumber(@javax.annotation.Nullable final String value) {
        this.documentNumber = value;
    }
    /**
     * Sets the documentType property value. The documentType property
     * @param value Value to set for the documentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentType(@javax.annotation.Nullable final String value) {
        this.documentType = value;
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
     * Sets the postingDate property value. The postingDate property
     * @param value Value to set for the postingDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostingDate(@javax.annotation.Nullable final LocalDate value) {
        this.postingDate = value;
    }
}
