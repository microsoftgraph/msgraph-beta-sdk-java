package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcBlobAccessTier implements ValuedEnum {
    Hot("hot"),
    Cool("cool"),
    Cold("cold"),
    Archive("archive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcBlobAccessTier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcBlobAccessTier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hot": return Hot;
            case "cool": return Cool;
            case "cold": return Cold;
            case "archive": return Archive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
