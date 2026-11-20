package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State of a deployment run.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RepositoryDeploymentState implements ValuedEnum {
    /** Deployment is in progress. */
    InProgress("inProgress"),
    /** Deployment completed. */
    Completed("completed"),
    /** Deployment is queued. */
    Queued("queued"),
    /** Deployment is being canceled. */
    Canceling("canceling"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RepositoryDeploymentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RepositoryDeploymentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "queued": return Queued;
            case "canceling": return Canceling;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
