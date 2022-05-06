package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceGuardLocalSystemAuthorityCredentialGuardState implements ValuedEnum {
    Running("running"),
    RebootRequired("rebootRequired"),
    NotLicensed("notLicensed"),
    NotConfigured("notConfigured"),
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
