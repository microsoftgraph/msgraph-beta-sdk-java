package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the policyRoot singleton. */
public enum ContinuousAccessEvaluationMode implements ValuedEnum {
    StrictEnforcement("strictEnforcement"),
    Disabled("disabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContinuousAccessEvaluationMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContinuousAccessEvaluationMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "strictEnforcement": return StrictEnforcement;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
