package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum Windows10AppType implements ValuedEnum {
    /** Desktop. */
    Desktop("desktop"),
    /** Universal. */
    Universal("universal");
    public final String value;
    Windows10AppType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Windows10AppType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "desktop": return Desktop;
            case "universal": return Universal;
            default: return null;
        }
    }
}
