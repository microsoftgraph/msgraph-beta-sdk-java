package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class LearningContent extends Entity implements Parsable {
    /** Keywords, topics, and other tags associated with the learning content. Optional. */
    private java.util.List<String> _additionalTags;
    /** The content web URL for the learning content. Required. */
    private String _contentWebUrl;
    /** The author, creator, or contributor of the learning content. Optional. */
    private String _contributor;
    /** The date when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional. */
    private OffsetDateTime _createdDateTime;
    /** The description or summary for the learning content. Optional. */
    private String _description;
    /** The duration of the learning content in seconds. Optional. */
    private Period _duration;
    /** Unique external content ID for the learning content. Required. */
    private String _externalId;
    /** The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional. */
    private String _format;
    /** Indicates whether the content is active or not. Inactive content will not show up in the UI. The default value is true. Optional. */
    private Boolean _isActive;
    /** Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional. */
    private Boolean _isPremium;
    /** Indicates whether the learning content is searchable or not. The default value is true. Optional. */
    private Boolean _isSearchable;
    /** The language of the learning content, for example, en-us or fr-fr. Required. */
    private String _languageTag;
    /** The date when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number of pages of the learning content, for example, 9. Optional. */
    private Integer _numberOfPages;
    /** The skills tags associated with the learning content. Optional. */
    private java.util.List<String> _skillTags;
    /** The source name of the learning content, such as LinkedIn Learning or Coursera. Optional. */
    private String _sourceName;
    /** The URL of learning content thumbnail image. Optional. */
    private String _thumbnailWebUrl;
    /** The title of the learning content. Required. */
    private String _title;
    /**
     * Instantiates a new learningContent and sets the default values.
     * @return a void
     */
    public LearningContent() {
        super();
        this.setOdataType("#microsoft.graph.learningContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a learningContent
     */
    @javax.annotation.Nonnull
    public static LearningContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningContent();
    }
    /**
     * Gets the additionalTags property value. Keywords, topics, and other tags associated with the learning content. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAdditionalTags() {
        return this._additionalTags;
    }
    /**
     * Gets the contentWebUrl property value. The content web URL for the learning content. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentWebUrl() {
        return this._contentWebUrl;
    }
    /**
     * Gets the contributor property value. The author, creator, or contributor of the learning content. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContributor() {
        return this._contributor;
    }
    /**
     * Gets the createdDateTime property value. The date when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description or summary for the learning content. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the duration property value. The duration of the learning content in seconds. Optional.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDuration() {
        return this._duration;
    }
    /**
     * Gets the externalId property value. Unique external content ID for the learning content. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LearningContent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("additionalTags", (n) -> { currentObject.setAdditionalTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("contentWebUrl", (n) -> { currentObject.setContentWebUrl(n.getStringValue()); });
            this.put("contributor", (n) -> { currentObject.setContributor(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("duration", (n) -> { currentObject.setDuration(n.getPeriodValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("format", (n) -> { currentObject.setFormat(n.getStringValue()); });
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
            this.put("isPremium", (n) -> { currentObject.setIsPremium(n.getBooleanValue()); });
            this.put("isSearchable", (n) -> { currentObject.setIsSearchable(n.getBooleanValue()); });
            this.put("languageTag", (n) -> { currentObject.setLanguageTag(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("numberOfPages", (n) -> { currentObject.setNumberOfPages(n.getIntegerValue()); });
            this.put("skillTags", (n) -> { currentObject.setSkillTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sourceName", (n) -> { currentObject.setSourceName(n.getStringValue()); });
            this.put("thumbnailWebUrl", (n) -> { currentObject.setThumbnailWebUrl(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the format property value. The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormat() {
        return this._format;
    }
    /**
     * Gets the isActive property value. Indicates whether the content is active or not. Inactive content will not show up in the UI. The default value is true. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Gets the isPremium property value. Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPremium() {
        return this._isPremium;
    }
    /**
     * Gets the isSearchable property value. Indicates whether the learning content is searchable or not. The default value is true. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this._isSearchable;
    }
    /**
     * Gets the languageTag property value. The language of the learning content, for example, en-us or fr-fr. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the numberOfPages property value. The number of pages of the learning content, for example, 9. Optional.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfPages() {
        return this._numberOfPages;
    }
    /**
     * Gets the skillTags property value. The skills tags associated with the learning content. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSkillTags() {
        return this._skillTags;
    }
    /**
     * Gets the sourceName property value. The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceName() {
        return this._sourceName;
    }
    /**
     * Gets the thumbnailWebUrl property value. The URL of learning content thumbnail image. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailWebUrl() {
        return this._thumbnailWebUrl;
    }
    /**
     * Gets the title property value. The title of the learning content. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("additionalTags", this.getAdditionalTags());
        writer.writeStringValue("contentWebUrl", this.getContentWebUrl());
        writer.writeStringValue("contributor", this.getContributor());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writePeriodValue("duration", this.getDuration());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("format", this.getFormat());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeBooleanValue("isPremium", this.getIsPremium());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("numberOfPages", this.getNumberOfPages());
        writer.writeCollectionOfPrimitiveValues("skillTags", this.getSkillTags());
        writer.writeStringValue("sourceName", this.getSourceName());
        writer.writeStringValue("thumbnailWebUrl", this.getThumbnailWebUrl());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the additionalTags property value. Keywords, topics, and other tags associated with the learning content. Optional.
     * @param value Value to set for the additionalTags property.
     * @return a void
     */
    public void setAdditionalTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._additionalTags = value;
    }
    /**
     * Sets the contentWebUrl property value. The content web URL for the learning content. Required.
     * @param value Value to set for the contentWebUrl property.
     * @return a void
     */
    public void setContentWebUrl(@javax.annotation.Nullable final String value) {
        this._contentWebUrl = value;
    }
    /**
     * Sets the contributor property value. The author, creator, or contributor of the learning content. Optional.
     * @param value Value to set for the contributor property.
     * @return a void
     */
    public void setContributor(@javax.annotation.Nullable final String value) {
        this._contributor = value;
    }
    /**
     * Sets the createdDateTime property value. The date when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description or summary for the learning content. Optional.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the duration property value. The duration of the learning content in seconds. Optional.
     * @param value Value to set for the duration property.
     * @return a void
     */
    public void setDuration(@javax.annotation.Nullable final Period value) {
        this._duration = value;
    }
    /**
     * Sets the externalId property value. Unique external content ID for the learning content. Required.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the format property value. The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final String value) {
        this._format = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the content is active or not. Inactive content will not show up in the UI. The default value is true. Optional.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
    /**
     * Sets the isPremium property value. Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     * @param value Value to set for the isPremium property.
     * @return a void
     */
    public void setIsPremium(@javax.annotation.Nullable final Boolean value) {
        this._isPremium = value;
    }
    /**
     * Sets the isSearchable property value. Indicates whether the learning content is searchable or not. The default value is true. Optional.
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this._isSearchable = value;
    }
    /**
     * Sets the languageTag property value. The language of the learning content, for example, en-us or fr-fr. Required.
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the numberOfPages property value. The number of pages of the learning content, for example, 9. Optional.
     * @param value Value to set for the numberOfPages property.
     * @return a void
     */
    public void setNumberOfPages(@javax.annotation.Nullable final Integer value) {
        this._numberOfPages = value;
    }
    /**
     * Sets the skillTags property value. The skills tags associated with the learning content. Optional.
     * @param value Value to set for the skillTags property.
     * @return a void
     */
    public void setSkillTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._skillTags = value;
    }
    /**
     * Sets the sourceName property value. The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     * @param value Value to set for the sourceName property.
     * @return a void
     */
    public void setSourceName(@javax.annotation.Nullable final String value) {
        this._sourceName = value;
    }
    /**
     * Sets the thumbnailWebUrl property value. The URL of learning content thumbnail image. Optional.
     * @param value Value to set for the thumbnailWebUrl property.
     * @return a void
     */
    public void setThumbnailWebUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailWebUrl = value;
    }
    /**
     * Sets the title property value. The title of the learning content. Required.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
