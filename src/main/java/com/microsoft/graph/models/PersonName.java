package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonName extends ItemFacet implements Parsable {
    /** Provides an ordered rendering of firstName and lastName depending on the locale of the user or their device. */
    private String _displayName;
    /** First name of the user. */
    private String _first;
    /** Initials of the user. */
    private String _initials;
    /** Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format. */
    private String _languageTag;
    /** Last name of the user. */
    private String _last;
    /** Maiden name of the user. */
    private String _maiden;
    /** Middle name of the user. */
    private String _middle;
    /** Nickname of the user. */
    private String _nickname;
    /** Guidance on how to pronounce the users name. */
    private PersonNamePronounciation _pronunciation;
    /** Designators used after the users name (eg: PhD.) */
    private String _suffix;
    /** Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.) */
    private String _title;
    /**
     * Instantiates a new PersonName and sets the default values.
     * @return a void
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
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PersonName currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("first", (n) -> { currentObject.setFirst(n.getStringValue()); });
            this.put("initials", (n) -> { currentObject.setInitials(n.getStringValue()); });
            this.put("languageTag", (n) -> { currentObject.setLanguageTag(n.getStringValue()); });
            this.put("last", (n) -> { currentObject.setLast(n.getStringValue()); });
            this.put("maiden", (n) -> { currentObject.setMaiden(n.getStringValue()); });
            this.put("middle", (n) -> { currentObject.setMiddle(n.getStringValue()); });
            this.put("nickname", (n) -> { currentObject.setNickname(n.getStringValue()); });
            this.put("pronunciation", (n) -> { currentObject.setPronunciation(n.getObjectValue(PersonNamePronounciation::createFromDiscriminatorValue)); });
            this.put("suffix", (n) -> { currentObject.setSuffix(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the first property value. First name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirst() {
        return this._first;
    }
    /**
     * Gets the initials property value. Initials of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitials() {
        return this._initials;
    }
    /**
     * Gets the languageTag property value. Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
    }
    /**
     * Gets the last property value. Last name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLast() {
        return this._last;
    }
    /**
     * Gets the maiden property value. Maiden name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaiden() {
        return this._maiden;
    }
    /**
     * Gets the middle property value. Middle name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddle() {
        return this._middle;
    }
    /**
     * Gets the nickname property value. Nickname of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNickname() {
        return this._nickname;
    }
    /**
     * Gets the pronunciation property value. Guidance on how to pronounce the users name.
     * @return a personNamePronounciation
     */
    @javax.annotation.Nullable
    public PersonNamePronounciation getPronunciation() {
        return this._pronunciation;
    }
    /**
     * Gets the suffix property value. Designators used after the users name (eg: PhD.)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSuffix() {
        return this._suffix;
    }
    /**
     * Gets the title property value. Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
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
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the first property value. First name of the user.
     * @param value Value to set for the first property.
     * @return a void
     */
    public void setFirst(@javax.annotation.Nullable final String value) {
        this._first = value;
    }
    /**
     * Sets the initials property value. Initials of the user.
     * @param value Value to set for the initials property.
     * @return a void
     */
    public void setInitials(@javax.annotation.Nullable final String value) {
        this._initials = value;
    }
    /**
     * Sets the languageTag property value. Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the last property value. Last name of the user.
     * @param value Value to set for the last property.
     * @return a void
     */
    public void setLast(@javax.annotation.Nullable final String value) {
        this._last = value;
    }
    /**
     * Sets the maiden property value. Maiden name of the user.
     * @param value Value to set for the maiden property.
     * @return a void
     */
    public void setMaiden(@javax.annotation.Nullable final String value) {
        this._maiden = value;
    }
    /**
     * Sets the middle property value. Middle name of the user.
     * @param value Value to set for the middle property.
     * @return a void
     */
    public void setMiddle(@javax.annotation.Nullable final String value) {
        this._middle = value;
    }
    /**
     * Sets the nickname property value. Nickname of the user.
     * @param value Value to set for the nickname property.
     * @return a void
     */
    public void setNickname(@javax.annotation.Nullable final String value) {
        this._nickname = value;
    }
    /**
     * Sets the pronunciation property value. Guidance on how to pronounce the users name.
     * @param value Value to set for the pronunciation property.
     * @return a void
     */
    public void setPronunciation(@javax.annotation.Nullable final PersonNamePronounciation value) {
        this._pronunciation = value;
    }
    /**
     * Sets the suffix property value. Designators used after the users name (eg: PhD.)
     * @param value Value to set for the suffix property.
     * @return a void
     */
    public void setSuffix(@javax.annotation.Nullable final String value) {
        this._suffix = value;
    }
    /**
     * Sets the title property value. Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
