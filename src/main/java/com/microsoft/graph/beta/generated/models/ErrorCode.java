package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
