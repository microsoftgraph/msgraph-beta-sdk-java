package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SensitivityLabelTarget implements ValuedEnum {
    Email("email"),
    Site("site"),
    UnifiedGroup("unifiedGroup"),
    Teamwork("teamwork"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SensitivityLabelTarget(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensitivityLabelTarget forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "site": return Site;
            case "unifiedGroup": return UnifiedGroup;
            case "teamwork": return Teamwork;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
