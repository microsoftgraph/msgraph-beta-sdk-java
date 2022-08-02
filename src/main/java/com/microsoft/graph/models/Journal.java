package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class Journal extends Entity implements Parsable {
    /** The account property */
    private Account _account;
    /** The balancingAccountId property */
    private String _balancingAccountId;
    /** The balancingAccountNumber property */
    private String _balancingAccountNumber;
    /** The code property */
    private String _code;
    /** The displayName property */
    private String _displayName;
    /** The journalLines property */
    private java.util.List<JournalLine> _journalLines;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new journal and sets the default values.
     * @return a void
     */
    public Journal() {
        super();
        this.setOdataType("#microsoft.graph.journal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a journal
     */
    @javax.annotation.Nonnull
    public static Journal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Journal();
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
     * Gets the balancingAccountId property value. The balancingAccountId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBalancingAccountId() {
        return this._balancingAccountId;
    }
    /**
     * Gets the balancingAccountNumber property value. The balancingAccountNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBalancingAccountNumber() {
        return this._balancingAccountNumber;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Journal currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("account", (n) -> { currentObject.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
            this.put("balancingAccountId", (n) -> { currentObject.setBalancingAccountId(n.getStringValue()); });
            this.put("balancingAccountNumber", (n) -> { currentObject.setBalancingAccountNumber(n.getStringValue()); });
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("journalLines", (n) -> { currentObject.setJournalLines(n.getCollectionOfObjectValues(JournalLine::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the journalLines property value. The journalLines property
     * @return a journalLine
     */
    @javax.annotation.Nullable
    public java.util.List<JournalLine> getJournalLines() {
        return this._journalLines;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeStringValue("balancingAccountId", this.getBalancingAccountId());
        writer.writeStringValue("balancingAccountNumber", this.getBalancingAccountNumber());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("journalLines", this.getJournalLines());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
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
     * Sets the balancingAccountId property value. The balancingAccountId property
     * @param value Value to set for the balancingAccountId property.
     * @return a void
     */
    public void setBalancingAccountId(@javax.annotation.Nullable final String value) {
        this._balancingAccountId = value;
    }
    /**
     * Sets the balancingAccountNumber property value. The balancingAccountNumber property
     * @param value Value to set for the balancingAccountNumber property.
     * @return a void
     */
    public void setBalancingAccountNumber(@javax.annotation.Nullable final String value) {
        this._balancingAccountNumber = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the journalLines property value. The journalLines property
     * @param value Value to set for the journalLines property.
     * @return a void
     */
    public void setJournalLines(@javax.annotation.Nullable final java.util.List<JournalLine> value) {
        this._journalLines = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
