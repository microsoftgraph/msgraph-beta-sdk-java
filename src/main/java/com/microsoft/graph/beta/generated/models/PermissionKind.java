package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PermissionKind implements ValuedEnum {
    All("all"),
    Enumerated("enumerated"),
    AllPermissionsOnResourceApp("allPermissionsOnResourceApp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PermissionKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PermissionKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "enumerated": return Enumerated;
            case "allPermissionsOnResourceApp": return AllPermissionsOnResourceApp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
