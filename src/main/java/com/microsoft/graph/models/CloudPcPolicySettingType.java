package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcPolicySettingType implements ValuedEnum {
    Region("region"),
    SingleSignOn("singleSignOn"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPolicySettingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcPolicySettingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "region": return Region;
            case "singleSignOn": return SingleSignOn;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
