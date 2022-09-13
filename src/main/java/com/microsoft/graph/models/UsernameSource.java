package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum UsernameSource implements ValuedEnum {
    /** User principal name. */
    UserPrincipalName("userPrincipalName"),
    /** Primary SMTP address. */
    PrimarySmtpAddress("primarySmtpAddress"),
    /** The user sam account name. */
    SamAccountName("samAccountName");
    public final String value;
    UsernameSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UsernameSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrincipalName": return UserPrincipalName;
            case "primarySmtpAddress": return PrimarySmtpAddress;
            case "samAccountName": return SamAccountName;
            default: return null;
        }
    }
}
