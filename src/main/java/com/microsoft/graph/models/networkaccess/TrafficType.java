package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TrafficType implements ValuedEnum {
    Internet("internet"),
    PrivateEscaped("private"),
    Microsoft365("microsoft365"),
    All("all"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrafficType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TrafficType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internet": return Internet;
            case "private": return PrivateEscaped;
            case "microsoft365": return Microsoft365;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
