package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApiUsageReportOnboardingStatus implements ValuedEnum {
    Enabling("enabling"),
    Enabled("enabled"),
    Disabling("disabling"),
    Disabled("disabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApiUsageReportOnboardingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApiUsageReportOnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabling": return Enabling;
            case "enabled": return Enabled;
            case "disabling": return Disabling;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
