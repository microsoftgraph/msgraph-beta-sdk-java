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
    /** The type property */
    private String _type;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstance and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingInstance() {
        this.setAdditionalData(new HashMap<>());
        this.setOdatatype("#microsoft.graph.deviceManagementConfigurationSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
        return new HashMap<>(3) {{
            this.put("settingDefinitionId", (n) -> { currentObject.setSettingDefinitionId(n.getStringValue()); });
            this.put("settingInstanceTemplateReference", (n) -> { currentObject.setSettingInstanceTemplateReference(n.getObjectValue(DeviceManagementConfigurationSettingInstanceTemplateReference::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdatatype(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdatatype() {
        return this._type;
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
        writer.writeStringValue("@odata.type", this.getOdatatype());
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
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setOdatatype(@javax.annotation.Nullable final String value) {
        this._type = value;
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
