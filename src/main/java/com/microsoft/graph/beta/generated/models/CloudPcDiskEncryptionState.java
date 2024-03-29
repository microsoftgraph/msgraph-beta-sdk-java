package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDiskEncryptionState implements ValuedEnum {
    NotAvailable("notAvailable"),
    NotEncrypted("notEncrypted"),
    EncryptedUsingPlatformManagedKey("encryptedUsingPlatformManagedKey"),
    EncryptedUsingCustomerManagedKey("encryptedUsingCustomerManagedKey"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDiskEncryptionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDiskEncryptionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notAvailable": return NotAvailable;
            case "notEncrypted": return NotEncrypted;
            case "encryptedUsingPlatformManagedKey": return EncryptedUsingPlatformManagedKey;
            case "encryptedUsingCustomerManagedKey": return EncryptedUsingCustomerManagedKey;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
