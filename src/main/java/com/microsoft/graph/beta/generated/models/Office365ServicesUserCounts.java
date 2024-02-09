package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Office365ServicesUserCounts extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Office365ServicesUserCounts} and sets the default values.
     */
    public Office365ServicesUserCounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Office365ServicesUserCounts}
     */
    @jakarta.annotation.Nonnull
    public static Office365ServicesUserCounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365ServicesUserCounts();
    }
    /**
     * Gets the exchangeActive property value. The number of active users on Exchange. Any user who can read and send email is considered an active user.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExchangeActive() {
        return this.backingStore.get("exchangeActive");
    }
    /**
     * Gets the exchangeInactive property value. The number of inactive users on Exchange.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExchangeInactive() {
        return this.backingStore.get("exchangeInactive");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exchangeActive", (n) -> { this.setExchangeActive(n.getLongValue()); });
        deserializerMap.put("exchangeInactive", (n) -> { this.setExchangeInactive(n.getLongValue()); });
        deserializerMap.put("office365Active", (n) -> { this.setOffice365Active(n.getLongValue()); });
        deserializerMap.put("office365Inactive", (n) -> { this.setOffice365Inactive(n.getLongValue()); });
        deserializerMap.put("oneDriveActive", (n) -> { this.setOneDriveActive(n.getLongValue()); });
        deserializerMap.put("oneDriveInactive", (n) -> { this.setOneDriveInactive(n.getLongValue()); });
        deserializerMap.put("reportPeriod", (n) -> { this.setReportPeriod(n.getStringValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("sharePointActive", (n) -> { this.setSharePointActive(n.getLongValue()); });
        deserializerMap.put("sharePointInactive", (n) -> { this.setSharePointInactive(n.getLongValue()); });
        deserializerMap.put("skypeForBusinessActive", (n) -> { this.setSkypeForBusinessActive(n.getLongValue()); });
        deserializerMap.put("skypeForBusinessInactive", (n) -> { this.setSkypeForBusinessInactive(n.getLongValue()); });
        deserializerMap.put("teamsActive", (n) -> { this.setTeamsActive(n.getLongValue()); });
        deserializerMap.put("teamsInactive", (n) -> { this.setTeamsInactive(n.getLongValue()); });
        deserializerMap.put("yammerActive", (n) -> { this.setYammerActive(n.getLongValue()); });
        deserializerMap.put("yammerInactive", (n) -> { this.setYammerInactive(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the office365Active property value. The number of active users on Microsoft 365.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOffice365Active() {
        return this.backingStore.get("office365Active");
    }
    /**
     * Gets the office365Inactive property value. The number of inactive users on Microsoft 365.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOffice365Inactive() {
        return this.backingStore.get("office365Inactive");
    }
    /**
     * Gets the oneDriveActive property value. The number of active users on OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOneDriveActive() {
        return this.backingStore.get("oneDriveActive");
    }
    /**
     * Gets the oneDriveInactive property value. The number of inactive users on OneDrive.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOneDriveInactive() {
        return this.backingStore.get("oneDriveInactive");
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportPeriod() {
        return this.backingStore.get("reportPeriod");
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.backingStore.get("reportRefreshDate");
    }
    /**
     * Gets the sharePointActive property value. The number of active users on SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSharePointActive() {
        return this.backingStore.get("sharePointActive");
    }
    /**
     * Gets the sharePointInactive property value. The number of inactive users on SharePoint.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSharePointInactive() {
        return this.backingStore.get("sharePointInactive");
    }
    /**
     * Gets the skypeForBusinessActive property value. The number of active users on Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSkypeForBusinessActive() {
        return this.backingStore.get("skypeForBusinessActive");
    }
    /**
     * Gets the skypeForBusinessInactive property value. The number of inactive users on Skype For Business.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSkypeForBusinessInactive() {
        return this.backingStore.get("skypeForBusinessInactive");
    }
    /**
     * Gets the teamsActive property value. The number of active users on Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTeamsActive() {
        return this.backingStore.get("teamsActive");
    }
    /**
     * Gets the teamsInactive property value. The number of inactive users on Microsoft Teams.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTeamsInactive() {
        return this.backingStore.get("teamsInactive");
    }
    /**
     * Gets the yammerActive property value. The number of active users on Yammer. Any user who can post, read, or like messages is considered an active user.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getYammerActive() {
        return this.backingStore.get("yammerActive");
    }
    /**
     * Gets the yammerInactive property value. The number of inactive users on Yammer.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getYammerInactive() {
        return this.backingStore.get("yammerInactive");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setExchangeActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exchangeActive", value);
    }
    /**
     * Sets the exchangeInactive property value. The number of inactive users on Exchange.
     * @param value Value to set for the exchangeInactive property.
     */
    public void setExchangeInactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exchangeInactive", value);
    }
    /**
     * Sets the office365Active property value. The number of active users on Microsoft 365.
     * @param value Value to set for the office365Active property.
     */
    public void setOffice365Active(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("office365Active", value);
    }
    /**
     * Sets the office365Inactive property value. The number of inactive users on Microsoft 365.
     * @param value Value to set for the office365Inactive property.
     */
    public void setOffice365Inactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("office365Inactive", value);
    }
    /**
     * Sets the oneDriveActive property value. The number of active users on OneDrive. Any user who viewed or edited files, shared files internally or externally, or synced files is considered an active user.
     * @param value Value to set for the oneDriveActive property.
     */
    public void setOneDriveActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("oneDriveActive", value);
    }
    /**
     * Sets the oneDriveInactive property value. The number of inactive users on OneDrive.
     * @param value Value to set for the oneDriveInactive property.
     */
    public void setOneDriveInactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("oneDriveInactive", value);
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     */
    public void setReportPeriod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reportPeriod", value);
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     */
    public void setReportRefreshDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("reportRefreshDate", value);
    }
    /**
     * Sets the sharePointActive property value. The number of active users on SharePoint. Any user who viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages is considered an active user.
     * @param value Value to set for the sharePointActive property.
     */
    public void setSharePointActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sharePointActive", value);
    }
    /**
     * Sets the sharePointInactive property value. The number of inactive users on SharePoint.
     * @param value Value to set for the sharePointInactive property.
     */
    public void setSharePointInactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sharePointInactive", value);
    }
    /**
     * Sets the skypeForBusinessActive property value. The number of active users on Skype For Business. Any user who organized or participated in conferences, or joined peer-to-peer sessions is considered an active user.
     * @param value Value to set for the skypeForBusinessActive property.
     */
    public void setSkypeForBusinessActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("skypeForBusinessActive", value);
    }
    /**
     * Sets the skypeForBusinessInactive property value. The number of inactive users on Skype For Business.
     * @param value Value to set for the skypeForBusinessInactive property.
     */
    public void setSkypeForBusinessInactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("skypeForBusinessInactive", value);
    }
    /**
     * Sets the teamsActive property value. The number of active users on Microsoft Teams. Any user who posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls is considered an active user.
     * @param value Value to set for the teamsActive property.
     */
    public void setTeamsActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("teamsActive", value);
    }
    /**
     * Sets the teamsInactive property value. The number of inactive users on Microsoft Teams.
     * @param value Value to set for the teamsInactive property.
     */
    public void setTeamsInactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("teamsInactive", value);
    }
    /**
     * Sets the yammerActive property value. The number of active users on Yammer. Any user who can post, read, or like messages is considered an active user.
     * @param value Value to set for the yammerActive property.
     */
    public void setYammerActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("yammerActive", value);
    }
    /**
     * Sets the yammerInactive property value. The number of inactive users on Yammer.
     * @param value Value to set for the yammerInactive property.
     */
    public void setYammerInactive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("yammerInactive", value);
    }
}
