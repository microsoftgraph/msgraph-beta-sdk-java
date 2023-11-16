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
 * Setting Instance Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingInstanceTemplate implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementConfigurationSettingInstanceTemplate and sets the default values.
     */
    public DeviceManagementConfigurationSettingInstanceTemplate() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSettingInstanceTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingInstanceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstanceTemplate": return new DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate();
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingInstanceTemplate": return new DeviceManagementConfigurationChoiceSettingInstanceTemplate();
                case "#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstanceTemplate": return new DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate();
                case "#microsoft.graph.deviceManagementConfigurationGroupSettingInstanceTemplate": return new DeviceManagementConfigurationGroupSettingInstanceTemplate();
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionInstanceTemplate": return new DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate();
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingInstanceTemplate": return new DeviceManagementConfigurationSimpleSettingInstanceTemplate();
            }
        }
        return new DeviceManagementConfigurationSettingInstanceTemplate();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingDefinitionId", (n) -> { this.setSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingInstanceTemplateId", (n) -> { this.setSettingInstanceTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Indicates if a policy must specify this setting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.backingStore.get("isRequired");
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
     * Gets the settingDefinitionId property value. Setting Definition Id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingDefinitionId() {
        return this.backingStore.get("settingDefinitionId");
    }
    /**
     * Gets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingInstanceTemplateId() {
        return this.backingStore.get("settingInstanceTemplateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeStringValue("settingInstanceTemplateId", this.getSettingInstanceTemplateId());
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
     * Sets the isRequired property value. Indicates if a policy must specify this setting.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequired", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the settingDefinitionId property value. Setting Definition Id
     * @param value Value to set for the settingDefinitionId property.
     */
    public void setSettingDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingDefinitionId", value);
    }
    /**
     * Sets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @param value Value to set for the settingInstanceTemplateId property.
     */
    public void setSettingInstanceTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingInstanceTemplateId", value);
    }
}
