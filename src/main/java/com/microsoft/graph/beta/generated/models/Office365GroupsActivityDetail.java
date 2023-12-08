package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Office365GroupsActivityDetail extends Entity implements Parsable {
    /**
     * Instantiates a new Office365GroupsActivityDetail and sets the default values.
     */
    public Office365GroupsActivityDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365GroupsActivityDetail
     */
    @jakarta.annotation.Nonnull
    public static Office365GroupsActivityDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityDetail();
    }
    /**
     * Gets the exchangeMailboxStorageUsedInBytes property value. The storage used of the group mailbox.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getExchangeMailboxStorageUsedInBytes() {
        return this.backingStore.get("exchangeMailboxStorageUsedInBytes");
    }
    /**
     * Gets the exchangeMailboxTotalItemCount property value. The number of items in the group mailbox.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getExchangeMailboxTotalItemCount() {
        return this.backingStore.get("exchangeMailboxTotalItemCount");
    }
    /**
     * Gets the exchangeReceivedEmailCount property value. The number of emails that the group mailbox received.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getExchangeReceivedEmailCount() {
        return this.backingStore.get("exchangeReceivedEmailCount");
    }
    /**
     * Gets the externalMemberCount property value. The group external member count.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getExternalMemberCount() {
        return this.backingStore.get("externalMemberCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exchangeMailboxStorageUsedInBytes", (n) -> { this.setExchangeMailboxStorageUsedInBytes(n.getLongValue()); });
        deserializerMap.put("exchangeMailboxTotalItemCount", (n) -> { this.setExchangeMailboxTotalItemCount(n.getLongValue()); });
        deserializerMap.put("exchangeReceivedEmailCount", (n) -> { this.setExchangeReceivedEmailCount(n.getLongValue()); });
        deserializerMap.put("externalMemberCount", (n) -> { this.setExternalMemberCount(n.getLongValue()); });
        deserializerMap.put("groupDisplayName", (n) -> { this.setGroupDisplayName(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("groupType", (n) -> { this.setGroupType(n.getStringValue()); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("lastActivityDate", (n) -> { this.setLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("memberCount", (n) -> { this.setMemberCount(n.getLongValue()); });
        deserializerMap.put("ownerPrincipalName", (n) -> { this.setOwnerPrincipalName(n.getStringValue()); });
        deserializerMap.put("reportPeriod", (n) -> { this.setReportPeriod(n.getStringValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("sharePointActiveFileCount", (n) -> { this.setSharePointActiveFileCount(n.getLongValue()); });
        deserializerMap.put("sharePointSiteStorageUsedInBytes", (n) -> { this.setSharePointSiteStorageUsedInBytes(n.getLongValue()); });
        deserializerMap.put("sharePointTotalFileCount", (n) -> { this.setSharePointTotalFileCount(n.getLongValue()); });
        deserializerMap.put("teamsChannelMessagesCount", (n) -> { this.setTeamsChannelMessagesCount(n.getLongValue()); });
        deserializerMap.put("teamsMeetingsOrganizedCount", (n) -> { this.setTeamsMeetingsOrganizedCount(n.getLongValue()); });
        deserializerMap.put("yammerLikedMessageCount", (n) -> { this.setYammerLikedMessageCount(n.getLongValue()); });
        deserializerMap.put("yammerPostedMessageCount", (n) -> { this.setYammerPostedMessageCount(n.getLongValue()); });
        deserializerMap.put("yammerReadMessageCount", (n) -> { this.setYammerReadMessageCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupDisplayName property value. The display name of the group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupDisplayName() {
        return this.backingStore.get("groupDisplayName");
    }
    /**
     * Gets the groupId property value. The group id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the groupType property value. The group type. Possible values are: Public or Private.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupType() {
        return this.backingStore.get("groupType");
    }
    /**
     * Gets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.backingStore.get("isDeleted");
    }
    /**
     * Gets the lastActivityDate property value. The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getLastActivityDate() {
        return this.backingStore.get("lastActivityDate");
    }
    /**
     * Gets the memberCount property value. The group member count.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMemberCount() {
        return this.backingStore.get("memberCount");
    }
    /**
     * Gets the ownerPrincipalName property value. The group owner principal name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerPrincipalName() {
        return this.backingStore.get("ownerPrincipalName");
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReportPeriod() {
        return this.backingStore.get("reportPeriod");
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.backingStore.get("reportRefreshDate");
    }
    /**
     * Gets the sharePointActiveFileCount property value. The number of active files in SharePoint Group site.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSharePointActiveFileCount() {
        return this.backingStore.get("sharePointActiveFileCount");
    }
    /**
     * Gets the sharePointSiteStorageUsedInBytes property value. The storage used by SharePoint Group site.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSharePointSiteStorageUsedInBytes() {
        return this.backingStore.get("sharePointSiteStorageUsedInBytes");
    }
    /**
     * Gets the sharePointTotalFileCount property value. The total number of files in SharePoint Group site.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSharePointTotalFileCount() {
        return this.backingStore.get("sharePointTotalFileCount");
    }
    /**
     * Gets the teamsChannelMessagesCount property value. The number of channel messages in Teams team.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTeamsChannelMessagesCount() {
        return this.backingStore.get("teamsChannelMessagesCount");
    }
    /**
     * Gets the teamsMeetingsOrganizedCount property value. The number of meetings organized in Teams team.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTeamsMeetingsOrganizedCount() {
        return this.backingStore.get("teamsMeetingsOrganizedCount");
    }
    /**
     * Gets the yammerLikedMessageCount property value. The number of messages liked in Yammer groups.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getYammerLikedMessageCount() {
        return this.backingStore.get("yammerLikedMessageCount");
    }
    /**
     * Gets the yammerPostedMessageCount property value. The number of messages posted to Yammer groups.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getYammerPostedMessageCount() {
        return this.backingStore.get("yammerPostedMessageCount");
    }
    /**
     * Gets the yammerReadMessageCount property value. The number of messages read in Yammer groups.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getYammerReadMessageCount() {
        return this.backingStore.get("yammerReadMessageCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("exchangeMailboxStorageUsedInBytes", this.getExchangeMailboxStorageUsedInBytes());
        writer.writeLongValue("exchangeMailboxTotalItemCount", this.getExchangeMailboxTotalItemCount());
        writer.writeLongValue("exchangeReceivedEmailCount", this.getExchangeReceivedEmailCount());
        writer.writeLongValue("externalMemberCount", this.getExternalMemberCount());
        writer.writeStringValue("groupDisplayName", this.getGroupDisplayName());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("groupType", this.getGroupType());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeLocalDateValue("lastActivityDate", this.getLastActivityDate());
        writer.writeLongValue("memberCount", this.getMemberCount());
        writer.writeStringValue("ownerPrincipalName", this.getOwnerPrincipalName());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("sharePointActiveFileCount", this.getSharePointActiveFileCount());
        writer.writeLongValue("sharePointSiteStorageUsedInBytes", this.getSharePointSiteStorageUsedInBytes());
        writer.writeLongValue("sharePointTotalFileCount", this.getSharePointTotalFileCount());
        writer.writeLongValue("teamsChannelMessagesCount", this.getTeamsChannelMessagesCount());
        writer.writeLongValue("teamsMeetingsOrganizedCount", this.getTeamsMeetingsOrganizedCount());
        writer.writeLongValue("yammerLikedMessageCount", this.getYammerLikedMessageCount());
        writer.writeLongValue("yammerPostedMessageCount", this.getYammerPostedMessageCount());
        writer.writeLongValue("yammerReadMessageCount", this.getYammerReadMessageCount());
    }
    /**
     * Sets the exchangeMailboxStorageUsedInBytes property value. The storage used of the group mailbox.
     * @param value Value to set for the exchangeMailboxStorageUsedInBytes property.
     */
    public void setExchangeMailboxStorageUsedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exchangeMailboxStorageUsedInBytes", value);
    }
    /**
     * Sets the exchangeMailboxTotalItemCount property value. The number of items in the group mailbox.
     * @param value Value to set for the exchangeMailboxTotalItemCount property.
     */
    public void setExchangeMailboxTotalItemCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exchangeMailboxTotalItemCount", value);
    }
    /**
     * Sets the exchangeReceivedEmailCount property value. The number of emails that the group mailbox received.
     * @param value Value to set for the exchangeReceivedEmailCount property.
     */
    public void setExchangeReceivedEmailCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exchangeReceivedEmailCount", value);
    }
    /**
     * Sets the externalMemberCount property value. The group external member count.
     * @param value Value to set for the externalMemberCount property.
     */
    public void setExternalMemberCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("externalMemberCount", value);
    }
    /**
     * Sets the groupDisplayName property value. The display name of the group.
     * @param value Value to set for the groupDisplayName property.
     */
    public void setGroupDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupDisplayName", value);
    }
    /**
     * Sets the groupId property value. The group id.
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the groupType property value. The group type. Possible values are: Public or Private.
     * @param value Value to set for the groupType property.
     */
    public void setGroupType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupType", value);
    }
    /**
     * Sets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeleted", value);
    }
    /**
     * Sets the lastActivityDate property value. The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     * @param value Value to set for the lastActivityDate property.
     */
    public void setLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("lastActivityDate", value);
    }
    /**
     * Sets the memberCount property value. The group member count.
     * @param value Value to set for the memberCount property.
     */
    public void setMemberCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("memberCount", value);
    }
    /**
     * Sets the ownerPrincipalName property value. The group owner principal name.
     * @param value Value to set for the ownerPrincipalName property.
     */
    public void setOwnerPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerPrincipalName", value);
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
     * Sets the sharePointActiveFileCount property value. The number of active files in SharePoint Group site.
     * @param value Value to set for the sharePointActiveFileCount property.
     */
    public void setSharePointActiveFileCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sharePointActiveFileCount", value);
    }
    /**
     * Sets the sharePointSiteStorageUsedInBytes property value. The storage used by SharePoint Group site.
     * @param value Value to set for the sharePointSiteStorageUsedInBytes property.
     */
    public void setSharePointSiteStorageUsedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sharePointSiteStorageUsedInBytes", value);
    }
    /**
     * Sets the sharePointTotalFileCount property value. The total number of files in SharePoint Group site.
     * @param value Value to set for the sharePointTotalFileCount property.
     */
    public void setSharePointTotalFileCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sharePointTotalFileCount", value);
    }
    /**
     * Sets the teamsChannelMessagesCount property value. The number of channel messages in Teams team.
     * @param value Value to set for the teamsChannelMessagesCount property.
     */
    public void setTeamsChannelMessagesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("teamsChannelMessagesCount", value);
    }
    /**
     * Sets the teamsMeetingsOrganizedCount property value. The number of meetings organized in Teams team.
     * @param value Value to set for the teamsMeetingsOrganizedCount property.
     */
    public void setTeamsMeetingsOrganizedCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("teamsMeetingsOrganizedCount", value);
    }
    /**
     * Sets the yammerLikedMessageCount property value. The number of messages liked in Yammer groups.
     * @param value Value to set for the yammerLikedMessageCount property.
     */
    public void setYammerLikedMessageCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("yammerLikedMessageCount", value);
    }
    /**
     * Sets the yammerPostedMessageCount property value. The number of messages posted to Yammer groups.
     * @param value Value to set for the yammerPostedMessageCount property.
     */
    public void setYammerPostedMessageCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("yammerPostedMessageCount", value);
    }
    /**
     * Sets the yammerReadMessageCount property value. The number of messages read in Yammer groups.
     * @param value Value to set for the yammerReadMessageCount property.
     */
    public void setYammerReadMessageCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("yammerReadMessageCount", value);
    }
}
