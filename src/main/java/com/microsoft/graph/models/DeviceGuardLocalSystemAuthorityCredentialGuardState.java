package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Casts the previous resource to group. */
public enum DeviceGuardLocalSystemAuthorityCredentialGuardState implements ValuedEnum {
    /** Running */
    Running("running"),
    /** Reboot required */
    RebootRequired("rebootRequired"),
    /** Not licensed for Credential Guard */
    NotLicensed("notLicensed"),
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Virtualization Based security is not running */
    VirtualizationBasedSecurityNotRunning("virtualizationBasedSecurityNotRunning");
    public final String value;
    DeviceGuardLocalSystemAuthorityCredentialGuardState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceGuardLocalSystemAuthorityCredentialGuardState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "rebootRequired": return RebootRequired;
            case "notLicensed": return NotLicensed;
            case "notConfigured": return NotConfigured;
            case "virtualizationBasedSecurityNotRunning": return VirtualizationBasedSecurityNotRunning;
            default: return null;
        }
    }
}
