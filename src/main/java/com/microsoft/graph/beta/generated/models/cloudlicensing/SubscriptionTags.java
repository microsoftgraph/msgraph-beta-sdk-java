package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubscriptionTags implements ValuedEnum {
    None("none"),
    Trial("trial"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubscriptionTags(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubscriptionTags forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "trial": return Trial;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
