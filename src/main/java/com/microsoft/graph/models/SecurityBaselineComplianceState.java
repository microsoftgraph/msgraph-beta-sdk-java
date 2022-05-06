package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum SecurityBaselineComplianceState implements ValuedEnum {
    Unknown("unknown"),
    Secure("secure"),
    NotApplicable("notApplicable"),
    NotSecure("notSecure"),
    Error("error"),
    Conflict("conflict");
    public final String value;
    SecurityBaselineComplianceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SecurityBaselineComplianceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "secure": return Secure;
            case "notApplicable": return NotApplicable;
            case "notSecure": return NotSecure;
            case "error": return Error;
            case "conflict": return Conflict;
            default: return null;
        }
    }
}
