package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceGuardLocalSystemAuthorityCredentialGuardState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
