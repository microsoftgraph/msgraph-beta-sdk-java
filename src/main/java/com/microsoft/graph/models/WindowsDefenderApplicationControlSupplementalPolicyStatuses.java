package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum values for the various WindowsDefenderApplicationControl supplemental policy deployment statuses.
 */
public enum WindowsDefenderApplicationControlSupplementalPolicyStatuses implements ValuedEnum {
    /** The status of the WindowsDefenderApplicationControl supplemental policy is not known. */
    Unknown("unknown"),
    /** The WindowsDefenderApplicationControl supplemental policy is in effect. */
    Success("success"),
    /** The WindowsDefenderApplicationControl supplemental policy is structurally okay but there is an error with authorizing the token. */
    TokenError("tokenError"),
    /** The token does not authorize this WindowsDefenderApplicationControl supplemental policy. */
    NotAuthorizedByToken("notAuthorizedByToken"),
    /** The WindowsDefenderApplicationControl supplemental policy is not found. */
    PolicyNotFound("policyNotFound");
    public final String value;
    WindowsDefenderApplicationControlSupplementalPolicyStatuses(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsDefenderApplicationControlSupplementalPolicyStatuses forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "tokenError": return TokenError;
            case "notAuthorizedByToken": return NotAuthorizedByToken;
            case "policyNotFound": return PolicyNotFound;
            default: return null;
        }
    }
}
