package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ErrorCode implements ValuedEnum {
    /** Default Value to indicate no error. */
    NoError("noError"),
    /** The current user does not have access due to lack of RBAC permissions on the resource. */
    Unauthorized("unauthorized"),
    /** The current user does not have access due to lack of RBAC Scope Tags on the resource. */
    NotFound("notFound"),
    /** The resource has been deleted. */
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
