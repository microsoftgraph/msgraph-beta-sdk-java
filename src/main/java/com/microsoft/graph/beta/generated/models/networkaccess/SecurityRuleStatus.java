package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityRuleStatus implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    ReportOnly("reportOnly"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityRuleStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityRuleStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "reportOnly": return ReportOnly;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
