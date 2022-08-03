package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum TeamworkSoftwareFreshness implements ValuedEnum {
    Unknown("unknown"),
    Latest("latest"),
    UpdateAvailable("updateAvailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkSoftwareFreshness(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkSoftwareFreshness forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "latest": return Latest;
            case "updateAvailable": return UpdateAvailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
