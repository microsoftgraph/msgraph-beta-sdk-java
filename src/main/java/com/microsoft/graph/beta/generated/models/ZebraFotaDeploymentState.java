package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the state of Zebra FOTA deployment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ZebraFotaDeploymentState implements ValuedEnum {
    /** Deployment is created but Zebra has not confirmed its creation. */
    PendingCreation("pendingCreation"),
    /** Deployment was not successfully created with Zebra. */
    CreateFailed("createFailed"),
    /** Deployment has been created but has not been deployed yet. */
    Created("created"),
    /** Deployment has started but not completed. */
    InProgress("inProgress"),
    /** Deployment has completed or end date has passed. */
    Completed("completed"),
    /** Admin has requested to cancel a deployment but Zebra has not confirmed cancellation. */
    PendingCancel("pendingCancel"),
    /** Deployment has been successfully canceled by Zebra. */
    Canceled("canceled"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaDeploymentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ZebraFotaDeploymentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pendingCreation": return PendingCreation;
            case "createFailed": return CreateFailed;
            case "created": return Created;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "pendingCancel": return PendingCancel;
            case "canceled": return Canceled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
