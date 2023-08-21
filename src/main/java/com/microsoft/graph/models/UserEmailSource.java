package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for username source or email source.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserEmailSource implements ValuedEnum {
    /** User principal name. */
    UserPrincipalName("userPrincipalName"),
    /** Primary SMTP address. */
    PrimarySmtpAddress("primarySmtpAddress");
    public final String value;
    UserEmailSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserEmailSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrincipalName": return UserPrincipalName;
            case "primarySmtpAddress": return PrimarySmtpAddress;
            default: return null;
        }
    }
}
