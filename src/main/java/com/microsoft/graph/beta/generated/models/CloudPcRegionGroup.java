package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcRegionGroup implements ValuedEnum {
    Default("default"),
    Australia("australia"),
    Canada("canada"),
    UsCentral("usCentral"),
    UsEast("usEast"),
    UsWest("usWest"),
    France("france"),
    Germany("germany"),
    EuropeUnion("europeUnion"),
    UnitedKingdom("unitedKingdom"),
    Japan("japan"),
    Asia("asia"),
    India("india"),
    SouthAmerica("southAmerica"),
    Euap("euap"),
    UsGovernment("usGovernment"),
    UsGovernmentDOD("usGovernmentDOD"),
    UnknownFutureValue("unknownFutureValue"),
    Norway("norway"),
    Switzerland("switzerland"),
    SouthKorea("southKorea"),
    MiddleEast("middleEast"),
    Mexico("mexico"),
    Australasia("australasia"),
    Europe("europe"),
    Singapore("singapore"),
    HongKong("hongKong"),
    Ireland("ireland"),
    Sweden("sweden"),
    Poland("poland"),
    Italy("italy"),
    Spain("spain"),
    Netherlands("netherlands"),
    Brazil("brazil"),
    Israel("israel"),
    Automatic("automatic"),
    Indonesia("indonesia"),
    Taiwan("taiwan"),
    Malaysia("malaysia"),
    NewZealand("newZealand"),
    Austria("austria"),
    Denmark("denmark"),
    Belgium("belgium"),
    Kenya("kenya");
    public final String value;
    CloudPcRegionGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcRegionGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "australia": return Australia;
            case "canada": return Canada;
            case "usCentral": return UsCentral;
            case "usEast": return UsEast;
            case "usWest": return UsWest;
            case "france": return France;
            case "germany": return Germany;
            case "europeUnion": return EuropeUnion;
            case "unitedKingdom": return UnitedKingdom;
            case "japan": return Japan;
            case "asia": return Asia;
            case "india": return India;
            case "southAmerica": return SouthAmerica;
            case "euap": return Euap;
            case "usGovernment": return UsGovernment;
            case "usGovernmentDOD": return UsGovernmentDOD;
            case "unknownFutureValue": return UnknownFutureValue;
            case "norway": return Norway;
            case "switzerland": return Switzerland;
            case "southKorea": return SouthKorea;
            case "middleEast": return MiddleEast;
            case "mexico": return Mexico;
            case "australasia": return Australasia;
            case "europe": return Europe;
            case "singapore": return Singapore;
            case "hongKong": return HongKong;
            case "ireland": return Ireland;
            case "sweden": return Sweden;
            case "poland": return Poland;
            case "italy": return Italy;
            case "spain": return Spain;
            case "netherlands": return Netherlands;
            case "brazil": return Brazil;
            case "israel": return Israel;
            case "automatic": return Automatic;
            case "indonesia": return Indonesia;
            case "taiwan": return Taiwan;
            case "malaysia": return Malaysia;
            case "newZealand": return NewZealand;
            case "austria": return Austria;
            case "denmark": return Denmark;
            case "belgium": return Belgium;
            case "kenya": return Kenya;
            default: return null;
        }
    }
}
