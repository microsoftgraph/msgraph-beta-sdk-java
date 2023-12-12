package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentExperienceType implements ValuedEnum {
    Search("search"),
    Compliance("compliance"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentExperienceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentExperienceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "search": return Search;
            case "compliance": return Compliance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
