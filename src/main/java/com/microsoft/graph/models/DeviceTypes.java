package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceTypes implements ValuedEnum {
    /** Desktop. */
    Desktop("desktop"),
    /** WindowsRT. */
    WindowsRT("windowsRT"),
    /** WinMO6. */
    WinMO6("winMO6"),
    /** Nokia. */
    Nokia("nokia"),
    /** Windows phone. */
    WindowsPhone("windowsPhone"),
    /** Mac. */
    Mac("mac"),
    /** WinCE. */
    WinCE("winCE"),
    /** WinEmbedded. */
    WinEmbedded("winEmbedded"),
    /** iPhone. */
    IPhone("iPhone"),
    /** iPad. */
    IPad("iPad"),
    /** iPodTouch. */
    IPod("iPod"),
    /** Android. */
    Android("android"),
    /** iSocConsumer. */
    ISocConsumer("iSocConsumer"),
    /** Unix. */
    Unix("unix"),
    /** Mac OS X client using built in MDM agent. */
    MacMDM("macMDM"),
    /** Representing the fancy Windows 10 goggles. */
    HoloLens("holoLens"),
    /** Surface HUB device. */
    SurfaceHub("surfaceHub"),
    /** Android for work device. */
    AndroidForWork("androidForWork"),
    /** Android enterprise device. */
    AndroidEnterprise("androidEnterprise"),
    /** Blackberry. */
    Blackberry("blackberry"),
    /** Palm. */
    Palm("palm"),
    /** Represents that the device type is unknown. */
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
