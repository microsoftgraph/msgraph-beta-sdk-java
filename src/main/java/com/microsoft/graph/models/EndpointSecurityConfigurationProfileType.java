package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum EndpointSecurityConfigurationProfileType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Antivirus. */
    Antivirus("antivirus"),
    /** Windows Security. */
    WindowsSecurity("windowsSecurity"),
    /** BitLocker. */
    BitLocker("bitLocker"),
    /** FileVault. */
    FileVault("fileVault"),
    /** Firewall. */
    Firewall("firewall"),
    /** Firewall rules. */
    FirewallRules("firewallRules"),
    /** Endpoint detection and response. */
    EndpointDetectionAndResponse("endpointDetectionAndResponse"),
    /** Device control. */
    DeviceControl("deviceControl"),
    /** App and browser isolation. */
    AppAndBrowserIsolation("appAndBrowserIsolation"),
    /** Exploit protection. */
    ExploitProtection("exploitProtection"),
    /** Web protection. */
    WebProtection("webProtection"),
    /** Application control. */
    ApplicationControl("applicationControl"),
    /** Attack surface reduction rules. */
    AttackSurfaceReductionRules("attackSurfaceReductionRules"),
    /** Account protection. */
    AccountProtection("accountProtection");
    public final String value;
    EndpointSecurityConfigurationProfileType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EndpointSecurityConfigurationProfileType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "antivirus": return Antivirus;
            case "windowsSecurity": return WindowsSecurity;
            case "bitLocker": return BitLocker;
            case "fileVault": return FileVault;
            case "firewall": return Firewall;
            case "firewallRules": return FirewallRules;
            case "endpointDetectionAndResponse": return EndpointDetectionAndResponse;
            case "deviceControl": return DeviceControl;
            case "appAndBrowserIsolation": return AppAndBrowserIsolation;
            case "exploitProtection": return ExploitProtection;
            case "webProtection": return WebProtection;
            case "applicationControl": return ApplicationControl;
            case "attackSurfaceReductionRules": return AttackSurfaceReductionRules;
            case "accountProtection": return AccountProtection;
            default: return null;
        }
    }
}
