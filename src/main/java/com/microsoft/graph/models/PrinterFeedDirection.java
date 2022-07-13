package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum PrinterFeedDirection implements ValuedEnum {
    LongEdgeFirst("longEdgeFirst"),
    ShortEdgeFirst("shortEdgeFirst");
    public final String value;
    PrinterFeedDirection(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrinterFeedDirection forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "longEdgeFirst": return LongEdgeFirst;
            case "shortEdgeFirst": return ShortEdgeFirst;
            default: return null;
        }
    }
}
