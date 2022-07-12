package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365GroupsActivityDetail extends Entity implements Parsable {
    /** The storage used of the group mailbox. */
    private Long _exchangeMailboxStorageUsedInBytes;
    /** The number of items in the group mailbox. */
    private Long _exchangeMailboxTotalItemCount;
    /** The number of email that the group mailbox received. */
    private Long _exchangeReceivedEmailCount;
    /** The group external member count. */
    private Long _externalMemberCount;
    /** The display name of the group. */
    private String _groupDisplayName;
    /** The group id. */
    private String _groupId;
    /** The group type. Possible values are: Public or Private. */
    private String _groupType;
    /** Whether this user has been deleted or soft deleted. */
    private Boolean _isDeleted;
    /** The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups. */
    private LocalDate _lastActivityDate;
    /** The group member count. */
    private Long _memberCount;
    /** The group owner principal name. */
    private String _ownerPrincipalName;
    /** The number of days the report covers. */
    private String _reportPeriod;
    /** The latest date of the content. */
    private LocalDate _reportRefreshDate;
    /** The number of active files in SharePoint Group site. */
    private Long _sharePointActiveFileCount;
    /** The storage used by SharePoint Group site. */
    private Long _sharePointSiteStorageUsedInBytes;
    /** The total number of files in SharePoint Group site. */
    private Long _sharePointTotalFileCount;
    /** The number of messages liked in Yammer groups. */
    private Long _yammerLikedMessageCount;
    /** The number of messages posted to Yammer groups. */
    private Long _yammerPostedMessageCount;
    /** The number of messages read in Yammer groups. */
    private Long _yammerReadMessageCount;
    /**
     * Instantiates a new Office365GroupsActivityDetail and sets the default values.
     * @return a void
     */
    public Office365GroupsActivityDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365GroupsActivityDetail
     */
    @javax.annotation.Nonnull
    public static Office365GroupsActivityDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityDetail();
    }
    /**
     * Gets the exchangeMailboxStorageUsedInBytes property value. The storage used of the group mailbox.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchangeMailboxStorageUsedInBytes() {
        return this._exchangeMailboxStorageUsedInBytes;
    }
    /**
     * Gets the exchangeMailboxTotalItemCount property value. The number of items in the group mailbox.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchangeMailboxTotalItemCount() {
        return this._exchangeMailboxTotalItemCount;
    }
    /**
     * Gets the exchangeReceivedEmailCount property value. The number of email that the group mailbox received.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExchangeReceivedEmailCount() {
        return this._exchangeReceivedEmailCount;
    }
    /**
     * Gets the externalMemberCount property value. The group external member count.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExternalMemberCount() {
        return this._externalMemberCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Office365GroupsActivityDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("exchangeMailboxStorageUsedInBytes", (n) -> { currentObject.setExchangeMailboxStorageUsedInBytes(n.getLongValue()); });
            this.put("exchangeMailboxTotalItemCount", (n) -> { currentObject.setExchangeMailboxTotalItemCount(n.getLongValue()); });
            this.put("exchangeReceivedEmailCount", (n) -> { currentObject.setExchangeReceivedEmailCount(n.getLongValue()); });
            this.put("externalMemberCount", (n) -> { currentObject.setExternalMemberCount(n.getLongValue()); });
            this.put("groupDisplayName", (n) -> { currentObject.setGroupDisplayName(n.getStringValue()); });
            this.put("groupId", (n) -> { currentObject.setGroupId(n.getStringValue()); });
            this.put("groupType", (n) -> { currentObject.setGroupType(n.getStringValue()); });
            this.put("isDeleted", (n) -> { currentObject.setIsDeleted(n.getBooleanValue()); });
            this.put("lastActivityDate", (n) -> { currentObject.setLastActivityDate(n.getLocalDateValue()); });
            this.put("memberCount", (n) -> { currentObject.setMemberCount(n.getLongValue()); });
            this.put("ownerPrincipalName", (n) -> { currentObject.setOwnerPrincipalName(n.getStringValue()); });
            this.put("reportPeriod", (n) -> { currentObject.setReportPeriod(n.getStringValue()); });
            this.put("reportRefreshDate", (n) -> { currentObject.setReportRefreshDate(n.getLocalDateValue()); });
            this.put("sharePointActiveFileCount", (n) -> { currentObject.setSharePointActiveFileCount(n.getLongValue()); });
            this.put("sharePointSiteStorageUsedInBytes", (n) -> { currentObject.setSharePointSiteStorageUsedInBytes(n.getLongValue()); });
            this.put("sharePointTotalFileCount", (n) -> { currentObject.setSharePointTotalFileCount(n.getLongValue()); });
            this.put("yammerLikedMessageCount", (n) -> { currentObject.setYammerLikedMessageCount(n.getLongValue()); });
            this.put("yammerPostedMessageCount", (n) -> { currentObject.setYammerPostedMessageCount(n.getLongValue()); });
            this.put("yammerReadMessageCount", (n) -> { currentObject.setYammerReadMessageCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the groupDisplayName property value. The display name of the group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupDisplayName() {
        return this._groupDisplayName;
    }
    /**
     * Gets the groupId property value. The group id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this._groupId;
    }
    /**
     * Gets the groupType property value. The group type. Possible values are: Public or Private.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupType() {
        return this._groupType;
    }
    /**
     * Gets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeleted() {
        return this._isDeleted;
    }
    /**
     * Gets the lastActivityDate property value. The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getLastActivityDate() {
        return this._lastActivityDate;
    }
    /**
     * Gets the memberCount property value. The group member count.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMemberCount() {
        return this._memberCount;
    }
    /**
     * Gets the ownerPrincipalName property value. The group owner principal name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerPrincipalName() {
        return this._ownerPrincipalName;
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
     * Gets the sharePointActiveFileCount property value. The number of active files in SharePoint Group site.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePointActiveFileCount() {
        return this._sharePointActiveFileCount;
    }
    /**
     * Gets the sharePointSiteStorageUsedInBytes property value. The storage used by SharePoint Group site.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePointSiteStorageUsedInBytes() {
        return this._sharePointSiteStorageUsedInBytes;
    }
    /**
     * Gets the sharePointTotalFileCount property value. The total number of files in SharePoint Group site.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSharePointTotalFileCount() {
        return this._sharePointTotalFileCount;
    }
    /**
     * Gets the yammerLikedMessageCount property value. The number of messages liked in Yammer groups.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerLikedMessageCount() {
        return this._yammerLikedMessageCount;
    }
    /**
     * Gets the yammerPostedMessageCount property value. The number of messages posted to Yammer groups.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerPostedMessageCount() {
        return this._yammerPostedMessageCount;
    }
    /**
     * Gets the yammerReadMessageCount property value. The number of messages read in Yammer groups.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getYammerReadMessageCount() {
        return this._yammerReadMessageCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeLongValue("yammerLikedMessageCount", this.getYammerLikedMessageCount());
        writer.writeLongValue("yammerPostedMessageCount", this.getYammerPostedMessageCount());
        writer.writeLongValue("yammerReadMessageCount", this.getYammerReadMessageCount());
    }
    /**
     * Sets the exchangeMailboxStorageUsedInBytes property value. The storage used of the group mailbox.
     * @param value Value to set for the exchangeMailboxStorageUsedInBytes property.
     * @return a void
     */
    public void setExchangeMailboxStorageUsedInBytes(@javax.annotation.Nullable final Long value) {
        this._exchangeMailboxStorageUsedInBytes = value;
    }
    /**
     * Sets the exchangeMailboxTotalItemCount property value. The number of items in the group mailbox.
     * @param value Value to set for the exchangeMailboxTotalItemCount property.
     * @return a void
     */
    public void setExchangeMailboxTotalItemCount(@javax.annotation.Nullable final Long value) {
        this._exchangeMailboxTotalItemCount = value;
    }
    /**
     * Sets the exchangeReceivedEmailCount property value. The number of email that the group mailbox received.
     * @param value Value to set for the exchangeReceivedEmailCount property.
     * @return a void
     */
    public void setExchangeReceivedEmailCount(@javax.annotation.Nullable final Long value) {
        this._exchangeReceivedEmailCount = value;
    }
    /**
     * Sets the externalMemberCount property value. The group external member count.
     * @param value Value to set for the externalMemberCount property.
     * @return a void
     */
    public void setExternalMemberCount(@javax.annotation.Nullable final Long value) {
        this._externalMemberCount = value;
    }
    /**
     * Sets the groupDisplayName property value. The display name of the group.
     * @param value Value to set for the groupDisplayName property.
     * @return a void
     */
    public void setGroupDisplayName(@javax.annotation.Nullable final String value) {
        this._groupDisplayName = value;
    }
    /**
     * Sets the groupId property value. The group id.
     * @param value Value to set for the groupId property.
     * @return a void
     */
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this._groupId = value;
    }
    /**
     * Sets the groupType property value. The group type. Possible values are: Public or Private.
     * @param value Value to set for the groupType property.
     * @return a void
     */
    public void setGroupType(@javax.annotation.Nullable final String value) {
        this._groupType = value;
    }
    /**
     * Sets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    public void setIsDeleted(@javax.annotation.Nullable final Boolean value) {
        this._isDeleted = value;
    }
    /**
     * Sets the lastActivityDate property value. The last activity date for the following scenarios:  group mailbox received email; user viewed, edited, shared, or synced files in SharePoint document library; user viewed SharePoint pages; user posted, read, or liked messages in Yammer groups.
     * @param value Value to set for the lastActivityDate property.
     * @return a void
     */
    public void setLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this._lastActivityDate = value;
    }
    /**
     * Sets the memberCount property value. The group member count.
     * @param value Value to set for the memberCount property.
     * @return a void
     */
    public void setMemberCount(@javax.annotation.Nullable final Long value) {
        this._memberCount = value;
    }
    /**
     * Sets the ownerPrincipalName property value. The group owner principal name.
     * @param value Value to set for the ownerPrincipalName property.
     * @return a void
     */
    public void setOwnerPrincipalName(@javax.annotation.Nullable final String value) {
        this._ownerPrincipalName = value;
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
     * Sets the sharePointActiveFileCount property value. The number of active files in SharePoint Group site.
     * @param value Value to set for the sharePointActiveFileCount property.
     * @return a void
     */
    public void setSharePointActiveFileCount(@javax.annotation.Nullable final Long value) {
        this._sharePointActiveFileCount = value;
    }
    /**
     * Sets the sharePointSiteStorageUsedInBytes property value. The storage used by SharePoint Group site.
     * @param value Value to set for the sharePointSiteStorageUsedInBytes property.
     * @return a void
     */
    public void setSharePointSiteStorageUsedInBytes(@javax.annotation.Nullable final Long value) {
        this._sharePointSiteStorageUsedInBytes = value;
    }
    /**
     * Sets the sharePointTotalFileCount property value. The total number of files in SharePoint Group site.
     * @param value Value to set for the sharePointTotalFileCount property.
     * @return a void
     */
    public void setSharePointTotalFileCount(@javax.annotation.Nullable final Long value) {
        this._sharePointTotalFileCount = value;
    }
    /**
     * Sets the yammerLikedMessageCount property value. The number of messages liked in Yammer groups.
     * @param value Value to set for the yammerLikedMessageCount property.
     * @return a void
     */
    public void setYammerLikedMessageCount(@javax.annotation.Nullable final Long value) {
        this._yammerLikedMessageCount = value;
    }
    /**
     * Sets the yammerPostedMessageCount property value. The number of messages posted to Yammer groups.
     * @param value Value to set for the yammerPostedMessageCount property.
     * @return a void
     */
    public void setYammerPostedMessageCount(@javax.annotation.Nullable final Long value) {
        this._yammerPostedMessageCount = value;
    }
    /**
     * Sets the yammerReadMessageCount property value. The number of messages read in Yammer groups.
     * @param value Value to set for the yammerReadMessageCount property.
     * @return a void
     */
    public void setYammerReadMessageCount(@javax.annotation.Nullable final Long value) {
        this._yammerReadMessageCount = value;
    }
}
