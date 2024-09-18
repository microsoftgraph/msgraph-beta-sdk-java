package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ThreatSeverity implements ValuedEnum {
    Low("low"),
    Medium("medium"),
    High("high"),
    Critical("critical"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ThreatSeverity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThreatSeverity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "critical": return Critical;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
