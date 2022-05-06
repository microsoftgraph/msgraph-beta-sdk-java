package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementTemplateType implements ValuedEnum {
    SecurityBaseline("securityBaseline"),
    SpecializedDevices("specializedDevices"),
    AdvancedThreatProtectionSecurityBaseline("advancedThreatProtectionSecurityBaseline"),
    DeviceConfiguration("deviceConfiguration"),
    Custom("custom"),
    SecurityTemplate("securityTemplate"),
    MicrosoftEdgeSecurityBaseline("microsoftEdgeSecurityBaseline"),
    MicrosoftOffice365ProPlusSecurityBaseline("microsoftOffice365ProPlusSecurityBaseline"),
    DeviceCompliance("deviceCompliance"),
    DeviceConfigurationForOffice365("deviceConfigurationForOffice365"),
    CloudPC("cloudPC"),
    FirewallSharedSettings("firewallSharedSettings");
    public final String value;
    DeviceManagementTemplateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementTemplateType forValue(@javax.annotation.Nonnull final String searchValue) {
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
