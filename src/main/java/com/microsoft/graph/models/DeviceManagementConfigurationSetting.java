package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Setting instance within policy */
public class DeviceManagementConfigurationSetting extends Entity implements Parsable {
    /** List of related Setting Definitions. This property is read-only. */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> _settingDefinitions;
    /** Setting instance within policy */
    private DeviceManagementConfigurationSettingInstance _settingInstance;
    /**
     * Instantiates a new deviceManagementConfigurationSetting and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSetting() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSetting
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("settingDefinitions", (n) -> { currentObject.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
            this.put("settingInstance", (n) -> { currentObject.setSettingInstance(n.getObjectValue(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settingDefinitions property value. List of related Setting Definitions. This property is read-only.
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getSettingDefinitions() {
        return this._settingDefinitions;
    }
    /**
     * Gets the settingInstance property value. Setting instance within policy
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstance getSettingInstance() {
        return this._settingInstance;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settingInstance", this.getSettingInstance());
    }
    /**
     * Sets the settingDefinitions property value. List of related Setting Definitions. This property is read-only.
     * @param value Value to set for the settingDefinitions property.
     * @return a void
     */
    public void setSettingDefinitions(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this._settingDefinitions = value;
    }
    /**
     * Sets the settingInstance property value. Setting instance within policy
     * @param value Value to set for the settingInstance property.
     * @return a void
     */
    public void setSettingInstance(@javax.annotation.Nullable final DeviceManagementConfigurationSettingInstance value) {
        this._settingInstance = value;
    }
}
