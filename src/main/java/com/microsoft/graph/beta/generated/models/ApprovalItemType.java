package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApprovalItemType implements ValuedEnum {
    Basic("basic"),
    BasicAwaitAll("basicAwaitAll"),
    Custom("custom"),
    CustomAwaitAll("customAwaitAll"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApprovalItemType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApprovalItemType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "basicAwaitAll": return BasicAwaitAll;
            case "custom": return Custom;
            case "customAwaitAll": return CustomAwaitAll;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
