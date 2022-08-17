package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum OverrideOption implements ValuedEnum {
    NotAllowed("notAllowed"),
    AllowFalsePositiveOverride("allowFalsePositiveOverride"),
    AllowWithJustification("allowWithJustification"),
    AllowWithoutJustification("allowWithoutJustification");
    public final String value;
    OverrideOption(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OverrideOption forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notAllowed": return NotAllowed;
            case "allowFalsePositiveOverride": return AllowFalsePositiveOverride;
            case "allowWithJustification": return AllowWithJustification;
            case "allowWithoutJustification": return AllowWithoutJustification;
            default: return null;
        }
    }
}
