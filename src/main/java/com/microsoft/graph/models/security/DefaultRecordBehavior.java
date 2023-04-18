package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DefaultRecordBehavior implements ValuedEnum {
    StartLocked("startLocked"),
    StartUnlocked("startUnlocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DefaultRecordBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefaultRecordBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "startLocked": return StartLocked;
            case "startUnlocked": return StartUnlocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
