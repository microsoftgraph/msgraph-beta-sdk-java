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
 * Setting value template reference information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingValueTemplateReference implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new DeviceManagementConfigurationSettingValueTemplateReference and sets the default values.
     */
    public DeviceManagementConfigurationSettingValueTemplateReference() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSettingValueTemplateReference
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingValueTemplateReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingValueTemplateReference();
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
        deserializerMap.put("settingValueTemplateId", (n) -> { this.setSettingValueTemplateId(n.getStringValue()); });
        deserializerMap.put("useTemplateDefault", (n) -> { this.setUseTemplateDefault(n.getBooleanValue()); });
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
     * Gets the settingValueTemplateId property value. Setting value template id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingValueTemplateId() {
        return this.BackingStore.get("settingValueTemplateId");
    }
    /**
     * Gets the useTemplateDefault property value. Indicates whether to update policy setting value to match template setting default value
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseTemplateDefault() {
        return this.BackingStore.get("useTemplateDefault");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingValueTemplateId", this.getSettingValueTemplateId());
        writer.writeBooleanValue("useTemplateDefault", this.getUseTemplateDefault());
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
     * Sets the settingValueTemplateId property value. Setting value template id
     * @param value Value to set for the settingValueTemplateId property.
     */
    public void setSettingValueTemplateId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("settingValueTemplateId", value);
    }
    /**
     * Sets the useTemplateDefault property value. Indicates whether to update policy setting value to match template setting default value
     * @param value Value to set for the useTemplateDefault property.
     */
    public void setUseTemplateDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("useTemplateDefault", value);
    }
}
