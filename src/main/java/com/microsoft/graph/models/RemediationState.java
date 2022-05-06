package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum RemediationState implements ValuedEnum {
    Unknown("unknown"),
    Skipped("skipped"),
    Success("success"),
    RemediationFailed("remediationFailed"),
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
