package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum UserEmailSource implements ValuedEnum {
    /** User principal name. */
    UserPrincipalName("userPrincipalName"),
    /** Primary SMTP address. */
    PrimarySmtpAddress("primarySmtpAddress");
    public final String value;
    UserEmailSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserEmailSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrincipalName": return UserPrincipalName;
            case "primarySmtpAddress": return PrimarySmtpAddress;
            default: return null;
        }
    }
}
