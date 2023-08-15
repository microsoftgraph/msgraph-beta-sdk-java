package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessReviewTimeoutBehavior implements ValuedEnum {
    KeepAccess("keepAccess"),
    RemoveAccess("removeAccess"),
    AcceptAccessRecommendation("acceptAccessRecommendation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewTimeoutBehavior(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessReviewTimeoutBehavior forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "keepAccess": return KeepAccess;
            case "removeAccess": return RemoveAccess;
            case "acceptAccessRecommendation": return AcceptAccessRecommendation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
