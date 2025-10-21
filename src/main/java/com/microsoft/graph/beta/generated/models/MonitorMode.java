package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MonitorMode implements ValuedEnum {
    MonitorOnce("monitorOnce"),
    MonitorOnly("monitorOnly"),
    ApplyOnceAndMonitorContinuous("applyOnceAndMonitorContinuous"),
    ApplyOnce("applyOnce"),
    ApplyContinuous("applyContinuous"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MonitorMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MonitorMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monitorOnce": return MonitorOnce;
            case "monitorOnly": return MonitorOnly;
            case "applyOnceAndMonitorContinuous": return ApplyOnceAndMonitorContinuous;
            case "applyOnce": return ApplyOnce;
            case "applyContinuous": return ApplyContinuous;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
