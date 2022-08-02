package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum TiAction implements ValuedEnum {
    Unknown("unknown"),
    Allow("allow"),
    Block("block"),
    Alert("alert"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TiAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TiAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "allow": return Allow;
            case "block": return Block;
            case "alert": return Alert;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
