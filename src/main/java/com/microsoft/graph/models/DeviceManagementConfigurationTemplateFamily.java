package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DeviceManagementConfigurationTemplateFamily implements ValuedEnum {
    /** Default for Template Family when Policy is not linked to a Template */
    None("none"),
    /** Template Family for EndpointSecurityAntivirus that manages the discrete group of antivirus settings for managed devices */
    EndpointSecurityAntivirus("endpointSecurityAntivirus"),
    /** Template Family for EndpointSecurityDiskEncryption that provides settings that are relevant for a devices built-in encryption  method, like FileVault or BitLocker */
    EndpointSecurityDiskEncryption("endpointSecurityDiskEncryption"),
    /** Template Family for EndpointSecurityFirewall that helps configure a devices built-in firewall for device that run macOS and Windows 10 */
    EndpointSecurityFirewall("endpointSecurityFirewall"),
    /** Template Family for EndpointSecurityEndpointDetectionAndResponse that facilitates management of the EDR settings and onboard devices to Microsoft Defender for Endpoint */
    EndpointSecurityEndpointDetectionAndResponse("endpointSecurityEndpointDetectionAndResponse"),
    /** Template Family for EndpointSecurityAttackSurfaceReduction that help reduce your attack surfaces, by minimizing the places where your organization is vulnerable to cyberthreats and attacks */
    EndpointSecurityAttackSurfaceReduction("endpointSecurityAttackSurfaceReduction"),
    /** Template Family for EndpointSecurityAccountProtection that facilitates protecting the identity and accounts of users */
    EndpointSecurityAccountProtection("endpointSecurityAccountProtection"),
    /** Template Family for ApplicationControl that helps mitigate security threats by restricting the applications that users can run and the code that runs in the System Core (kernel) */
    EndpointSecurityApplicationControl("endpointSecurityApplicationControl"),
    /** Template Family for Baseline */
    Baseline("baseline");
    public final String value;
    DeviceManagementConfigurationTemplateFamily(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationTemplateFamily forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "endpointSecurityAntivirus": return EndpointSecurityAntivirus;
            case "endpointSecurityDiskEncryption": return EndpointSecurityDiskEncryption;
            case "endpointSecurityFirewall": return EndpointSecurityFirewall;
            case "endpointSecurityEndpointDetectionAndResponse": return EndpointSecurityEndpointDetectionAndResponse;
            case "endpointSecurityAttackSurfaceReduction": return EndpointSecurityAttackSurfaceReduction;
            case "endpointSecurityAccountProtection": return EndpointSecurityAccountProtection;
            case "endpointSecurityApplicationControl": return EndpointSecurityApplicationControl;
            case "baseline": return Baseline;
            default: return null;
        }
    }
}
