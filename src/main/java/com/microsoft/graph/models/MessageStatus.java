package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MessageStatus implements ValuedEnum {
    GettingStatus("gettingStatus"),
    Pending("pending"),
    Failed("failed"),
    Delivered("delivered"),
    Expanded("expanded"),
    Quarantined("quarantined"),
    FilteredAsSpam("filteredAsSpam"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MessageStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MessageStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gettingStatus": return GettingStatus;
            case "pending": return Pending;
            case "failed": return Failed;
            case "delivered": return Delivered;
            case "expanded": return Expanded;
            case "quarantined": return Quarantined;
            case "filteredAsSpam": return FilteredAsSpam;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
