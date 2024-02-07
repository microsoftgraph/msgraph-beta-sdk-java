package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Bind status of the tenant with the Google EMM API
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidManagedStoreAccountBindStatus implements ValuedEnum {
    NotBound("notBound"),
    Bound("bound"),
    BoundAndValidated("boundAndValidated"),
    Unbinding("unbinding");
    public final String value;
    AndroidManagedStoreAccountBindStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidManagedStoreAccountBindStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notBound": return NotBound;
            case "bound": return Bound;
            case "boundAndValidated": return BoundAndValidated;
            case "unbinding": return Unbinding;
            default: return null;
        }
    }
}
