package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The property to determine if Android device administrator enrollment is enabled for this account.  */
    private Boolean _androidDeviceAdministratorEnrollmentEnabled;
    /** The Derived Credential Provider to use for this account. Possible values are: notConfigured, entrustDataCard, purebred, xTec, intercede.  */
    private DerivedCredentialProviderType _derivedCredentialProvider;
    /** The Derived Credential Provider self-service URI.  */
    private String _derivedCredentialUrl;
    /** The number of days a device is allowed to go without checking in to remain compliant.  */
    private Integer _deviceComplianceCheckinThresholdDays;
    /** When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270  */
    private Integer _deviceInactivityBeforeRetirementInDay;
    /** Determines whether the autopilot diagnostic feature is enabled or not.  */
    private Boolean _enableAutopilotDiagnostics;
    /** Determines whether the device group membership report feature is enabled or not.  */
    private Boolean _enableDeviceGroupMembershipReport;
    /** Determines whether the enhanced troubleshooting UX is enabled or not.  */
    private Boolean _enableEnhancedTroubleshootingExperience;
    /** Determines whether the log collection feature should be available for use.  */
    private Boolean _enableLogCollection;
    /** Is feature enabled or not for enhanced jailbreak detection.  */
    private Boolean _enhancedJailBreak;
    /** The property to determine whether to ignore unsupported compliance settings on certian models of devices.  */
    private Boolean _ignoreDevicesForUnsupportedSettingsEnabled;
    /** Is feature enabled or not for scheduled action for rule.  */
    private Boolean _isScheduledActionEnabled;
    /** Device should be noncompliant when there is no compliance policy targeted when this is true  */
    private Boolean _secureByDefault;
    /**
     * Instantiates a new deviceManagementSettings and sets the default values.
     * @return a void
     */
    public DeviceManagementSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettings
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettings();
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
     * Gets the androidDeviceAdministratorEnrollmentEnabled property value. The property to determine if Android device administrator enrollment is enabled for this account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidDeviceAdministratorEnrollmentEnabled() {
        return this._androidDeviceAdministratorEnrollmentEnabled;
    }
    /**
     * Gets the derivedCredentialProvider property value. The Derived Credential Provider to use for this account. Possible values are: notConfigured, entrustDataCard, purebred, xTec, intercede.
     * @return a derivedCredentialProviderType
     */
    @javax.annotation.Nullable
    public DerivedCredentialProviderType getDerivedCredentialProvider() {
        return this._derivedCredentialProvider;
    }
    /**
     * Gets the derivedCredentialUrl property value. The Derived Credential Provider self-service URI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDerivedCredentialUrl() {
        return this._derivedCredentialUrl;
    }
    /**
     * Gets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceComplianceCheckinThresholdDays() {
        return this._deviceComplianceCheckinThresholdDays;
    }
    /**
     * Gets the deviceInactivityBeforeRetirementInDay property value. When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceInactivityBeforeRetirementInDay() {
        return this._deviceInactivityBeforeRetirementInDay;
    }
    /**
     * Gets the enableAutopilotDiagnostics property value. Determines whether the autopilot diagnostic feature is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAutopilotDiagnostics() {
        return this._enableAutopilotDiagnostics;
    }
    /**
     * Gets the enableDeviceGroupMembershipReport property value. Determines whether the device group membership report feature is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableDeviceGroupMembershipReport() {
        return this._enableDeviceGroupMembershipReport;
    }
    /**
     * Gets the enableEnhancedTroubleshootingExperience property value. Determines whether the enhanced troubleshooting UX is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableEnhancedTroubleshootingExperience() {
        return this._enableEnhancedTroubleshootingExperience;
    }
    /**
     * Gets the enableLogCollection property value. Determines whether the log collection feature should be available for use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableLogCollection() {
        return this._enableLogCollection;
    }
    /**
     * Gets the enhancedJailBreak property value. Is feature enabled or not for enhanced jailbreak detection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnhancedJailBreak() {
        return this._enhancedJailBreak;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettings currentObject = this;
        return new HashMap<>(13) {{
            this.put("androidDeviceAdministratorEnrollmentEnabled", (n) -> { currentObject.setAndroidDeviceAdministratorEnrollmentEnabled(n.getBooleanValue()); });
            this.put("derivedCredentialProvider", (n) -> { currentObject.setDerivedCredentialProvider(n.getEnumValue(DerivedCredentialProviderType.class)); });
            this.put("derivedCredentialUrl", (n) -> { currentObject.setDerivedCredentialUrl(n.getStringValue()); });
            this.put("deviceComplianceCheckinThresholdDays", (n) -> { currentObject.setDeviceComplianceCheckinThresholdDays(n.getIntegerValue()); });
            this.put("deviceInactivityBeforeRetirementInDay", (n) -> { currentObject.setDeviceInactivityBeforeRetirementInDay(n.getIntegerValue()); });
            this.put("enableAutopilotDiagnostics", (n) -> { currentObject.setEnableAutopilotDiagnostics(n.getBooleanValue()); });
            this.put("enableDeviceGroupMembershipReport", (n) -> { currentObject.setEnableDeviceGroupMembershipReport(n.getBooleanValue()); });
            this.put("enableEnhancedTroubleshootingExperience", (n) -> { currentObject.setEnableEnhancedTroubleshootingExperience(n.getBooleanValue()); });
            this.put("enableLogCollection", (n) -> { currentObject.setEnableLogCollection(n.getBooleanValue()); });
            this.put("enhancedJailBreak", (n) -> { currentObject.setEnhancedJailBreak(n.getBooleanValue()); });
            this.put("ignoreDevicesForUnsupportedSettingsEnabled", (n) -> { currentObject.setIgnoreDevicesForUnsupportedSettingsEnabled(n.getBooleanValue()); });
            this.put("isScheduledActionEnabled", (n) -> { currentObject.setIsScheduledActionEnabled(n.getBooleanValue()); });
            this.put("secureByDefault", (n) -> { currentObject.setSecureByDefault(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the ignoreDevicesForUnsupportedSettingsEnabled property value. The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreDevicesForUnsupportedSettingsEnabled() {
        return this._ignoreDevicesForUnsupportedSettingsEnabled;
    }
    /**
     * Gets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsScheduledActionEnabled() {
        return this._isScheduledActionEnabled;
    }
    /**
     * Gets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecureByDefault() {
        return this._secureByDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("androidDeviceAdministratorEnrollmentEnabled", this.getAndroidDeviceAdministratorEnrollmentEnabled());
        writer.writeEnumValue("derivedCredentialProvider", this.getDerivedCredentialProvider());
        writer.writeStringValue("derivedCredentialUrl", this.getDerivedCredentialUrl());
        writer.writeIntegerValue("deviceComplianceCheckinThresholdDays", this.getDeviceComplianceCheckinThresholdDays());
        writer.writeIntegerValue("deviceInactivityBeforeRetirementInDay", this.getDeviceInactivityBeforeRetirementInDay());
        writer.writeBooleanValue("enableAutopilotDiagnostics", this.getEnableAutopilotDiagnostics());
        writer.writeBooleanValue("enableDeviceGroupMembershipReport", this.getEnableDeviceGroupMembershipReport());
        writer.writeBooleanValue("enableEnhancedTroubleshootingExperience", this.getEnableEnhancedTroubleshootingExperience());
        writer.writeBooleanValue("enableLogCollection", this.getEnableLogCollection());
        writer.writeBooleanValue("enhancedJailBreak", this.getEnhancedJailBreak());
        writer.writeBooleanValue("ignoreDevicesForUnsupportedSettingsEnabled", this.getIgnoreDevicesForUnsupportedSettingsEnabled());
        writer.writeBooleanValue("isScheduledActionEnabled", this.getIsScheduledActionEnabled());
        writer.writeBooleanValue("secureByDefault", this.getSecureByDefault());
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
     * Sets the androidDeviceAdministratorEnrollmentEnabled property value. The property to determine if Android device administrator enrollment is enabled for this account.
     * @param value Value to set for the androidDeviceAdministratorEnrollmentEnabled property.
     * @return a void
     */
    public void setAndroidDeviceAdministratorEnrollmentEnabled(@javax.annotation.Nullable final Boolean value) {
        this._androidDeviceAdministratorEnrollmentEnabled = value;
    }
    /**
     * Sets the derivedCredentialProvider property value. The Derived Credential Provider to use for this account. Possible values are: notConfigured, entrustDataCard, purebred, xTec, intercede.
     * @param value Value to set for the derivedCredentialProvider property.
     * @return a void
     */
    public void setDerivedCredentialProvider(@javax.annotation.Nullable final DerivedCredentialProviderType value) {
        this._derivedCredentialProvider = value;
    }
    /**
     * Sets the derivedCredentialUrl property value. The Derived Credential Provider self-service URI.
     * @param value Value to set for the derivedCredentialUrl property.
     * @return a void
     */
    public void setDerivedCredentialUrl(@javax.annotation.Nullable final String value) {
        this._derivedCredentialUrl = value;
    }
    /**
     * Sets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @param value Value to set for the deviceComplianceCheckinThresholdDays property.
     * @return a void
     */
    public void setDeviceComplianceCheckinThresholdDays(@javax.annotation.Nullable final Integer value) {
        this._deviceComplianceCheckinThresholdDays = value;
    }
    /**
     * Sets the deviceInactivityBeforeRetirementInDay property value. When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     * @param value Value to set for the deviceInactivityBeforeRetirementInDay property.
     * @return a void
     */
    public void setDeviceInactivityBeforeRetirementInDay(@javax.annotation.Nullable final Integer value) {
        this._deviceInactivityBeforeRetirementInDay = value;
    }
    /**
     * Sets the enableAutopilotDiagnostics property value. Determines whether the autopilot diagnostic feature is enabled or not.
     * @param value Value to set for the enableAutopilotDiagnostics property.
     * @return a void
     */
    public void setEnableAutopilotDiagnostics(@javax.annotation.Nullable final Boolean value) {
        this._enableAutopilotDiagnostics = value;
    }
    /**
     * Sets the enableDeviceGroupMembershipReport property value. Determines whether the device group membership report feature is enabled or not.
     * @param value Value to set for the enableDeviceGroupMembershipReport property.
     * @return a void
     */
    public void setEnableDeviceGroupMembershipReport(@javax.annotation.Nullable final Boolean value) {
        this._enableDeviceGroupMembershipReport = value;
    }
    /**
     * Sets the enableEnhancedTroubleshootingExperience property value. Determines whether the enhanced troubleshooting UX is enabled or not.
     * @param value Value to set for the enableEnhancedTroubleshootingExperience property.
     * @return a void
     */
    public void setEnableEnhancedTroubleshootingExperience(@javax.annotation.Nullable final Boolean value) {
        this._enableEnhancedTroubleshootingExperience = value;
    }
    /**
     * Sets the enableLogCollection property value. Determines whether the log collection feature should be available for use.
     * @param value Value to set for the enableLogCollection property.
     * @return a void
     */
    public void setEnableLogCollection(@javax.annotation.Nullable final Boolean value) {
        this._enableLogCollection = value;
    }
    /**
     * Sets the enhancedJailBreak property value. Is feature enabled or not for enhanced jailbreak detection.
     * @param value Value to set for the enhancedJailBreak property.
     * @return a void
     */
    public void setEnhancedJailBreak(@javax.annotation.Nullable final Boolean value) {
        this._enhancedJailBreak = value;
    }
    /**
     * Sets the ignoreDevicesForUnsupportedSettingsEnabled property value. The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     * @param value Value to set for the ignoreDevicesForUnsupportedSettingsEnabled property.
     * @return a void
     */
    public void setIgnoreDevicesForUnsupportedSettingsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._ignoreDevicesForUnsupportedSettingsEnabled = value;
    }
    /**
     * Sets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @param value Value to set for the isScheduledActionEnabled property.
     * @return a void
     */
    public void setIsScheduledActionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isScheduledActionEnabled = value;
    }
    /**
     * Sets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @param value Value to set for the secureByDefault property.
     * @return a void
     */
    public void setSecureByDefault(@javax.annotation.Nullable final Boolean value) {
        this._secureByDefault = value;
    }
}
