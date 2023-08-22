package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * type tracking the encryption state of a secret setting value
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationSecretSettingValueState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalid": return Invalid;
            case "notEncrypted": return NotEncrypted;
            case "encryptedValueToken": return EncryptedValueToken;
            default: return null;
        }
    }
}
