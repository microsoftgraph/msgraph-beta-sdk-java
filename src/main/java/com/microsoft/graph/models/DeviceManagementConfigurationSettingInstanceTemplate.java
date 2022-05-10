package microsoft.graph.models;

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
    /** Setting Definition Id */
    private String _settingDefinitionId;
    /** Setting Instance Template Id */
    private String _settingInstanceTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstanceTemplate and sets the default values.
     * @return a void
     */
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
        return new HashMap<>(3) {{
            this.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
            this.put("settingDefinitionId", (n) -> { currentObject.setSettingDefinitionId(n.getStringValue()); });
            this.put("settingInstanceTemplateId", (n) -> { currentObject.setSettingInstanceTemplateId(n.getStringValue()); });
        }};
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeStringValue("settingInstanceTemplateId", this.getSettingInstanceTemplateId());
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
     * Sets the isRequired property value. Indicates if a policy must specify this setting.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
    /**
     * Sets the settingDefinitionId property value. Setting Definition Id
     * @param value Value to set for the settingDefinitionId property.
     * @return a void
     */
    public void setSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this._settingDefinitionId = value;
    }
    /**
     * Sets the settingInstanceTemplateId property value. Setting Instance Template Id
     * @param value Value to set for the settingInstanceTemplateId property.
     * @return a void
     */
    public void setSettingInstanceTemplateId(@javax.annotation.Nullable final String value) {
        this._settingInstanceTemplateId = value;
    }
}
