package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class JournalLine extends Entity implements Parsable {
    /** The account property */
    private Account _account;
    /** The accountId property */
    private String _accountId;
    /** The accountNumber property */
    private String _accountNumber;
    /** The amount property */
    private BigDecimal _amount;
    /** The comment property */
    private String _comment;
    /** The description property */
    private String _description;
    /** The documentNumber property */
    private String _documentNumber;
    /** The externalDocumentNumber property */
    private String _externalDocumentNumber;
    /** The journalDisplayName property */
    private String _journalDisplayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The lineNumber property */
    private Integer _lineNumber;
    /** The postingDate property */
    private LocalDate _postingDate;
    /**
     * Instantiates a new journalLine and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public JournalLine() {
        super();
        this.setOdataType("#microsoft.graph.journalLine");
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
        return this._account;
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this._accountId;
    }
    /**
     * Gets the accountNumber property value. The accountNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountNumber() {
        return this._accountNumber;
    }
    /**
     * Gets the amount property value. The amount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmount() {
        return this._amount;
    }
    /**
     * Gets the comment property value. The comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the documentNumber property value. The documentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentNumber() {
        return this._documentNumber;
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this._externalDocumentNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final JournalLine currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("account", (n) -> { currentObject.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
            this.put("accountId", (n) -> { currentObject.setAccountId(n.getStringValue()); });
            this.put("accountNumber", (n) -> { currentObject.setAccountNumber(n.getStringValue()); });
            this.put("amount", (n) -> { currentObject.setAmount(n.getBigDecimalValue()); });
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("documentNumber", (n) -> { currentObject.setDocumentNumber(n.getStringValue()); });
            this.put("externalDocumentNumber", (n) -> { currentObject.setExternalDocumentNumber(n.getStringValue()); });
            this.put("journalDisplayName", (n) -> { currentObject.setJournalDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lineNumber", (n) -> { currentObject.setLineNumber(n.getIntegerValue()); });
            this.put("postingDate", (n) -> { currentObject.setPostingDate(n.getLocalDateValue()); });
        }};
    }
    /**
     * Gets the journalDisplayName property value. The journalDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJournalDisplayName() {
        return this._journalDisplayName;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lineNumber property value. The lineNumber property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLineNumber() {
        return this._lineNumber;
    }
    /**
     * Gets the postingDate property value. The postingDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getPostingDate() {
        return this._postingDate;
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
        writer.writeStringValue("accountId", this.getAccountId());
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
        this._account = value;
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this._accountId = value;
    }
    /**
     * Sets the accountNumber property value. The accountNumber property
     * @param value Value to set for the accountNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountNumber(@javax.annotation.Nullable final String value) {
        this._accountNumber = value;
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._amount = value;
    }
    /**
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the documentNumber property value. The documentNumber property
     * @param value Value to set for the documentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentNumber(@javax.annotation.Nullable final String value) {
        this._documentNumber = value;
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalDocumentNumber(@javax.annotation.Nullable final String value) {
        this._externalDocumentNumber = value;
    }
    /**
     * Sets the journalDisplayName property value. The journalDisplayName property
     * @param value Value to set for the journalDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJournalDisplayName(@javax.annotation.Nullable final String value) {
        this._journalDisplayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lineNumber property value. The lineNumber property
     * @param value Value to set for the lineNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLineNumber(@javax.annotation.Nullable final Integer value) {
        this._lineNumber = value;
    }
    /**
     * Sets the postingDate property value. The postingDate property
     * @param value Value to set for the postingDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostingDate(@javax.annotation.Nullable final LocalDate value) {
        this._postingDate = value;
    }
}
