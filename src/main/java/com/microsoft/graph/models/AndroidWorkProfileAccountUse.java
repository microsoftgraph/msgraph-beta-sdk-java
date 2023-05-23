package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** An enum representing possible values for account use in work profile. */
public enum AndroidWorkProfileAccountUse implements ValuedEnum {
    /** Allow additon of all accounts except Google accounts in Android Work Profile. */
    AllowAllExceptGoogleAccounts("allowAllExceptGoogleAccounts"),
    /** Block any account from being added in Android Work Profile.  */
    BlockAll("blockAll"),
    /** Allow addition of all accounts (including Google accounts) in Android Work Profile. */
    AllowAll("allowAll"),
    /** Unknown future value for evolvable enum patterns. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidWorkProfileAccountUse(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidWorkProfileAccountUse forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowAllExceptGoogleAccounts": return AllowAllExceptGoogleAccounts;
            case "blockAll": return BlockAll;
            case "allowAll": return AllowAll;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
