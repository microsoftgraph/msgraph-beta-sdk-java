package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ErrorCode implements ValuedEnum {
    NoError("noError"),
    Unauthorized("unauthorized"),
    NotFound("notFound"),
    Deleted("deleted");
    public final String value;
    ErrorCode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ErrorCode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noError": return NoError;
            case "unauthorized": return Unauthorized;
            case "notFound": return NotFound;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
