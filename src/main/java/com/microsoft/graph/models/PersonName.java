package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PersonName extends ItemFacet implements Parsable {
    /**
     * Instantiates a new PersonName and sets the default values.
     */
    public PersonName() {
        super();
        this.setOdataType("#microsoft.graph.personName");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PersonName
     */
    @jakarta.annotation.Nonnull
    public static PersonName createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonName();
    }
    /**
     * Gets the displayName property value. Provides an ordered rendering of firstName and lastName depending on the locale of the user or their device.
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
        deserializerMap.put("first", (n) -> { this.setFirst(n.getStringValue()); });
        deserializerMap.put("initials", (n) -> { this.setInitials(n.getStringValue()); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("last", (n) -> { this.setLast(n.getStringValue()); });
        deserializerMap.put("maiden", (n) -> { this.setMaiden(n.getStringValue()); });
        deserializerMap.put("middle", (n) -> { this.setMiddle(n.getStringValue()); });
        deserializerMap.put("nickname", (n) -> { this.setNickname(n.getStringValue()); });
        deserializerMap.put("pronunciation", (n) -> { this.setPronunciation(n.getObjectValue(PersonNamePronounciation::createFromDiscriminatorValue)); });
        deserializerMap.put("suffix", (n) -> { this.setSuffix(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first property value. First name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirst() {
        return this.backingStore.get("first");
    }
    /**
     * Gets the initials property value. Initials of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitials() {
        return this.backingStore.get("initials");
    }
    /**
     * Gets the languageTag property value. Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.backingStore.get("languageTag");
    }
    /**
     * Gets the last property value. Last name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLast() {
        return this.backingStore.get("last");
    }
    /**
     * Gets the maiden property value. Maiden name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMaiden() {
        return this.backingStore.get("maiden");
    }
    /**
     * Gets the middle property value. Middle name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMiddle() {
        return this.backingStore.get("middle");
    }
    /**
     * Gets the nickname property value. Nickname of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNickname() {
        return this.backingStore.get("nickname");
    }
    /**
     * Gets the pronunciation property value. Guidance on how to pronounce the users name.
     * @return a PersonNamePronounciation
     */
    @jakarta.annotation.Nullable
    public PersonNamePronounciation getPronunciation() {
        return this.backingStore.get("pronunciation");
    }
    /**
     * Gets the suffix property value. Designators used after the users name (eg: PhD.)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSuffix() {
        return this.backingStore.get("suffix");
    }
    /**
     * Gets the title property value. Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("first", this.getFirst());
        writer.writeStringValue("initials", this.getInitials());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeStringValue("last", this.getLast());
        writer.writeStringValue("maiden", this.getMaiden());
        writer.writeStringValue("middle", this.getMiddle());
        writer.writeStringValue("nickname", this.getNickname());
        writer.writeObjectValue("pronunciation", this.getPronunciation());
        writer.writeStringValue("suffix", this.getSuffix());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the displayName property value. Provides an ordered rendering of firstName and lastName depending on the locale of the user or their device.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the first property value. First name of the user.
     * @param value Value to set for the first property.
     */
    public void setFirst(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("first", value);
    }
    /**
     * Sets the initials property value. Initials of the user.
     * @param value Value to set for the initials property.
     */
    public void setInitials(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initials", value);
    }
    /**
     * Sets the languageTag property value. Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("languageTag", value);
    }
    /**
     * Sets the last property value. Last name of the user.
     * @param value Value to set for the last property.
     */
    public void setLast(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("last", value);
    }
    /**
     * Sets the maiden property value. Maiden name of the user.
     * @param value Value to set for the maiden property.
     */
    public void setMaiden(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("maiden", value);
    }
    /**
     * Sets the middle property value. Middle name of the user.
     * @param value Value to set for the middle property.
     */
    public void setMiddle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("middle", value);
    }
    /**
     * Sets the nickname property value. Nickname of the user.
     * @param value Value to set for the nickname property.
     */
    public void setNickname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nickname", value);
    }
    /**
     * Sets the pronunciation property value. Guidance on how to pronounce the users name.
     * @param value Value to set for the pronunciation property.
     */
    public void setPronunciation(@jakarta.annotation.Nullable final PersonNamePronounciation value) {
        this.backingStore.set("pronunciation", value);
    }
    /**
     * Sets the suffix property value. Designators used after the users name (eg: PhD.)
     * @param value Value to set for the suffix property.
     */
    public void setSuffix(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("suffix", value);
    }
    /**
     * Sets the title property value. Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
