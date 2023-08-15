package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RuleSeverityType implements ValuedEnum {
    Unknown("unknown"),
    Informational("informational"),
    Warning("warning"),
    Critical("critical"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RuleSeverityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RuleSeverityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "informational": return Informational;
            case "warning": return Warning;
            case "critical": return Critical;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
