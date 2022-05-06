package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppRemediationAction implements ValuedEnum {
    Block("block"),
    Wipe("wipe"),
    Warn("warn");
    public final String value;
    ManagedAppRemediationAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppRemediationAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "wipe": return Wipe;
            case "warn": return Warn;
            default: return null;
        }
    }
}
