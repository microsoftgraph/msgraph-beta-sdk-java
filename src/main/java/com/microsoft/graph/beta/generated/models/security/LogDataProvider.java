package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LogDataProvider implements ValuedEnum {
    Barracuda("barracuda"),
    Bluecoat("bluecoat"),
    Checkpoint("checkpoint"),
    CiscoAsa("ciscoAsa"),
    CiscoIronportProxy("ciscoIronportProxy"),
    Fortigate("fortigate"),
    PaloAlto("paloAlto"),
    Squid("squid"),
    Zscaler("zscaler"),
    McafeeSwg("mcafeeSwg"),
    CiscoScanSafe("ciscoScanSafe"),
    JuniperSrx("juniperSrx"),
    SophosSg("sophosSg"),
    WebsenseV75("websenseV75"),
    WebsenseSiemCef("websenseSiemCef"),
    MachineZoneMeraki("machineZoneMeraki"),
    SquidNative("squidNative"),
    CiscoFwsm("ciscoFwsm"),
    MicrosoftIsaW3C("microsoftIsaW3C"),
    Sonicwall("sonicwall"),
    SophosCyberoam("sophosCyberoam"),
    Clavister("clavister"),
    CustomParser("customParser"),
    JuniperSsg("juniperSsg"),
    ZscalerQradar("zscalerQradar"),
    JuniperSrxSd("juniperSrxSd"),
    JuniperSrxWelf("juniperSrxWelf"),
    MicrosoftConditionalAppAccess("microsoftConditionalAppAccess"),
    CiscoAsaFirepower("ciscoAsaFirepower"),
    GenericCef("genericCef"),
    GenericLeef("genericLeef"),
    GenericW3C("genericW3C"),
    IFilter("iFilter"),
    CheckpointXml("checkpointXml"),
    CheckpointSmartViewTracker("checkpointSmartViewTracker"),
    BarracudaNextGenFw("barracudaNextGenFw"),
    BarracudaNextGenFwWeblog("barracudaNextGenFwWeblog"),
    MicrosoftDefenderForEndpoint("microsoftDefenderForEndpoint"),
    ZscalerCef("zscalerCef"),
    SophosXg("sophosXg"),
    Iboss("iboss"),
    Forcepoint("forcepoint"),
    Fortios("fortios"),
    CiscoIronportWsaIi("ciscoIronportWsaIi"),
    PaloAltoLeef("paloAltoLeef"),
    ForcepointLeef("forcepointLeef"),
    Stormshield("stormshield"),
    Contentkeeper("contentkeeper"),
    CiscoIronportWsaIii("ciscoIronportWsaIii"),
    CheckpointCef("checkpointCef"),
    Corrata("corrata"),
    CiscoFirepowerV6("ciscoFirepowerV6"),
    MenloSecurityCef("menloSecurityCef"),
    WatchguardXtm("watchguardXtm"),
    OpenSystemsSecureWebGateway("openSystemsSecureWebGateway"),
    Wandera("wandera"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LogDataProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LogDataProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "barracuda": return Barracuda;
            case "bluecoat": return Bluecoat;
            case "checkpoint": return Checkpoint;
            case "ciscoAsa": return CiscoAsa;
            case "ciscoIronportProxy": return CiscoIronportProxy;
            case "fortigate": return Fortigate;
            case "paloAlto": return PaloAlto;
            case "squid": return Squid;
            case "zscaler": return Zscaler;
            case "mcafeeSwg": return McafeeSwg;
            case "ciscoScanSafe": return CiscoScanSafe;
            case "juniperSrx": return JuniperSrx;
            case "sophosSg": return SophosSg;
            case "websenseV75": return WebsenseV75;
            case "websenseSiemCef": return WebsenseSiemCef;
            case "machineZoneMeraki": return MachineZoneMeraki;
            case "squidNative": return SquidNative;
            case "ciscoFwsm": return CiscoFwsm;
            case "microsoftIsaW3C": return MicrosoftIsaW3C;
            case "sonicwall": return Sonicwall;
            case "sophosCyberoam": return SophosCyberoam;
            case "clavister": return Clavister;
            case "customParser": return CustomParser;
            case "juniperSsg": return JuniperSsg;
            case "zscalerQradar": return ZscalerQradar;
            case "juniperSrxSd": return JuniperSrxSd;
            case "juniperSrxWelf": return JuniperSrxWelf;
            case "microsoftConditionalAppAccess": return MicrosoftConditionalAppAccess;
            case "ciscoAsaFirepower": return CiscoAsaFirepower;
            case "genericCef": return GenericCef;
            case "genericLeef": return GenericLeef;
            case "genericW3C": return GenericW3C;
            case "iFilter": return IFilter;
            case "checkpointXml": return CheckpointXml;
            case "checkpointSmartViewTracker": return CheckpointSmartViewTracker;
            case "barracudaNextGenFw": return BarracudaNextGenFw;
            case "barracudaNextGenFwWeblog": return BarracudaNextGenFwWeblog;
            case "microsoftDefenderForEndpoint": return MicrosoftDefenderForEndpoint;
            case "zscalerCef": return ZscalerCef;
            case "sophosXg": return SophosXg;
            case "iboss": return Iboss;
            case "forcepoint": return Forcepoint;
            case "fortios": return Fortios;
            case "ciscoIronportWsaIi": return CiscoIronportWsaIi;
            case "paloAltoLeef": return PaloAltoLeef;
            case "forcepointLeef": return ForcepointLeef;
            case "stormshield": return Stormshield;
            case "contentkeeper": return Contentkeeper;
            case "ciscoIronportWsaIii": return CiscoIronportWsaIii;
            case "checkpointCef": return CheckpointCef;
            case "corrata": return Corrata;
            case "ciscoFirepowerV6": return CiscoFirepowerV6;
            case "menloSecurityCef": return MenloSecurityCef;
            case "watchguardXtm": return WatchguardXtm;
            case "openSystemsSecureWebGateway": return OpenSystemsSecureWebGateway;
            case "wandera": return Wandera;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
