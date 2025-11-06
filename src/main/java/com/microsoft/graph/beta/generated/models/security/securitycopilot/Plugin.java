package com.microsoft.graph.beta.models.security.securitycopilot;

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
public class Plugin implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Plugin} and sets the default values.
     */
    public Plugin() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Plugin}
     */
    @jakarta.annotation.Nonnull
    public static Plugin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Plugin();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the authorization property value. Authorization for the plugin.
     * @return a {@link PluginAuth}
     */
    @jakarta.annotation.Nullable
    public PluginAuth getAuthorization() {
        return this.backingStore.get("authorization");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the catalogScope property value. The catalogScope property
     * @return a {@link PluginCatalogScope}
     */
    @jakarta.annotation.Nullable
    public PluginCatalogScope getCatalogScope() {
        return this.backingStore.get("catalogScope");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link PluginCategory}
     */
    @jakarta.annotation.Nullable
    public PluginCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the description property value. Brief description of the plugin.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name of the plugin.   Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("authorization", (n) -> { this.setAuthorization(n.getObjectValue(PluginAuth::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogScope", (n) -> { this.setCatalogScope(n.getEnumValue(PluginCatalogScope::forValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(PluginCategory::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previewState", (n) -> { this.setPreviewState(n.getEnumValue(PluginPreviewStates::forValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(PluginSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedAuthTypes", (n) -> { this.setSupportedAuthTypes(n.getEnumValue(PluginAuthTypes::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Displays whether the plugin is enabled for use within the catalogScope.   Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the name property value. Represents the name of the plugin. Primary key.   Supports $filter (eq, contains).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the previewState property value. The previewState property
     * @return a {@link PluginPreviewStates}
     */
    @jakarta.annotation.Nullable
    public PluginPreviewStates getPreviewState() {
        return this.backingStore.get("previewState");
    }
    /**
     * Gets the settings property value. Settings for the plugin.
     * @return a {@link java.util.List<PluginSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PluginSetting> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the supportedAuthTypes property value. The supportedAuthTypes property
     * @return a {@link PluginAuthTypes}
     */
    @jakarta.annotation.Nullable
    public PluginAuthTypes getSupportedAuthTypes() {
        return this.backingStore.get("supportedAuthTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authorization", this.getAuthorization());
        writer.writeEnumValue("catalogScope", this.getCatalogScope());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("previewState", this.getPreviewState());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeEnumValue("supportedAuthTypes", this.getSupportedAuthTypes());
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
     * Sets the authorization property value. Authorization for the plugin.
     * @param value Value to set for the authorization property.
     */
    public void setAuthorization(@jakarta.annotation.Nullable final PluginAuth value) {
        this.backingStore.set("authorization", value);
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
     * Sets the catalogScope property value. The catalogScope property
     * @param value Value to set for the catalogScope property.
     */
    public void setCatalogScope(@jakarta.annotation.Nullable final PluginCatalogScope value) {
        this.backingStore.set("catalogScope", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final PluginCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the description property value. Brief description of the plugin.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name of the plugin.   Supports $filter (eq).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isEnabled property value. Displays whether the plugin is enabled for use within the catalogScope.   Supports $filter (eq).
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the name property value. Represents the name of the plugin. Primary key.   Supports $filter (eq, contains).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the previewState property value. The previewState property
     * @param value Value to set for the previewState property.
     */
    public void setPreviewState(@jakarta.annotation.Nullable final PluginPreviewStates value) {
        this.backingStore.set("previewState", value);
    }
    /**
     * Sets the settings property value. Settings for the plugin.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<PluginSetting> value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the supportedAuthTypes property value. The supportedAuthTypes property
     * @param value Value to set for the supportedAuthTypes property.
     */
    public void setSupportedAuthTypes(@jakarta.annotation.Nullable final PluginAuthTypes value) {
        this.backingStore.set("supportedAuthTypes", value);
    }
}
