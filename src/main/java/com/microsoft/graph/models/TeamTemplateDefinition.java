package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class TeamTemplateDefinition extends Entity implements Parsable {
    /** The audience property */
    private TeamTemplateAudience _audience;
    /** The categories property */
    private java.util.List<String> _categories;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The iconUrl property */
    private String _iconUrl;
    /** The languageTag property */
    private String _languageTag;
    /** The lastModifiedBy property */
    private IdentitySet _lastModifiedBy;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The parentTemplateId property */
    private String _parentTemplateId;
    /** The publisherName property */
    private String _publisherName;
    /** The shortDescription property */
    private String _shortDescription;
    /** The teamDefinition property */
    private Team _teamDefinition;
    /**
     * Instantiates a new teamTemplateDefinition and sets the default values.
     * @return a void
     */
    public TeamTemplateDefinition() {
        super();
        this.setOdataType("#microsoft.graph.teamTemplateDefinition");
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
        return this._audience;
    }
    /**
     * Gets the categories property value. The categories property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamTemplateDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("audience", (n) -> { currentObject.setAudience(n.getEnumValue(TeamTemplateAudience.class)); });
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("iconUrl", (n) -> { currentObject.setIconUrl(n.getStringValue()); });
            this.put("languageTag", (n) -> { currentObject.setLanguageTag(n.getStringValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("parentTemplateId", (n) -> { currentObject.setParentTemplateId(n.getStringValue()); });
            this.put("publisherName", (n) -> { currentObject.setPublisherName(n.getStringValue()); });
            this.put("shortDescription", (n) -> { currentObject.setShortDescription(n.getStringValue()); });
            this.put("teamDefinition", (n) -> { currentObject.setTeamDefinition(n.getObjectValue(Team::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the iconUrl property value. The iconUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIconUrl() {
        return this._iconUrl;
    }
    /**
     * Gets the languageTag property value. The languageTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the parentTemplateId property value. The parentTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentTemplateId() {
        return this._parentTemplateId;
    }
    /**
     * Gets the publisherName property value. The publisherName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisherName() {
        return this._publisherName;
    }
    /**
     * Gets the shortDescription property value. The shortDescription property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShortDescription() {
        return this._shortDescription;
    }
    /**
     * Gets the teamDefinition property value. The teamDefinition property
     * @return a team
     */
    @javax.annotation.Nullable
    public Team getTeamDefinition() {
        return this._teamDefinition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAudience(@javax.annotation.Nullable final TeamTemplateAudience value) {
        this._audience = value;
    }
    /**
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the iconUrl property value. The iconUrl property
     * @param value Value to set for the iconUrl property.
     * @return a void
     */
    public void setIconUrl(@javax.annotation.Nullable final String value) {
        this._iconUrl = value;
    }
    /**
     * Sets the languageTag property value. The languageTag property
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the parentTemplateId property value. The parentTemplateId property
     * @param value Value to set for the parentTemplateId property.
     * @return a void
     */
    public void setParentTemplateId(@javax.annotation.Nullable final String value) {
        this._parentTemplateId = value;
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     * @return a void
     */
    public void setPublisherName(@javax.annotation.Nullable final String value) {
        this._publisherName = value;
    }
    /**
     * Sets the shortDescription property value. The shortDescription property
     * @param value Value to set for the shortDescription property.
     * @return a void
     */
    public void setShortDescription(@javax.annotation.Nullable final String value) {
        this._shortDescription = value;
    }
    /**
     * Sets the teamDefinition property value. The teamDefinition property
     * @param value Value to set for the teamDefinition property.
     * @return a void
     */
    public void setTeamDefinition(@javax.annotation.Nullable final Team value) {
        this._teamDefinition = value;
    }
}
