package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDiskEncryptionType implements ValuedEnum {
    PlatformManagedKey("platformManagedKey"),
    CustomerManagedKey("customerManagedKey"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDiskEncryptionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDiskEncryptionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "platformManagedKey": return PlatformManagedKey;
            case "customerManagedKey": return CustomerManagedKey;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
