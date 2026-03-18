package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The Android credential provider role state for apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidAppCredentialProviderRoleState implements ValuedEnum {
    /** Default. Indicates the app&apos;s ability to act as a credential provider has not been configured. When set to &apos;notConfigured&apos;, the Android OS will determine whether the app is allowed to act as a credential provider or not. */
    NotConfigured("notConfigured"),
    /** Indicates the app is allowed to act as a credential provider. */
    Allowed("allowed"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidAppCredentialProviderRoleState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidAppCredentialProviderRoleState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "allowed": return Allowed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
