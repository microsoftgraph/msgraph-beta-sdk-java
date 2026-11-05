package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SlaPolicyLogicalOperator implements ValuedEnum {
    And("and"),
    Or("or"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SlaPolicyLogicalOperator(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SlaPolicyLogicalOperator forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "and": return And;
            case "or": return Or;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
