package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of mobilityManagementPolicy entities.  */
public enum PolicyScope implements ValuedEnum {
    None("none"),
    All("all"),
    Selected("selected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PolicyScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "all": return All;
            case "selected": return Selected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
