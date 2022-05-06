package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementTemplateSubtype implements ValuedEnum {
    None("none"),
    Firewall("firewall"),
    DiskEncryption("diskEncryption"),
    AttackSurfaceReduction("attackSurfaceReduction"),
    EndpointDetectionReponse("endpointDetectionReponse"),
    AccountProtection("accountProtection"),
    Antivirus("antivirus"),
    FirewallSharedAppList("firewallSharedAppList"),
    FirewallSharedIpList("firewallSharedIpList"),
    FirewallSharedPortlist("firewallSharedPortlist");
    public final String value;
    DeviceManagementTemplateSubtype(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementTemplateSubtype forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "firewall": return Firewall;
            case "diskEncryption": return DiskEncryption;
            case "attackSurfaceReduction": return AttackSurfaceReduction;
            case "endpointDetectionReponse": return EndpointDetectionReponse;
            case "accountProtection": return AccountProtection;
            case "antivirus": return Antivirus;
            case "firewallSharedAppList": return FirewallSharedAppList;
            case "firewallSharedIpList": return FirewallSharedIpList;
            case "firewallSharedPortlist": return FirewallSharedPortlist;
            default: return null;
        }
    }
}
