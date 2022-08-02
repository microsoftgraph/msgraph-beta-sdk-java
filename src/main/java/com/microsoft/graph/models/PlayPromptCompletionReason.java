package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum PlayPromptCompletionReason implements ValuedEnum {
    Unknown("unknown"),
    CompletedSuccessfully("completedSuccessfully"),
    MediaOperationCanceled("mediaOperationCanceled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlayPromptCompletionReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlayPromptCompletionReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "completedSuccessfully": return CompletedSuccessfully;
            case "mediaOperationCanceled": return MediaOperationCanceled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
