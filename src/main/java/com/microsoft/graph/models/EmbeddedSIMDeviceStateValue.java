package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum EmbeddedSIMDeviceStateValue implements ValuedEnum {
    NotEvaluated("notEvaluated"),
    Failed("failed"),
    Installing("installing"),
    Installed("installed"),
    Deleting("deleting"),
    Error("error"),
    Deleted("deleted"),
    RemovedByUser("removedByUser");
    public final String value;
    EmbeddedSIMDeviceStateValue(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EmbeddedSIMDeviceStateValue forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notEvaluated": return NotEvaluated;
            case "failed": return Failed;
            case "installing": return Installing;
            case "installed": return Installed;
            case "deleting": return Deleting;
            case "error": return Error;
            case "deleted": return Deleted;
            case "removedByUser": return RemovedByUser;
            default: return null;
        }
    }
}
