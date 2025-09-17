package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Extensible Authentication Protocol (EAP) configuration types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IosWiredNetworkEapType implements ValuedEnum {
    /** EAP-Transport Layer Security (EAP-TLS). */
    EapTls("eapTls"),
    /** EAP-Tunneled Transport Layer Security (EAP-TTLS). */
    EapTtls("eapTtls"),
    /** Protected Extensible Authentication Protocol (PEAP). */
    Peap("peap"),
    /** EAP-Flexible Authentication via Secure Tunneling (EAP-FAST). */
    EapFast("eapFast"),
    /** EAP-Authentication and Key Agreement (EAP-AKA). */
    EapAka("eapAka"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IosWiredNetworkEapType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IosWiredNetworkEapType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eapTls": return EapTls;
            case "eapTtls": return EapTtls;
            case "peap": return Peap;
            case "eapFast": return EapFast;
            case "eapAka": return EapAka;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
