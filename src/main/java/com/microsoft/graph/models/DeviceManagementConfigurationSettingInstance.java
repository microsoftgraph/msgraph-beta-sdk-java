package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Setting instance within policy */
public class DeviceManagementConfigurationSettingInstance implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Setting Definition Id */
    private String _settingDefinitionId;
    /** Setting Instance Template Reference */
    private DeviceManagementConfigurationSettingInstanceTemplateReference _settingInstanceTemplateReference;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstance and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingInstance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingInstance();
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
        final DeviceManagementConfigurationSettingInstance currentObject = this;
        return new HashMap<>(2) {{
            this.put("settingDefinitionId", (n) -> { currentObject.setSettingDefinitionId(n.getStringValue()); });
            this.put("settingInstanceTemplateReference", (n) -> { currentObject.setSettingInstanceTemplateReference(n.getObjectValue(DeviceManagementConfigurationSettingInstanceTemplateReference::createFromDiscriminatorValue)); });
        }};
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
     * Gets the settingInstanceTemplateReference property value. Setting Instance Template Reference
     * @return a deviceManagementConfigurationSettingInstanceTemplateReference
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstanceTemplateReference getSettingInstanceTemplateReference() {
        return this._settingInstanceTemplateReference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeObjectValue("settingInstanceTemplateReference", this.getSettingInstanceTemplateReference());
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
     * Sets the settingDefinitionId property value. Setting Definition Id
     * @param value Value to set for the settingDefinitionId property.
     * @return a void
     */
    public void setSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this._settingDefinitionId = value;
    }
    /**
     * Sets the settingInstanceTemplateReference property value. Setting Instance Template Reference
     * @param value Value to set for the settingInstanceTemplateReference property.
     * @return a void
     */
    public void setSettingInstanceTemplateReference(@javax.annotation.Nullable final DeviceManagementConfigurationSettingInstanceTemplateReference value) {
        this._settingInstanceTemplateReference = value;
    }
}
