package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CloudPcDiskEncryptionState implements ValuedEnum {
    NotAvailable("notAvailable"),
    NotEncryped("notEncryped"),
    EncryptedUsingPlatformManagedKey("encryptedUsingPlatformManagedKey"),
    EncryptedUsingCustomerManagedKey("encryptedUsingCustomerManagedKey"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDiskEncryptionState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcDiskEncryptionState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notAvailable": return NotAvailable;
            case "notEncryped": return NotEncryped;
            case "encryptedUsingPlatformManagedKey": return EncryptedUsingPlatformManagedKey;
            case "encryptedUsingCustomerManagedKey": return EncryptedUsingCustomerManagedKey;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
