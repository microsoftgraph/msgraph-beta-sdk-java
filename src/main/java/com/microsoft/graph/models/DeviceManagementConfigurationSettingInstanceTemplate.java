package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationChoiceSettingInstanceTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationGroupSettingInstanceTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationSimpleSettingInstanceTemplate;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Setting Instance Template */
public class DeviceManagementConfigurationSettingInstanceTemplate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates if a policy must specify this setting. */
    private Boolean _isRequired;
    /** The OdataType property */
    private String _odataType;
    /** Setting Definition Id */
    private String _settingDefinitionId;
    /** Setting Instance Template Id */
    private String _settingInstanceTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstanceTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstanceTemplate() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSettingInstanceTemplate");
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSettingInstanceTemplate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingDefinitionId", (n) -> { currentObject.setSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingInstanceTemplateId", (n) -> { currentObject.setSettingInstanceTemplateId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the isRequired property value. Indicates if a policy must specify this setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this._isRequired;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the settingDefinitionId property value. Setting Definition Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDefinitionId() {
        return this._settingDefinitionId;
    }
    /**
     * Gets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingInstanceTemplateId() {
        return this._settingInstanceTemplateId;
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
        this._additionalData = value;
    }
    /**
     * Sets the isRequired property value. Indicates if a policy must specify this setting.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the settingDefinitionId property value. Setting Definition Id
     * @param value Value to set for the settingDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this._settingDefinitionId = value;
    }
    /**
     * Sets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @param value Value to set for the settingInstanceTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingInstanceTemplateId(@javax.annotation.Nullable final String value) {
        this._settingInstanceTemplateId = value;
    }
}
