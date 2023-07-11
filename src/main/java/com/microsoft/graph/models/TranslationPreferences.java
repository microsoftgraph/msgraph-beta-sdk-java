package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TranslationPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Translation override behavior for languages, if any.Returned by default.
     */
    private java.util.List<TranslationLanguageOverride> languageOverrides;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The user's preferred translation behavior.Returned by default. Not nullable.
     */
    private TranslationBehavior translationBehavior;
    /**
     * The list of languages the user does not need translated. This is computed from the authoringLanguages collection in regionalAndLanguageSettings, and the languageOverrides collection in translationPreferences. The list specifies neutral culture values that include the language code without any country or region association. For example, it would specify 'fr' for the neutral French culture, but not 'fr-FR' for the French culture in France. Returned by default. Read only.
     */
    private java.util.List<String> untranslatedLanguages;
    /**
     * Instantiates a new translationPreferences and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TranslationPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a translationPreferences
     */
    @javax.annotation.Nonnull
    public static TranslationPreferences createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslationPreferences();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("languageOverrides", (n) -> { this.setLanguageOverrides(n.getCollectionOfObjectValues(TranslationLanguageOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("translationBehavior", (n) -> { this.setTranslationBehavior(n.getEnumValue(TranslationBehavior.class)); });
        deserializerMap.put("untranslatedLanguages", (n) -> { this.setUntranslatedLanguages(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the languageOverrides property value. Translation override behavior for languages, if any.Returned by default.
     * @return a translationLanguageOverride
     */
    @javax.annotation.Nullable
    public java.util.List<TranslationLanguageOverride> getLanguageOverrides() {
        return this.languageOverrides;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the translationBehavior property value. The user's preferred translation behavior.Returned by default. Not nullable.
     * @return a translationBehavior
     */
    @javax.annotation.Nullable
    public TranslationBehavior getTranslationBehavior() {
        return this.translationBehavior;
    }
    /**
     * Gets the untranslatedLanguages property value. The list of languages the user does not need translated. This is computed from the authoringLanguages collection in regionalAndLanguageSettings, and the languageOverrides collection in translationPreferences. The list specifies neutral culture values that include the language code without any country or region association. For example, it would specify 'fr' for the neutral French culture, but not 'fr-FR' for the French culture in France. Returned by default. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUntranslatedLanguages() {
        return this.untranslatedLanguages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("languageOverrides", this.getLanguageOverrides());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("translationBehavior", this.getTranslationBehavior());
        writer.writeCollectionOfPrimitiveValues("untranslatedLanguages", this.getUntranslatedLanguages());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the languageOverrides property value. Translation override behavior for languages, if any.Returned by default.
     * @param value Value to set for the languageOverrides property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageOverrides(@javax.annotation.Nullable final java.util.List<TranslationLanguageOverride> value) {
        this.languageOverrides = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the translationBehavior property value. The user's preferred translation behavior.Returned by default. Not nullable.
     * @param value Value to set for the translationBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTranslationBehavior(@javax.annotation.Nullable final TranslationBehavior value) {
        this.translationBehavior = value;
    }
    /**
     * Sets the untranslatedLanguages property value. The list of languages the user does not need translated. This is computed from the authoringLanguages collection in regionalAndLanguageSettings, and the languageOverrides collection in translationPreferences. The list specifies neutral culture values that include the language code without any country or region association. For example, it would specify 'fr' for the neutral French culture, but not 'fr-FR' for the French culture in France. Returned by default. Read only.
     * @param value Value to set for the untranslatedLanguages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUntranslatedLanguages(@javax.annotation.Nullable final java.util.List<String> value) {
        this.untranslatedLanguages = value;
    }
}
