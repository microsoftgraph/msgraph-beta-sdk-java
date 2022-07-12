package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ITunesPairingMode implements ValuedEnum {
    /** Pairing is not allowed */
    Disallow("disallow"),
    /** Pairing allowed */
    Allow("allow"),
    /** Certificate required to pair with iTunes */
    RequiresCertificate("requiresCertificate");
    public final String value;
    ITunesPairingMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ITunesPairingMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disallow": return Disallow;
            case "allow": return Allow;
            case "requiresCertificate": return RequiresCertificate;
            default: return null;
        }
    }
}
