package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of administrativeUnit entities. */
public enum SecurityBaselinePolicySourceType implements ValuedEnum {
    DeviceConfiguration("deviceConfiguration"),
    DeviceIntent("deviceIntent");
    public final String value;
    SecurityBaselinePolicySourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SecurityBaselinePolicySourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceConfiguration": return DeviceConfiguration;
            case "deviceIntent": return DeviceIntent;
            default: return null;
        }
    }
}
