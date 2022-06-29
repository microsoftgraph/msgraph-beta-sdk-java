package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AndroidEapType implements ValuedEnum {
    /** Extensible Authentication Protocol-Transport Layer Security (EAP-TLS). */
    EapTls("eapTls"),
    /** Extensible Authentication Protocol-Tunneled Transport Layer Security (EAP-TTLS). */
    EapTtls("eapTtls"),
    /** Protected Extensible Authentication Protocol (PEAP). */
    Peap("peap");
    public final String value;
    AndroidEapType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidEapType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eapTls": return EapTls;
            case "eapTtls": return EapTtls;
            case "peap": return Peap;
            default: return null;
        }
    }
}
