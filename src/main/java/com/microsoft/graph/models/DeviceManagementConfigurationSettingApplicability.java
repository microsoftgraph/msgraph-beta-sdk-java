package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSettingApplicability implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** description of the setting */
    private String _description;
    /** Describes applicability for the mode the device is in */
    private DeviceManagementConfigurationDeviceMode _deviceMode;
    /** Supported platform types. */
    private DeviceManagementConfigurationPlatforms _platform;
    /** Describes which technology this setting can be deployed with */
    private DeviceManagementConfigurationTechnologies _technologies;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new deviceManagementConfigurationSettingApplicability and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingApplicability() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.deviceManagementConfigurationSettingApplicability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingApplicability
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingApplicability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationExchangeOnlineSettingApplicability": return new DeviceManagementConfigurationExchangeOnlineSettingApplicability();
                case "#microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability": return new DeviceManagementConfigurationWindowsSettingApplicability();
            }
        }
        return new DeviceManagementConfigurationSettingApplicability();
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
     * Gets the description property value. description of the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceMode property value. Describes applicability for the mode the device is in
     * @return a deviceManagementConfigurationDeviceMode
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationDeviceMode getDeviceMode() {
        return this._deviceMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSettingApplicability currentObject = this;
        return new HashMap<>(5) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceMode", (n) -> { currentObject.setDeviceMode(n.getEnumValue(DeviceManagementConfigurationDeviceMode.class)); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
            this.put("technologies", (n) -> { currentObject.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the platform property value. Supported platform types.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatform() {
        return this._platform;
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this._technologies;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("deviceMode", this.getDeviceMode());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeEnumValue("technologies", this.getTechnologies());
        writer.writeStringValue("@odata.type", this.getType());
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
     * Sets the description property value. description of the setting
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceMode property value. Describes applicability for the mode the device is in
     * @param value Value to set for the deviceMode property.
     * @return a void
     */
    public void setDeviceMode(@javax.annotation.Nullable final DeviceManagementConfigurationDeviceMode value) {
        this._deviceMode = value;
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this._platform = value;
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     * @return a void
     */
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this._technologies = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
