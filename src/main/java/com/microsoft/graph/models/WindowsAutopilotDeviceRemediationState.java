package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsAutopilotDeviceRemediationState forValue(@javax.annotation.Nonnull final String searchValue) {
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
