package com.microsoft.graph.beta.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RelationshipType implements ValuedEnum {
    And("and"),
    Or("or"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RelationshipType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RelationshipType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "and": return And;
            case "or": return Or;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
