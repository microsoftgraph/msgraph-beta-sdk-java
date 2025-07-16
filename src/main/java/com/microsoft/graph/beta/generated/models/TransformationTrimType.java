package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TransformationTrimType implements ValuedEnum {
    Leading("leading"),
    Trailing("trailing"),
    LeadingAndTrailing("leadingAndTrailing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TransformationTrimType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TransformationTrimType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "leading": return Leading;
            case "trailing": return Trailing;
            case "leadingAndTrailing": return LeadingAndTrailing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
