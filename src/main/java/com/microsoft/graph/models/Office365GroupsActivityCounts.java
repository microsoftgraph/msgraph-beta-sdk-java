package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365GroupsActivityCounts extends Entity implements Parsable {
    /** The number of emails received by Group mailboxes.  */
    private Long _exchangeEmailsReceived;
    /** The date on which a number of emails were sent to a group mailbox or a number of messages were posted, read, or liked in a Yammer group  */
    private LocalDate _reportDate;
    /** The number of days the report covers.  */
    private String _reportPeriod;
    /** The latest date of the content.  */
    private LocalDate _reportRefreshDate;
    /** The number of messages liked in Yammer groups.  */
    private Long _yammerMessagesLiked;
    /** The number of messages posted to Yammer groups.  */
    private Long _yammerMessagesPosted;
    /** The number of messages read in Yammer groups.  */
    private Long _yammerMessagesRead;
    /**
     * Instantiates a new office365GroupsActivityCounts and sets the default values.
     * @return a void
     */
    public Office365GroupsActivityCounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a office365GroupsActivityCounts
     */
    @javax.annotation.Nonnull
    public static Office365GroupsActivityCounts createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityCounts();
    }
    /**
     * Gets the exchangeEmailsReceived property value. The number of emails received by Group mailboxes.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchangeEmailsReceived() {
        return this._exchangeEmailsReceived;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Office365GroupsActivityCounts currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("exchangeEmailsReceived", (n) -> { currentObject.setExchangeEmailsReceived(n.getLongValue()); });
            this.put("reportDate", (n) -> { currentObject.setReportDate(n.getLocalDateValue()); });
            this.put("reportPeriod", (n) -> { currentObject.setReportPeriod(n.getStringValue()); });
            this.put("reportRefreshDate", (n) -> { currentObject.setReportRefreshDate(n.getLocalDateValue()); });
            this.put("yammerMessagesLiked", (n) -> { currentObject.setYammerMessagesLiked(n.getLongValue()); });
            this.put("yammerMessagesPosted", (n) -> { currentObject.setYammerMessagesPosted(n.getLongValue()); });
            this.put("yammerMessagesRead", (n) -> { currentObject.setYammerMessagesRead(n.getLongValue()); });
        }};
    }
    /**
     * Gets the reportDate property value. The date on which a number of emails were sent to a group mailbox or a number of messages were posted, read, or liked in a Yammer group
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportDate() {
        return this._reportDate;
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportPeriod() {
        return this._reportPeriod;
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this._reportRefreshDate;
    }
    /**
     * Gets the yammerMessagesLiked property value. The number of messages liked in Yammer groups.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerMessagesLiked() {
        return this._yammerMessagesLiked;
    }
    /**
     * Gets the yammerMessagesPosted property value. The number of messages posted to Yammer groups.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerMessagesPosted() {
        return this._yammerMessagesPosted;
    }
    /**
     * Gets the yammerMessagesRead property value. The number of messages read in Yammer groups.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerMessagesRead() {
        return this._yammerMessagesRead;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("exchangeEmailsReceived", this.getExchangeEmailsReceived());
        writer.writeLocalDateValue("reportDate", this.getReportDate());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("yammerMessagesLiked", this.getYammerMessagesLiked());
        writer.writeLongValue("yammerMessagesPosted", this.getYammerMessagesPosted());
        writer.writeLongValue("yammerMessagesRead", this.getYammerMessagesRead());
    }
    /**
     * Sets the exchangeEmailsReceived property value. The number of emails received by Group mailboxes.
     * @param value Value to set for the exchangeEmailsReceived property.
     * @return a void
     */
    public void setExchangeEmailsReceived(@javax.annotation.Nullable final Long value) {
        this._exchangeEmailsReceived = value;
    }
    /**
     * Sets the reportDate property value. The date on which a number of emails were sent to a group mailbox or a number of messages were posted, read, or liked in a Yammer group
     * @param value Value to set for the reportDate property.
     * @return a void
     */
    public void setReportDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportDate = value;
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     * @return a void
     */
    public void setReportPeriod(@javax.annotation.Nullable final String value) {
        this._reportPeriod = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     * @return a void
     */
    public void setReportRefreshDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportRefreshDate = value;
    }
    /**
     * Sets the yammerMessagesLiked property value. The number of messages liked in Yammer groups.
     * @param value Value to set for the yammerMessagesLiked property.
     * @return a void
     */
    public void setYammerMessagesLiked(@javax.annotation.Nullable final Long value) {
        this._yammerMessagesLiked = value;
    }
    /**
     * Sets the yammerMessagesPosted property value. The number of messages posted to Yammer groups.
     * @param value Value to set for the yammerMessagesPosted property.
     * @return a void
     */
    public void setYammerMessagesPosted(@javax.annotation.Nullable final Long value) {
        this._yammerMessagesPosted = value;
    }
    /**
     * Sets the yammerMessagesRead property value. The number of messages read in Yammer groups.
     * @param value Value to set for the yammerMessagesRead property.
     * @return a void
     */
    public void setYammerMessagesRead(@javax.annotation.Nullable final Long value) {
        this._yammerMessagesRead = value;
    }
}
