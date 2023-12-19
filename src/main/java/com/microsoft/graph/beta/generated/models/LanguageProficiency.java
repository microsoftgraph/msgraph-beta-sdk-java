package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LanguageProficiency extends ItemFacet implements Parsable {
    /**
     * Instantiates a new LanguageProficiency and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static LanguageProficiency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LanguageProficiency();
    }
    /**
     * Gets the displayName property value. Contains the long-form name for the language.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("proficiency", (n) -> { this.setProficiency(n.getEnumValue(LanguageProficiencyProficiency::forValue)); });
        deserializerMap.put("reading", (n) -> { this.setReading(n.getEnumValue(LanguageProficiencyReading::forValue)); });
        deserializerMap.put("spoken", (n) -> { this.setSpoken(n.getEnumValue(LanguageProficiencySpoken::forValue)); });
        deserializerMap.put("tag", (n) -> { this.setTag(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("written", (n) -> { this.setWritten(n.getEnumValue(LanguageProficiencyWritten::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the proficiency property value. The proficiency property
     * @return a LanguageProficiencyProficiency
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyProficiency getProficiency() {
        return this.backingStore.get("proficiency");
    }
    /**
     * Gets the reading property value. Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a LanguageProficiencyReading
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyReading getReading() {
        return this.backingStore.get("reading");
    }
    /**
     * Gets the spoken property value. Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a LanguageProficiencySpoken
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencySpoken getSpoken() {
        return this.backingStore.get("spoken");
    }
    /**
     * Gets the tag property value. Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTag() {
        return this.backingStore.get("tag");
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.backingStore.get("thumbnailUrl");
    }
    /**
     * Gets the written property value. Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @return a LanguageProficiencyWritten
     */
    @jakarta.annotation.Nullable
    public LanguageProficiencyWritten getWritten() {
        return this.backingStore.get("written");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the proficiency property value. The proficiency property
     * @param value Value to set for the proficiency property.
     */
    public void setProficiency(@jakarta.annotation.Nullable final LanguageProficiencyProficiency value) {
        this.backingStore.set("proficiency", value);
    }
    /**
     * Sets the reading property value. Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the reading property.
     */
    public void setReading(@jakarta.annotation.Nullable final LanguageProficiencyReading value) {
        this.backingStore.set("reading", value);
    }
    /**
     * Sets the spoken property value. Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the spoken property.
     */
    public void setSpoken(@jakarta.annotation.Nullable final LanguageProficiencySpoken value) {
        this.backingStore.set("spoken", value);
    }
    /**
     * Sets the tag property value. Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     * @param value Value to set for the tag property.
     */
    public void setTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tag", value);
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailUrl", value);
    }
    /**
     * Sets the written property value. Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     * @param value Value to set for the written property.
     */
    public void setWritten(@jakarta.annotation.Nullable final LanguageProficiencyWritten value) {
        this.backingStore.set("written", value);
    }
}
