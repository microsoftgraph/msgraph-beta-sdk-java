package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegionalAndLanguageSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RegionalAndLanguageSettings} and sets the default values.
     */
    public RegionalAndLanguageSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegionalAndLanguageSettings}
     */
    @jakarta.annotation.Nonnull
    public static RegionalAndLanguageSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionalAndLanguageSettings();
    }
    /**
     * Gets the authoringLanguages property value. Prioritized list of languages the user reads and authors in.Returned by default. Not nullable.
     * @return a {@link java.util.List<LocaleInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocaleInfo> getAuthoringLanguages() {
        return this.backingStore.get("authoringLanguages");
    }
    /**
     * Gets the defaultDisplayLanguage property value. The  user&apos;s preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     * @return a {@link LocaleInfo}
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultDisplayLanguage() {
        return this.backingStore.get("defaultDisplayLanguage");
    }
    /**
     * Gets the defaultRegionalFormat property value. The locale that drives the default date, time, and calendar formatting.Returned by default.
     * @return a {@link LocaleInfo}
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultRegionalFormat() {
        return this.backingStore.get("defaultRegionalFormat");
    }
    /**
     * Gets the defaultSpeechInputLanguage property value. The language a user expected to use as input for text to speech scenarios.Returned by default.
     * @return a {@link LocaleInfo}
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultSpeechInputLanguage() {
        return this.backingStore.get("defaultSpeechInputLanguage");
    }
    /**
     * Gets the defaultTranslationLanguage property value. The language a user expects to have documents, emails, and messages translated into.Returned by default.
     * @return a {@link LocaleInfo}
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getDefaultTranslationLanguage() {
        return this.backingStore.get("defaultTranslationLanguage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link RegionalFormatOverrides}
     */
    @jakarta.annotation.Nullable
    public RegionalFormatOverrides getRegionalFormatOverrides() {
        return this.backingStore.get("regionalFormatOverrides");
    }
    /**
     * Gets the translationPreferences property value. The user&apos;s preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     * @return a {@link TranslationPreferences}
     */
    @jakarta.annotation.Nullable
    public TranslationPreferences getTranslationPreferences() {
        return this.backingStore.get("translationPreferences");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAuthoringLanguages(@jakarta.annotation.Nullable final java.util.List<LocaleInfo> value) {
        this.backingStore.set("authoringLanguages", value);
    }
    /**
     * Sets the defaultDisplayLanguage property value. The  user&apos;s preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     * @param value Value to set for the defaultDisplayLanguage property.
     */
    public void setDefaultDisplayLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.backingStore.set("defaultDisplayLanguage", value);
    }
    /**
     * Sets the defaultRegionalFormat property value. The locale that drives the default date, time, and calendar formatting.Returned by default.
     * @param value Value to set for the defaultRegionalFormat property.
     */
    public void setDefaultRegionalFormat(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.backingStore.set("defaultRegionalFormat", value);
    }
    /**
     * Sets the defaultSpeechInputLanguage property value. The language a user expected to use as input for text to speech scenarios.Returned by default.
     * @param value Value to set for the defaultSpeechInputLanguage property.
     */
    public void setDefaultSpeechInputLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.backingStore.set("defaultSpeechInputLanguage", value);
    }
    /**
     * Sets the defaultTranslationLanguage property value. The language a user expects to have documents, emails, and messages translated into.Returned by default.
     * @param value Value to set for the defaultTranslationLanguage property.
     */
    public void setDefaultTranslationLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.backingStore.set("defaultTranslationLanguage", value);
    }
    /**
     * Sets the regionalFormatOverrides property value. Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     * @param value Value to set for the regionalFormatOverrides property.
     */
    public void setRegionalFormatOverrides(@jakarta.annotation.Nullable final RegionalFormatOverrides value) {
        this.backingStore.set("regionalFormatOverrides", value);
    }
    /**
     * Sets the translationPreferences property value. The user&apos;s preferred settings when consuming translated documents, emails, messages, and websites.Returned by default. Not nullable.
     * @param value Value to set for the translationPreferences property.
     */
    public void setTranslationPreferences(@jakarta.annotation.Nullable final TranslationPreferences value) {
        this.backingStore.set("translationPreferences", value);
    }
}
