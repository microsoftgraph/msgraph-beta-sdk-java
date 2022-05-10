package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the evaluateApplication method. */
public enum AssignmentMethod implements ValuedEnum {
    Standard("standard"),
    Privileged("privileged"),
    Auto("auto");
    public final String value;
    AssignmentMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AssignmentMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "privileged": return Privileged;
            case "auto": return Auto;
            default: return null;
        }
    }
}
