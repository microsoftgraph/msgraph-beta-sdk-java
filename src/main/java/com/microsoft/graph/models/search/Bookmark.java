package com.microsoft.graph.models.search;

import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Bookmark extends SearchAnswer implements Parsable {
    /** Timestamp of when the bookmark will stop to appear as a search result. Set as null for always available. */
    private OffsetDateTime availabilityEndDateTime;
    /** Timestamp of when the bookmark will start to appear as a search result. Set as null for always available. */
    private OffsetDateTime availabilityStartDateTime;
    /** Categories commonly used to describe this bookmark. For example, IT and HR. */
    private java.util.List<String> categories;
    /** List of security groups able to view this bookmark. */
    private java.util.List<String> groupIds;
    /** True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only. */
    private Boolean isSuggested;
    /** Keywords that trigger this bookmark to appear in search results. */
    private AnswerKeyword keywords;
    /** A list of language names that are geographically specific and that this bookmark can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. See supported language tags for the list of possible values. */
    private java.util.List<String> languageTags;
    /** List of devices and operating systems able to view this bookmark. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP. */
    private java.util.List<DevicePlatformType> platforms;
    /** List of Power Apps associated with this bookmark. If users add existing Power Apps to a bookmark, they can complete tasks, such as to enter vacation time or to report expenses on the search results page. */
    private java.util.List<String> powerAppIds;
    /** The state property */
    private AnswerState state;
    /** Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations. */
    private java.util.List<AnswerVariant> targetedVariations;
    /**
     * Instantiates a new Bookmark and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Bookmark() {
        super();
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
        return this.availabilityEndDateTime;
    }
    /**
     * Gets the availabilityStartDateTime property value. Timestamp of when the bookmark will start to appear as a search result. Set as null for always available.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAvailabilityStartDateTime() {
        return this.availabilityStartDateTime;
    }
    /**
     * Gets the categories property value. Categories commonly used to describe this bookmark. For example, IT and HR.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.categories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityEndDateTime", (n) -> { this.setAvailabilityEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("availabilityStartDateTime", (n) -> { this.setAvailabilityStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("groupIds", (n) -> { this.setGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isSuggested", (n) -> { this.setIsSuggested(n.getBooleanValue()); });
        deserializerMap.put("keywords", (n) -> { this.setKeywords(n.getObjectValue(AnswerKeyword::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTags", (n) -> { this.setLanguageTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getCollectionOfEnumValues(DevicePlatformType.class)); });
        deserializerMap.put("powerAppIds", (n) -> { this.setPowerAppIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AnswerState.class)); });
        deserializerMap.put("targetedVariations", (n) -> { this.setTargetedVariations(n.getCollectionOfObjectValues(AnswerVariant::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupIds property value. List of security groups able to view this bookmark.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }
    /**
     * Gets the isSuggested property value. True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSuggested() {
        return this.isSuggested;
    }
    /**
     * Gets the keywords property value. Keywords that trigger this bookmark to appear in search results.
     * @return a answerKeyword
     */
    @javax.annotation.Nullable
    public AnswerKeyword getKeywords() {
        return this.keywords;
    }
    /**
     * Gets the languageTags property value. A list of language names that are geographically specific and that this bookmark can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. See supported language tags for the list of possible values.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLanguageTags() {
        return this.languageTags;
    }
    /**
     * Gets the platforms property value. List of devices and operating systems able to view this bookmark. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public java.util.List<DevicePlatformType> getPlatforms() {
        return this.platforms;
    }
    /**
     * Gets the powerAppIds property value. List of Power Apps associated with this bookmark. If users add existing Power Apps to a bookmark, they can complete tasks, such as to enter vacation time or to report expenses on the search results page.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPowerAppIds() {
        return this.powerAppIds;
    }
    /**
     * Gets the state property value. The state property
     * @return a answerState
     */
    @javax.annotation.Nullable
    public AnswerState getState() {
        return this.state;
    }
    /**
     * Gets the targetedVariations property value. Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     * @return a answerVariant
     */
    @javax.annotation.Nullable
    public java.util.List<AnswerVariant> getTargetedVariations() {
        return this.targetedVariations;
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
        writer.writeOffsetDateTimeValue("availabilityEndDateTime", this.getAvailabilityEndDateTime());
        writer.writeOffsetDateTimeValue("availabilityStartDateTime", this.getAvailabilityStartDateTime());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfPrimitiveValues("groupIds", this.getGroupIds());
        writer.writeBooleanValue("isSuggested", this.getIsSuggested());
        writer.writeObjectValue("keywords", this.getKeywords());
        writer.writeCollectionOfPrimitiveValues("languageTags", this.getLanguageTags());
        writer.writeCollectionOfEnumValues("platforms", this.getPlatforms());
        writer.writeCollectionOfPrimitiveValues("powerAppIds", this.getPowerAppIds());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("targetedVariations", this.getTargetedVariations());
    }
    /**
     * Sets the availabilityEndDateTime property value. Timestamp of when the bookmark will stop to appear as a search result. Set as null for always available.
     * @param value Value to set for the availabilityEndDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.availabilityEndDateTime = value;
    }
    /**
     * Sets the availabilityStartDateTime property value. Timestamp of when the bookmark will start to appear as a search result. Set as null for always available.
     * @param value Value to set for the availabilityStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.availabilityStartDateTime = value;
    }
    /**
     * Sets the categories property value. Categories commonly used to describe this bookmark. For example, IT and HR.
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the groupIds property value. List of security groups able to view this bookmark.
     * @param value Value to set for the groupIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.groupIds = value;
    }
    /**
     * Sets the isSuggested property value. True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     * @param value Value to set for the isSuggested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSuggested(@javax.annotation.Nullable final Boolean value) {
        this.isSuggested = value;
    }
    /**
     * Sets the keywords property value. Keywords that trigger this bookmark to appear in search results.
     * @param value Value to set for the keywords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeywords(@javax.annotation.Nullable final AnswerKeyword value) {
        this.keywords = value;
    }
    /**
     * Sets the languageTags property value. A list of language names that are geographically specific and that this bookmark can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. See supported language tags for the list of possible values.
     * @param value Value to set for the languageTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this.languageTags = value;
    }
    /**
     * Sets the platforms property value. List of devices and operating systems able to view this bookmark. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatforms(@javax.annotation.Nullable final java.util.List<DevicePlatformType> value) {
        this.platforms = value;
    }
    /**
     * Sets the powerAppIds property value. List of Power Apps associated with this bookmark. If users add existing Power Apps to a bookmark, they can complete tasks, such as to enter vacation time or to report expenses on the search results page.
     * @param value Value to set for the powerAppIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerAppIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.powerAppIds = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AnswerState value) {
        this.state = value;
    }
    /**
     * Sets the targetedVariations property value. Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     * @param value Value to set for the targetedVariations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedVariations(@javax.annotation.Nullable final java.util.List<AnswerVariant> value) {
        this.targetedVariations = value;
    }
}
