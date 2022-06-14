package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of administrativeUnit entities. */
public enum SynchronizationScheduleState implements ValuedEnum {
    Active("Active"),
    Disabled("Disabled"),
    Paused("Paused");
    public final String value;
    SynchronizationScheduleState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SynchronizationScheduleState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Active": return Active;
            case "Disabled": return Disabled;
            case "Paused": return Paused;
            default: return null;
        }
    }
}
