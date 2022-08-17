package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum MicrosoftTunnelLogCollectionStatus implements ValuedEnum {
    /** Log collection is in progress */
    Pending("pending"),
    /** Log collection is completed */
    Completed("completed"),
    /** Log collection has failed */
    Failed("failed");
    public final String value;
    MicrosoftTunnelLogCollectionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftTunnelLogCollectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "completed": return Completed;
            case "failed": return Failed;
            default: return null;
        }
    }
}
