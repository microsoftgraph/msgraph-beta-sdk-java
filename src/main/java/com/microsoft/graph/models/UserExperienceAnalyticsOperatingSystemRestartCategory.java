package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum UserExperienceAnalyticsOperatingSystemRestartCategory implements ValuedEnum {
    Unknown("unknown"),
    RestartWithUpdate("restartWithUpdate"),
    RestartWithoutUpdate("restartWithoutUpdate"),
    BlueScreen("blueScreen"),
    ShutdownWithUpdate("shutdownWithUpdate"),
    ShutdownWithoutUpdate("shutdownWithoutUpdate"),
    LongPowerButtonPress("longPowerButtonPress"),
    BootError("bootError"),
    Update("update");
    public final String value;
    UserExperienceAnalyticsOperatingSystemRestartCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserExperienceAnalyticsOperatingSystemRestartCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "restartWithUpdate": return RestartWithUpdate;
            case "restartWithoutUpdate": return RestartWithoutUpdate;
            case "blueScreen": return BlueScreen;
            case "shutdownWithUpdate": return ShutdownWithUpdate;
            case "shutdownWithoutUpdate": return ShutdownWithoutUpdate;
            case "longPowerButtonPress": return LongPowerButtonPress;
            case "bootError": return BootError;
            case "update": return Update;
            default: return null;
        }
    }
}
