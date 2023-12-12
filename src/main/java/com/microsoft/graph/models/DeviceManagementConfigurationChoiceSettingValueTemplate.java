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
/**
 * Choice Setting Value Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingValueTemplate implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingValueTemplate and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingValueTemplate() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingValueTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValueTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValueTemplate();
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
     * Gets the defaultValue property value. Choice Setting Value Default Template.
     * @return a DeviceManagementConfigurationChoiceSettingValueDefaultTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefaultTemplate getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueDefaultTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedValueDefinition", (n) -> { this.setRecommendedValueDefinition(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("requiredValueDefinition", (n) -> { this.setRequiredValueDefinition(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("settingValueTemplateId", (n) -> { this.setSettingValueTemplateId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the recommendedValueDefinition property value. Recommended definition override.
     * @return a DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate getRecommendedValueDefinition() {
        return this.backingStore.get("recommendedValueDefinition");
    }
    /**
     * Gets the requiredValueDefinition property value. Required definition override.
     * @return a DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate getRequiredValueDefinition() {
        return this.backingStore.get("requiredValueDefinition");
    }
    /**
     * Gets the settingValueTemplateId property value. Setting Value Template Id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingValueTemplateId() {
        return this.backingStore.get("settingValueTemplateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultValue", this.getDefaultValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("recommendedValueDefinition", this.getRecommendedValueDefinition());
        writer.writeObjectValue("requiredValueDefinition", this.getRequiredValueDefinition());
        writer.writeStringValue("settingValueTemplateId", this.getSettingValueTemplateId());
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
     * Sets the defaultValue property value. Choice Setting Value Default Template.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefaultTemplate value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recommendedValueDefinition property value. Recommended definition override.
     * @param value Value to set for the recommendedValueDefinition property.
     */
    public void setRecommendedValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate value) {
        this.backingStore.set("recommendedValueDefinition", value);
    }
    /**
     * Sets the requiredValueDefinition property value. Required definition override.
     * @param value Value to set for the requiredValueDefinition property.
     */
    public void setRequiredValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate value) {
        this.backingStore.set("requiredValueDefinition", value);
    }
    /**
     * Sets the settingValueTemplateId property value. Setting Value Template Id
     * @param value Value to set for the settingValueTemplateId property.
     */
    public void setSettingValueTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingValueTemplateId", value);
    }
}
