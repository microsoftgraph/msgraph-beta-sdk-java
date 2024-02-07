package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkloadActionCategory implements ValuedEnum {
    Automated("automated"),
    Manual("manual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkloadActionCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkloadActionCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "automated": return Automated;
            case "manual": return Manual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
