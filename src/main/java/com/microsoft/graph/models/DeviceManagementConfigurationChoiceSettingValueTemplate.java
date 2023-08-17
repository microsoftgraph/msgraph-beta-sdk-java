package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Choice Setting Value Template
 */
public class DeviceManagementConfigurationChoiceSettingValueTemplate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Choice Setting Value Default Template.
     */
    private DeviceManagementConfigurationChoiceSettingValueDefaultTemplate defaultValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Recommended definition override.
     */
    private DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate recommendedValueDefinition;
    /**
     * Required definition override.
     */
    private DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate requiredValueDefinition;
    /**
     * Setting Value Template Id
     */
    private String settingValueTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationChoiceSettingValueTemplate and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingValueTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationChoiceSettingValueTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValueTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValueTemplate();
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
     * Gets the defaultValue property value. Choice Setting Value Default Template.
     * @return a deviceManagementConfigurationChoiceSettingValueDefaultTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefaultTemplate getDefaultValue() {
        return this.defaultValue;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the recommendedValueDefinition property value. Recommended definition override.
     * @return a deviceManagementConfigurationChoiceSettingValueDefinitionTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate getRecommendedValueDefinition() {
        return this.recommendedValueDefinition;
    }
    /**
     * Gets the requiredValueDefinition property value. Required definition override.
     * @return a deviceManagementConfigurationChoiceSettingValueDefinitionTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate getRequiredValueDefinition() {
        return this.requiredValueDefinition;
    }
    /**
     * Gets the settingValueTemplateId property value. Setting Value Template Id
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSettingValueTemplateId() {
        return this.settingValueTemplateId;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultValue property value. Choice Setting Value Default Template.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefaultTemplate value) {
        this.defaultValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recommendedValueDefinition property value. Recommended definition override.
     * @param value Value to set for the recommendedValueDefinition property.
     */
    public void setRecommendedValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate value) {
        this.recommendedValueDefinition = value;
    }
    /**
     * Sets the requiredValueDefinition property value. Required definition override.
     * @param value Value to set for the requiredValueDefinition property.
     */
    public void setRequiredValueDefinition(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate value) {
        this.requiredValueDefinition = value;
    }
    /**
     * Sets the settingValueTemplateId property value. Setting Value Template Id
     * @param value Value to set for the settingValueTemplateId property.
     */
    public void setSettingValueTemplateId(@jakarta.annotation.Nullable final String value) {
        this.settingValueTemplateId = value;
    }
}
