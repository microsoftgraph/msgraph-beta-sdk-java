package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaDeploymentState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ZebraFotaDeploymentState forValue(@javax.annotation.Nonnull final String searchValue) {
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
