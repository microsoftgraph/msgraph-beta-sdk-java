package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum EapType implements ValuedEnum {
    /** EAP-Transport Layer Security (EAP-TLS). */
    EapTls("eapTls"),
    /** Lightweight Extensible Authentication Protocol (LEAP). */
    Leap("leap"),
    /** EAP for GSM Subscriber Identity Module (EAP-SIM). */
    EapSim("eapSim"),
    /** EAP-Tunneled Transport Layer Security (EAP-TTLS). */
    EapTtls("eapTtls"),
    /** Protected Extensible Authentication Protocol (PEAP). */
    Peap("peap"),
    /** EAP-Flexible Authentication via Secure Tunneling (EAP-FAST). */
    EapFast("eapFast"),
    /** Tunnel Extensible Authentication Protocol (TEAP). */
    Teap("teap");
    public final String value;
    EapType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EapType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eapTls": return EapTls;
            case "leap": return Leap;
            case "eapSim": return EapSim;
            case "eapTtls": return EapTtls;
            case "peap": return Peap;
            case "eapFast": return EapFast;
            case "teap": return Teap;
            default: return null;
        }
    }
}
