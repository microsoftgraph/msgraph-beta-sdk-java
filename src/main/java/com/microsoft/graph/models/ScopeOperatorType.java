package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the filterOperators method. */
public enum ScopeOperatorType implements ValuedEnum {
    Binary("Binary"),
    Unary("Unary");
    public final String value;
    ScopeOperatorType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ScopeOperatorType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Binary": return Binary;
            case "Unary": return Unary;
            default: return null;
        }
    }
}
