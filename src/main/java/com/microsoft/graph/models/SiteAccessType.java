package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum SiteAccessType implements ValuedEnum {
    Block("block"),
    Full("full"),
    Limited("limited");
    public final String value;
    SiteAccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SiteAccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "full": return Full;
            case "limited": return Limited;
            default: return null;
        }
    }
}
