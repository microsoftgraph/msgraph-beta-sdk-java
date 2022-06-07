package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Management Configuration Policy Template */
public class DeviceManagementConfigurationPolicyTemplate extends Entity implements Parsable {
    /** Allow unmanaged setting templates */
    private Boolean _allowUnmanagedSettings;
    /** Template base identifier */
    private String _baseId;
    /** Template description */
    private String _description;
    /** Template display name */
    private String _displayName;
    /** Description of template version */
    private String _displayVersion;
    /** Indicate current lifecycle state of template. Possible values are: invalid, draft, active, superseded, deprecated, retired. */
    private DeviceManagementTemplateLifecycleState _lifecycleState;
    /** Platforms for this template. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue. */
    private DeviceManagementConfigurationPlatforms _platforms;
    /** Number of setting templates. Valid values 0 to 2147483647. This property is read-only. */
    private Integer _settingTemplateCount;
    /** Setting templates */
    private java.util.List<DeviceManagementConfigurationSettingTemplate> _settingTemplates;
    /** Technologies for this template. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue. */
    private DeviceManagementConfigurationTechnologies _technologies;
    /** TemplateFamily for this template. Possible values are: none, endpointSecurityAntivirus, endpointSecurityDiskEncryption, endpointSecurityFirewall, endpointSecurityEndpointDetectionAndResponse, endpointSecurityAttackSurfaceReduction, endpointSecurityAccountProtection, endpointSecurityApplicationControl, baseline. */
    private DeviceManagementConfigurationTemplateFamily _templateFamily;
    /** Template version. Valid values 1 to 2147483647. This property is read-only. */
    private Integer _version;
    /**
     * Instantiates a new deviceManagementConfigurationPolicyTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationPolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationPolicyTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyTemplate();
    }
    /**
     * Gets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUnmanagedSettings() {
        return this._allowUnmanagedSettings;
    }
    /**
     * Gets the baseId property value. Template base identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBaseId() {
        return this._baseId;
    }
    /**
     * Gets the description property value. Template description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Template display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the displayVersion property value. Description of template version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayVersion() {
        return this._displayVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationPolicyTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowUnmanagedSettings", (n) -> { currentObject.setAllowUnmanagedSettings(n.getBooleanValue()); });
            this.put("baseId", (n) -> { currentObject.setBaseId(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("displayVersion", (n) -> { currentObject.setDisplayVersion(n.getStringValue()); });
            this.put("lifecycleState", (n) -> { currentObject.setLifecycleState(n.getEnumValue(DeviceManagementTemplateLifecycleState.class)); });
            this.put("platforms", (n) -> { currentObject.setPlatforms(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
            this.put("settingTemplateCount", (n) -> { currentObject.setSettingTemplateCount(n.getIntegerValue()); });
            this.put("settingTemplates", (n) -> { currentObject.setSettingTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
            this.put("technologies", (n) -> { currentObject.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
            this.put("templateFamily", (n) -> { currentObject.setTemplateFamily(n.getEnumValue(DeviceManagementConfigurationTemplateFamily.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lifecycleState property value. Indicate current lifecycle state of template. Possible values are: invalid, draft, active, superseded, deprecated, retired.
     * @return a deviceManagementTemplateLifecycleState
     */
    @javax.annotation.Nullable
    public DeviceManagementTemplateLifecycleState getLifecycleState() {
        return this._lifecycleState;
    }
    /**
     * Gets the platforms property value. Platforms for this template. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatforms() {
        return this._platforms;
    }
    /**
     * Gets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingTemplateCount() {
        return this._settingTemplateCount;
    }
    /**
     * Gets the settingTemplates property value. Setting templates
     * @return a deviceManagementConfigurationSettingTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getSettingTemplates() {
        return this._settingTemplates;
    }
    /**
     * Gets the technologies property value. Technologies for this template. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this._technologies;
    }
    /**
     * Gets the templateFamily property value. TemplateFamily for this template. Possible values are: none, endpointSecurityAntivirus, endpointSecurityDiskEncryption, endpointSecurityFirewall, endpointSecurityEndpointDetectionAndResponse, endpointSecurityAttackSurfaceReduction, endpointSecurityAccountProtection, endpointSecurityApplicationControl, baseline.
     * @return a deviceManagementConfigurationTemplateFamily
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTemplateFamily getTemplateFamily() {
        return this._templateFamily;
    }
    /**
     * Gets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUnmanagedSettings", this.getAllowUnmanagedSettings());
        writer.writeStringValue("baseId", this.getBaseId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeEnumValue("lifecycleState", this.getLifecycleState());
        writer.writeEnumValue("platforms", this.getPlatforms());
        writer.writeIntegerValue("settingTemplateCount", this.getSettingTemplateCount());
        writer.writeCollectionOfObjectValues("settingTemplates", this.getSettingTemplates());
        writer.writeEnumValue("technologies", this.getTechnologies());
        writer.writeEnumValue("templateFamily", this.getTemplateFamily());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @param value Value to set for the allowUnmanagedSettings property.
     * @return a void
     */
    public void setAllowUnmanagedSettings(@javax.annotation.Nullable final Boolean value) {
        this._allowUnmanagedSettings = value;
    }
    /**
     * Sets the baseId property value. Template base identifier
     * @param value Value to set for the baseId property.
     * @return a void
     */
    public void setBaseId(@javax.annotation.Nullable final String value) {
        this._baseId = value;
    }
    /**
     * Sets the description property value. Template description
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Template display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the displayVersion property value. Description of template version
     * @param value Value to set for the displayVersion property.
     * @return a void
     */
    public void setDisplayVersion(@javax.annotation.Nullable final String value) {
        this._displayVersion = value;
    }
    /**
     * Sets the lifecycleState property value. Indicate current lifecycle state of template. Possible values are: invalid, draft, active, superseded, deprecated, retired.
     * @param value Value to set for the lifecycleState property.
     * @return a void
     */
    public void setLifecycleState(@javax.annotation.Nullable final DeviceManagementTemplateLifecycleState value) {
        this._lifecycleState = value;
    }
    /**
     * Sets the platforms property value. Platforms for this template. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    public void setPlatforms(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this._platforms = value;
    }
    /**
     * Sets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the settingTemplateCount property.
     * @return a void
     */
    public void setSettingTemplateCount(@javax.annotation.Nullable final Integer value) {
        this._settingTemplateCount = value;
    }
    /**
     * Sets the settingTemplates property value. Setting templates
     * @param value Value to set for the settingTemplates property.
     * @return a void
     */
    public void setSettingTemplates(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this._settingTemplates = value;
    }
    /**
     * Sets the technologies property value. Technologies for this template. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     * @param value Value to set for the technologies property.
     * @return a void
     */
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this._technologies = value;
    }
    /**
     * Sets the templateFamily property value. TemplateFamily for this template. Possible values are: none, endpointSecurityAntivirus, endpointSecurityDiskEncryption, endpointSecurityFirewall, endpointSecurityEndpointDetectionAndResponse, endpointSecurityAttackSurfaceReduction, endpointSecurityAccountProtection, endpointSecurityApplicationControl, baseline.
     * @param value Value to set for the templateFamily property.
     * @return a void
     */
    public void setTemplateFamily(@javax.annotation.Nullable final DeviceManagementConfigurationTemplateFamily value) {
        this._templateFamily = value;
    }
    /**
     * Sets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
