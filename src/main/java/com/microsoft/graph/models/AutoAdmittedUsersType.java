package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AutoAdmittedUsersType implements ValuedEnum {
    EveryoneInCompany("everyoneInCompany"),
    Everyone("everyone");
    public final String value;
    AutoAdmittedUsersType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AutoAdmittedUsersType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyoneInCompany": return EveryoneInCompany;
            case "everyone": return Everyone;
            default: return null;
        }
    }
}
