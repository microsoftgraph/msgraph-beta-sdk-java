package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible Firmware protection type for a device. Firmware protection is a set of features that helps to ensure attackers can&apos;t get your device to start with untrusted or malicious firmware. Firmware protection type is determined by report sent from Microsoft Azure Attestation service. Only Windows 11 devices will have values &quot;systemGuardSecureLaunch&quot; or &quot;firmwareAttackSurfaceReduction&quot; or &quot;disabled&quot;. Windows 10 devices will have value &quot;notApplicable&quot;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FirmwareProtectionType implements ValuedEnum {
    /** Indicates that the device is not a Windows 11 device. */
    NotApplicable("notApplicable"),
    /** Indicates that System Guard Secure Launch is enabled for Firmware protection. */
    SystemGuardSecureLaunch("systemGuardSecureLaunch"),
    /** Indicates that Firmware Attack Surface Reduction is enabled for Firmware protection. This is only applicable to Surface devices. */
    FirmwareAttackSurfaceReduction("firmwareAttackSurfaceReduction"),
    /** Indicates that the device has Firmware protection disabled. */
    Disabled("disabled"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FirmwareProtectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FirmwareProtectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "systemGuardSecureLaunch": return SystemGuardSecureLaunch;
            case "firmwareAttackSurfaceReduction": return FirmwareAttackSurfaceReduction;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
