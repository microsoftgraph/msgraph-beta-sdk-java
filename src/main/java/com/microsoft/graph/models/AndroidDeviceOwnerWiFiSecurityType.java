package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AndroidDeviceOwnerWiFiSecurityType implements ValuedEnum {
    /** Open (No Authentication). */
    Open("open"),
    /** WEP Encryption. */
    Wep("wep"),
    /** WPA-Personal/WPA2-Personal. */
    WpaPersonal("wpaPersonal"),
    /** WPA-Enterprise/WPA2-Enterprise. Must use AndroidDeviceOwnerEnterpriseWifiConfiguration type to configure enterprise options. */
    WpaEnterprise("wpaEnterprise");
    public final String value;
    AndroidDeviceOwnerWiFiSecurityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerWiFiSecurityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "wep": return Wep;
            case "wpaPersonal": return WpaPersonal;
            case "wpaEnterprise": return WpaEnterprise;
            default: return null;
        }
    }
}
