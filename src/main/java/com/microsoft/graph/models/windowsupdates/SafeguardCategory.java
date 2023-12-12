package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SafeguardCategory implements ValuedEnum {
    LikelyIssues("likelyIssues"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SafeguardCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SafeguardCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "likelyIssues": return LikelyIssues;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
