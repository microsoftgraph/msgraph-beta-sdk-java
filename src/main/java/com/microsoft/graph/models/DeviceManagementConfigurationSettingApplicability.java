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
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** description of the setting  */
    private String _description;
    /** Device Mode that setting can be applied on. Possible values are: none, kiosk.  */
    private DeviceManagementConfigurationDeviceMode _deviceMode;
    /** Platform setting can be applied on. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.  */
    private DeviceManagementConfigurationPlatforms _platform;
    /** Which technology channels this setting can be deployed through. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.  */
    private DeviceManagementConfigurationTechnologies _technologies;
    /**
     * Instantiates a new deviceManagementConfigurationSettingApplicability and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingApplicability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingApplicability
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingApplicability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
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
     * Gets the deviceMode property value. Device Mode that setting can be applied on. Possible values are: none, kiosk.
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
        return new HashMap<>(4) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceMode", (n) -> { currentObject.setDeviceMode(n.getEnumValue(DeviceManagementConfigurationDeviceMode.class)); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
            this.put("technologies", (n) -> { currentObject.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
        }};
    }
    /**
     * Gets the platform property value. Platform setting can be applied on. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatform() {
        return this._platform;
    }
    /**
     * Gets the technologies property value. Which technology channels this setting can be deployed through. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this._technologies;
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
     * Sets the deviceMode property value. Device Mode that setting can be applied on. Possible values are: none, kiosk.
     * @param value Value to set for the deviceMode property.
     * @return a void
     */
    public void setDeviceMode(@javax.annotation.Nullable final DeviceManagementConfigurationDeviceMode value) {
        this._deviceMode = value;
    }
    /**
     * Sets the platform property value. Platform setting can be applied on. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this._platform = value;
    }
    /**
     * Sets the technologies property value. Which technology channels this setting can be deployed through. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     * @param value Value to set for the technologies property.
     * @return a void
     */
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this._technologies = value;
    }
}
