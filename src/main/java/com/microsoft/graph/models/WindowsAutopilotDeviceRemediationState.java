package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device remediation status, indicating whether or not hardware has been changed for an Autopilot-registered device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotDeviceRemediationState implements ValuedEnum {
    /** Unknown status. */
    Unknown("unknown"),
    /** No hardware change has been detected. */
    NoRemediationRequired("noRemediationRequired"),
    /** Hardware change detected on client. Additional remediation is required. */
    AutomaticRemediationRequired("automaticRemediationRequired"),
    /** Hardware change detected on client that could not resolved automatically. Additional remediation is required. */
    ManualRemediationRequired("manualRemediationRequired"),
    /** Marks the end of known enum values, and allows for additional values in the future. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutopilotDeviceRemediationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotDeviceRemediationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "noRemediationRequired": return NoRemediationRequired;
            case "automaticRemediationRequired": return AutomaticRemediationRequired;
            case "manualRemediationRequired": return ManualRemediationRequired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
