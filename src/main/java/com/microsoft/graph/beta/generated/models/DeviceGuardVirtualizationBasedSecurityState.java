package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceGuardVirtualizationBasedSecurityState implements ValuedEnum {
    /** Running */
    Running("running"),
    /** Root required */
    RebootRequired("rebootRequired"),
    /** 64 bit architecture required */
    Require64BitArchitecture("require64BitArchitecture"),
    /** Not licensed */
    NotLicensed("notLicensed"),
    /** Not configured */
    NotConfigured("notConfigured"),
    /** System does not meet hardware requirements */
    DoesNotMeetHardwareRequirements("doesNotMeetHardwareRequirements"),
    /** Other. Event logs in microsoft-Windows-DeviceGuard have more details. */
    Other("other");
    public final String value;
    DeviceGuardVirtualizationBasedSecurityState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceGuardVirtualizationBasedSecurityState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "rebootRequired": return RebootRequired;
            case "require64BitArchitecture": return Require64BitArchitecture;
            case "notLicensed": return NotLicensed;
            case "notConfigured": return NotConfigured;
            case "doesNotMeetHardwareRequirements": return DoesNotMeetHardwareRequirements;
            case "other": return Other;
            default: return null;
        }
    }
}
