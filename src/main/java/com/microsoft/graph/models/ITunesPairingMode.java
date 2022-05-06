package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ITunesPairingMode implements ValuedEnum {
    Disallow("disallow"),
    Allow("allow"),
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
