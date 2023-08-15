package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Determines the conflict resolution strategy, when more than one Mobile Threat Defense provider is enabled.
 */
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileThreatDefensePartnerPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "defenderOverThirdPartyPartner": return DefenderOverThirdPartyPartner;
            case "thirdPartyPartnerOverDefender": return ThirdPartyPartnerOverDefender;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
