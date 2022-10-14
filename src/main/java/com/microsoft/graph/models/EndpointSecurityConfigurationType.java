package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum EndpointSecurityConfigurationType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Antivirus. */
    Antivirus("antivirus"),
    /** Disk encryption. */
    DiskEncryption("diskEncryption"),
    /** Firewall. */
    Firewall("firewall"),
    /** Endpoint detection and response. */
    EndpointDetectionAndResponse("endpointDetectionAndResponse"),
    /** Attack surface reduction. */
    AttackSurfaceReduction("attackSurfaceReduction"),
    /** Account protection. */
    AccountProtection("accountProtection");
    public final String value;
    EndpointSecurityConfigurationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EndpointSecurityConfigurationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "antivirus": return Antivirus;
            case "diskEncryption": return DiskEncryption;
            case "firewall": return Firewall;
            case "endpointDetectionAndResponse": return EndpointDetectionAndResponse;
            case "attackSurfaceReduction": return AttackSurfaceReduction;
            case "accountProtection": return AccountProtection;
            default: return null;
        }
    }
}
