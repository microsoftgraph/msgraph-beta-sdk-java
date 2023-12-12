package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceVendor implements ValuedEnum {
    BarracudaNetworks("barracudaNetworks"),
    CheckPoint("checkPoint"),
    CiscoMeraki("ciscoMeraki"),
    Citrix("citrix"),
    Fortinet("fortinet"),
    HpeAruba("hpeAruba"),
    NetFoundry("netFoundry"),
    Nuage("nuage"),
    OpenSystems("openSystems"),
    PaloAltoNetworks("paloAltoNetworks"),
    RiverbedTechnology("riverbedTechnology"),
    SilverPeak("silverPeak"),
    VmWareSdWan("vmWareSdWan"),
    Versa("versa"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceVendor(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceVendor forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "barracudaNetworks": return BarracudaNetworks;
            case "checkPoint": return CheckPoint;
            case "ciscoMeraki": return CiscoMeraki;
            case "citrix": return Citrix;
            case "fortinet": return Fortinet;
            case "hpeAruba": return HpeAruba;
            case "netFoundry": return NetFoundry;
            case "nuage": return Nuage;
            case "openSystems": return OpenSystems;
            case "paloAltoNetworks": return PaloAltoNetworks;
            case "riverbedTechnology": return RiverbedTechnology;
            case "silverPeak": return SilverPeak;
            case "vmWareSdWan": return VmWareSdWan;
            case "versa": return Versa;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
