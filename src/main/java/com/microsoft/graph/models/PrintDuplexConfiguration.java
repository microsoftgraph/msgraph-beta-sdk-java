package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum PrintDuplexConfiguration implements ValuedEnum {
    TwoSidedLongEdge("twoSidedLongEdge"),
    TwoSidedShortEdge("twoSidedShortEdge"),
    OneSided("oneSided");
    public final String value;
    PrintDuplexConfiguration(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintDuplexConfiguration forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "twoSidedLongEdge": return TwoSidedLongEdge;
            case "twoSidedShortEdge": return TwoSidedShortEdge;
            case "oneSided": return OneSided;
            default: return null;
        }
    }
}
