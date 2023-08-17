package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamTemplateDefinition extends Entity implements Parsable {
    /**
     * Describes the audience the team template is available to. The possible values are: organization, user, public, unknownFutureValue.
     */
    private TeamTemplateAudience audience;
    /**
     * The assigned categories for the team template.
     */
    private java.util.List<String> categories;
    /**
     * A brief description of the team template as it will appear to the users in Microsoft Teams.
     */
    private String description;
    /**
     * The user defined name of the team template.
     */
    private String displayName;
    /**
     * The icon url for the team template.
     */
    private String iconUrl;
    /**
     * Language the template is available in.
     */
    private String languageTag;
    /**
     * The identity of the user who last modified the team template.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The date time of when the team template was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The templateId for the team template
     */
    private String parentTemplateId;
    /**
     * The organization which published the team template.
     */
    private String publisherName;
    /**
     * A short-description of the team template as it will appear to the users in Microsoft Teams.
     */
    private String shortDescription;
    /**
     * Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
     */
    private Team teamDefinition;
    /**
     * Instantiates a new teamTemplateDefinition and sets the default values.
     */
    public TeamTemplateDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamTemplateDefinition
     */
    @jakarta.annotation.Nonnull
    public static TeamTemplateDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamTemplateDefinition();
    }
    /**
     * Gets the audience property value. Describes the audience the team template is available to. The possible values are: organization, user, public, unknownFutureValue.
     * @return a teamTemplateAudience
     */
    @jakarta.annotation.Nullable
    public TeamTemplateAudience getAudience() {
        return this.audience;
    }
    /**
     * Gets the categories property value. The assigned categories for the team template.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.categories;
    }
    /**
     * Gets the description property value. A brief description of the team template as it will appear to the users in Microsoft Teams.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The user defined name of the team template.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getEnumValue(TeamTemplateAudience.class)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("iconUrl", (n) -> { this.setIconUrl(n.getStringValue()); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parentTemplateId", (n) -> { this.setParentTemplateId(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        deserializerMap.put("shortDescription", (n) -> { this.setShortDescription(n.getStringValue()); });
        deserializerMap.put("teamDefinition", (n) -> { this.setTeamDefinition(n.getObjectValue(Team::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iconUrl property value. The icon url for the team template.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIconUrl() {
        return this.iconUrl;
    }
    /**
     * Gets the languageTag property value. Language the template is available in.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the lastModifiedBy property value. The identity of the user who last modified the team template.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time of when the team template was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the parentTemplateId property value. The templateId for the team template
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParentTemplateId() {
        return this.parentTemplateId;
    }
    /**
     * Gets the publisherName property value. The organization which published the team template.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.publisherName;
    }
    /**
     * Gets the shortDescription property value. A short-description of the team template as it will appear to the users in Microsoft Teams.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getShortDescription() {
        return this.shortDescription;
    }
    /**
     * Gets the teamDefinition property value. Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
     * @return a team
     */
    @jakarta.annotation.Nullable
    public Team getTeamDefinition() {
        return this.teamDefinition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("audience", this.getAudience());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("iconUrl", this.getIconUrl());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("parentTemplateId", this.getParentTemplateId());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeStringValue("shortDescription", this.getShortDescription());
        writer.writeObjectValue("teamDefinition", this.getTeamDefinition());
    }
    /**
     * Sets the audience property value. Describes the audience the team template is available to. The possible values are: organization, user, public, unknownFutureValue.
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final TeamTemplateAudience value) {
        this.audience = value;
    }
    /**
     * Sets the categories property value. The assigned categories for the team template.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the description property value. A brief description of the team template as it will appear to the users in Microsoft Teams.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The user defined name of the team template.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the iconUrl property value. The icon url for the team template.
     * @param value Value to set for the iconUrl property.
     */
    public void setIconUrl(@jakarta.annotation.Nullable final String value) {
        this.iconUrl = value;
    }
    /**
     * Sets the languageTag property value. Language the template is available in.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the lastModifiedBy property value. The identity of the user who last modified the team template.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time of when the team template was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the parentTemplateId property value. The templateId for the team template
     * @param value Value to set for the parentTemplateId property.
     */
    public void setParentTemplateId(@jakarta.annotation.Nullable final String value) {
        this.parentTemplateId = value;
    }
    /**
     * Sets the publisherName property value. The organization which published the team template.
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.publisherName = value;
    }
    /**
     * Sets the shortDescription property value. A short-description of the team template as it will appear to the users in Microsoft Teams.
     * @param value Value to set for the shortDescription property.
     */
    public void setShortDescription(@jakarta.annotation.Nullable final String value) {
        this.shortDescription = value;
    }
    /**
     * Sets the teamDefinition property value. Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
     * @param value Value to set for the teamDefinition property.
     */
    public void setTeamDefinition(@jakarta.annotation.Nullable final Team value) {
        this.teamDefinition = value;
    }
}
