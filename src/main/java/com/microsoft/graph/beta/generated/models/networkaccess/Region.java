package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Region implements ValuedEnum {
    EastUS("eastUS"),
    EastUS2("eastUS2"),
    WestUS("westUS"),
    WestUS2("westUS2"),
    WestUS3("westUS3"),
    CentralUS("centralUS"),
    NorthCentralUS("northCentralUS"),
    SouthCentralUS("southCentralUS"),
    NorthEurope("northEurope"),
    WestEurope("westEurope"),
    FranceCentral("franceCentral"),
    GermanyWestCentral("germanyWestCentral"),
    SwitzerlandNorth("switzerlandNorth"),
    UkSouth("ukSouth"),
    CanadaEast("canadaEast"),
    CanadaCentral("canadaCentral"),
    SouthAfricaWest("southAfricaWest"),
    SouthAfricaNorth("southAfricaNorth"),
    UaeNorth("uaeNorth"),
    AustraliaEast("australiaEast"),
    WestCentralUS("westCentralUS"),
    CentralIndia("centralIndia"),
    SouthEastAsia("southEastAsia"),
    SwedenCentral("swedenCentral"),
    SouthIndia("southIndia"),
    AustraliaSouthEast("australiaSouthEast"),
    KoreaCentral("koreaCentral"),
    PolandCentral("polandCentral"),
    BrazilSouth("brazilSouth"),
    JapanEast("japanEast"),
    JapanWest("japanWest"),
    KoreaSouth("koreaSouth"),
    ItalyNorth("italyNorth"),
    FranceSouth("franceSouth"),
    IsraelCentral("israelCentral"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Region(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Region forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eastUS": return EastUS;
            case "eastUS2": return EastUS2;
            case "westUS": return WestUS;
            case "westUS2": return WestUS2;
            case "westUS3": return WestUS3;
            case "centralUS": return CentralUS;
            case "northCentralUS": return NorthCentralUS;
            case "southCentralUS": return SouthCentralUS;
            case "northEurope": return NorthEurope;
            case "westEurope": return WestEurope;
            case "franceCentral": return FranceCentral;
            case "germanyWestCentral": return GermanyWestCentral;
            case "switzerlandNorth": return SwitzerlandNorth;
            case "ukSouth": return UkSouth;
            case "canadaEast": return CanadaEast;
            case "canadaCentral": return CanadaCentral;
            case "southAfricaWest": return SouthAfricaWest;
            case "southAfricaNorth": return SouthAfricaNorth;
            case "uaeNorth": return UaeNorth;
            case "australiaEast": return AustraliaEast;
            case "westCentralUS": return WestCentralUS;
            case "centralIndia": return CentralIndia;
            case "southEastAsia": return SouthEastAsia;
            case "swedenCentral": return SwedenCentral;
            case "southIndia": return SouthIndia;
            case "australiaSouthEast": return AustraliaSouthEast;
            case "koreaCentral": return KoreaCentral;
            case "polandCentral": return PolandCentral;
            case "brazilSouth": return BrazilSouth;
            case "japanEast": return JapanEast;
            case "japanWest": return JapanWest;
            case "koreaSouth": return KoreaSouth;
            case "italyNorth": return ItalyNorth;
            case "franceSouth": return FranceSouth;
            case "israelCentral": return IsraelCentral;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
