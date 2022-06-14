package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of administrativeUnit entities. */
public enum ManagedAppRemediationAction implements ValuedEnum {
    /** app and the corresponding company data to be blocked */
    Block("block"),
    /** app and the corresponding company data to be wiped */
    Wipe("wipe"),
    /** app and the corresponding user to be warned */
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
