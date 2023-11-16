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
 * Setting Insights
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingInsightsDefinition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new DeviceManagementSettingInsightsDefinition and sets the default values.
     */
    public DeviceManagementSettingInsightsDefinition() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingInsightsDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingInsightsDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingInsightsDefinition();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingDefinitionId", (n) -> { this.setSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingInsight", (n) -> { this.setSettingInsight(n.getObjectValue(DeviceManagementConfigurationSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the settingDefinitionId property value. Setting definition id that is being referred to a setting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingDefinitionId() {
        return this.BackingStore.get("settingDefinitionId");
    }
    /**
     * Gets the settingInsight property value. Data Insights Target Value
     * @return a DeviceManagementConfigurationSettingValue
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingValue getSettingInsight() {
        return this.BackingStore.get("settingInsight");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeObjectValue("settingInsight", this.getSettingInsight());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the settingDefinitionId property value. Setting definition id that is being referred to a setting.
     * @param value Value to set for the settingDefinitionId property.
     */
    public void setSettingDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("settingDefinitionId", value);
    }
    /**
     * Sets the settingInsight property value. Data Insights Target Value
     * @param value Value to set for the settingInsight property.
     */
    public void setSettingInsight(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingValue value) {
        this.BackingStore.set("settingInsight", value);
    }
}
