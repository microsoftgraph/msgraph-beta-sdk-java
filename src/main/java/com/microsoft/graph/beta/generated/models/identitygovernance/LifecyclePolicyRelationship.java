package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyRelationship implements ValuedEnum {
    Effective("effective"),
    InScopeButIneffective("inScopeButIneffective"),
    Pending("pending"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyRelationship(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyRelationship forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "effective": return Effective;
            case "inScopeButIneffective": return InScopeButIneffective;
            case "pending": return Pending;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
