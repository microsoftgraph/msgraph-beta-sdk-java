package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Channel extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Channel} and sets the default values.
     */
    public Channel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Channel}
     */
    @jakarta.annotation.Nonnull
    public static Channel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Channel();
    }
    /**
     * Gets the allMembers property value. A collection of membership records associated with the channel. It includes both direct and indirect members of shared channels.
     * @return a {@link java.util.List<ConversationMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationMember> getAllMembers() {
        return this.backingStore.get("allMembers");
    }
    /**
     * Gets the createdDateTime property value. Read only. Timestamp at which the channel was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Optional textual description for the channel.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Channel name as it appears to the user in Microsoft Teams. The maximum length is 50 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email address for sending messages to the channel. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allMembers", (n) -> { this.setAllMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("filesFolder", (n) -> { this.setFilesFolder(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("isFavoriteByDefault", (n) -> { this.setIsFavoriteByDefault(n.getBooleanValue()); });
        deserializerMap.put("layoutType", (n) -> { this.setLayoutType(n.getEnumValue(ChannelLayoutType::forValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("membershipType", (n) -> { this.setMembershipType(n.getEnumValue(ChannelMembershipType::forValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("moderationSettings", (n) -> { this.setModerationSettings(n.getObjectValue(ChannelModerationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("planner", (n) -> { this.setPlanner(n.getObjectValue(TeamsChannelPlanner::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedWithTeams", (n) -> { this.setSharedWithTeams(n.getCollectionOfObjectValues(SharedWithChannelTeamInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getObjectValue(ChannelSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("tabs", (n) -> { this.setTabs(n.getCollectionOfObjectValues(TeamsTab::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filesFolder property value. Metadata for the location where the channel&apos;s files are stored.
     * @return a {@link DriveItem}
     */
    @jakarta.annotation.Nullable
    public DriveItem getFilesFolder() {
        return this.backingStore.get("filesFolder");
    }
    /**
     * Gets the isArchived property value. Indicates whether the channel is archived. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.backingStore.get("isArchived");
    }
    /**
     * Gets the isFavoriteByDefault property value. Indicates whether the channel should be marked as recommended for all members of the team to show in their channel list. Note: All recommended channels automatically show in the channels list for education and frontline worker users. The property can only be set programmatically via the Create team method. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFavoriteByDefault() {
        return this.backingStore.get("isFavoriteByDefault");
    }
    /**
     * Gets the layoutType property value. The layoutType property
     * @return a {@link ChannelLayoutType}
     */
    @jakarta.annotation.Nullable
    public ChannelLayoutType getLayoutType() {
        return this.backingStore.get("layoutType");
    }
    /**
     * Gets the members property value. A collection of membership records associated with the channel.
     * @return a {@link java.util.List<ConversationMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the membershipType property value. The type of the channel. Can be set during creation and can&apos;t be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     * @return a {@link ChannelMembershipType}
     */
    @jakarta.annotation.Nullable
    public ChannelMembershipType getMembershipType() {
        return this.backingStore.get("membershipType");
    }
    /**
     * Gets the messages property value. A collection of all the messages in the channel. Nullable.
     * @return a {@link java.util.List<ChatMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChatMessage> getMessages() {
        return this.backingStore.get("messages");
    }
    /**
     * Gets the moderationSettings property value. Settings to configure channel moderation to control who can start new posts and reply to posts in that channel.
     * @return a {@link ChannelModerationSettings}
     */
    @jakarta.annotation.Nullable
    public ChannelModerationSettings getModerationSettings() {
        return this.backingStore.get("moderationSettings");
    }
    /**
     * Gets the planner property value. Selective Planner services available to this channel. Currently, only shared channels are supported. Read-only. Nullable.
     * @return a {@link TeamsChannelPlanner}
     */
    @jakarta.annotation.Nullable
    public TeamsChannelPlanner getPlanner() {
        return this.backingStore.get("planner");
    }
    /**
     * Gets the sharedWithTeams property value. A collection of teams with which a channel is shared.
     * @return a {@link java.util.List<SharedWithChannelTeamInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharedWithChannelTeamInfo> getSharedWithTeams() {
        return this.backingStore.get("sharedWithTeams");
    }
    /**
     * Gets the summary property value. Contains summary information about the channel, including number of guests, members, owners, and an indicator for members from other tenants. The summary property is only returned if it appears in the $select clause of the Get channel method.
     * @return a {@link ChannelSummary}
     */
    @jakarta.annotation.Nullable
    public ChannelSummary getSummary() {
        return this.backingStore.get("summary");
    }
    /**
     * Gets the tabs property value. A collection of all the tabs in the channel.
     * @return a {@link java.util.List<TeamsTab>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsTab> getTabs() {
        return this.backingStore.get("tabs");
    }
    /**
     * Gets the tenantId property value. The ID of the Microsoft Entra tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the webUrl property value. A hyperlink to the channel in Microsoft Teams. This URL is supplied when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("allMembers", this.getAllMembers());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("filesFolder", this.getFilesFolder());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isFavoriteByDefault", this.getIsFavoriteByDefault());
        writer.writeEnumValue("layoutType", this.getLayoutType());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeEnumValue("membershipType", this.getMembershipType());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeObjectValue("moderationSettings", this.getModerationSettings());
        writer.writeObjectValue("planner", this.getPlanner());
        writer.writeCollectionOfObjectValues("sharedWithTeams", this.getSharedWithTeams());
        writer.writeObjectValue("summary", this.getSummary());
        writer.writeCollectionOfObjectValues("tabs", this.getTabs());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the allMembers property value. A collection of membership records associated with the channel. It includes both direct and indirect members of shared channels.
     * @param value Value to set for the allMembers property.
     */
    public void setAllMembers(@jakarta.annotation.Nullable final java.util.List<ConversationMember> value) {
        this.backingStore.set("allMembers", value);
    }
    /**
     * Sets the createdDateTime property value. Read only. Timestamp at which the channel was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Optional textual description for the channel.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Channel name as it appears to the user in Microsoft Teams. The maximum length is 50 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email address for sending messages to the channel. Read-only.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the filesFolder property value. Metadata for the location where the channel&apos;s files are stored.
     * @param value Value to set for the filesFolder property.
     */
    public void setFilesFolder(@jakarta.annotation.Nullable final DriveItem value) {
        this.backingStore.set("filesFolder", value);
    }
    /**
     * Sets the isArchived property value. Indicates whether the channel is archived. Read-only.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isArchived", value);
    }
    /**
     * Sets the isFavoriteByDefault property value. Indicates whether the channel should be marked as recommended for all members of the team to show in their channel list. Note: All recommended channels automatically show in the channels list for education and frontline worker users. The property can only be set programmatically via the Create team method. The default value is false.
     * @param value Value to set for the isFavoriteByDefault property.
     */
    public void setIsFavoriteByDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFavoriteByDefault", value);
    }
    /**
     * Sets the layoutType property value. The layoutType property
     * @param value Value to set for the layoutType property.
     */
    public void setLayoutType(@jakarta.annotation.Nullable final ChannelLayoutType value) {
        this.backingStore.set("layoutType", value);
    }
    /**
     * Sets the members property value. A collection of membership records associated with the channel.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<ConversationMember> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the membershipType property value. The type of the channel. Can be set during creation and can&apos;t be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     * @param value Value to set for the membershipType property.
     */
    public void setMembershipType(@jakarta.annotation.Nullable final ChannelMembershipType value) {
        this.backingStore.set("membershipType", value);
    }
    /**
     * Sets the messages property value. A collection of all the messages in the channel. Nullable.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<ChatMessage> value) {
        this.backingStore.set("messages", value);
    }
    /**
     * Sets the moderationSettings property value. Settings to configure channel moderation to control who can start new posts and reply to posts in that channel.
     * @param value Value to set for the moderationSettings property.
     */
    public void setModerationSettings(@jakarta.annotation.Nullable final ChannelModerationSettings value) {
        this.backingStore.set("moderationSettings", value);
    }
    /**
     * Sets the planner property value. Selective Planner services available to this channel. Currently, only shared channels are supported. Read-only. Nullable.
     * @param value Value to set for the planner property.
     */
    public void setPlanner(@jakarta.annotation.Nullable final TeamsChannelPlanner value) {
        this.backingStore.set("planner", value);
    }
    /**
     * Sets the sharedWithTeams property value. A collection of teams with which a channel is shared.
     * @param value Value to set for the sharedWithTeams property.
     */
    public void setSharedWithTeams(@jakarta.annotation.Nullable final java.util.List<SharedWithChannelTeamInfo> value) {
        this.backingStore.set("sharedWithTeams", value);
    }
    /**
     * Sets the summary property value. Contains summary information about the channel, including number of guests, members, owners, and an indicator for members from other tenants. The summary property is only returned if it appears in the $select clause of the Get channel method.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final ChannelSummary value) {
        this.backingStore.set("summary", value);
    }
    /**
     * Sets the tabs property value. A collection of all the tabs in the channel.
     * @param value Value to set for the tabs property.
     */
    public void setTabs(@jakarta.annotation.Nullable final java.util.List<TeamsTab> value) {
        this.backingStore.set("tabs", value);
    }
    /**
     * Sets the tenantId property value. The ID of the Microsoft Entra tenant.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the webUrl property value. A hyperlink to the channel in Microsoft Teams. This URL is supplied when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
