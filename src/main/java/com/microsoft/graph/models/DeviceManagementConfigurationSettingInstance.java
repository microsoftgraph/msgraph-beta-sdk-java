package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting instance within policy
 */
public class DeviceManagementConfigurationSettingInstance implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Setting Definition Id
     */
    private String settingDefinitionId;
    /**
     * Setting Instance Template Reference
     */
    private DeviceManagementConfigurationSettingInstanceTemplateReference settingInstanceTemplateReference;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstance and sets the default values.
     */
    public DeviceManagementConfigurationSettingInstance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingInstance
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstance": return new DeviceManagementConfigurationChoiceSettingCollectionInstance();
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingInstance": return new DeviceManagementConfigurationChoiceSettingInstance();
                case "#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstance": return new DeviceManagementConfigurationGroupSettingCollectionInstance();
                case "#microsoft.graph.deviceManagementConfigurationGroupSettingInstance": return new DeviceManagementConfigurationGroupSettingInstance();
                case "#microsoft.graph.deviceManagementConfigurationSettingGroupCollectionInstance": return new DeviceManagementConfigurationSettingGroupCollectionInstance();
                case "#microsoft.graph.deviceManagementConfigurationSettingGroupInstance": return new DeviceManagementConfigurationSettingGroupInstance();
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionInstance": return new DeviceManagementConfigurationSimpleSettingCollectionInstance();
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingInstance": return new DeviceManagementConfigurationSimpleSettingInstance();
            }
        }
        return new DeviceManagementConfigurationSettingInstance();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
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
        deserializerMap.put("settingInstanceTemplateReference", (n) -> { this.setSettingInstanceTemplateReference(n.getObjectValue(DeviceManagementConfigurationSettingInstanceTemplateReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the settingDefinitionId property value. Setting Definition Id
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSettingDefinitionId() {
        return this.settingDefinitionId;
    }
    /**
     * Gets the settingInstanceTemplateReference property value. Setting Instance Template Reference
     * @return a deviceManagementConfigurationSettingInstanceTemplateReference
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingInstanceTemplateReference getSettingInstanceTemplateReference() {
        return this.settingInstanceTemplateReference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeObjectValue("settingInstanceTemplateReference", this.getSettingInstanceTemplateReference());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the settingDefinitionId property value. Setting Definition Id
     * @param value Value to set for the settingDefinitionId property.
     */
    public void setSettingDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.settingDefinitionId = value;
    }
    /**
     * Sets the settingInstanceTemplateReference property value. Setting Instance Template Reference
     * @param value Value to set for the settingInstanceTemplateReference property.
     */
    public void setSettingInstanceTemplateReference(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingInstanceTemplateReference value) {
        this.settingInstanceTemplateReference = value;
    }
}
