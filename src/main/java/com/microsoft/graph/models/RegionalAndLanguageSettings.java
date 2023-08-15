package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegionalAndLanguageSettings extends Entity implements Parsable {
    /**
     * Prioritized list of languages the user reads and authors in.Returned by default. Not nullable.
     */
    private java.util.List<LocaleInfo> authoringLanguages;
    /**
     * The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     */
    private LocaleInfo defaultDisplayLanguage;
    /**
     * The locale that drives the default date, time, and calendar formatting.Returned by default.
     */
    private LocaleInfo defaultRegionalFormat;
    /**
     * The language a user expected to use as input for text to speech scenarios.Returned by default.
     */
    private LocaleInfo defaultSpeechInputLanguage;
    /**
     * The language a user expects to have documents, emails, and messages translated into.Returned by default.
     */
    private LocaleInfo defaultTranslationLanguage;
    /**
     * Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     */
    private RegionalFormatOverrides regionalFormatOverrides;
    /**
     * The user's preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     */
    private TranslationPreferences translationPreferences;
    /**
     * Instantiates a new regionalAndLanguageSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RegionalAndLanguageSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a regionalAndLanguageSettings
     */
    @jakarta.annotation.Nonnull
    public static RegionalAndLanguageSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionalAndLanguageSettings();
    }
    /**
     * Gets the authoringLanguages property value. Prioritized list of languages the user reads and authors in.Returned by default. Not nullable.
     * @return a localeInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocaleInfo> getAuthoringLanguages() {
        return this.authoringLanguages;
    }
    /**
     * Gets the defaultDisplayLanguage property value. The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     * @return a localeInfo
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultDisplayLanguage() {
        return this.defaultDisplayLanguage;
    }
    /**
     * Gets the defaultRegionalFormat property value. The locale that drives the default date, time, and calendar formatting.Returned by default.
     * @return a localeInfo
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultRegionalFormat() {
        return this.defaultRegionalFormat;
    }
    /**
     * Gets the defaultSpeechInputLanguage property value. The language a user expected to use as input for text to speech scenarios.Returned by default.
     * @return a localeInfo
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultSpeechInputLanguage() {
        return this.defaultSpeechInputLanguage;
    }
    /**
     * Gets the defaultTranslationLanguage property value. The language a user expects to have documents, emails, and messages translated into.Returned by default.
     * @return a localeInfo
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultTranslationLanguage() {
        return this.defaultTranslationLanguage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authoringLanguages", (n) -> { this.setAuthoringLanguages(n.getCollectionOfObjectValues(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultDisplayLanguage", (n) -> { this.setDefaultDisplayLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultRegionalFormat", (n) -> { this.setDefaultRegionalFormat(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultSpeechInputLanguage", (n) -> { this.setDefaultSpeechInputLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultTranslationLanguage", (n) -> { this.setDefaultTranslationLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("regionalFormatOverrides", (n) -> { this.setRegionalFormatOverrides(n.getObjectValue(RegionalFormatOverrides::createFromDiscriminatorValue)); });
        deserializerMap.put("translationPreferences", (n) -> { this.setTranslationPreferences(n.getObjectValue(TranslationPreferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the regionalFormatOverrides property value. Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     * @return a regionalFormatOverrides
     */
    @jakarta.annotation.Nullable
    public RegionalFormatOverrides getRegionalFormatOverrides() {
        return this.regionalFormatOverrides;
    }
    /**
     * Gets the translationPreferences property value. The user's preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     * @return a translationPreferences
     */
    @jakarta.annotation.Nullable
    public TranslationPreferences getTranslationPreferences() {
        return this.translationPreferences;
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
    @jakarta.annotation.Nonnull
    public void setAuthoringLanguages(@jakarta.annotation.Nullable final java.util.List<LocaleInfo> value) {
        this.authoringLanguages = value;
    }
    /**
     * Sets the defaultDisplayLanguage property value. The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     * @param value Value to set for the defaultDisplayLanguage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultDisplayLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.defaultDisplayLanguage = value;
    }
    /**
     * Sets the defaultRegionalFormat property value. The locale that drives the default date, time, and calendar formatting.Returned by default.
     * @param value Value to set for the defaultRegionalFormat property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultRegionalFormat(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.defaultRegionalFormat = value;
    }
    /**
     * Sets the defaultSpeechInputLanguage property value. The language a user expected to use as input for text to speech scenarios.Returned by default.
     * @param value Value to set for the defaultSpeechInputLanguage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultSpeechInputLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.defaultSpeechInputLanguage = value;
    }
    /**
     * Sets the defaultTranslationLanguage property value. The language a user expects to have documents, emails, and messages translated into.Returned by default.
     * @param value Value to set for the defaultTranslationLanguage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultTranslationLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.defaultTranslationLanguage = value;
    }
    /**
     * Sets the regionalFormatOverrides property value. Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     * @param value Value to set for the regionalFormatOverrides property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRegionalFormatOverrides(@jakarta.annotation.Nullable final RegionalFormatOverrides value) {
        this.regionalFormatOverrides = value;
    }
    /**
     * Sets the translationPreferences property value. The user's preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     * @param value Value to set for the translationPreferences property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTranslationPreferences(@jakarta.annotation.Nullable final TranslationPreferences value) {
        this.translationPreferences = value;
    }
}
