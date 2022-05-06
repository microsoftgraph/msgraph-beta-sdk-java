package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsAutopilotDeploymentState implements ValuedEnum {
    Unknown("unknown"),
    Success("success"),
    InProgress("inProgress"),
    Failure("failure"),
    SuccessWithTimeout("successWithTimeout"),
    NotAttempted("notAttempted"),
    Disabled("disabled");
    public final String value;
    WindowsAutopilotDeploymentState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsAutopilotDeploymentState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "inProgress": return InProgress;
            case "failure": return Failure;
            case "successWithTimeout": return SuccessWithTimeout;
            case "notAttempted": return NotAttempted;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
