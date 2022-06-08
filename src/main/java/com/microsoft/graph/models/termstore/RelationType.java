package microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Casts the previous resource to group. */
public enum RelationType implements ValuedEnum {
    Pin("pin"),
    Reuse("reuse");
    public final String value;
    RelationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RelationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pin": return Pin;
            case "reuse": return Reuse;
            default: return null;
        }
    }
}
