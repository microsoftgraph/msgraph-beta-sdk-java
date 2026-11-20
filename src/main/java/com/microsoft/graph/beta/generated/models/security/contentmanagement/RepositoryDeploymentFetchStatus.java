package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Whether deployment status could be fetched.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RepositoryDeploymentFetchStatus implements ValuedEnum {
    /** Status fetched successfully. */
    Success("success"),
    /** Caller was not authorized to fetch status. */
    Unauthorized("unauthorized"),
    /** No deployment was found. */
    NotFound("notFound"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue"),
    /** Provider status could not be fetched. */
    Unavailable("unavailable");
    public final String value;
    RepositoryDeploymentFetchStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RepositoryDeploymentFetchStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "unauthorized": return Unauthorized;
            case "notFound": return NotFound;
            case "unknownFutureValue": return UnknownFutureValue;
            case "unavailable": return Unavailable;
            default: return null;
        }
    }
}
