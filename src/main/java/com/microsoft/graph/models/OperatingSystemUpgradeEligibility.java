package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum OperatingSystemUpgradeEligibility implements ValuedEnum {
    Upgraded("upgraded"),
    Unknown("unknown"),
    NotCapable("notCapable"),
    Capable("capable");
    public final String value;
    OperatingSystemUpgradeEligibility(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OperatingSystemUpgradeEligibility forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "upgraded": return Upgraded;
            case "unknown": return Unknown;
            case "notCapable": return NotCapable;
            case "capable": return Capable;
            default: return null;
        }
    }
}
