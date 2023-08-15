package com.microsoft.graph.models.search;

import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Qna extends SearchAnswer implements Parsable {
    /**
     * Timestamp of when the qna will stop to appear as a search result. Set as null for always available.
     */
    private OffsetDateTime availabilityEndDateTime;
    /**
     * Timestamp of when the qna will start to appear as a search result. Set as null for always available.
     */
    private OffsetDateTime availabilityStartDateTime;
    /**
     * List of security groups able to view this qna.
     */
    private java.util.List<String> groupIds;
    /**
     * True if this qna was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     */
    private Boolean isSuggested;
    /**
     * Keywords that trigger this qna to appear in search results.
     */
    private AnswerKeyword keywords;
    /**
     * A list of language names that are geographically specific and that this QnA can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. For the list of possible values, see supported language tags.
     */
    private java.util.List<String> languageTags;
    /**
     * List of devices and operating systems able to view this qna. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     */
    private java.util.List<DevicePlatformType> platforms;
    /**
     * The state property
     */
    private AnswerState state;
    /**
     * Variations of a qna for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     */
    private java.util.List<AnswerVariant> targetedVariations;
    /**
     * Instantiates a new qna and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Qna() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a qna
     */
    @jakarta.annotation.Nonnull
    public static Qna createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Qna();
    }
    /**
     * Gets the availabilityEndDateTime property value. Timestamp of when the qna will stop to appear as a search result. Set as null for always available.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAvailabilityEndDateTime() {
        return this.availabilityEndDateTime;
    }
    /**
     * Gets the availabilityStartDateTime property value. Timestamp of when the qna will start to appear as a search result. Set as null for always available.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAvailabilityStartDateTime() {
        return this.availabilityStartDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityEndDateTime", (n) -> { this.setAvailabilityEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("availabilityStartDateTime", (n) -> { this.setAvailabilityStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupIds", (n) -> { this.setGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isSuggested", (n) -> { this.setIsSuggested(n.getBooleanValue()); });
        deserializerMap.put("keywords", (n) -> { this.setKeywords(n.getObjectValue(AnswerKeyword::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTags", (n) -> { this.setLanguageTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getCollectionOfEnumValues(DevicePlatformType.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AnswerState.class)); });
        deserializerMap.put("targetedVariations", (n) -> { this.setTargetedVariations(n.getCollectionOfObjectValues(AnswerVariant::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupIds property value. List of security groups able to view this qna.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }
    /**
     * Gets the isSuggested property value. True if this qna was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSuggested() {
        return this.isSuggested;
    }
    /**
     * Gets the keywords property value. Keywords that trigger this qna to appear in search results.
     * @return a answerKeyword
     */
    @jakarta.annotation.Nullable
    public AnswerKeyword getKeywords() {
        return this.keywords;
    }
    /**
     * Gets the languageTags property value. A list of language names that are geographically specific and that this QnA can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. For the list of possible values, see supported language tags.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLanguageTags() {
        return this.languageTags;
    }
    /**
     * Gets the platforms property value. List of devices and operating systems able to view this qna. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     * @return a devicePlatformType
     */
    @jakarta.annotation.Nullable
    public java.util.List<DevicePlatformType> getPlatforms() {
        return this.platforms;
    }
    /**
     * Gets the state property value. The state property
     * @return a answerState
     */
    @jakarta.annotation.Nullable
    public AnswerState getState() {
        return this.state;
    }
    /**
     * Gets the targetedVariations property value. Variations of a qna for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     * @return a answerVariant
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnswerVariant> getTargetedVariations() {
        return this.targetedVariations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("availabilityEndDateTime", this.getAvailabilityEndDateTime());
        writer.writeOffsetDateTimeValue("availabilityStartDateTime", this.getAvailabilityStartDateTime());
        writer.writeCollectionOfPrimitiveValues("groupIds", this.getGroupIds());
        writer.writeBooleanValue("isSuggested", this.getIsSuggested());
        writer.writeObjectValue("keywords", this.getKeywords());
        writer.writeCollectionOfPrimitiveValues("languageTags", this.getLanguageTags());
        writer.writeCollectionOfEnumValues("platforms", this.getPlatforms());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("targetedVariations", this.getTargetedVariations());
    }
    /**
     * Sets the availabilityEndDateTime property value. Timestamp of when the qna will stop to appear as a search result. Set as null for always available.
     * @param value Value to set for the availabilityEndDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAvailabilityEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.availabilityEndDateTime = value;
    }
    /**
     * Sets the availabilityStartDateTime property value. Timestamp of when the qna will start to appear as a search result. Set as null for always available.
     * @param value Value to set for the availabilityStartDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAvailabilityStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.availabilityStartDateTime = value;
    }
    /**
     * Sets the groupIds property value. List of security groups able to view this qna.
     * @param value Value to set for the groupIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groupIds = value;
    }
    /**
     * Sets the isSuggested property value. True if this qna was suggested to the admin by a user or was mined and suggested by Microsoft. Read-only.
     * @param value Value to set for the isSuggested property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsSuggested(@jakarta.annotation.Nullable final Boolean value) {
        this.isSuggested = value;
    }
    /**
     * Sets the keywords property value. Keywords that trigger this qna to appear in search results.
     * @param value Value to set for the keywords property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setKeywords(@jakarta.annotation.Nullable final AnswerKeyword value) {
        this.keywords = value;
    }
    /**
     * Sets the languageTags property value. A list of language names that are geographically specific and that this QnA can be viewed in. Each language tag value follows the pattern {language}-{region}. As an example, en-us is English as used in the United States. For the list of possible values, see supported language tags.
     * @param value Value to set for the languageTags property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLanguageTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.languageTags = value;
    }
    /**
     * Sets the platforms property value. List of devices and operating systems able to view this qna. Possible values are: unknown, android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, androidASOP.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPlatforms(@jakarta.annotation.Nullable final java.util.List<DevicePlatformType> value) {
        this.platforms = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setState(@jakarta.annotation.Nullable final AnswerState value) {
        this.state = value;
    }
    /**
     * Sets the targetedVariations property value. Variations of a qna for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.
     * @param value Value to set for the targetedVariations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargetedVariations(@jakarta.annotation.Nullable final java.util.List<AnswerVariant> value) {
        this.targetedVariations = value;
    }
}
