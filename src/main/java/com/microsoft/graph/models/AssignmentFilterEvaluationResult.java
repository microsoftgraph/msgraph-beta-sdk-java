package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getAssignmentFiltersStatusDetails method.  */
public enum AssignmentFilterEvaluationResult implements ValuedEnum {
    Unknown("unknown"),
    Match("match"),
    NotMatch("notMatch"),
    Inconclusive("inconclusive"),
    Failure("failure"),
    NotEvaluated("notEvaluated");
    public final String value;
    AssignmentFilterEvaluationResult(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AssignmentFilterEvaluationResult forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "match": return Match;
            case "notMatch": return NotMatch;
            case "inconclusive": return Inconclusive;
            case "failure": return Failure;
            case "notEvaluated": return NotEvaluated;
            default: return null;
        }
    }
}
