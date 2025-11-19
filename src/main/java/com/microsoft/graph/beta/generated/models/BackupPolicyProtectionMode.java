package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BackupPolicyProtectionMode implements ValuedEnum {
    Standard("standard"),
    FullServiceBackup("fullServiceBackup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BackupPolicyProtectionMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BackupPolicyProtectionMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "fullServiceBackup": return FullServiceBackup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
