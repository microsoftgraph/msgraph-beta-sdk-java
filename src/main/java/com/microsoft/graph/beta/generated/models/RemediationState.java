package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of execution status of the device management script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemediationState implements ValuedEnum {
    /** Unknown result. */
    Unknown("unknown"),
    /** Remediation script execution was skipped */
    Skipped("skipped"),
    /** Remediation script executed successfully and remediated the device state */
    Success("success"),
    /** Remediation script executed successfully but failed to remediated the device state */
    RemediationFailed("remediationFailed"),
    /** Remediation script execution encountered and error or timed out */
    ScriptError("scriptError"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RemediationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemediationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "skipped": return Skipped;
            case "success": return Success;
            case "remediationFailed": return RemediationFailed;
            case "scriptError": return ScriptError;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
