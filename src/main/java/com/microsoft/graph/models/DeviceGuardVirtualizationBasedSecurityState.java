package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceGuardVirtualizationBasedSecurityState implements ValuedEnum {
    Running("running"),
    RebootRequired("rebootRequired"),
    Require64BitArchitecture("require64BitArchitecture"),
    NotLicensed("notLicensed"),
    NotConfigured("notConfigured"),
    DoesNotMeetHardwareRequirements("doesNotMeetHardwareRequirements"),
    Other("other");
    public final String value;
    DeviceGuardVirtualizationBasedSecurityState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceGuardVirtualizationBasedSecurityState forValue(@javax.annotation.Nonnull final String searchValue) {
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
