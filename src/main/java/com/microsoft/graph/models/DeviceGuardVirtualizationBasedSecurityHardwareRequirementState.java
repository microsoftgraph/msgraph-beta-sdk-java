package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceGuardVirtualizationBasedSecurityHardwareRequirementState implements ValuedEnum {
    MeetHardwareRequirements("meetHardwareRequirements"),
    SecureBootRequired("secureBootRequired"),
    DmaProtectionRequired("dmaProtectionRequired"),
    HyperVNotSupportedForGuestVM("hyperVNotSupportedForGuestVM"),
    HyperVNotAvailable("hyperVNotAvailable");
    public final String value;
    DeviceGuardVirtualizationBasedSecurityHardwareRequirementState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceGuardVirtualizationBasedSecurityHardwareRequirementState forValue(@javax.annotation.Nonnull final String searchValue) {
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
