package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android username source.
 */
public enum AndroidUsernameSource implements ValuedEnum {
    /** The username. */
    Username("username"),
    /** The user principal name. */
    UserPrincipalName("userPrincipalName"),
    /** The user sam account name. */
    SamAccountName("samAccountName"),
    /** Primary SMTP address. */
    PrimarySmtpAddress("primarySmtpAddress");
    public final String value;
    AndroidUsernameSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidUsernameSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "username": return Username;
            case "userPrincipalName": return UserPrincipalName;
            case "samAccountName": return SamAccountName;
            case "primarySmtpAddress": return PrimarySmtpAddress;
            default: return null;
        }
    }
}
