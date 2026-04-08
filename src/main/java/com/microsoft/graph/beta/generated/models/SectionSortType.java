package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SectionSortType implements ValuedEnum {
    MostRecent("mostRecent"),
    UnreadThenMostRecent("unreadThenMostRecent"),
    NameAlphabetical("nameAlphabetical"),
    UserDefinedCustomOrder("userDefinedCustomOrder"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SectionSortType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SectionSortType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mostRecent": return MostRecent;
            case "unreadThenMostRecent": return UnreadThenMostRecent;
            case "nameAlphabetical": return NameAlphabetical;
            case "userDefinedCustomOrder": return UserDefinedCustomOrder;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
