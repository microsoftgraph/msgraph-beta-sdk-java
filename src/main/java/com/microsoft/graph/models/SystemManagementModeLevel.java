package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible System Management Mode levels for a device. System Management Mode levels is determined by report sent from Microsoft Azure Attestation service. Only specific hardwares support System Management Mode. Windows 11 devices will have values "notApplicable", "level1", "level2" or "level3". Windows 10 devices will have value "notApplicable".
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SystemManagementModeLevel implements ValuedEnum {
    /** Indicates that the device does not have Firmware protection (System Management Mode) enabled. */
    NotApplicable("notApplicable"),
    /** Indicates that deny System Management Mode (SMM) read/write access to OS and Virtualization-based security (VBS) memory. The benefit is that by design System Management Mode (SMM) cannot modify security of or exfiltrate secrets from the OS (including Virtualization-based security). */
    Level1("level1"),
    /** Indicates that in addition to the System Management Mode (SMM) Level 1 protections, this level prevents System Management Mode (SMM) from tampering with Input-Output Memory Management Unit (IOMMU) config. The benefit is that by design System Management Mode (SMM) cannot disable Virtualization-based security (VBS) and kernel Direct memory access (DMA) protections. */
    Level2("level2"),
    /** Indicates that in addition to the System Management Mode (SMM) Level 2 protections, this level reduces System Management Mode (SMM) save state capabilities. The benefit is that by design System Management Mode (SMM) cannot exploit save state to modify security of or exfiltrate secrets from the OS (including Virtualization-based security). */
    Level3("level3"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SystemManagementModeLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SystemManagementModeLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "level1": return Level1;
            case "level2": return Level2;
            case "level3": return Level3;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
