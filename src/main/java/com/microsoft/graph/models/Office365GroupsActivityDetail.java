package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365GroupsActivityDetail extends Entity implements Parsable {
    /**
     * The storage used of the group mailbox.
     */
    private Long exchangeMailboxStorageUsedInBytes;
    /**
     * The number of items in the group mailbox.
     */
    private Long exchangeMailboxTotalItemCount;
    /**
     * The number of email that the group mailbox received.
     */
    private Long exchangeReceivedEmailCount;
    /**
     * The group external member count.
     */
    private Long externalMemberCount;
    /**
     * The display name of the group.
     */
    private String groupDisplayName;
    /**
     * The group id.
     */
    private String groupId;
    /**
     * The group type. Possible values are: Public or Private.
     */
    private String groupType;
    /**
     * Whether this user has been deleted or soft deleted.
     */
    private Boolean isDeleted;
    /**
     * The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     */
    private LocalDate lastActivityDate;
    /**
     * The group member count.
     */
    private Long memberCount;
    /**
     * The group owner principal name.
     */
    private String ownerPrincipalName;
    /**
     * The number of days the report covers.
     */
    private String reportPeriod;
    /**
     * The latest date of the content.
     */
    private LocalDate reportRefreshDate;
    /**
     * The number of active files in SharePoint Group site.
     */
    private Long sharePointActiveFileCount;
    /**
     * The storage used by SharePoint Group site.
     */
    private Long sharePointSiteStorageUsedInBytes;
    /**
     * The total number of files in SharePoint Group site.
     */
    private Long sharePointTotalFileCount;
    /**
     * The number of channel messages in Teams team.
     */
    private Long teamsChannelMessagesCount;
    /**
     * The number of meetings organized in Teams team.
     */
    private Long teamsMeetingsOrganizedCount;
    /**
     * The number of messages liked in Yammer groups.
     */
    private Long yammerLikedMessageCount;
    /**
     * The number of messages posted to Yammer groups.
     */
    private Long yammerPostedMessageCount;
    /**
     * The number of messages read in Yammer groups.
     */
    private Long yammerReadMessageCount;
    /**
     * Instantiates a new office365GroupsActivityDetail and sets the default values.
     */
    public Office365GroupsActivityDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a office365GroupsActivityDetail
     */
    @jakarta.annotation.Nonnull
    public static Office365GroupsActivityDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityDetail();
    }
    /**
     * Gets the exchangeMailboxStorageUsedInBytes property value. The storage used of the group mailbox.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getExchangeMailboxStorageUsedInBytes() {
        return this.exchangeMailboxStorageUsedInBytes;
    }
    /**
     * Gets the exchangeMailboxTotalItemCount property value. The number of items in the group mailbox.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getExchangeMailboxTotalItemCount() {
        return this.exchangeMailboxTotalItemCount;
    }
    /**
     * Gets the exchangeReceivedEmailCount property value. The number of email that the group mailbox received.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getExchangeReceivedEmailCount() {
        return this.exchangeReceivedEmailCount;
    }
    /**
     * Gets the externalMemberCount property value. The group external member count.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getExternalMemberCount() {
        return this.externalMemberCount;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupDisplayName() {
        return this.groupDisplayName;
    }
    /**
     * Gets the groupId property value. The group id.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the groupType property value. The group type. Possible values are: Public or Private.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupType() {
        return this.groupType;
    }
    /**
     * Gets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    /**
     * Gets the lastActivityDate property value. The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getLastActivityDate() {
        return this.lastActivityDate;
    }
    /**
     * Gets the memberCount property value. The group member count.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMemberCount() {
        return this.memberCount;
    }
    /**
     * Gets the ownerPrincipalName property value. The group owner principal name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOwnerPrincipalName() {
        return this.ownerPrincipalName;
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
     * Gets the sharePointActiveFileCount property value. The number of active files in SharePoint Group site.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSharePointActiveFileCount() {
        return this.sharePointActiveFileCount;
    }
    /**
     * Gets the sharePointSiteStorageUsedInBytes property value. The storage used by SharePoint Group site.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSharePointSiteStorageUsedInBytes() {
        return this.sharePointSiteStorageUsedInBytes;
    }
    /**
     * Gets the sharePointTotalFileCount property value. The total number of files in SharePoint Group site.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSharePointTotalFileCount() {
        return this.sharePointTotalFileCount;
    }
    /**
     * Gets the teamsChannelMessagesCount property value. The number of channel messages in Teams team.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTeamsChannelMessagesCount() {
        return this.teamsChannelMessagesCount;
    }
    /**
     * Gets the teamsMeetingsOrganizedCount property value. The number of meetings organized in Teams team.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTeamsMeetingsOrganizedCount() {
        return this.teamsMeetingsOrganizedCount;
    }
    /**
     * Gets the yammerLikedMessageCount property value. The number of messages liked in Yammer groups.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getYammerLikedMessageCount() {
        return this.yammerLikedMessageCount;
    }
    /**
     * Gets the yammerPostedMessageCount property value. The number of messages posted to Yammer groups.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getYammerPostedMessageCount() {
        return this.yammerPostedMessageCount;
    }
    /**
     * Gets the yammerReadMessageCount property value. The number of messages read in Yammer groups.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getYammerReadMessageCount() {
        return this.yammerReadMessageCount;
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
        this.exchangeMailboxStorageUsedInBytes = value;
    }
    /**
     * Sets the exchangeMailboxTotalItemCount property value. The number of items in the group mailbox.
     * @param value Value to set for the exchangeMailboxTotalItemCount property.
     */
    public void setExchangeMailboxTotalItemCount(@jakarta.annotation.Nullable final Long value) {
        this.exchangeMailboxTotalItemCount = value;
    }
    /**
     * Sets the exchangeReceivedEmailCount property value. The number of email that the group mailbox received.
     * @param value Value to set for the exchangeReceivedEmailCount property.
     */
    public void setExchangeReceivedEmailCount(@jakarta.annotation.Nullable final Long value) {
        this.exchangeReceivedEmailCount = value;
    }
    /**
     * Sets the externalMemberCount property value. The group external member count.
     * @param value Value to set for the externalMemberCount property.
     */
    public void setExternalMemberCount(@jakarta.annotation.Nullable final Long value) {
        this.externalMemberCount = value;
    }
    /**
     * Sets the groupDisplayName property value. The display name of the group.
     * @param value Value to set for the groupDisplayName property.
     */
    public void setGroupDisplayName(@jakarta.annotation.Nullable final String value) {
        this.groupDisplayName = value;
    }
    /**
     * Sets the groupId property value. The group id.
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the groupType property value. The group type. Possible values are: Public or Private.
     * @param value Value to set for the groupType property.
     */
    public void setGroupType(@jakarta.annotation.Nullable final String value) {
        this.groupType = value;
    }
    /**
     * Sets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.isDeleted = value;
    }
    /**
     * Sets the lastActivityDate property value. The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     * @param value Value to set for the lastActivityDate property.
     */
    public void setLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.lastActivityDate = value;
    }
    /**
     * Sets the memberCount property value. The group member count.
     * @param value Value to set for the memberCount property.
     */
    public void setMemberCount(@jakarta.annotation.Nullable final Long value) {
        this.memberCount = value;
    }
    /**
     * Sets the ownerPrincipalName property value. The group owner principal name.
     * @param value Value to set for the ownerPrincipalName property.
     */
    public void setOwnerPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.ownerPrincipalName = value;
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
     * Sets the sharePointActiveFileCount property value. The number of active files in SharePoint Group site.
     * @param value Value to set for the sharePointActiveFileCount property.
     */
    public void setSharePointActiveFileCount(@jakarta.annotation.Nullable final Long value) {
        this.sharePointActiveFileCount = value;
    }
    /**
     * Sets the sharePointSiteStorageUsedInBytes property value. The storage used by SharePoint Group site.
     * @param value Value to set for the sharePointSiteStorageUsedInBytes property.
     */
    public void setSharePointSiteStorageUsedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.sharePointSiteStorageUsedInBytes = value;
    }
    /**
     * Sets the sharePointTotalFileCount property value. The total number of files in SharePoint Group site.
     * @param value Value to set for the sharePointTotalFileCount property.
     */
    public void setSharePointTotalFileCount(@jakarta.annotation.Nullable final Long value) {
        this.sharePointTotalFileCount = value;
    }
    /**
     * Sets the teamsChannelMessagesCount property value. The number of channel messages in Teams team.
     * @param value Value to set for the teamsChannelMessagesCount property.
     */
    public void setTeamsChannelMessagesCount(@jakarta.annotation.Nullable final Long value) {
        this.teamsChannelMessagesCount = value;
    }
    /**
     * Sets the teamsMeetingsOrganizedCount property value. The number of meetings organized in Teams team.
     * @param value Value to set for the teamsMeetingsOrganizedCount property.
     */
    public void setTeamsMeetingsOrganizedCount(@jakarta.annotation.Nullable final Long value) {
        this.teamsMeetingsOrganizedCount = value;
    }
    /**
     * Sets the yammerLikedMessageCount property value. The number of messages liked in Yammer groups.
     * @param value Value to set for the yammerLikedMessageCount property.
     */
    public void setYammerLikedMessageCount(@jakarta.annotation.Nullable final Long value) {
        this.yammerLikedMessageCount = value;
    }
    /**
     * Sets the yammerPostedMessageCount property value. The number of messages posted to Yammer groups.
     * @param value Value to set for the yammerPostedMessageCount property.
     */
    public void setYammerPostedMessageCount(@jakarta.annotation.Nullable final Long value) {
        this.yammerPostedMessageCount = value;
    }
    /**
     * Sets the yammerReadMessageCount property value. The number of messages read in Yammer groups.
     * @param value Value to set for the yammerReadMessageCount property.
     */
    public void setYammerReadMessageCount(@jakarta.annotation.Nullable final Long value) {
        this.yammerReadMessageCount = value;
    }
}
