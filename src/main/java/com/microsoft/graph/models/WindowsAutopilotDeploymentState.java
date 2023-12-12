package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Deployment states for Autopilot devices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotDeploymentState implements ValuedEnum {
    /** The deployment state is unknown. */
    Unknown("unknown"),
    /** The deployment succeeded. */
    Success("success"),
    /** The deployment state is in progress. */
    InProgress("inProgress"),
    /** The deployment failed. */
    Failure("failure"),
    /** The deployment timed out but user clicked past failure. */
    SuccessWithTimeout("successWithTimeout"),
    /** The deployment was not run. */
    NotAttempted("notAttempted"),
    /** The deployment is disabled. */
    Disabled("disabled"),
    /** The deployment succeeded after hitting an initial timeout failure. */
    SuccessOnRetry("successOnRetry");
    public final String value;
    WindowsAutopilotDeploymentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotDeploymentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "inProgress": return InProgress;
            case "failure": return Failure;
            case "successWithTimeout": return SuccessWithTimeout;
            case "notAttempted": return NotAttempted;
            case "disabled": return Disabled;
            case "successOnRetry": return SuccessOnRetry;
            default: return null;
        }
    }
}
