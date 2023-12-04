package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PermissionsRequestOccurrenceStatus implements ValuedEnum {
    GrantingFailed("grantingFailed"),
    Granted("granted"),
    Granting("granting"),
    Revoked("revoked"),
    Revoking("revoking"),
    RevokingFailed("revokingFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PermissionsRequestOccurrenceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PermissionsRequestOccurrenceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "grantingFailed": return GrantingFailed;
            case "granted": return Granted;
            case "granting": return Granting;
            case "revoked": return Revoked;
            case "revoking": return Revoking;
            case "revokingFailed": return RevokingFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
