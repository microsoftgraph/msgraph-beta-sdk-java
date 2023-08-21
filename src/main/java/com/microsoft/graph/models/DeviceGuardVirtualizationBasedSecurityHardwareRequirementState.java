package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceGuardVirtualizationBasedSecurityHardwareRequirementState implements ValuedEnum {
    /** System meets hardware configuration requirements */
    MeetHardwareRequirements("meetHardwareRequirements"),
    /** Secure boot required */
    SecureBootRequired("secureBootRequired"),
    /** DMA protection required */
    DmaProtectionRequired("dmaProtectionRequired"),
    /** HyperV not supported for Guest VM */
    HyperVNotSupportedForGuestVM("hyperVNotSupportedForGuestVM"),
    /** HyperV feature is not available */
    HyperVNotAvailable("hyperVNotAvailable");
    public final String value;
    DeviceGuardVirtualizationBasedSecurityHardwareRequirementState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceGuardVirtualizationBasedSecurityHardwareRequirementState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "meetHardwareRequirements": return MeetHardwareRequirements;
            case "secureBootRequired": return SecureBootRequired;
            case "dmaProtectionRequired": return DmaProtectionRequired;
            case "hyperVNotSupportedForGuestVM": return HyperVNotSupportedForGuestVM;
            case "hyperVNotAvailable": return HyperVNotAvailable;
            default: return null;
        }
    }
}
