package microsoft.graph.models;

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
/** Provides operations to manage the collection of accessReview entities. */
public class GeneralLedgerEntry extends Entity implements Parsable {
    /** The account property */
    private Account _account;
    /** The accountId property */
    private String _accountId;
    /** The accountNumber property */
    private String _accountNumber;
    /** The creditAmount property */
    private BigDecimal _creditAmount;
    /** The debitAmount property */
    private BigDecimal _debitAmount;
    /** The description property */
    private String _description;
    /** The documentNumber property */
    private String _documentNumber;
    /** The documentType property */
    private String _documentType;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The postingDate property */
    private LocalDate _postingDate;
    /**
     * Instantiates a new generalLedgerEntry and sets the default values.
     * @return a void
     */
    public GeneralLedgerEntry() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a generalLedgerEntry
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
     * Gets the creditAmount property value. The creditAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getCreditAmount() {
        return this._creditAmount;
    }
    /**
     * Gets the debitAmount property value. The debitAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDebitAmount() {
        return this._debitAmount;
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
     * Gets the documentType property value. The documentType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentType() {
        return this._documentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GeneralLedgerEntry currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("account", (n) -> { currentObject.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
            this.put("accountId", (n) -> { currentObject.setAccountId(n.getStringValue()); });
            this.put("accountNumber", (n) -> { currentObject.setAccountNumber(n.getStringValue()); });
            this.put("creditAmount", (n) -> { currentObject.setCreditAmount(n.getBigDecimalValue()); });
            this.put("debitAmount", (n) -> { currentObject.setDebitAmount(n.getBigDecimalValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("documentNumber", (n) -> { currentObject.setDocumentNumber(n.getStringValue()); });
            this.put("documentType", (n) -> { currentObject.setDocumentType(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("postingDate", (n) -> { currentObject.setPostingDate(n.getLocalDateValue()); });
        }};
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeStringValue("accountId", this.getAccountId());
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
    public void setAccount(@javax.annotation.Nullable final Account value) {
        this._account = value;
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this._accountId = value;
    }
    /**
     * Sets the accountNumber property value. The accountNumber property
     * @param value Value to set for the accountNumber property.
     * @return a void
     */
    public void setAccountNumber(@javax.annotation.Nullable final String value) {
        this._accountNumber = value;
    }
    /**
     * Sets the creditAmount property value. The creditAmount property
     * @param value Value to set for the creditAmount property.
     * @return a void
     */
    public void setCreditAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._creditAmount = value;
    }
    /**
     * Sets the debitAmount property value. The debitAmount property
     * @param value Value to set for the debitAmount property.
     * @return a void
     */
    public void setDebitAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._debitAmount = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the documentNumber property value. The documentNumber property
     * @param value Value to set for the documentNumber property.
     * @return a void
     */
    public void setDocumentNumber(@javax.annotation.Nullable final String value) {
        this._documentNumber = value;
    }
    /**
     * Sets the documentType property value. The documentType property
     * @param value Value to set for the documentType property.
     * @return a void
     */
    public void setDocumentType(@javax.annotation.Nullable final String value) {
        this._documentType = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the postingDate property value. The postingDate property
     * @param value Value to set for the postingDate property.
     * @return a void
     */
    public void setPostingDate(@javax.annotation.Nullable final LocalDate value) {
        this._postingDate = value;
    }
}
