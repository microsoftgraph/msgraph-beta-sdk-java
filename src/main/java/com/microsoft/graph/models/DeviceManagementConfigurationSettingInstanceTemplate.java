package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting Instance Template
 */
public class DeviceManagementConfigurationSettingInstanceTemplate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates if a policy must specify this setting.
     */
    private Boolean isRequired;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Setting Definition Id
     */
    private String settingDefinitionId;
    /**
     * Setting Instance Template Id
     */
    private String settingInstanceTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstanceTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstanceTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingInstanceTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingInstanceTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingDefinitionId", (n) -> { this.setSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingInstanceTemplateId", (n) -> { this.setSettingInstanceTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Indicates if a policy must specify this setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
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
     * Gets the settingDefinitionId property value. Setting Definition Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDefinitionId() {
        return this.settingDefinitionId;
    }
    /**
     * Gets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingInstanceTemplateId() {
        return this.settingInstanceTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeStringValue("settingInstanceTemplateId", this.getSettingInstanceTemplateId());
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
     * Sets the isRequired property value. Indicates if a policy must specify this setting.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this.isRequired = value;
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
     * Sets the settingDefinitionId property value. Setting Definition Id
     * @param value Value to set for the settingDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this.settingDefinitionId = value;
    }
    /**
     * Sets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @param value Value to set for the settingInstanceTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingInstanceTemplateId(@javax.annotation.Nullable final String value) {
        this.settingInstanceTemplateId = value;
    }
}
