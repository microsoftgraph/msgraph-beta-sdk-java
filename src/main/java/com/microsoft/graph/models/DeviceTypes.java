package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceTypes implements ValuedEnum {
    Desktop("desktop"),
    WindowsRT("windowsRT"),
    WinMO6("winMO6"),
    Nokia("nokia"),
    WindowsPhone("windowsPhone"),
    Mac("mac"),
    WinCE("winCE"),
    WinEmbedded("winEmbedded"),
    IPhone("iPhone"),
    IPad("iPad"),
    IPod("iPod"),
    Android("android"),
    ISocConsumer("iSocConsumer"),
    Unix("unix"),
    MacMDM("macMDM"),
    HoloLens("holoLens"),
    SurfaceHub("surfaceHub"),
    AndroidForWork("androidForWork"),
    AndroidEnterprise("androidEnterprise"),
    Blackberry("blackberry"),
    Palm("palm"),
    Unknown("unknown");
    public final String value;
    DeviceTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "desktop": return Desktop;
            case "windowsRT": return WindowsRT;
            case "winMO6": return WinMO6;
            case "nokia": return Nokia;
            case "windowsPhone": return WindowsPhone;
            case "mac": return Mac;
            case "winCE": return WinCE;
            case "winEmbedded": return WinEmbedded;
            case "iPhone": return IPhone;
            case "iPad": return IPad;
            case "iPod": return IPod;
            case "android": return Android;
            case "iSocConsumer": return ISocConsumer;
            case "unix": return Unix;
            case "macMDM": return MacMDM;
            case "holoLens": return HoloLens;
            case "surfaceHub": return SurfaceHub;
            case "androidForWork": return AndroidForWork;
            case "androidEnterprise": return AndroidEnterprise;
            case "blackberry": return Blackberry;
            case "palm": return Palm;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
