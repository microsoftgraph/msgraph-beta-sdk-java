package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharingScope implements ValuedEnum {
    Anyone("anyone"),
    Organization("organization"),
    SpecificPeople("specificPeople"),
    Anonymous("anonymous"),
    Users("users"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharingScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharingScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "anyone": return Anyone;
            case "organization": return Organization;
            case "specificPeople": return SpecificPeople;
            case "anonymous": return Anonymous;
            case "users": return Users;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
