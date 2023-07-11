package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365ActiveUserCounts extends Entity implements Parsable {
    /**
     * The number of active users in Exchange. Any user who can read and send email is considered an active user.
     */
    private Long exchange;
    /**
     * The number of active users in Microsoft 365. This number includes all the active users in Exchange, OneDrive, SharePoint, Skype For Business, Yammer, and Microsoft Teams. You can find the definition of active user for each product in the respective property description.
     */
    private Long office365;
    /**
     * The number of active users in OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     */
    private Long oneDrive;
    /**
     * The date on which a number of users were active.
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
     * The number of active users in SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     */
    private Long sharePoint;
    /**
     * The number of active users in Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     */
    private Long skypeForBusiness;
    /**
     * The number of active users in Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     */
    private Long teams;
    /**
     * The number of active users in Yammer. Any user who can post, read, or like messages is considered an active user.
     */
    private Long yammer;
    /**
     * Instantiates a new office365ActiveUserCounts and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Office365ActiveUserCounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a office365ActiveUserCounts
     */
    @javax.annotation.Nonnull
    public static Office365ActiveUserCounts createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365ActiveUserCounts();
    }
    /**
     * Gets the exchange property value. The number of active users in Exchange. Any user who can read and send email is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchange() {
        return this.exchange;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exchange", (n) -> { this.setExchange(n.getLongValue()); });
        deserializerMap.put("office365", (n) -> { this.setOffice365(n.getLongValue()); });
        deserializerMap.put("oneDrive", (n) -> { this.setOneDrive(n.getLongValue()); });
        deserializerMap.put("reportDate", (n) -> { this.setReportDate(n.getLocalDateValue()); });
        deserializerMap.put("reportPeriod", (n) -> { this.setReportPeriod(n.getStringValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("sharePoint", (n) -> { this.setSharePoint(n.getLongValue()); });
        deserializerMap.put("skypeForBusiness", (n) -> { this.setSkypeForBusiness(n.getLongValue()); });
        deserializerMap.put("teams", (n) -> { this.setTeams(n.getLongValue()); });
        deserializerMap.put("yammer", (n) -> { this.setYammer(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the office365 property value. The number of active users in Microsoft 365. This number includes all the active users in Exchange, OneDrive, SharePoint, Skype For Business, Yammer, and Microsoft Teams. You can find the definition of active user for each product in the respective property description.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffice365() {
        return this.office365;
    }
    /**
     * Gets the oneDrive property value. The number of active users in OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOneDrive() {
        return this.oneDrive;
    }
    /**
     * Gets the reportDate property value. The date on which a number of users were active.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportDate() {
        return this.reportDate;
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportPeriod() {
        return this.reportPeriod;
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.reportRefreshDate;
    }
    /**
     * Gets the sharePoint property value. The number of active users in SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePoint() {
        return this.sharePoint;
    }
    /**
     * Gets the skypeForBusiness property value. The number of active users in Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSkypeForBusiness() {
        return this.skypeForBusiness;
    }
    /**
     * Gets the teams property value. The number of active users in Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTeams() {
        return this.teams;
    }
    /**
     * Gets the yammer property value. The number of active users in Yammer. Any user who can post, read, or like messages is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammer() {
        return this.yammer;
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
        writer.writeLongValue("exchange", this.getExchange());
        writer.writeLongValue("office365", this.getOffice365());
        writer.writeLongValue("oneDrive", this.getOneDrive());
        writer.writeLocalDateValue("reportDate", this.getReportDate());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("sharePoint", this.getSharePoint());
        writer.writeLongValue("skypeForBusiness", this.getSkypeForBusiness());
        writer.writeLongValue("teams", this.getTeams());
        writer.writeLongValue("yammer", this.getYammer());
    }
    /**
     * Sets the exchange property value. The number of active users in Exchange. Any user who can read and send email is considered an active user.
     * @param value Value to set for the exchange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchange(@javax.annotation.Nullable final Long value) {
        this.exchange = value;
    }
    /**
     * Sets the office365 property value. The number of active users in Microsoft 365. This number includes all the active users in Exchange, OneDrive, SharePoint, Skype For Business, Yammer, and Microsoft Teams. You can find the definition of active user for each product in the respective property description.
     * @param value Value to set for the office365 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffice365(@javax.annotation.Nullable final Long value) {
        this.office365 = value;
    }
    /**
     * Sets the oneDrive property value. The number of active users in OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @param value Value to set for the oneDrive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDrive(@javax.annotation.Nullable final Long value) {
        this.oneDrive = value;
    }
    /**
     * Sets the reportDate property value. The date on which a number of users were active.
     * @param value Value to set for the reportDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportDate(@javax.annotation.Nullable final LocalDate value) {
        this.reportDate = value;
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportPeriod(@javax.annotation.Nullable final String value) {
        this.reportPeriod = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportRefreshDate(@javax.annotation.Nullable final LocalDate value) {
        this.reportRefreshDate = value;
    }
    /**
     * Sets the sharePoint property value. The number of active users in SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @param value Value to set for the sharePoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePoint(@javax.annotation.Nullable final Long value) {
        this.sharePoint = value;
    }
    /**
     * Sets the skypeForBusiness property value. The number of active users in Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @param value Value to set for the skypeForBusiness property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeForBusiness(@javax.annotation.Nullable final Long value) {
        this.skypeForBusiness = value;
    }
    /**
     * Sets the teams property value. The number of active users in Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @param value Value to set for the teams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeams(@javax.annotation.Nullable final Long value) {
        this.teams = value;
    }
    /**
     * Sets the yammer property value. The number of active users in Yammer. Any user who can post, read, or like messages is considered an active user.
     * @param value Value to set for the yammer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYammer(@javax.annotation.Nullable final Long value) {
        this.yammer = value;
    }
}
