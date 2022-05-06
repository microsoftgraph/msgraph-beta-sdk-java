package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementConfigurationTemplateFamily implements ValuedEnum {
    None("none"),
    EndpointSecurityAntivirus("endpointSecurityAntivirus"),
    EndpointSecurityDiskEncryption("endpointSecurityDiskEncryption"),
    EndpointSecurityFirewall("endpointSecurityFirewall"),
    EndpointSecurityEndpointDetectionAndResponse("endpointSecurityEndpointDetectionAndResponse"),
    EndpointSecurityAttackSurfaceReduction("endpointSecurityAttackSurfaceReduction"),
    EndpointSecurityAccountProtection("endpointSecurityAccountProtection"),
    EndpointSecurityApplicationControl("endpointSecurityApplicationControl"),
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
