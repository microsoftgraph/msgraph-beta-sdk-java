package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates whether the target of a relationship is the parent or the child in the relationship.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppRelationshipType implements ValuedEnum {
    /** Indicates that the target of a relationship is the child in the relationship. */
    Child("child"),
    /** Indicates that the target of a relationship is the parent in the relationship. */
    Parent("parent");
    public final String value;
    MobileAppRelationshipType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppRelationshipType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "child": return Child;
            case "parent": return Parent;
            default: return null;
        }
    }
}
