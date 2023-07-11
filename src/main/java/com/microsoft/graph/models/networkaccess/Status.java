package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Status implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Status(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Status forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
