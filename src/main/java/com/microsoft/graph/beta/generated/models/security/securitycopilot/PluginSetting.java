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
public class PluginSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PluginSetting} and sets the default values.
     */
    public PluginSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PluginSetting}
     */
    @jakarta.annotation.Nonnull
    public static PluginSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PluginSetting();
    }
    /**
     * Gets the acceptableValues property value. Acceptable values for plugin type
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAcceptableValues() {
        return this.backingStore.get("acceptableValues");
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the defaultValue property value. Default value available for the plugin if not configured
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * Gets the description property value. Description of the value requested
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayType property value. The displayType property
     * @return a {@link PluginSettingDisplayType}
     */
    @jakarta.annotation.Nullable
    public PluginSettingDisplayType getDisplayType() {
        return this.backingStore.get("displayType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("acceptableValues", (n) -> { this.setAcceptableValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayType", (n) -> { this.setDisplayType(n.getEnumValue(PluginSettingDisplayType::forValue)); });
        deserializerMap.put("hintText", (n) -> { this.setHintText(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingValue", (n) -> { this.setSettingValue(n.getEnumValue(PluginSettingType::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hintText property value. Hint for the plugin
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHintText() {
        return this.backingStore.get("hintText");
    }
    /**
     * Gets the isRequired property value. Setting whether the value is required
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.backingStore.get("isRequired");
    }
    /**
     * Gets the label property value. Label for the setting
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.backingStore.get("label");
    }
    /**
     * Gets the name property value. Name of the setting
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
     * Gets the settingValue property value. The settingValue property
     * @return a {@link PluginSettingType}
     */
    @jakarta.annotation.Nullable
    public PluginSettingType getSettingValue() {
        return this.backingStore.get("settingValue");
    }
    /**
     * Gets the value property value. Value
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("acceptableValues", this.getAcceptableValues());
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("displayType", this.getDisplayType());
        writer.writeStringValue("hintText", this.getHintText());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("settingValue", this.getSettingValue());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptableValues property value. Acceptable values for plugin type
     * @param value Value to set for the acceptableValues property.
     */
    public void setAcceptableValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("acceptableValues", value);
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
     * Sets the defaultValue property value. Default value available for the plugin if not configured
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the description property value. Description of the value requested
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayType property value. The displayType property
     * @param value Value to set for the displayType property.
     */
    public void setDisplayType(@jakarta.annotation.Nullable final PluginSettingDisplayType value) {
        this.backingStore.set("displayType", value);
    }
    /**
     * Sets the hintText property value. Hint for the plugin
     * @param value Value to set for the hintText property.
     */
    public void setHintText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hintText", value);
    }
    /**
     * Sets the isRequired property value. Setting whether the value is required
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequired", value);
    }
    /**
     * Sets the label property value. Label for the setting
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("label", value);
    }
    /**
     * Sets the name property value. Name of the setting
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
     * Sets the settingValue property value. The settingValue property
     * @param value Value to set for the settingValue property.
     */
    public void setSettingValue(@jakarta.annotation.Nullable final PluginSettingType value) {
        this.backingStore.set("settingValue", value);
    }
    /**
     * Sets the value property value. Value
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
