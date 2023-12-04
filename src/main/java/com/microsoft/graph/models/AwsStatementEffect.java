package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AwsStatementEffect implements ValuedEnum {
    Allow("allow"),
    Deny("deny"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AwsStatementEffect(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AwsStatementEffect forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allow": return Allow;
            case "deny": return Deny;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
