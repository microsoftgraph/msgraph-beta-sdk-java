package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidDeviceOwnerRequiredPasswordUnlock implements ValuedEnum {
    /** Timeout period before strong authentication is required is set to the device's default. */
    DeviceDefault("deviceDefault"),
    /** Timeout period before strong authentication is required is set to 24 hours. */
    Daily("daily"),
    /** Unknown future value (reserved, not used right now) */
    UnkownFutureValue("unkownFutureValue");
    public final String value;
    AndroidDeviceOwnerRequiredPasswordUnlock(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerRequiredPasswordUnlock forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "daily": return Daily;
            case "unkownFutureValue": return UnkownFutureValue;
            default: return null;
        }
    }
}
