package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceComplianceActionType implements ValuedEnum {
    NoAction("noAction"),
    Notification("notification"),
    Block("block"),
    Retire("retire"),
    Wipe("wipe"),
    RemoveResourceAccessProfiles("removeResourceAccessProfiles"),
    PushNotification("pushNotification"),
    RemoteLock("remoteLock");
    public final String value;
    DeviceComplianceActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceComplianceActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noAction": return NoAction;
            case "notification": return Notification;
            case "block": return Block;
            case "retire": return Retire;
            case "wipe": return Wipe;
            case "removeResourceAccessProfiles": return RemoveResourceAccessProfiles;
            case "pushNotification": return PushNotification;
            case "remoteLock": return RemoteLock;
            default: return null;
        }
    }
}
