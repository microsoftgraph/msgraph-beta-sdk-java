package com.microsoft.graph.models.search;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Bookmark extends SearchAnswer implements Parsable {
    /** Timestamp of when the bookmark will stop to appear as a search result. Set as null for always available. */
    private OffsetDateTime _availabilityEndDateTime;
    /** Timestamp of when the bookmark will start to appear as a search result. Set as null for always available. */
    private OffsetDateTime _availabilityStartDateTime;
    /** Categories commonly used to describe this bookmark. For example, IT and HR. */
    private java.util.List<String> _categories;
    /** List of security groups able to view this bookmark. */
    private java.util.List<String> _groupIds;
    /** True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only. */
    private Boolean _isSuggested;
    /** Keywords that trigger this bookmark to appear in search results. */
    private AnswerKeyword _keywords;
    /** A list of language names that are geographically specific and that this bookmark can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. See supported language tags for the list of possible values. */
    private java.util.List<String> _languageTags;
    /** List of devices and operating systems able to view this bookmark. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP. */
    private java.util.List<String> _platforms;
    /** List of Power Apps associated with this bookmark. If users add existing Power Apps to a bookmark, they can complete tasks, such as to enter vacation time or to report expenses on the search results page. */
    private java.util.List<String> _powerAppIds;
    /** The state property */
    private AnswerState _state;
    /** Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations. */
    private java.util.List<AnswerVariant> _targetedVariations;
    /**
     * Instantiates a new Bookmark and sets the default values.
     * @return a void
     */
    public Bookmark() {
        super();
        this.setOdataType("#microsoft.graph.search.bookmark");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Bookmark
     */
    @javax.annotation.Nonnull
    public static Bookmark createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Bookmark();
    }
    /**
     * Gets the availabilityEndDateTime property value. Timestamp of when the bookmark will stop to appear as a search result. Set as null for always available.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAvailabilityEndDateTime() {
        return this._availabilityEndDateTime;
    }
    /**
     * Gets the availabilityStartDateTime property value. Timestamp of when the bookmark will start to appear as a search result. Set as null for always available.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAvailabilityStartDateTime() {
        return this._availabilityStartDateTime;
    }
    /**
     * Gets the categories property value. Categories commonly used to describe this bookmark. For example, IT and HR.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Bookmark currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("availabilityEndDateTime", (n) -> { currentObject.setAvailabilityEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("availabilityStartDateTime", (n) -> { currentObject.setAvailabilityStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("groupIds", (n) -> { currentObject.setGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isSuggested", (n) -> { currentObject.setIsSuggested(n.getBooleanValue()); });
            this.put("keywords", (n) -> { currentObject.setKeywords(n.getObjectValue(AnswerKeyword::createFromDiscriminatorValue)); });
            this.put("languageTags", (n) -> { currentObject.setLanguageTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("platforms", (n) -> { currentObject.setPlatforms(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("powerAppIds", (n) -> { currentObject.setPowerAppIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AnswerState.class)); });
            this.put("targetedVariations", (n) -> { currentObject.setTargetedVariations(n.getCollectionOfObjectValues(AnswerVariant::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupIds property value. List of security groups able to view this bookmark.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroupIds() {
        return this._groupIds;
    }
    /**
     * Gets the isSuggested property value. True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSuggested() {
        return this._isSuggested;
    }
    /**
     * Gets the keywords property value. Keywords that trigger this bookmark to appear in search results.
     * @return a answerKeyword
     */
    @javax.annotation.Nullable
    public AnswerKeyword getKeywords() {
        return this._keywords;
    }
    /**
     * Gets the languageTags property value. A list of language names that are geographically specific and that this bookmark can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. See supported language tags for the list of possible values.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLanguageTags() {
        return this._languageTags;
    }
    /**
     * Gets the platforms property value. List of devices and operating systems able to view this bookmark. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPlatforms() {
        return this._platforms;
    }
    /**
     * Gets the powerAppIds property value. List of Power Apps associated with this bookmark. If users add existing Power Apps to a bookmark, they can complete tasks, such as to enter vacation time or to report expenses on the search results page.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPowerAppIds() {
        return this._powerAppIds;
    }
    /**
     * Gets the state property value. The state property
     * @return a answerState
     */
    @javax.annotation.Nullable
    public AnswerState getState() {
        return this._state;
    }
    /**
     * Gets the targetedVariations property value. Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     * @return a answerVariant
     */
    @javax.annotation.Nullable
    public java.util.List<AnswerVariant> getTargetedVariations() {
        return this._targetedVariations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("availabilityEndDateTime", this.getAvailabilityEndDateTime());
        writer.writeOffsetDateTimeValue("availabilityStartDateTime", this.getAvailabilityStartDateTime());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfPrimitiveValues("groupIds", this.getGroupIds());
        writer.writeBooleanValue("isSuggested", this.getIsSuggested());
        writer.writeObjectValue("keywords", this.getKeywords());
        writer.writeCollectionOfPrimitiveValues("languageTags", this.getLanguageTags());
        writer.writeCollectionOfPrimitiveValues("platforms", this.getPlatforms());
        writer.writeCollectionOfPrimitiveValues("powerAppIds", this.getPowerAppIds());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("targetedVariations", this.getTargetedVariations());
    }
    /**
     * Sets the availabilityEndDateTime property value. Timestamp of when the bookmark will stop to appear as a search result. Set as null for always available.
     * @param value Value to set for the availabilityEndDateTime property.
     * @return a void
     */
    public void setAvailabilityEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._availabilityEndDateTime = value;
    }
    /**
     * Sets the availabilityStartDateTime property value. Timestamp of when the bookmark will start to appear as a search result. Set as null for always available.
     * @param value Value to set for the availabilityStartDateTime property.
     * @return a void
     */
    public void setAvailabilityStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._availabilityStartDateTime = value;
    }
    /**
     * Sets the categories property value. Categories commonly used to describe this bookmark. For example, IT and HR.
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the groupIds property value. List of security groups able to view this bookmark.
     * @param value Value to set for the groupIds property.
     * @return a void
     */
    public void setGroupIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._groupIds = value;
    }
    /**
     * Sets the isSuggested property value. True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     * @param value Value to set for the isSuggested property.
     * @return a void
     */
    public void setIsSuggested(@javax.annotation.Nullable final Boolean value) {
        this._isSuggested = value;
    }
    /**
     * Sets the keywords property value. Keywords that trigger this bookmark to appear in search results.
     * @param value Value to set for the keywords property.
     * @return a void
     */
    public void setKeywords(@javax.annotation.Nullable final AnswerKeyword value) {
        this._keywords = value;
    }
    /**
     * Sets the languageTags property value. A list of language names that are geographically specific and that this bookmark can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. See supported language tags for the list of possible values.
     * @param value Value to set for the languageTags property.
     * @return a void
     */
    public void setLanguageTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._languageTags = value;
    }
    /**
     * Sets the platforms property value. List of devices and operating systems able to view this bookmark. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    public void setPlatforms(@javax.annotation.Nullable final java.util.List<String> value) {
        this._platforms = value;
    }
    /**
     * Sets the powerAppIds property value. List of Power Apps associated with this bookmark. If users add existing Power Apps to a bookmark, they can complete tasks, such as to enter vacation time or to report expenses on the search results page.
     * @param value Value to set for the powerAppIds property.
     * @return a void
     */
    public void setPowerAppIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._powerAppIds = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final AnswerState value) {
        this._state = value;
    }
    /**
     * Sets the targetedVariations property value. Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     * @param value Value to set for the targetedVariations property.
     * @return a void
     */
    public void setTargetedVariations(@javax.annotation.Nullable final java.util.List<AnswerVariant> value) {
        this._targetedVariations = value;
    }
}
