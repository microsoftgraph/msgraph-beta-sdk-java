package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementConfigurationPlatforms implements ValuedEnum {
    None("none"),
    Android("android"),
    IOS("iOS"),
    MacOS("macOS"),
    Windows10X("windows10X"),
    Windows10("windows10"),
    Linux("linux"),
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
