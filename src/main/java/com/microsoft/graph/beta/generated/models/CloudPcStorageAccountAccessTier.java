package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcStorageAccountAccessTier implements ValuedEnum {
    Hot("hot"),
    Cool("cool"),
    Premium("premium"),
    Cold("cold"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcStorageAccountAccessTier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcStorageAccountAccessTier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hot": return Hot;
            case "cool": return Cool;
            case "premium": return Premium;
            case "cold": return Cold;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
