package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum MobileThreatDefensePartnerPriority implements ValuedEnum {
    /** Indicates use of Microsoft Defender Endpoint over 3rd party MTD connectors */
    DefenderOverThirdPartyPartner("defenderOverThirdPartyPartner"),
    /** Indicates use of a 3rd party MTD connector over Microsoft Defender Endpoint */
    ThirdPartyPartnerOverDefender("thirdPartyPartnerOverDefender"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MobileThreatDefensePartnerPriority(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileThreatDefensePartnerPriority forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "defenderOverThirdPartyPartner": return DefenderOverThirdPartyPartner;
            case "thirdPartyPartnerOverDefender": return ThirdPartyPartnerOverDefender;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
