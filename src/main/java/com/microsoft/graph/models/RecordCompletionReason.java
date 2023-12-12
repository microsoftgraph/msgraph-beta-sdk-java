package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecordCompletionReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
