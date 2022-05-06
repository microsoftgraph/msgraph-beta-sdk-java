package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the evaluate method.  */
public enum DlpAction implements ValuedEnum {
    NotifyUser("notifyUser"),
    BlockAccess("blockAccess"),
    DeviceRestriction("deviceRestriction");
    public final String value;
    DlpAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DlpAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notifyUser": return NotifyUser;
            case "blockAccess": return BlockAccess;
            case "deviceRestriction": return DeviceRestriction;
            default: return null;
        }
    }
}
