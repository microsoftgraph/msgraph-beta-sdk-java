package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkSection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamworkSection} and sets the default values.
     */
    public TeamworkSection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkSection}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkSection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSection();
    }
    /**
     * Gets the createdDateTime property value. Date and time when the section was created. Read-only. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayIcon property value. The icon displayed for the section.
     * @return a {@link SectionDisplayIcon}
     */
    @jakarta.annotation.Nullable
    public SectionDisplayIcon getDisplayIcon() {
        return this.backingStore.get("displayIcon");
    }
    /**
     * Gets the displayName property value. The display name of the section. Required. Maximum length is 50 characters. Display names are case-sensitive and must be unique within a user&apos;s sections. The following names are reserved for system-defined sections and can&apos;t be used when creating a user-defined section: RecentChats, QuickViews, TeamsAndChannels, MutedChats, MeetingChats, EngageCommunities.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayIcon", (n) -> { this.setDisplayIcon(n.getObjectValue(SectionDisplayIcon::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isExpanded", (n) -> { this.setIsExpanded(n.getBooleanValue()); });
        deserializerMap.put("isHierarchicalViewEnabled", (n) -> { this.setIsHierarchicalViewEnabled(n.getBooleanValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(TeamworkSectionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sectionType", (n) -> { this.setSectionType(n.getEnumValue(SectionType::forValue)); });
        deserializerMap.put("sortType", (n) -> { this.setSortType(n.getEnumValue(SectionSortType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isExpanded property value. Indicates whether the section is expanded in the user interface. The default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExpanded() {
        return this.backingStore.get("isExpanded");
    }
    /**
     * Gets the isHierarchicalViewEnabled property value. Indicates whether the hierarchical view is enabled for the section. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHierarchicalViewEnabled() {
        return this.backingStore.get("isHierarchicalViewEnabled");
    }
    /**
     * Gets the items property value. The items (chats, channels, meetings, or communities) organized within the section.
     * @return a {@link java.util.List<TeamworkSectionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkSectionItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the section was last modified. Read-only. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the sectionType property value. The type of the section. The possible values are: userDefined, systemDefined, unknownFutureValue. Read-only.
     * @return a {@link SectionType}
     */
    @jakarta.annotation.Nullable
    public SectionType getSectionType() {
        return this.backingStore.get("sectionType");
    }
    /**
     * Gets the sortType property value. The sort order of items in the section. The valid values depend on the sectionType. The possible values are: mostRecent, unreadThenMostRecent, nameAlphabetical, userDefinedCustomOrder, unknownFutureValue.
     * @return a {@link SectionSortType}
     */
    @jakarta.annotation.Nullable
    public SectionSortType getSortType() {
        return this.backingStore.get("sortType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("displayIcon", this.getDisplayIcon());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isExpanded", this.getIsExpanded());
        writer.writeBooleanValue("isHierarchicalViewEnabled", this.getIsHierarchicalViewEnabled());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("sectionType", this.getSectionType());
        writer.writeEnumValue("sortType", this.getSortType());
    }
    /**
     * Sets the createdDateTime property value. Date and time when the section was created. Read-only. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayIcon property value. The icon displayed for the section.
     * @param value Value to set for the displayIcon property.
     */
    public void setDisplayIcon(@jakarta.annotation.Nullable final SectionDisplayIcon value) {
        this.backingStore.set("displayIcon", value);
    }
    /**
     * Sets the displayName property value. The display name of the section. Required. Maximum length is 50 characters. Display names are case-sensitive and must be unique within a user&apos;s sections. The following names are reserved for system-defined sections and can&apos;t be used when creating a user-defined section: RecentChats, QuickViews, TeamsAndChannels, MutedChats, MeetingChats, EngageCommunities.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isExpanded property value. Indicates whether the section is expanded in the user interface. The default value is true.
     * @param value Value to set for the isExpanded property.
     */
    public void setIsExpanded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExpanded", value);
    }
    /**
     * Sets the isHierarchicalViewEnabled property value. Indicates whether the hierarchical view is enabled for the section. Read-only.
     * @param value Value to set for the isHierarchicalViewEnabled property.
     */
    public void setIsHierarchicalViewEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHierarchicalViewEnabled", value);
    }
    /**
     * Sets the items property value. The items (chats, channels, meetings, or communities) organized within the section.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<TeamworkSectionItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the section was last modified. Read-only. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the sectionType property value. The type of the section. The possible values are: userDefined, systemDefined, unknownFutureValue. Read-only.
     * @param value Value to set for the sectionType property.
     */
    public void setSectionType(@jakarta.annotation.Nullable final SectionType value) {
        this.backingStore.set("sectionType", value);
    }
    /**
     * Sets the sortType property value. The sort order of items in the section. The valid values depend on the sectionType. The possible values are: mostRecent, unreadThenMostRecent, nameAlphabetical, userDefinedCustomOrder, unknownFutureValue.
     * @param value Value to set for the sortType property.
     */
    public void setSortType(@jakarta.annotation.Nullable final SectionSortType value) {
        this.backingStore.set("sortType", value);
    }
}
