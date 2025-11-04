package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The store layout types for Managed Google Play. Values correspond directly to the store layout types of Google enterprise objects.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidManagedStoreLayoutType implements ValuedEnum {
    /** Default. Basic store layout where all approved apps are automatically visible in the Google Play Store. */
    Basic("basic"),
    /** Indicates a customized Google Play Store layout where only apps added to a specific collection in the Intune admin portal are visible in the Google Play Store on managed devices. */
    Custom("custom"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidManagedStoreLayoutType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidManagedStoreLayoutType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "custom": return Custom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
