package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MeteredConnectionLimitType implements ValuedEnum {
    /** Unrestricted */
    Unrestricted("unrestricted"),
    /** Fixed */
    Fixed("fixed"),
    /** Variable */
    Variable("variable");
    public final String value;
    MeteredConnectionLimitType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MeteredConnectionLimitType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unrestricted": return Unrestricted;
            case "fixed": return Fixed;
            case "variable": return Variable;
            default: return null;
        }
    }
}
