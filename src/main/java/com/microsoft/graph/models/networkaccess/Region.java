package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Region(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Region forValue(@javax.annotation.Nonnull final String searchValue) {
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
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
