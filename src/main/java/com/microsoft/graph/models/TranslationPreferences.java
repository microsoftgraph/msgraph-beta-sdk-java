package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TranslationPreferences implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TranslationPreferences and sets the default values.
     */
    public TranslationPreferences() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TranslationPreferences
     */
    @jakarta.annotation.Nonnull
    public static TranslationPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslationPreferences();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<TranslationLanguageOverride>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TranslationLanguageOverride> getLanguageOverrides() {
        return this.backingStore.get("languageOverrides");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the translationBehavior property value. The user's preferred translation behavior.Returned by default. Not nullable.
     * @return a TranslationBehavior
     */
    @jakarta.annotation.Nullable
    public TranslationBehavior getTranslationBehavior() {
        return this.backingStore.get("translationBehavior");
    }
    /**
     * Gets the untranslatedLanguages property value. The list of languages the user does not need translated. This is computed from the authoringLanguages collection in regionalAndLanguageSettings, and the languageOverrides collection in translationPreferences. The list specifies neutral culture values that include the language code without any country or region association. For example, it would specify 'fr' for the neutral French culture, but not 'fr-FR' for the French culture in France. Returned by default. Read only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUntranslatedLanguages() {
        return this.backingStore.get("untranslatedLanguages");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("languageOverrides", this.getLanguageOverrides());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("translationBehavior", this.getTranslationBehavior());
        writer.writeCollectionOfPrimitiveValues("untranslatedLanguages", this.getUntranslatedLanguages());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the languageOverrides property value. Translation override behavior for languages, if any.Returned by default.
     * @param value Value to set for the languageOverrides property.
     */
    public void setLanguageOverrides(@jakarta.annotation.Nullable final java.util.List<TranslationLanguageOverride> value) {
        this.backingStore.set("languageOverrides", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the translationBehavior property value. The user's preferred translation behavior.Returned by default. Not nullable.
     * @param value Value to set for the translationBehavior property.
     */
    public void setTranslationBehavior(@jakarta.annotation.Nullable final TranslationBehavior value) {
        this.backingStore.set("translationBehavior", value);
    }
    /**
     * Sets the untranslatedLanguages property value. The list of languages the user does not need translated. This is computed from the authoringLanguages collection in regionalAndLanguageSettings, and the languageOverrides collection in translationPreferences. The list specifies neutral culture values that include the language code without any country or region association. For example, it would specify 'fr' for the neutral French culture, but not 'fr-FR' for the French culture in France. Returned by default. Read only.
     * @param value Value to set for the untranslatedLanguages property.
     */
    public void setUntranslatedLanguages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("untranslatedLanguages", value);
    }
}
