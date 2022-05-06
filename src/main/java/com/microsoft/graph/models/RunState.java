package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum RunState implements ValuedEnum {
    Unknown("unknown"),
    Success("success"),
    Fail("fail"),
    ScriptError("scriptError"),
    Pending("pending"),
    NotApplicable("notApplicable");
    public final String value;
    RunState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RunState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "fail": return Fail;
            case "scriptError": return ScriptError;
            case "pending": return Pending;
            case "notApplicable": return NotApplicable;
            default: return null;
        }
    }
}
