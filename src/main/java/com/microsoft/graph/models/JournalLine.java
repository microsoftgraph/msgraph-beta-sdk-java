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
public class JournalLine extends Entity implements Parsable {
    /** The account property */
    private Account account;
    /** The accountId property */
    private UUID accountId;
    /** The accountNumber property */
    private String accountNumber;
    /** The amount property */
    private BigDecimal amount;
    /** The comment property */
    private String comment;
    /** The description property */
    private String description;
    /** The documentNumber property */
    private String documentNumber;
    /** The externalDocumentNumber property */
    private String externalDocumentNumber;
    /** The journalDisplayName property */
    private String journalDisplayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The lineNumber property */
    private Integer lineNumber;
    /** The postingDate property */
    private LocalDate postingDate;
    /**
     * Instantiates a new journalLine and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public JournalLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a journalLine
     */
    @javax.annotation.Nonnull
    public static JournalLine createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JournalLine();
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
     * Gets the amount property value. The amount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Gets the comment property value. The comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this.comment;
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
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this.externalDocumentNumber;
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
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getBigDecimalValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("documentNumber", (n) -> { this.setDocumentNumber(n.getStringValue()); });
        deserializerMap.put("externalDocumentNumber", (n) -> { this.setExternalDocumentNumber(n.getStringValue()); });
        deserializerMap.put("journalDisplayName", (n) -> { this.setJournalDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lineNumber", (n) -> { this.setLineNumber(n.getIntegerValue()); });
        deserializerMap.put("postingDate", (n) -> { this.setPostingDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the journalDisplayName property value. The journalDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJournalDisplayName() {
        return this.journalDisplayName;
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
     * Gets the lineNumber property value. The lineNumber property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLineNumber() {
        return this.lineNumber;
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
        writer.writeBigDecimalValue("amount", this.getAmount());
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("documentNumber", this.getDocumentNumber());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeStringValue("journalDisplayName", this.getJournalDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("lineNumber", this.getLineNumber());
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
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.amount = value;
    }
    /**
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this.comment = value;
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
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalDocumentNumber(@javax.annotation.Nullable final String value) {
        this.externalDocumentNumber = value;
    }
    /**
     * Sets the journalDisplayName property value. The journalDisplayName property
     * @param value Value to set for the journalDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJournalDisplayName(@javax.annotation.Nullable final String value) {
        this.journalDisplayName = value;
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
     * Sets the lineNumber property value. The lineNumber property
     * @param value Value to set for the lineNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLineNumber(@javax.annotation.Nullable final Integer value) {
        this.lineNumber = value;
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
