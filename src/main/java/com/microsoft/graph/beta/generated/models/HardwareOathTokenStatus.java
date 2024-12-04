package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HardwareOathTokenStatus implements ValuedEnum {
    Available("available"),
    Assigned("assigned"),
    Activated("activated"),
    FailedActivation("failedActivation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HardwareOathTokenStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HardwareOathTokenStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "assigned": return Assigned;
            case "activated": return Activated;
            case "failedActivation": return FailedActivation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
