package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamTemplateDefinition extends Entity implements Parsable {
    /** The audience property */
    private TeamTemplateAudience audience;
    /** The categories property */
    private java.util.List<String> categories;
    /** The description property */
    private String description;
    /** The displayName property */
    private String displayName;
    /** The iconUrl property */
    private String iconUrl;
    /** The languageTag property */
    private String languageTag;
    /** The lastModifiedBy property */
    private IdentitySet lastModifiedBy;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The parentTemplateId property */
    private String parentTemplateId;
    /** The publisherName property */
    private String publisherName;
    /** The shortDescription property */
    private String shortDescription;
    /** The teamDefinition property */
    private Team teamDefinition;
    /**
     * Instantiates a new teamTemplateDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamTemplateDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamTemplateDefinition
     */
    @javax.annotation.Nonnull
    public static TeamTemplateDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamTemplateDefinition();
    }
    /**
     * Gets the audience property value. The audience property
     * @return a teamTemplateAudience
     */
    @javax.annotation.Nullable
    public TeamTemplateAudience getAudience() {
        return this.audience;
    }
    /**
     * Gets the categories property value. The categories property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.categories;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the iconUrl property value. The iconUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIconUrl() {
        return this.iconUrl;
    }
    /**
     * Gets the languageTag property value. The languageTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the parentTemplateId property value. The parentTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentTemplateId() {
        return this.parentTemplateId;
    }
    /**
     * Gets the publisherName property value. The publisherName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisherName() {
        return this.publisherName;
    }
    /**
     * Gets the shortDescription property value. The shortDescription property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShortDescription() {
        return this.shortDescription;
    }
    /**
     * Gets the teamDefinition property value. The teamDefinition property
     * @return a team
     */
    @javax.annotation.Nullable
    public Team getTeamDefinition() {
        return this.teamDefinition;
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
     * Sets the audience property value. The audience property
     * @param value Value to set for the audience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudience(@javax.annotation.Nullable final TeamTemplateAudience value) {
        this.audience = value;
    }
    /**
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the iconUrl property value. The iconUrl property
     * @param value Value to set for the iconUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIconUrl(@javax.annotation.Nullable final String value) {
        this.iconUrl = value;
    }
    /**
     * Sets the languageTag property value. The languageTag property
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the parentTemplateId property value. The parentTemplateId property
     * @param value Value to set for the parentTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentTemplateId(@javax.annotation.Nullable final String value) {
        this.parentTemplateId = value;
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisherName(@javax.annotation.Nullable final String value) {
        this.publisherName = value;
    }
    /**
     * Sets the shortDescription property value. The shortDescription property
     * @param value Value to set for the shortDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShortDescription(@javax.annotation.Nullable final String value) {
        this.shortDescription = value;
    }
    /**
     * Sets the teamDefinition property value. The teamDefinition property
     * @param value Value to set for the teamDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamDefinition(@javax.annotation.Nullable final Team value) {
        this.teamDefinition = value;
    }
}
