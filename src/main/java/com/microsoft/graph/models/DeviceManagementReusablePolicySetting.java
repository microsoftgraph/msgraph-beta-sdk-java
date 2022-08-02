package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementReusablePolicySetting extends Entity implements Parsable {
    /** reusable setting creation date and time. This property is read-only. */
    private OffsetDateTime _createdDateTime;
    /** reusable setting description supplied by user. */
    private String _description;
    /** reusable setting display name supplied by user. */
    private String _displayName;
    /** date and time when reusable setting was last modified. This property is read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** configuration policies referencing the current reusable setting. This property is read-only. */
    private java.util.List<DeviceManagementConfigurationPolicy> _referencingConfigurationPolicies;
    /** count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only. */
    private Integer _referencingConfigurationPolicyCount;
    /** setting definition id associated with this reusable setting. */
    private String _settingDefinitionId;
    /** reusable setting configuration instance */
    private DeviceManagementConfigurationSettingInstance _settingInstance;
    /** version number for reusable setting. Valid values 0 to 2147483647. This property is read-only. */
    private Integer _version;
    /**
     * Instantiates a new DeviceManagementReusablePolicySetting and sets the default values.
     * @return a void
     */
    public DeviceManagementReusablePolicySetting() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementReusablePolicySetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementReusablePolicySetting
     */
    @javax.annotation.Nonnull
    public static DeviceManagementReusablePolicySetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementReusablePolicySetting();
    }
    /**
     * Gets the createdDateTime property value. reusable setting creation date and time. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. reusable setting description supplied by user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. reusable setting display name supplied by user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementReusablePolicySetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("referencingConfigurationPolicies", (n) -> { currentObject.setReferencingConfigurationPolicies(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicy::createFromDiscriminatorValue)); });
            this.put("referencingConfigurationPolicyCount", (n) -> { currentObject.setReferencingConfigurationPolicyCount(n.getIntegerValue()); });
            this.put("settingDefinitionId", (n) -> { currentObject.setSettingDefinitionId(n.getStringValue()); });
            this.put("settingInstance", (n) -> { currentObject.setSettingInstance(n.getObjectValue(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. date and time when reusable setting was last modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the referencingConfigurationPolicies property value. configuration policies referencing the current reusable setting. This property is read-only.
     * @return a deviceManagementConfigurationPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicy> getReferencingConfigurationPolicies() {
        return this._referencingConfigurationPolicies;
    }
    /**
     * Gets the referencingConfigurationPolicyCount property value. count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReferencingConfigurationPolicyCount() {
        return this._referencingConfigurationPolicyCount;
    }
    /**
     * Gets the settingDefinitionId property value. setting definition id associated with this reusable setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDefinitionId() {
        return this._settingDefinitionId;
    }
    /**
     * Gets the settingInstance property value. reusable setting configuration instance
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstance getSettingInstance() {
        return this._settingInstance;
    }
    /**
     * Gets the version property value. version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("referencingConfigurationPolicies", this.getReferencingConfigurationPolicies());
        writer.writeIntegerValue("referencingConfigurationPolicyCount", this.getReferencingConfigurationPolicyCount());
        writer.writeStringValue("settingDefinitionId", this.getSettingDefinitionId());
        writer.writeObjectValue("settingInstance", this.getSettingInstance());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the createdDateTime property value. reusable setting creation date and time. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. reusable setting description supplied by user.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. reusable setting display name supplied by user.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. date and time when reusable setting was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the referencingConfigurationPolicies property value. configuration policies referencing the current reusable setting. This property is read-only.
     * @param value Value to set for the referencingConfigurationPolicies property.
     * @return a void
     */
    public void setReferencingConfigurationPolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicy> value) {
        this._referencingConfigurationPolicies = value;
    }
    /**
     * Sets the referencingConfigurationPolicyCount property value. count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the referencingConfigurationPolicyCount property.
     * @return a void
     */
    public void setReferencingConfigurationPolicyCount(@javax.annotation.Nullable final Integer value) {
        this._referencingConfigurationPolicyCount = value;
    }
    /**
     * Sets the settingDefinitionId property value. setting definition id associated with this reusable setting.
     * @param value Value to set for the settingDefinitionId property.
     * @return a void
     */
    public void setSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this._settingDefinitionId = value;
    }
    /**
     * Sets the settingInstance property value. reusable setting configuration instance
     * @param value Value to set for the settingInstance property.
     * @return a void
     */
    public void setSettingInstance(@javax.annotation.Nullable final DeviceManagementConfigurationSettingInstance value) {
        this._settingInstance = value;
    }
    /**
     * Sets the version property value. version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
