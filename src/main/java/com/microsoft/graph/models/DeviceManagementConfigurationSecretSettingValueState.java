package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceManagementConfigurationSecretSettingValueState implements ValuedEnum {
    /** default invalid value */
    Invalid("invalid"),
    /** secret value is not encrypted */
    NotEncrypted("notEncrypted"),
    /** a token for the encrypted value is returned by the service */
    EncryptedValueToken("encryptedValueToken");
    public final String value;
    DeviceManagementConfigurationSecretSettingValueState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationSecretSettingValueState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalid": return Invalid;
            case "notEncrypted": return NotEncrypted;
            case "encryptedValueToken": return EncryptedValueToken;
            default: return null;
        }
    }
}
