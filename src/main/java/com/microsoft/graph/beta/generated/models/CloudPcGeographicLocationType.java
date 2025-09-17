package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcGeographicLocationType implements ValuedEnum {
    Default("default"),
    Asia("asia"),
    Australasia("australasia"),
    Canada("canada"),
    Europe("europe"),
    India("india"),
    Africa("africa"),
    UsCentral("usCentral"),
    UsEast("usEast"),
    UsWest("usWest"),
    SouthAmerica("southAmerica"),
    MiddleEast("middleEast"),
    CentralAmerica("centralAmerica"),
    UsGovernment("usGovernment"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcGeographicLocationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcGeographicLocationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "asia": return Asia;
            case "australasia": return Australasia;
            case "canada": return Canada;
            case "europe": return Europe;
            case "india": return India;
            case "africa": return Africa;
            case "usCentral": return UsCentral;
            case "usEast": return UsEast;
            case "usWest": return UsWest;
            case "southAmerica": return SouthAmerica;
            case "middleEast": return MiddleEast;
            case "centralAmerica": return CentralAmerica;
            case "usGovernment": return UsGovernment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
