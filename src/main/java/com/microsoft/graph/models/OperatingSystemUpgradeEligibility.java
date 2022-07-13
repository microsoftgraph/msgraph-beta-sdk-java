package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum OperatingSystemUpgradeEligibility implements ValuedEnum {
    /** The device is upgraded to latest version of windows */
    Upgraded("upgraded"),
    /** Not enough data available to compute the eligibility of device for windows upgrade */
    Unknown("unknown"),
    /** The device is not capable for windows upgrade */
    NotCapable("notCapable"),
    /** The device is capable for windows upgrade */
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
