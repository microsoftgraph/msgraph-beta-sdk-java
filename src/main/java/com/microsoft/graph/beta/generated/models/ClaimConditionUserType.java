package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClaimConditionUserType implements ValuedEnum {
    Any("any"),
    Members("members"),
    AllGuests("allGuests"),
    AadGuests("aadGuests"),
    ExternalGuests("externalGuests"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ClaimConditionUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClaimConditionUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "any": return Any;
            case "members": return Members;
            case "allGuests": return AllGuests;
            case "aadGuests": return AadGuests;
            case "externalGuests": return ExternalGuests;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
