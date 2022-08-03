package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DepTokenType implements ValuedEnum {
    /** Token Type is None */
    None("none"),
    /** Token Type is Dep. */
    Dep("dep"),
    /** Token Type is Apple School Manager */
    AppleSchoolManager("appleSchoolManager");
    public final String value;
    DepTokenType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DepTokenType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "dep": return Dep;
            case "appleSchoolManager": return AppleSchoolManager;
            default: return null;
        }
    }
}
