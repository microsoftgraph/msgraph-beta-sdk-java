package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Template type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementTemplateType implements ValuedEnum {
    /** Security baseline template */
    SecurityBaseline("securityBaseline"),
    /** Specialized devices template */
    SpecializedDevices("specializedDevices"),
    /** Advanced Threat Protection security baseline template */
    AdvancedThreatProtectionSecurityBaseline("advancedThreatProtectionSecurityBaseline"),
    /** Device configuration template */
    DeviceConfiguration("deviceConfiguration"),
    /** Custom admin defined template */
    Custom("custom"),
    /** Templates containing specific security focused settings */
    SecurityTemplate("securityTemplate"),
    /** Microsoft Edge security baseline template */
    MicrosoftEdgeSecurityBaseline("microsoftEdgeSecurityBaseline"),
    /** Microsoft Office 365 ProPlus security baseline template */
    MicrosoftOffice365ProPlusSecurityBaseline("microsoftOffice365ProPlusSecurityBaseline"),
    /** Device compliance template */
    DeviceCompliance("deviceCompliance"),
    /** Device Configuration for Microsoft Office 365 settings */
    DeviceConfigurationForOffice365("deviceConfigurationForOffice365"),
    /** Windows 365 security baseline template */
    CloudPC("cloudPC"),
    /** Firewall Shared Object templates for reference settings */
    FirewallSharedSettings("firewallSharedSettings");
    public final String value;
    DeviceManagementTemplateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementTemplateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "securityBaseline": return SecurityBaseline;
            case "specializedDevices": return SpecializedDevices;
            case "advancedThreatProtectionSecurityBaseline": return AdvancedThreatProtectionSecurityBaseline;
            case "deviceConfiguration": return DeviceConfiguration;
            case "custom": return Custom;
            case "securityTemplate": return SecurityTemplate;
            case "microsoftEdgeSecurityBaseline": return MicrosoftEdgeSecurityBaseline;
            case "microsoftOffice365ProPlusSecurityBaseline": return MicrosoftOffice365ProPlusSecurityBaseline;
            case "deviceCompliance": return DeviceCompliance;
            case "deviceConfigurationForOffice365": return DeviceConfigurationForOffice365;
            case "cloudPC": return CloudPC;
            case "firewallSharedSettings": return FirewallSharedSettings;
            default: return null;
        }
    }
}
