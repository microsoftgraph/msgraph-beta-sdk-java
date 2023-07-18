package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TrafficForwardingType implements ValuedEnum {
    M365("m365"),
    Internet("internet"),
    Private("private"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrafficForwardingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TrafficForwardingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "m365": return M365;
            case "internet": return Internet;
            case "private": return Private;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
