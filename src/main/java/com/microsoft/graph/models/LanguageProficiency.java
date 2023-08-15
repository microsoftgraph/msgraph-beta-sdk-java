package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LanguageProficiency extends ItemFacet implements Parsable {
    /**
     * Contains the long-form name for the language.
     */
    private String displayName;
    /**
     * The proficiency property
     */
    private LanguageProficiencyLevel proficiency;
    /**
     * Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     */
    private LanguageProficiencyLevel reading;
    /**
     * Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     */
    private LanguageProficiencyLevel spoken;
    /**
     * Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     */
    private String tag;
    /**
     * The thumbnailUrl property
     */
    private String thumbnailUrl;
    /**
     * Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     */
    private LanguageProficiencyLevel written;
    /**
     * Instantiates a new languageProficiency and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LanguageProficiency() {
        super();
        this.setOdataType("#microsoft.graph.languageProficiency");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a languageProficiency
     */
    @jakarta.annotation.Nonnull
    public static LanguageProficiency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LanguageProficiency();
    }
    /**
     * Gets the displayName property value. Contains the long-form name for the language.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("proficiency", (n) -> { this.setProficiency(n.getEnumValue(LanguageProficiencyLevel.class)); });
        deserializerMap.put("reading", (n) -> { this.setReading(n.getEnumValue(LanguageProficiencyLevel.class)); });
        deserializerMap.put("spoken", (n) -> { this.setSpoken(n.getEnumValue(LanguageProficiencyLevel.class)); });
        deserializerMap.put("tag", (n) -> { this.setTag(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("written", (n) -> { this.setWritten(n.getEnumValue(LanguageProficiencyLevel.class)); });
        return deserializerMap;
    }
    /**
     * Gets the proficiency property value. The proficiency property
     * @return a languageProficiencyLevel
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyLevel getProficiency() {
        return this.proficiency;
    }
    /**
     * Gets the reading property value. Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a languageProficiencyLevel
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyLevel getReading() {
        return this.reading;
    }
    /**
     * Gets the spoken property value. Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a languageProficiencyLevel
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyLevel getSpoken() {
        return this.spoken;
    }
    /**
     * Gets the tag property value. Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTag() {
        return this.tag;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Gets the written property value. Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a languageProficiencyLevel
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyLevel getWritten() {
        return this.written;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("proficiency", this.getProficiency());
        writer.writeEnumValue("reading", this.getReading());
        writer.writeEnumValue("spoken", this.getSpoken());
        writer.writeStringValue("tag", this.getTag());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeEnumValue("written", this.getWritten());
    }
    /**
     * Sets the displayName property value. Contains the long-form name for the language.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the proficiency property value. The proficiency property
     * @param value Value to set for the proficiency property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProficiency(@jakarta.annotation.Nullable final LanguageProficiencyLevel value) {
        this.proficiency = value;
    }
    /**
     * Sets the reading property value. Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the reading property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReading(@jakarta.annotation.Nullable final LanguageProficiencyLevel value) {
        this.reading = value;
    }
    /**
     * Sets the spoken property value. Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the spoken property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSpoken(@jakarta.annotation.Nullable final LanguageProficiencyLevel value) {
        this.spoken = value;
    }
    /**
     * Sets the tag property value. Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     * @param value Value to set for the tag property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTag(@jakarta.annotation.Nullable final String value) {
        this.tag = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
    /**
     * Sets the written property value. Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the written property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWritten(@jakarta.annotation.Nullable final LanguageProficiencyLevel value) {
        this.written = value;
    }
}
