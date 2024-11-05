package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDisasterRecoveryType implements ValuedEnum {
    NotConfigured("notConfigured"),
    CrossRegion("crossRegion"),
    Premium("premium"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDisasterRecoveryType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDisasterRecoveryType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "crossRegion": return CrossRegion;
            case "premium": return Premium;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
