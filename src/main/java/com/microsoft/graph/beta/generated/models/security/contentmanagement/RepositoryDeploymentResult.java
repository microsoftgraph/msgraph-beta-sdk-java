package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Result of a completed deployment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RepositoryDeploymentResult implements ValuedEnum {
    /** Deployment succeeded. */
    Success("success"),
    /** Deployment was canceled. */
    Canceled("canceled"),
    /** Deployment failed. */
    Failed("failed"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue"),
    /** The deployment has not produced a final result yet. */
    Pending("pending");
    public final String value;
    RepositoryDeploymentResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RepositoryDeploymentResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "canceled": return Canceled;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            case "pending": return Pending;
            default: return null;
        }
    }
}
