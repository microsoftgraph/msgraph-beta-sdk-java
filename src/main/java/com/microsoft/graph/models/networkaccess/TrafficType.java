package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TrafficType implements ValuedEnum {
    Internet("internet"),
    Private("private"),
    Microsoft365("microsoft365"),
    All("all"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrafficType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TrafficType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internet": return Internet;
            case "private": return Private;
            case "microsoft365": return Microsoft365;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
