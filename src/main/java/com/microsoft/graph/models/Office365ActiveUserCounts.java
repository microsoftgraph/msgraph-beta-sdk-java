package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365ActiveUserCounts extends Entity implements Parsable {
    /** The number of active users in Exchange. Any user who can read and send email is considered an active user. */
    private Long _exchange;
    /** The number of active users in Microsoft 365. This number includes all the active users in Exchange, OneDrive, SharePoint, Skype For Business, Yammer, and Microsoft Teams. You can find the definition of active user for each product in the respective property description. */
    private Long _office365;
    /** The number of active users in OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user. */
    private Long _oneDrive;
    /** The date on which a number of users were active. */
    private LocalDate _reportDate;
    /** The number of days the report covers. */
    private String _reportPeriod;
    /** The latest date of the content. */
    private LocalDate _reportRefreshDate;
    /** The number of active users in SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user. */
    private Long _sharePoint;
    /** The number of active users in Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user. */
    private Long _skypeForBusiness;
    /** The number of active users in Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user. */
    private Long _teams;
    /** The number of active users in Yammer. Any user who can post, read, or like messages is considered an active user. */
    private Long _yammer;
    /**
     * Instantiates a new Office365ActiveUserCounts and sets the default values.
     * @return a void
     */
    public Office365ActiveUserCounts() {
        super();
        this.setOdataType("#microsoft.graph.office365ActiveUserCounts");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365ActiveUserCounts
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
        return this._exchange;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Office365ActiveUserCounts currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("exchange", (n) -> { currentObject.setExchange(n.getLongValue()); });
            this.put("office365", (n) -> { currentObject.setOffice365(n.getLongValue()); });
            this.put("oneDrive", (n) -> { currentObject.setOneDrive(n.getLongValue()); });
            this.put("reportDate", (n) -> { currentObject.setReportDate(n.getLocalDateValue()); });
            this.put("reportPeriod", (n) -> { currentObject.setReportPeriod(n.getStringValue()); });
            this.put("reportRefreshDate", (n) -> { currentObject.setReportRefreshDate(n.getLocalDateValue()); });
            this.put("sharePoint", (n) -> { currentObject.setSharePoint(n.getLongValue()); });
            this.put("skypeForBusiness", (n) -> { currentObject.setSkypeForBusiness(n.getLongValue()); });
            this.put("teams", (n) -> { currentObject.setTeams(n.getLongValue()); });
            this.put("yammer", (n) -> { currentObject.setYammer(n.getLongValue()); });
        }};
    }
    /**
     * Gets the office365 property value. The number of active users in Microsoft 365. This number includes all the active users in Exchange, OneDrive, SharePoint, Skype For Business, Yammer, and Microsoft Teams. You can find the definition of active user for each product in the respective property description.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffice365() {
        return this._office365;
    }
    /**
     * Gets the oneDrive property value. The number of active users in OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOneDrive() {
        return this._oneDrive;
    }
    /**
     * Gets the reportDate property value. The date on which a number of users were active.
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
     * Gets the sharePoint property value. The number of active users in SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePoint() {
        return this._sharePoint;
    }
    /**
     * Gets the skypeForBusiness property value. The number of active users in Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSkypeForBusiness() {
        return this._skypeForBusiness;
    }
    /**
     * Gets the teams property value. The number of active users in Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTeams() {
        return this._teams;
    }
    /**
     * Gets the yammer property value. The number of active users in Yammer. Any user who can post, read, or like messages is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammer() {
        return this._yammer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setExchange(@javax.annotation.Nullable final Long value) {
        this._exchange = value;
    }
    /**
     * Sets the office365 property value. The number of active users in Microsoft 365. This number includes all the active users in Exchange, OneDrive, SharePoint, Skype For Business, Yammer, and Microsoft Teams. You can find the definition of active user for each product in the respective property description.
     * @param value Value to set for the office365 property.
     * @return a void
     */
    public void setOffice365(@javax.annotation.Nullable final Long value) {
        this._office365 = value;
    }
    /**
     * Sets the oneDrive property value. The number of active users in OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @param value Value to set for the oneDrive property.
     * @return a void
     */
    public void setOneDrive(@javax.annotation.Nullable final Long value) {
        this._oneDrive = value;
    }
    /**
     * Sets the reportDate property value. The date on which a number of users were active.
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
     * Sets the sharePoint property value. The number of active users in SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @param value Value to set for the sharePoint property.
     * @return a void
     */
    public void setSharePoint(@javax.annotation.Nullable final Long value) {
        this._sharePoint = value;
    }
    /**
     * Sets the skypeForBusiness property value. The number of active users in Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @param value Value to set for the skypeForBusiness property.
     * @return a void
     */
    public void setSkypeForBusiness(@javax.annotation.Nullable final Long value) {
        this._skypeForBusiness = value;
    }
    /**
     * Sets the teams property value. The number of active users in Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @param value Value to set for the teams property.
     * @return a void
     */
    public void setTeams(@javax.annotation.Nullable final Long value) {
        this._teams = value;
    }
    /**
     * Sets the yammer property value. The number of active users in Yammer. Any user who can post, read, or like messages is considered an active user.
     * @param value Value to set for the yammer property.
     * @return a void
     */
    public void setYammer(@javax.annotation.Nullable final Long value) {
        this._yammer = value;
    }
}
