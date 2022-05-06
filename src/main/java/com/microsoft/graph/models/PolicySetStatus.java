package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum PolicySetStatus implements ValuedEnum {
    Unknown("unknown"),
    Validating("validating"),
    PartialSuccess("partialSuccess"),
    Success("success"),
    Error("error"),
    NotAssigned("notAssigned");
    public final String value;
    PolicySetStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PolicySetStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "validating": return Validating;
            case "partialSuccess": return PartialSuccess;
            case "success": return Success;
            case "error": return Error;
            case "notAssigned": return NotAssigned;
            default: return null;
        }
    }
}
