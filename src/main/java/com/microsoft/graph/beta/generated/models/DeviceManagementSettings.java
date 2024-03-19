package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceManagementSettings} and sets the default values.
     */
    public DeviceManagementSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementSettings}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the androidDeviceAdministratorEnrollmentEnabled property value. The property to determine if Android device administrator enrollment is enabled for this account.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAndroidDeviceAdministratorEnrollmentEnabled() {
        return this.backingStore.get("androidDeviceAdministratorEnrollmentEnabled");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the derivedCredentialProvider property value. Provider type for Derived Credentials.
     * @return a {@link DerivedCredentialProviderType}
     */
    @jakarta.annotation.Nullable
    public DerivedCredentialProviderType getDerivedCredentialProvider() {
        return this.backingStore.get("derivedCredentialProvider");
    }
    /**
     * Gets the derivedCredentialUrl property value. The Derived Credential Provider self-service URI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDerivedCredentialUrl() {
        return this.backingStore.get("derivedCredentialUrl");
    }
    /**
     * Gets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceComplianceCheckinThresholdDays() {
        return this.backingStore.get("deviceComplianceCheckinThresholdDays");
    }
    /**
     * Gets the deviceInactivityBeforeRetirementInDay property value. When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceInactivityBeforeRetirementInDay() {
        return this.backingStore.get("deviceInactivityBeforeRetirementInDay");
    }
    /**
     * Gets the enableAutopilotDiagnostics property value. Determines whether the autopilot diagnostic feature is enabled or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAutopilotDiagnostics() {
        return this.backingStore.get("enableAutopilotDiagnostics");
    }
    /**
     * Gets the enableDeviceGroupMembershipReport property value. Determines whether the device group membership report feature is enabled or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableDeviceGroupMembershipReport() {
        return this.backingStore.get("enableDeviceGroupMembershipReport");
    }
    /**
     * Gets the enableEnhancedTroubleshootingExperience property value. Determines whether the enhanced troubleshooting UX is enabled or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableEnhancedTroubleshootingExperience() {
        return this.backingStore.get("enableEnhancedTroubleshootingExperience");
    }
    /**
     * Gets the enableLogCollection property value. Determines whether the log collection feature should be available for use.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableLogCollection() {
        return this.backingStore.get("enableLogCollection");
    }
    /**
     * Gets the enhancedJailBreak property value. Is feature enabled or not for enhanced jailbreak detection.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnhancedJailBreak() {
        return this.backingStore.get("enhancedJailBreak");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("androidDeviceAdministratorEnrollmentEnabled", (n) -> { this.setAndroidDeviceAdministratorEnrollmentEnabled(n.getBooleanValue()); });
        deserializerMap.put("derivedCredentialProvider", (n) -> { this.setDerivedCredentialProvider(n.getEnumValue(DerivedCredentialProviderType::forValue)); });
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
        deserializerMap.put("m365AppDiagnosticsEnabled", (n) -> { this.setM365AppDiagnosticsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("secureByDefault", (n) -> { this.setSecureByDefault(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreDevicesForUnsupportedSettingsEnabled property value. The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreDevicesForUnsupportedSettingsEnabled() {
        return this.backingStore.get("ignoreDevicesForUnsupportedSettingsEnabled");
    }
    /**
     * Gets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScheduledActionEnabled() {
        return this.backingStore.get("isScheduledActionEnabled");
    }
    /**
     * Gets the m365AppDiagnosticsEnabled property value. The property to determine if M365 App log collection is enabled for account. When TRUE it indicates that M365 app log collection is enabled for account.  When FALSE it indicates that M365 app log collection is disabled for account. Default value is FALSE
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getM365AppDiagnosticsEnabled() {
        return this.backingStore.get("m365AppDiagnosticsEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecureByDefault() {
        return this.backingStore.get("secureByDefault");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeBooleanValue("m365AppDiagnosticsEnabled", this.getM365AppDiagnosticsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("secureByDefault", this.getSecureByDefault());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the androidDeviceAdministratorEnrollmentEnabled property value. The property to determine if Android device administrator enrollment is enabled for this account.
     * @param value Value to set for the androidDeviceAdministratorEnrollmentEnabled property.
     */
    public void setAndroidDeviceAdministratorEnrollmentEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("androidDeviceAdministratorEnrollmentEnabled", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the derivedCredentialProvider property value. Provider type for Derived Credentials.
     * @param value Value to set for the derivedCredentialProvider property.
     */
    public void setDerivedCredentialProvider(@jakarta.annotation.Nullable final DerivedCredentialProviderType value) {
        this.backingStore.set("derivedCredentialProvider", value);
    }
    /**
     * Sets the derivedCredentialUrl property value. The Derived Credential Provider self-service URI.
     * @param value Value to set for the derivedCredentialUrl property.
     */
    public void setDerivedCredentialUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("derivedCredentialUrl", value);
    }
    /**
     * Sets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @param value Value to set for the deviceComplianceCheckinThresholdDays property.
     */
    public void setDeviceComplianceCheckinThresholdDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceComplianceCheckinThresholdDays", value);
    }
    /**
     * Sets the deviceInactivityBeforeRetirementInDay property value. When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     * @param value Value to set for the deviceInactivityBeforeRetirementInDay property.
     */
    public void setDeviceInactivityBeforeRetirementInDay(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceInactivityBeforeRetirementInDay", value);
    }
    /**
     * Sets the enableAutopilotDiagnostics property value. Determines whether the autopilot diagnostic feature is enabled or not.
     * @param value Value to set for the enableAutopilotDiagnostics property.
     */
    public void setEnableAutopilotDiagnostics(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableAutopilotDiagnostics", value);
    }
    /**
     * Sets the enableDeviceGroupMembershipReport property value. Determines whether the device group membership report feature is enabled or not.
     * @param value Value to set for the enableDeviceGroupMembershipReport property.
     */
    public void setEnableDeviceGroupMembershipReport(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableDeviceGroupMembershipReport", value);
    }
    /**
     * Sets the enableEnhancedTroubleshootingExperience property value. Determines whether the enhanced troubleshooting UX is enabled or not.
     * @param value Value to set for the enableEnhancedTroubleshootingExperience property.
     */
    public void setEnableEnhancedTroubleshootingExperience(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableEnhancedTroubleshootingExperience", value);
    }
    /**
     * Sets the enableLogCollection property value. Determines whether the log collection feature should be available for use.
     * @param value Value to set for the enableLogCollection property.
     */
    public void setEnableLogCollection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableLogCollection", value);
    }
    /**
     * Sets the enhancedJailBreak property value. Is feature enabled or not for enhanced jailbreak detection.
     * @param value Value to set for the enhancedJailBreak property.
     */
    public void setEnhancedJailBreak(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enhancedJailBreak", value);
    }
    /**
     * Sets the ignoreDevicesForUnsupportedSettingsEnabled property value. The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     * @param value Value to set for the ignoreDevicesForUnsupportedSettingsEnabled property.
     */
    public void setIgnoreDevicesForUnsupportedSettingsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ignoreDevicesForUnsupportedSettingsEnabled", value);
    }
    /**
     * Sets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @param value Value to set for the isScheduledActionEnabled property.
     */
    public void setIsScheduledActionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isScheduledActionEnabled", value);
    }
    /**
     * Sets the m365AppDiagnosticsEnabled property value. The property to determine if M365 App log collection is enabled for account. When TRUE it indicates that M365 app log collection is enabled for account.  When FALSE it indicates that M365 app log collection is disabled for account. Default value is FALSE
     * @param value Value to set for the m365AppDiagnosticsEnabled property.
     */
    public void setM365AppDiagnosticsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("m365AppDiagnosticsEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @param value Value to set for the secureByDefault property.
     */
    public void setSecureByDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("secureByDefault", value);
    }
}
