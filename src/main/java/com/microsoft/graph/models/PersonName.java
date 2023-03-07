package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonName extends ItemFacet implements Parsable {
    /** Provides an ordered rendering of firstName and lastName depending on the locale of the user or their device. */
    private String displayName;
    /** First name of the user. */
    private String first;
    /** Initials of the user. */
    private String initials;
    /** Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format. */
    private String languageTag;
    /** Last name of the user. */
    private String last;
    /** Maiden name of the user. */
    private String maiden;
    /** Middle name of the user. */
    private String middle;
    /** Nickname of the user. */
    private String nickname;
    /** Guidance on how to pronounce the users name. */
    private PersonNamePronounciation pronunciation;
    /** Designators used after the users name (eg: PhD.) */
    private String suffix;
    /** Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.) */
    private String title;
    /**
     * Instantiates a new personName and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersonName() {
        super();
        this.setOdataType("#microsoft.graph.personName");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personName
     */
    @javax.annotation.Nonnull
    public static PersonName createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonName();
    }
    /**
     * Gets the displayName property value. Provides an ordered rendering of firstName and lastName depending on the locale of the user or their device.
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirst() {
        return this.first;
    }
    /**
     * Gets the initials property value. Initials of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitials() {
        return this.initials;
    }
    /**
     * Gets the languageTag property value. Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the last property value. Last name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLast() {
        return this.last;
    }
    /**
     * Gets the maiden property value. Maiden name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaiden() {
        return this.maiden;
    }
    /**
     * Gets the middle property value. Middle name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddle() {
        return this.middle;
    }
    /**
     * Gets the nickname property value. Nickname of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNickname() {
        return this.nickname;
    }
    /**
     * Gets the pronunciation property value. Guidance on how to pronounce the users name.
     * @return a personNamePronounciation
     */
    @javax.annotation.Nullable
    public PersonNamePronounciation getPronunciation() {
        return this.pronunciation;
    }
    /**
     * Gets the suffix property value. Designators used after the users name (eg: PhD.)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSuffix() {
        return this.suffix;
    }
    /**
     * Gets the title property value. Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the first property value. First name of the user.
     * @param value Value to set for the first property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirst(@javax.annotation.Nullable final String value) {
        this.first = value;
    }
    /**
     * Sets the initials property value. Initials of the user.
     * @param value Value to set for the initials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitials(@javax.annotation.Nullable final String value) {
        this.initials = value;
    }
    /**
     * Sets the languageTag property value. Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the last property value. Last name of the user.
     * @param value Value to set for the last property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLast(@javax.annotation.Nullable final String value) {
        this.last = value;
    }
    /**
     * Sets the maiden property value. Maiden name of the user.
     * @param value Value to set for the maiden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaiden(@javax.annotation.Nullable final String value) {
        this.maiden = value;
    }
    /**
     * Sets the middle property value. Middle name of the user.
     * @param value Value to set for the middle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMiddle(@javax.annotation.Nullable final String value) {
        this.middle = value;
    }
    /**
     * Sets the nickname property value. Nickname of the user.
     * @param value Value to set for the nickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNickname(@javax.annotation.Nullable final String value) {
        this.nickname = value;
    }
    /**
     * Sets the pronunciation property value. Guidance on how to pronounce the users name.
     * @param value Value to set for the pronunciation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPronunciation(@javax.annotation.Nullable final PersonNamePronounciation value) {
        this.pronunciation = value;
    }
    /**
     * Sets the suffix property value. Designators used after the users name (eg: PhD.)
     * @param value Value to set for the suffix property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuffix(@javax.annotation.Nullable final String value) {
        this.suffix = value;
    }
    /**
     * Sets the title property value. Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
}
