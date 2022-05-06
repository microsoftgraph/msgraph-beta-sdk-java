package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DevicePlatformType implements ValuedEnum {
    Android("android"),
    AndroidForWork("androidForWork"),
    IOS("iOS"),
    MacOS("macOS"),
    WindowsPhone81("windowsPhone81"),
    Windows81AndLater("windows81AndLater"),
    Windows10AndLater("windows10AndLater"),
    AndroidWorkProfile("androidWorkProfile"),
    Unknown("unknown"),
    AndroidAOSP("androidAOSP");
    public final String value;
    DevicePlatformType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DevicePlatformType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "android": return Android;
            case "androidForWork": return AndroidForWork;
            case "iOS": return IOS;
            case "macOS": return MacOS;
            case "windowsPhone81": return WindowsPhone81;
            case "windows81AndLater": return Windows81AndLater;
            case "windows10AndLater": return Windows10AndLater;
            case "androidWorkProfile": return AndroidWorkProfile;
            case "unknown": return Unknown;
            case "androidAOSP": return AndroidAOSP;
            default: return null;
        }
    }
}
