package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    ScriptError("scriptError");
    public final String value;
    RemediationState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RemediationState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "skipped": return Skipped;
            case "success": return Success;
            case "remediationFailed": return RemediationFailed;
            case "scriptError": return ScriptError;
            default: return null;
        }
    }
}
