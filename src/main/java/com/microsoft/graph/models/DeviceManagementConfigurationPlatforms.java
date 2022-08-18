package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceManagementConfigurationPlatforms implements ValuedEnum {
    /** None. */
    None("none"),
    /** Android. */
    Android("android"),
    /** iOS. */
    IOS("iOS"),
    /** MacOS. */
    MacOS("macOS"),
    /** Windows 10 X. */
    Windows10X("windows10X"),
    /** Windows 10. */
    Windows10("windows10"),
    /** Linux. */
    Linux("linux"),
    /** Sentinel member for cases where the client cannot handle the new enum values. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationPlatforms(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationPlatforms forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "android": return Android;
            case "iOS": return IOS;
            case "macOS": return MacOS;
            case "windows10X": return Windows10X;
            case "windows10": return Windows10;
            case "linux": return Linux;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
