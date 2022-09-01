package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegionalAndLanguageSettings extends Entity implements Parsable {
    /** Prioritized list of languages the user reads and authors in.Returned by default. Not nullable. */
    private java.util.List<LocaleInfo> _authoringLanguages;
    /** The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable. */
    private LocaleInfo _defaultDisplayLanguage;
    /** The locale that drives the default date, time, and calendar formatting.Returned by default. */
    private LocaleInfo _defaultRegionalFormat;
    /** The language a user expected to use as input for text to speech scenarios.Returned by default. */
    private LocaleInfo _defaultSpeechInputLanguage;
    /** The language a user expects to have documents, emails, and messages translated into.Returned by default. */
    private LocaleInfo _defaultTranslationLanguage;
    /** Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default. */
    private RegionalFormatOverrides _regionalFormatOverrides;
    /** The user's preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable. */
    private TranslationPreferences _translationPreferences;
    /**
     * Instantiates a new regionalAndLanguageSettings and sets the default values.
     * @return a void
     */
    public RegionalAndLanguageSettings() {
        super();
        this.setOdataType("#microsoft.graph.regionalAndLanguageSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a regionalAndLanguageSettings
     */
    @javax.annotation.Nonnull
    public static RegionalAndLanguageSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionalAndLanguageSettings();
    }
    /**
     * Gets the authoringLanguages property value. Prioritized list of languages the user reads and authors in.Returned by default. Not nullable.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public java.util.List<LocaleInfo> getAuthoringLanguages() {
        return this._authoringLanguages;
    }
    /**
     * Gets the defaultDisplayLanguage property value. The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public LocaleInfo getDefaultDisplayLanguage() {
        return this._defaultDisplayLanguage;
    }
    /**
     * Gets the defaultRegionalFormat property value. The locale that drives the default date, time, and calendar formatting.Returned by default.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public LocaleInfo getDefaultRegionalFormat() {
        return this._defaultRegionalFormat;
    }
    /**
     * Gets the defaultSpeechInputLanguage property value. The language a user expected to use as input for text to speech scenarios.Returned by default.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public LocaleInfo getDefaultSpeechInputLanguage() {
        return this._defaultSpeechInputLanguage;
    }
    /**
     * Gets the defaultTranslationLanguage property value. The language a user expects to have documents, emails, and messages translated into.Returned by default.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public LocaleInfo getDefaultTranslationLanguage() {
        return this._defaultTranslationLanguage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RegionalAndLanguageSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authoringLanguages", (n) -> { currentObject.setAuthoringLanguages(n.getCollectionOfObjectValues(LocaleInfo::createFromDiscriminatorValue)); });
            this.put("defaultDisplayLanguage", (n) -> { currentObject.setDefaultDisplayLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
            this.put("defaultRegionalFormat", (n) -> { currentObject.setDefaultRegionalFormat(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
            this.put("defaultSpeechInputLanguage", (n) -> { currentObject.setDefaultSpeechInputLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
            this.put("defaultTranslationLanguage", (n) -> { currentObject.setDefaultTranslationLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
            this.put("regionalFormatOverrides", (n) -> { currentObject.setRegionalFormatOverrides(n.getObjectValue(RegionalFormatOverrides::createFromDiscriminatorValue)); });
            this.put("translationPreferences", (n) -> { currentObject.setTranslationPreferences(n.getObjectValue(TranslationPreferences::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the regionalFormatOverrides property value. Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     * @return a regionalFormatOverrides
     */
    @javax.annotation.Nullable
    public RegionalFormatOverrides getRegionalFormatOverrides() {
        return this._regionalFormatOverrides;
    }
    /**
     * Gets the translationPreferences property value. The user's preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     * @return a translationPreferences
     */
    @javax.annotation.Nullable
    public TranslationPreferences getTranslationPreferences() {
        return this._translationPreferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authoringLanguages", this.getAuthoringLanguages());
        writer.writeObjectValue("defaultDisplayLanguage", this.getDefaultDisplayLanguage());
        writer.writeObjectValue("defaultRegionalFormat", this.getDefaultRegionalFormat());
        writer.writeObjectValue("defaultSpeechInputLanguage", this.getDefaultSpeechInputLanguage());
        writer.writeObjectValue("defaultTranslationLanguage", this.getDefaultTranslationLanguage());
        writer.writeObjectValue("regionalFormatOverrides", this.getRegionalFormatOverrides());
        writer.writeObjectValue("translationPreferences", this.getTranslationPreferences());
    }
    /**
     * Sets the authoringLanguages property value. Prioritized list of languages the user reads and authors in.Returned by default. Not nullable.
     * @param value Value to set for the authoringLanguages property.
     * @return a void
     */
    public void setAuthoringLanguages(@javax.annotation.Nullable final java.util.List<LocaleInfo> value) {
        this._authoringLanguages = value;
    }
    /**
     * Sets the defaultDisplayLanguage property value. The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     * @param value Value to set for the defaultDisplayLanguage property.
     * @return a void
     */
    public void setDefaultDisplayLanguage(@javax.annotation.Nullable final LocaleInfo value) {
        this._defaultDisplayLanguage = value;
    }
    /**
     * Sets the defaultRegionalFormat property value. The locale that drives the default date, time, and calendar formatting.Returned by default.
     * @param value Value to set for the defaultRegionalFormat property.
     * @return a void
     */
    public void setDefaultRegionalFormat(@javax.annotation.Nullable final LocaleInfo value) {
        this._defaultRegionalFormat = value;
    }
    /**
     * Sets the defaultSpeechInputLanguage property value. The language a user expected to use as input for text to speech scenarios.Returned by default.
     * @param value Value to set for the defaultSpeechInputLanguage property.
     * @return a void
     */
    public void setDefaultSpeechInputLanguage(@javax.annotation.Nullable final LocaleInfo value) {
        this._defaultSpeechInputLanguage = value;
    }
    /**
     * Sets the defaultTranslationLanguage property value. The language a user expects to have documents, emails, and messages translated into.Returned by default.
     * @param value Value to set for the defaultTranslationLanguage property.
     * @return a void
     */
    public void setDefaultTranslationLanguage(@javax.annotation.Nullable final LocaleInfo value) {
        this._defaultTranslationLanguage = value;
    }
    /**
     * Sets the regionalFormatOverrides property value. Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     * @param value Value to set for the regionalFormatOverrides property.
     * @return a void
     */
    public void setRegionalFormatOverrides(@javax.annotation.Nullable final RegionalFormatOverrides value) {
        this._regionalFormatOverrides = value;
    }
    /**
     * Sets the translationPreferences property value. The user's preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     * @param value Value to set for the translationPreferences property.
     * @return a void
     */
    public void setTranslationPreferences(@javax.annotation.Nullable final TranslationPreferences value) {
        this._translationPreferences = value;
    }
}
