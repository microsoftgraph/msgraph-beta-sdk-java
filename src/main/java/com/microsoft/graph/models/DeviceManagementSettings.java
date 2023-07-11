package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The property to determine if Android device administrator enrollment is enabled for this account.
     */
    private Boolean androidDeviceAdministratorEnrollmentEnabled;
    /**
     * Provider type for Derived Credentials.
     */
    private DerivedCredentialProviderType derivedCredentialProvider;
    /**
     * The Derived Credential Provider self-service URI.
     */
    private String derivedCredentialUrl;
    /**
     * The number of days a device is allowed to go without checking in to remain compliant.
     */
    private Integer deviceComplianceCheckinThresholdDays;
    /**
     * When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     */
    private Integer deviceInactivityBeforeRetirementInDay;
    /**
     * Determines whether the autopilot diagnostic feature is enabled or not.
     */
    private Boolean enableAutopilotDiagnostics;
    /**
     * Determines whether the device group membership report feature is enabled or not.
     */
    private Boolean enableDeviceGroupMembershipReport;
    /**
     * Determines whether the enhanced troubleshooting UX is enabled or not.
     */
    private Boolean enableEnhancedTroubleshootingExperience;
    /**
     * Determines whether the log collection feature should be available for use.
     */
    private Boolean enableLogCollection;
    /**
     * Is feature enabled or not for enhanced jailbreak detection.
     */
    private Boolean enhancedJailBreak;
    /**
     * The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     */
    private Boolean ignoreDevicesForUnsupportedSettingsEnabled;
    /**
     * Is feature enabled or not for scheduled action for rule.
     */
    private Boolean isScheduledActionEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Device should be noncompliant when there is no compliance policy targeted when this is true
     */
    private Boolean secureByDefault;
    /**
     * Instantiates a new deviceManagementSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the androidDeviceAdministratorEnrollmentEnabled property value. The property to determine if Android device administrator enrollment is enabled for this account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidDeviceAdministratorEnrollmentEnabled() {
        return this.androidDeviceAdministratorEnrollmentEnabled;
    }
    /**
     * Gets the derivedCredentialProvider property value. Provider type for Derived Credentials.
     * @return a derivedCredentialProviderType
     */
    @javax.annotation.Nullable
    public DerivedCredentialProviderType getDerivedCredentialProvider() {
        return this.derivedCredentialProvider;
    }
    /**
     * Gets the derivedCredentialUrl property value. The Derived Credential Provider self-service URI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDerivedCredentialUrl() {
        return this.derivedCredentialUrl;
    }
    /**
     * Gets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceComplianceCheckinThresholdDays() {
        return this.deviceComplianceCheckinThresholdDays;
    }
    /**
     * Gets the deviceInactivityBeforeRetirementInDay property value. When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceInactivityBeforeRetirementInDay() {
        return this.deviceInactivityBeforeRetirementInDay;
    }
    /**
     * Gets the enableAutopilotDiagnostics property value. Determines whether the autopilot diagnostic feature is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAutopilotDiagnostics() {
        return this.enableAutopilotDiagnostics;
    }
    /**
     * Gets the enableDeviceGroupMembershipReport property value. Determines whether the device group membership report feature is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableDeviceGroupMembershipReport() {
        return this.enableDeviceGroupMembershipReport;
    }
    /**
     * Gets the enableEnhancedTroubleshootingExperience property value. Determines whether the enhanced troubleshooting UX is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableEnhancedTroubleshootingExperience() {
        return this.enableEnhancedTroubleshootingExperience;
    }
    /**
     * Gets the enableLogCollection property value. Determines whether the log collection feature should be available for use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableLogCollection() {
        return this.enableLogCollection;
    }
    /**
     * Gets the enhancedJailBreak property value. Is feature enabled or not for enhanced jailbreak detection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnhancedJailBreak() {
        return this.enhancedJailBreak;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("androidDeviceAdministratorEnrollmentEnabled", (n) -> { this.setAndroidDeviceAdministratorEnrollmentEnabled(n.getBooleanValue()); });
        deserializerMap.put("derivedCredentialProvider", (n) -> { this.setDerivedCredentialProvider(n.getEnumValue(DerivedCredentialProviderType.class)); });
        deserializerMap.put("derivedCredentialUrl", (n) -> { this.setDerivedCredentialUrl(n.getStringValue()); });
        deserializerMap.put("deviceComplianceCheckinThresholdDays", (n) -> { this.setDeviceComplianceCheckinThresholdDays(n.getIntegerValue()); });
        deserializerMap.put("deviceInactivityBeforeRetirementInDay", (n) -> { this.setDeviceInactivityBeforeRetirementInDay(n.getIntegerValue()); });
        deserializerMap.put("enableAutopilotDiagnostics", (n) -> { this.setEnableAutopilotDiagnostics(n.getBooleanValue()); });
        deserializerMap.put("enableDeviceGroupMembershipReport", (n) -> { this.setEnableDeviceGroupMembershipReport(n.getBooleanValue()); });
        deserializerMap.put("enableEnhancedTroubleshootingExperience", (n) -> { this.setEnableEnhancedTroubleshootingExperience(n.getBooleanValue()); });
        deserializerMap.put("enableLogCollection", (n) -> { this.setEnableLogCollection(n.getBooleanValue()); });
        deserializerMap.put("enhancedJailBreak", (n) -> { this.setEnhancedJailBreak(n.getBooleanValue()); });
        deserializerMap.put("ignoreDevicesForUnsupportedSettingsEnabled", (n) -> { this.setIgnoreDevicesForUnsupportedSettingsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isScheduledActionEnabled", (n) -> { this.setIsScheduledActionEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("secureByDefault", (n) -> { this.setSecureByDefault(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreDevicesForUnsupportedSettingsEnabled property value. The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreDevicesForUnsupportedSettingsEnabled() {
        return this.ignoreDevicesForUnsupportedSettingsEnabled;
    }
    /**
     * Gets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsScheduledActionEnabled() {
        return this.isScheduledActionEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecureByDefault() {
        return this.secureByDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("secureByDefault", this.getSecureByDefault());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the androidDeviceAdministratorEnrollmentEnabled property value. The property to determine if Android device administrator enrollment is enabled for this account.
     * @param value Value to set for the androidDeviceAdministratorEnrollmentEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidDeviceAdministratorEnrollmentEnabled(@javax.annotation.Nullable final Boolean value) {
        this.androidDeviceAdministratorEnrollmentEnabled = value;
    }
    /**
     * Sets the derivedCredentialProvider property value. Provider type for Derived Credentials.
     * @param value Value to set for the derivedCredentialProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDerivedCredentialProvider(@javax.annotation.Nullable final DerivedCredentialProviderType value) {
        this.derivedCredentialProvider = value;
    }
    /**
     * Sets the derivedCredentialUrl property value. The Derived Credential Provider self-service URI.
     * @param value Value to set for the derivedCredentialUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDerivedCredentialUrl(@javax.annotation.Nullable final String value) {
        this.derivedCredentialUrl = value;
    }
    /**
     * Sets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @param value Value to set for the deviceComplianceCheckinThresholdDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceCheckinThresholdDays(@javax.annotation.Nullable final Integer value) {
        this.deviceComplianceCheckinThresholdDays = value;
    }
    /**
     * Sets the deviceInactivityBeforeRetirementInDay property value. When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     * @param value Value to set for the deviceInactivityBeforeRetirementInDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceInactivityBeforeRetirementInDay(@javax.annotation.Nullable final Integer value) {
        this.deviceInactivityBeforeRetirementInDay = value;
    }
    /**
     * Sets the enableAutopilotDiagnostics property value. Determines whether the autopilot diagnostic feature is enabled or not.
     * @param value Value to set for the enableAutopilotDiagnostics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableAutopilotDiagnostics(@javax.annotation.Nullable final Boolean value) {
        this.enableAutopilotDiagnostics = value;
    }
    /**
     * Sets the enableDeviceGroupMembershipReport property value. Determines whether the device group membership report feature is enabled or not.
     * @param value Value to set for the enableDeviceGroupMembershipReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableDeviceGroupMembershipReport(@javax.annotation.Nullable final Boolean value) {
        this.enableDeviceGroupMembershipReport = value;
    }
    /**
     * Sets the enableEnhancedTroubleshootingExperience property value. Determines whether the enhanced troubleshooting UX is enabled or not.
     * @param value Value to set for the enableEnhancedTroubleshootingExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableEnhancedTroubleshootingExperience(@javax.annotation.Nullable final Boolean value) {
        this.enableEnhancedTroubleshootingExperience = value;
    }
    /**
     * Sets the enableLogCollection property value. Determines whether the log collection feature should be available for use.
     * @param value Value to set for the enableLogCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableLogCollection(@javax.annotation.Nullable final Boolean value) {
        this.enableLogCollection = value;
    }
    /**
     * Sets the enhancedJailBreak property value. Is feature enabled or not for enhanced jailbreak detection.
     * @param value Value to set for the enhancedJailBreak property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnhancedJailBreak(@javax.annotation.Nullable final Boolean value) {
        this.enhancedJailBreak = value;
    }
    /**
     * Sets the ignoreDevicesForUnsupportedSettingsEnabled property value. The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     * @param value Value to set for the ignoreDevicesForUnsupportedSettingsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIgnoreDevicesForUnsupportedSettingsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.ignoreDevicesForUnsupportedSettingsEnabled = value;
    }
    /**
     * Sets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @param value Value to set for the isScheduledActionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsScheduledActionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isScheduledActionEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @param value Value to set for the secureByDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureByDefault(@javax.annotation.Nullable final Boolean value) {
        this.secureByDefault = value;
    }
}
