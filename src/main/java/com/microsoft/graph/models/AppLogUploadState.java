package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AppLogUploadState implements ValuedEnum {
    /** Request is waiting to be processed or under processing */
    Pending("pending"),
    /** Request is completed with file uploaded to Azure blob for download. */
    Completed("completed"),
    /** Request finished processing and in error state. */
    Failed("failed");
    public final String value;
    AppLogUploadState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppLogUploadState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "completed": return Completed;
            case "failed": return Failed;
            default: return null;
        }
    }
}
