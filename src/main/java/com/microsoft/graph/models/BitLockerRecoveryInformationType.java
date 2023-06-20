package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** BitLockerRecoveryInformationType types */
public enum BitLockerRecoveryInformationType implements ValuedEnum {
    /** Store recovery passwords and key packages. */
    PasswordAndKey("passwordAndKey"),
    /** Store recovery passwords only. */
    PasswordOnly("passwordOnly");
    public final String value;
    BitLockerRecoveryInformationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BitLockerRecoveryInformationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "passwordAndKey": return PasswordAndKey;
            case "passwordOnly": return PasswordOnly;
            default: return null;
        }
    }
}
