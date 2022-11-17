package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365ServicesUserCounts extends Entity implements Parsable {
    /** The number of active users on Exchange. Any user who can read and send email is considered an active user. */
    private Long _exchangeActive;
    /** The number of inactive users on Exchange. */
    private Long _exchangeInactive;
    /** The number of active users on Microsoft 365. */
    private Long _office365Active;
    /** The number of inactive users on Microsoft 365. */
    private Long _office365Inactive;
    /** The number of active users on OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user. */
    private Long _oneDriveActive;
    /** The number of inactive users on OneDrive. */
    private Long _oneDriveInactive;
    /** The number of days the report covers. */
    private String _reportPeriod;
    /** The latest date of the content. */
    private LocalDate _reportRefreshDate;
    /** The number of active users on SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user. */
    private Long _sharePointActive;
    /** The number of inactive users on SharePoint. */
    private Long _sharePointInactive;
    /** The number of active users on Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user. */
    private Long _skypeForBusinessActive;
    /** The number of inactive users on Skype For Business. */
    private Long _skypeForBusinessInactive;
    /** The number of active users on Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user. */
    private Long _teamsActive;
    /** The number of inactive users on Microsoft Teams. */
    private Long _teamsInactive;
    /** The number of active users on Yammer. Any user who can post, read, or like messages is considered an active user. */
    private Long _yammerActive;
    /** The number of inactive users on Yammer. */
    private Long _yammerInactive;
    /**
     * Instantiates a new Office365ServicesUserCounts and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Office365ServicesUserCounts() {
        super();
        this.setOdataType("#microsoft.graph.office365ServicesUserCounts");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365ServicesUserCounts
     */
    @javax.annotation.Nonnull
    public static Office365ServicesUserCounts createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365ServicesUserCounts();
    }
    /**
     * Gets the exchangeActive property value. The number of active users on Exchange. Any user who can read and send email is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchangeActive() {
        return this._exchangeActive;
    }
    /**
     * Gets the exchangeInactive property value. The number of inactive users on Exchange.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchangeInactive() {
        return this._exchangeInactive;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Office365ServicesUserCounts currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("exchangeActive", (n) -> { currentObject.setExchangeActive(n.getLongValue()); });
            this.put("exchangeInactive", (n) -> { currentObject.setExchangeInactive(n.getLongValue()); });
            this.put("office365Active", (n) -> { currentObject.setOffice365Active(n.getLongValue()); });
            this.put("office365Inactive", (n) -> { currentObject.setOffice365Inactive(n.getLongValue()); });
            this.put("oneDriveActive", (n) -> { currentObject.setOneDriveActive(n.getLongValue()); });
            this.put("oneDriveInactive", (n) -> { currentObject.setOneDriveInactive(n.getLongValue()); });
            this.put("reportPeriod", (n) -> { currentObject.setReportPeriod(n.getStringValue()); });
            this.put("reportRefreshDate", (n) -> { currentObject.setReportRefreshDate(n.getLocalDateValue()); });
            this.put("sharePointActive", (n) -> { currentObject.setSharePointActive(n.getLongValue()); });
            this.put("sharePointInactive", (n) -> { currentObject.setSharePointInactive(n.getLongValue()); });
            this.put("skypeForBusinessActive", (n) -> { currentObject.setSkypeForBusinessActive(n.getLongValue()); });
            this.put("skypeForBusinessInactive", (n) -> { currentObject.setSkypeForBusinessInactive(n.getLongValue()); });
            this.put("teamsActive", (n) -> { currentObject.setTeamsActive(n.getLongValue()); });
            this.put("teamsInactive", (n) -> { currentObject.setTeamsInactive(n.getLongValue()); });
            this.put("yammerActive", (n) -> { currentObject.setYammerActive(n.getLongValue()); });
            this.put("yammerInactive", (n) -> { currentObject.setYammerInactive(n.getLongValue()); });
        }};
    }
    /**
     * Gets the office365Active property value. The number of active users on Microsoft 365.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffice365Active() {
        return this._office365Active;
    }
    /**
     * Gets the office365Inactive property value. The number of inactive users on Microsoft 365.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffice365Inactive() {
        return this._office365Inactive;
    }
    /**
     * Gets the oneDriveActive property value. The number of active users on OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOneDriveActive() {
        return this._oneDriveActive;
    }
    /**
     * Gets the oneDriveInactive property value. The number of inactive users on OneDrive.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOneDriveInactive() {
        return this._oneDriveInactive;
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
     * Gets the sharePointActive property value. The number of active users on SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePointActive() {
        return this._sharePointActive;
    }
    /**
     * Gets the sharePointInactive property value. The number of inactive users on SharePoint.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePointInactive() {
        return this._sharePointInactive;
    }
    /**
     * Gets the skypeForBusinessActive property value. The number of active users on Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSkypeForBusinessActive() {
        return this._skypeForBusinessActive;
    }
    /**
     * Gets the skypeForBusinessInactive property value. The number of inactive users on Skype For Business.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSkypeForBusinessInactive() {
        return this._skypeForBusinessInactive;
    }
    /**
     * Gets the teamsActive property value. The number of active users on Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTeamsActive() {
        return this._teamsActive;
    }
    /**
     * Gets the teamsInactive property value. The number of inactive users on Microsoft Teams.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTeamsInactive() {
        return this._teamsInactive;
    }
    /**
     * Gets the yammerActive property value. The number of active users on Yammer. Any user who can post, read, or like messages is considered an active user.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerActive() {
        return this._yammerActive;
    }
    /**
     * Gets the yammerInactive property value. The number of inactive users on Yammer.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerInactive() {
        return this._yammerInactive;
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
        writer.writeLongValue("exchangeActive", this.getExchangeActive());
        writer.writeLongValue("exchangeInactive", this.getExchangeInactive());
        writer.writeLongValue("office365Active", this.getOffice365Active());
        writer.writeLongValue("office365Inactive", this.getOffice365Inactive());
        writer.writeLongValue("oneDriveActive", this.getOneDriveActive());
        writer.writeLongValue("oneDriveInactive", this.getOneDriveInactive());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("sharePointActive", this.getSharePointActive());
        writer.writeLongValue("sharePointInactive", this.getSharePointInactive());
        writer.writeLongValue("skypeForBusinessActive", this.getSkypeForBusinessActive());
        writer.writeLongValue("skypeForBusinessInactive", this.getSkypeForBusinessInactive());
        writer.writeLongValue("teamsActive", this.getTeamsActive());
        writer.writeLongValue("teamsInactive", this.getTeamsInactive());
        writer.writeLongValue("yammerActive", this.getYammerActive());
        writer.writeLongValue("yammerInactive", this.getYammerInactive());
    }
    /**
     * Sets the exchangeActive property value. The number of active users on Exchange. Any user who can read and send email is considered an active user.
     * @param value Value to set for the exchangeActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeActive(@javax.annotation.Nullable final Long value) {
        this._exchangeActive = value;
    }
    /**
     * Sets the exchangeInactive property value. The number of inactive users on Exchange.
     * @param value Value to set for the exchangeInactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeInactive(@javax.annotation.Nullable final Long value) {
        this._exchangeInactive = value;
    }
    /**
     * Sets the office365Active property value. The number of active users on Microsoft 365.
     * @param value Value to set for the office365Active property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffice365Active(@javax.annotation.Nullable final Long value) {
        this._office365Active = value;
    }
    /**
     * Sets the office365Inactive property value. The number of inactive users on Microsoft 365.
     * @param value Value to set for the office365Inactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffice365Inactive(@javax.annotation.Nullable final Long value) {
        this._office365Inactive = value;
    }
    /**
     * Sets the oneDriveActive property value. The number of active users on OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @param value Value to set for the oneDriveActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveActive(@javax.annotation.Nullable final Long value) {
        this._oneDriveActive = value;
    }
    /**
     * Sets the oneDriveInactive property value. The number of inactive users on OneDrive.
     * @param value Value to set for the oneDriveInactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveInactive(@javax.annotation.Nullable final Long value) {
        this._oneDriveInactive = value;
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportPeriod(@javax.annotation.Nullable final String value) {
        this._reportPeriod = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportRefreshDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportRefreshDate = value;
    }
    /**
     * Sets the sharePointActive property value. The number of active users on SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @param value Value to set for the sharePointActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointActive(@javax.annotation.Nullable final Long value) {
        this._sharePointActive = value;
    }
    /**
     * Sets the sharePointInactive property value. The number of inactive users on SharePoint.
     * @param value Value to set for the sharePointInactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointInactive(@javax.annotation.Nullable final Long value) {
        this._sharePointInactive = value;
    }
    /**
     * Sets the skypeForBusinessActive property value. The number of active users on Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @param value Value to set for the skypeForBusinessActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeForBusinessActive(@javax.annotation.Nullable final Long value) {
        this._skypeForBusinessActive = value;
    }
    /**
     * Sets the skypeForBusinessInactive property value. The number of inactive users on Skype For Business.
     * @param value Value to set for the skypeForBusinessInactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeForBusinessInactive(@javax.annotation.Nullable final Long value) {
        this._skypeForBusinessInactive = value;
    }
    /**
     * Sets the teamsActive property value. The number of active users on Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @param value Value to set for the teamsActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsActive(@javax.annotation.Nullable final Long value) {
        this._teamsActive = value;
    }
    /**
     * Sets the teamsInactive property value. The number of inactive users on Microsoft Teams.
     * @param value Value to set for the teamsInactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsInactive(@javax.annotation.Nullable final Long value) {
        this._teamsInactive = value;
    }
    /**
     * Sets the yammerActive property value. The number of active users on Yammer. Any user who can post, read, or like messages is considered an active user.
     * @param value Value to set for the yammerActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYammerActive(@javax.annotation.Nullable final Long value) {
        this._yammerActive = value;
    }
    /**
     * Sets the yammerInactive property value. The number of inactive users on Yammer.
     * @param value Value to set for the yammerInactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYammerInactive(@javax.annotation.Nullable final Long value) {
        this._yammerInactive = value;
    }
}
