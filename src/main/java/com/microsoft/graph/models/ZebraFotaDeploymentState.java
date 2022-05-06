package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ZebraFotaDeploymentState implements ValuedEnum {
    PendingCreation("pendingCreation"),
    CreateFailed("createFailed"),
    Created("created"),
    InProgress("inProgress"),
    Completed("completed"),
    PendingCancel("pendingCancel"),
    Canceled("canceled"),
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
