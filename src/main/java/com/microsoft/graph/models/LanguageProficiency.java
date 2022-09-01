package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LanguageProficiency extends ItemFacet implements Parsable {
    /** Contains the long-form name for the language. */
    private String _displayName;
    /** The proficiency property */
    private LanguageProficiencyLevel _proficiency;
    /** Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue. */
    private LanguageProficiencyLevel _reading;
    /** Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue. */
    private LanguageProficiencyLevel _spoken;
    /** Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU). */
    private String _tag;
    /** The thumbnailUrl property */
    private String _thumbnailUrl;
    /** Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue. */
    private LanguageProficiencyLevel _written;
    /**
     * Instantiates a new LanguageProficiency and sets the default values.
     * @return a void
     */
    public LanguageProficiency() {
        super();
        this.setOdataType("#microsoft.graph.languageProficiency");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LanguageProficiency
     */
    @javax.annotation.Nonnull
    public static LanguageProficiency createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LanguageProficiency();
    }
    /**
     * Gets the displayName property value. Contains the long-form name for the language.
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
        final LanguageProficiency currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("proficiency", (n) -> { currentObject.setProficiency(n.getEnumValue(LanguageProficiencyLevel.class)); });
            this.put("reading", (n) -> { currentObject.setReading(n.getEnumValue(LanguageProficiencyLevel.class)); });
            this.put("spoken", (n) -> { currentObject.setSpoken(n.getEnumValue(LanguageProficiencyLevel.class)); });
            this.put("tag", (n) -> { currentObject.setTag(n.getStringValue()); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
            this.put("written", (n) -> { currentObject.setWritten(n.getEnumValue(LanguageProficiencyLevel.class)); });
        }};
    }
    /**
     * Gets the proficiency property value. The proficiency property
     * @return a languageProficiencyLevel
     */
    @javax.annotation.Nullable
    public LanguageProficiencyLevel getProficiency() {
        return this._proficiency;
    }
    /**
     * Gets the reading property value. Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a languageProficiencyLevel
     */
    @javax.annotation.Nullable
    public LanguageProficiencyLevel getReading() {
        return this._reading;
    }
    /**
     * Gets the spoken property value. Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a languageProficiencyLevel
     */
    @javax.annotation.Nullable
    public LanguageProficiencyLevel getSpoken() {
        return this._spoken;
    }
    /**
     * Gets the tag property value. Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTag() {
        return this._tag;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Gets the written property value. Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a languageProficiencyLevel
     */
    @javax.annotation.Nullable
    public LanguageProficiencyLevel getWritten() {
        return this._written;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the proficiency property value. The proficiency property
     * @param value Value to set for the proficiency property.
     * @return a void
     */
    public void setProficiency(@javax.annotation.Nullable final LanguageProficiencyLevel value) {
        this._proficiency = value;
    }
    /**
     * Sets the reading property value. Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the reading property.
     * @return a void
     */
    public void setReading(@javax.annotation.Nullable final LanguageProficiencyLevel value) {
        this._reading = value;
    }
    /**
     * Sets the spoken property value. Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the spoken property.
     * @return a void
     */
    public void setSpoken(@javax.annotation.Nullable final LanguageProficiencyLevel value) {
        this._spoken = value;
    }
    /**
     * Sets the tag property value. Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     * @param value Value to set for the tag property.
     * @return a void
     */
    public void setTag(@javax.annotation.Nullable final String value) {
        this._tag = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
    /**
     * Sets the written property value. Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the written property.
     * @return a void
     */
    public void setWritten(@javax.annotation.Nullable final LanguageProficiencyLevel value) {
        this._written = value;
    }
}
