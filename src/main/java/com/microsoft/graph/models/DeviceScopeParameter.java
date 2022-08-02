package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceScopeParameter implements ValuedEnum {
    /** Device Scope parameter is not set */
    None("none"),
    /** use Scope Tag as parameter for the device scope configuration. */
    ScopeTag("scopeTag"),
    /** Placeholder value for future expansion. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeParameter(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceScopeParameter forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "scopeTag": return ScopeTag;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
