package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getSupportedProperties method.  */
public enum AssignmentFilterOperator implements ValuedEnum {
    NotSet("notSet"),
    Equals("equals"),
    NotEquals("notEquals"),
    StartsWith("startsWith"),
    NotStartsWith("notStartsWith"),
    Contains("contains"),
    NotContains("notContains"),
    In("in"),
    NotIn("notIn"),
    EndsWith("endsWith"),
    NotEndsWith("notEndsWith");
    public final String value;
    AssignmentFilterOperator(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AssignmentFilterOperator forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "equals": return Equals;
            case "notEquals": return NotEquals;
            case "startsWith": return StartsWith;
            case "notStartsWith": return NotStartsWith;
            case "contains": return Contains;
            case "notContains": return NotContains;
            case "in": return In;
            case "notIn": return NotIn;
            case "endsWith": return EndsWith;
            case "notEndsWith": return NotEndsWith;
            default: return null;
        }
    }
}
