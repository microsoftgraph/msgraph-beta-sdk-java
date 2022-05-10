package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum AndroidManagedAppSafetyNetEvaluationType implements ValuedEnum {
    /** Require basic evaluation */
    Basic("basic"),
    /** Require hardware backed evaluation */
    HardwareBacked("hardwareBacked");
    public final String value;
    AndroidManagedAppSafetyNetEvaluationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedAppSafetyNetEvaluationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "hardwareBacked": return HardwareBacked;
            default: return null;
        }
    }
}
