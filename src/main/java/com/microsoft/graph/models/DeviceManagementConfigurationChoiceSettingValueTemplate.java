package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Choice Setting Value Template */
public class DeviceManagementConfigurationChoiceSettingValueTemplate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Choice Setting Value Default Template. */
    private DeviceManagementConfigurationChoiceSettingValueDefaultTemplate _defaultValue;
    /** The OdataType property */
    private String _odataType;
    /** Recommended definition override. */
    private DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate _recommendedValueDefinition;
    /** Required definition override. */
    private DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate _requiredValueDefinition;
    /** Setting Value Template Id */
    private String _settingValueTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationChoiceSettingValueTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationChoiceSettingValueTemplate() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingValueTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationChoiceSettingValueTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValueTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValueTemplate();
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
     * Gets the defaultValue property value. Choice Setting Value Default Template.
     * @return a deviceManagementConfigurationChoiceSettingValueDefaultTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefaultTemplate getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingValueTemplate currentObject = this;
        return new HashMap<>(5) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueDefaultTemplate::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("recommendedValueDefinition", (n) -> { currentObject.setRecommendedValueDefinition(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate::createFromDiscriminatorValue)); });
            this.put("requiredValueDefinition", (n) -> { currentObject.setRequiredValueDefinition(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate::createFromDiscriminatorValue)); });
            this.put("settingValueTemplateId", (n) -> { currentObject.setSettingValueTemplateId(n.getStringValue()); });
        }};
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
     * Gets the recommendedValueDefinition property value. Recommended definition override.
     * @return a deviceManagementConfigurationChoiceSettingValueDefinitionTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate getRecommendedValueDefinition() {
        return this._recommendedValueDefinition;
    }
    /**
     * Gets the requiredValueDefinition property value. Required definition override.
     * @return a deviceManagementConfigurationChoiceSettingValueDefinitionTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate getRequiredValueDefinition() {
        return this._requiredValueDefinition;
    }
    /**
     * Gets the settingValueTemplateId property value. Setting Value Template Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueTemplateId() {
        return this._settingValueTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the defaultValue property value. Choice Setting Value Default Template.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    public void setDefaultValue(@javax.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefaultTemplate value) {
        this._defaultValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the recommendedValueDefinition property value. Recommended definition override.
     * @param value Value to set for the recommendedValueDefinition property.
     * @return a void
     */
    public void setRecommendedValueDefinition(@javax.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate value) {
        this._recommendedValueDefinition = value;
    }
    /**
     * Sets the requiredValueDefinition property value. Required definition override.
     * @param value Value to set for the requiredValueDefinition property.
     * @return a void
     */
    public void setRequiredValueDefinition(@javax.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueDefinitionTemplate value) {
        this._requiredValueDefinition = value;
    }
    /**
     * Sets the settingValueTemplateId property value. Setting Value Template Id
     * @param value Value to set for the settingValueTemplateId property.
     * @return a void
     */
    public void setSettingValueTemplateId(@javax.annotation.Nullable final String value) {
        this._settingValueTemplateId = value;
    }
}
