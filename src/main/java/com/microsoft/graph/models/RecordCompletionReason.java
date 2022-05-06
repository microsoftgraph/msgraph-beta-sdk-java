package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the record method.  */
public enum RecordCompletionReason implements ValuedEnum {
    OperationCanceled("operationCanceled"),
    StopToneDetected("stopToneDetected"),
    MaxRecordDurationReached("maxRecordDurationReached"),
    InitialSilenceTimeout("initialSilenceTimeout"),
    MaxSilenceTimeout("maxSilenceTimeout"),
    PlayPromptFailed("playPromptFailed"),
    PlayBeepFailed("playBeepFailed"),
    MediaReceiveTimeout("mediaReceiveTimeout"),
    UnspecifiedError("unspecifiedError");
    public final String value;
    RecordCompletionReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecordCompletionReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "operationCanceled": return OperationCanceled;
            case "stopToneDetected": return StopToneDetected;
            case "maxRecordDurationReached": return MaxRecordDurationReached;
            case "initialSilenceTimeout": return InitialSilenceTimeout;
            case "maxSilenceTimeout": return MaxSilenceTimeout;
            case "playPromptFailed": return PlayPromptFailed;
            case "playBeepFailed": return PlayBeepFailed;
            case "mediaReceiveTimeout": return MediaReceiveTimeout;
            case "unspecifiedError": return UnspecifiedError;
            default: return null;
        }
    }
}
