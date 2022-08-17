package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MicrosoftManagedDesktopType implements ValuedEnum {
    NotManaged("notManaged"),
    PremiumManaged("premiumManaged"),
    StandardManaged("standardManaged"),
    StarterManaged("starterManaged"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MicrosoftManagedDesktopType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftManagedDesktopType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notManaged": return NotManaged;
            case "premiumManaged": return PremiumManaged;
            case "standardManaged": return StandardManaged;
            case "starterManaged": return StarterManaged;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
