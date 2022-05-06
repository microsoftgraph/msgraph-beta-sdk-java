package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicyUploadedDefinitionFileStatus implements ValuedEnum {
    None("none"),
    UploadInProgress("uploadInProgress"),
    Available("available"),
    Assigned("assigned"),
    RemovalInProgress("removalInProgress"),
    UploadFailed("uploadFailed"),
    RemovalFailed("removalFailed");
    public final String value;
    GroupPolicyUploadedDefinitionFileStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyUploadedDefinitionFileStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "uploadInProgress": return UploadInProgress;
            case "available": return Available;
            case "assigned": return Assigned;
            case "removalInProgress": return RemovalInProgress;
            case "uploadFailed": return UploadFailed;
            case "removalFailed": return RemovalFailed;
            default: return null;
        }
    }
}
