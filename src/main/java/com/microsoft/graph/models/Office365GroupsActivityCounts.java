package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Office365GroupsActivityCounts extends Entity implements Parsable {
    /**
     * The number of emails received by Group mailboxes.
     */
    private Long exchangeEmailsReceived;
    /**
     * The date on which a number of emails were sent to a group mailbox or a number of messages were posted, read, or liked in a Yammer group
     */
    private LocalDate reportDate;
    /**
     * The number of days the report covers.
     */
    private String reportPeriod;
    /**
     * The latest date of the content.
     */
    private LocalDate reportRefreshDate;
    /**
     * The number of channel messages in Teams team.
     */
    private Long teamsChannelMessages;
    /**
     * The number of meetings organized in Teams team.
     */
    private Long teamsMeetingsOrganized;
    /**
     * The number of messages liked in Yammer groups.
     */
    private Long yammerMessagesLiked;
    /**
     * The number of messages posted to Yammer groups.
     */
    private Long yammerMessagesPosted;
    /**
     * The number of messages read in Yammer groups.
     */
    private Long yammerMessagesRead;
    /**
     * Instantiates a new office365GroupsActivityCounts and sets the default values.
     */
    public Office365GroupsActivityCounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a office365GroupsActivityCounts
     */
    @jakarta.annotation.Nonnull
    public static Office365GroupsActivityCounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityCounts();
    }
    /**
     * Gets the exchangeEmailsReceived property value. The number of emails received by Group mailboxes.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getExchangeEmailsReceived() {
        return this.exchangeEmailsReceived;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exchangeEmailsReceived", (n) -> { this.setExchangeEmailsReceived(n.getLongValue()); });
        deserializerMap.put("reportDate", (n) -> { this.setReportDate(n.getLocalDateValue()); });
        deserializerMap.put("reportPeriod", (n) -> { this.setReportPeriod(n.getStringValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("teamsChannelMessages", (n) -> { this.setTeamsChannelMessages(n.getLongValue()); });
        deserializerMap.put("teamsMeetingsOrganized", (n) -> { this.setTeamsMeetingsOrganized(n.getLongValue()); });
        deserializerMap.put("yammerMessagesLiked", (n) -> { this.setYammerMessagesLiked(n.getLongValue()); });
        deserializerMap.put("yammerMessagesPosted", (n) -> { this.setYammerMessagesPosted(n.getLongValue()); });
        deserializerMap.put("yammerMessagesRead", (n) -> { this.setYammerMessagesRead(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reportDate property value. The date on which a number of emails were sent to a group mailbox or a number of messages were posted, read, or liked in a Yammer group
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportDate() {
        return this.reportDate;
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReportPeriod() {
        return this.reportPeriod;
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.reportRefreshDate;
    }
    /**
     * Gets the teamsChannelMessages property value. The number of channel messages in Teams team.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTeamsChannelMessages() {
        return this.teamsChannelMessages;
    }
    /**
     * Gets the teamsMeetingsOrganized property value. The number of meetings organized in Teams team.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTeamsMeetingsOrganized() {
        return this.teamsMeetingsOrganized;
    }
    /**
     * Gets the yammerMessagesLiked property value. The number of messages liked in Yammer groups.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getYammerMessagesLiked() {
        return this.yammerMessagesLiked;
    }
    /**
     * Gets the yammerMessagesPosted property value. The number of messages posted to Yammer groups.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getYammerMessagesPosted() {
        return this.yammerMessagesPosted;
    }
    /**
     * Gets the yammerMessagesRead property value. The number of messages read in Yammer groups.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getYammerMessagesRead() {
        return this.yammerMessagesRead;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("exchangeEmailsReceived", this.getExchangeEmailsReceived());
        writer.writeLocalDateValue("reportDate", this.getReportDate());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("teamsChannelMessages", this.getTeamsChannelMessages());
        writer.writeLongValue("teamsMeetingsOrganized", this.getTeamsMeetingsOrganized());
        writer.writeLongValue("yammerMessagesLiked", this.getYammerMessagesLiked());
        writer.writeLongValue("yammerMessagesPosted", this.getYammerMessagesPosted());
        writer.writeLongValue("yammerMessagesRead", this.getYammerMessagesRead());
    }
    /**
     * Sets the exchangeEmailsReceived property value. The number of emails received by Group mailboxes.
     * @param value Value to set for the exchangeEmailsReceived property.
     */
    public void setExchangeEmailsReceived(@jakarta.annotation.Nullable final Long value) {
        this.exchangeEmailsReceived = value;
    }
    /**
     * Sets the reportDate property value. The date on which a number of emails were sent to a group mailbox or a number of messages were posted, read, or liked in a Yammer group
     * @param value Value to set for the reportDate property.
     */
    public void setReportDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.reportDate = value;
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     */
    public void setReportPeriod(@jakarta.annotation.Nullable final String value) {
        this.reportPeriod = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     */
    public void setReportRefreshDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.reportRefreshDate = value;
    }
    /**
     * Sets the teamsChannelMessages property value. The number of channel messages in Teams team.
     * @param value Value to set for the teamsChannelMessages property.
     */
    public void setTeamsChannelMessages(@jakarta.annotation.Nullable final Long value) {
        this.teamsChannelMessages = value;
    }
    /**
     * Sets the teamsMeetingsOrganized property value. The number of meetings organized in Teams team.
     * @param value Value to set for the teamsMeetingsOrganized property.
     */
    public void setTeamsMeetingsOrganized(@jakarta.annotation.Nullable final Long value) {
        this.teamsMeetingsOrganized = value;
    }
    /**
     * Sets the yammerMessagesLiked property value. The number of messages liked in Yammer groups.
     * @param value Value to set for the yammerMessagesLiked property.
     */
    public void setYammerMessagesLiked(@jakarta.annotation.Nullable final Long value) {
        this.yammerMessagesLiked = value;
    }
    /**
     * Sets the yammerMessagesPosted property value. The number of messages posted to Yammer groups.
     * @param value Value to set for the yammerMessagesPosted property.
     */
    public void setYammerMessagesPosted(@jakarta.annotation.Nullable final Long value) {
        this.yammerMessagesPosted = value;
    }
    /**
     * Sets the yammerMessagesRead property value. The number of messages read in Yammer groups.
     * @param value Value to set for the yammerMessagesRead property.
     */
    public void setYammerMessagesRead(@jakarta.annotation.Nullable final Long value) {
        this.yammerMessagesRead = value;
    }
}
