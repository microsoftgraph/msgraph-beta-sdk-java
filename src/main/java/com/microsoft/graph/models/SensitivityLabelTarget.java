package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SensitivityLabelTarget forValue(@javax.annotation.Nonnull final String searchValue) {
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
