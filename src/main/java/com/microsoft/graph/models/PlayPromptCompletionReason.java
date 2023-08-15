package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlayPromptCompletionReason implements ValuedEnum {
    Unknown("unknown"),
    CompletedSuccessfully("completedSuccessfully"),
    MediaOperationCanceled("mediaOperationCanceled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlayPromptCompletionReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlayPromptCompletionReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
