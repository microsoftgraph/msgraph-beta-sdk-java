package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessType implements ValuedEnum {
    QuickAccess("quickAccess"),
    PrivateAccess("privateAccess"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "quickAccess": return QuickAccess;
            case "privateAccess": return PrivateAccess;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
