package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of administrativeUnit entities. */
public enum ExternalAuthenticationType implements ValuedEnum {
    Passthru("passthru"),
    AadPreAuthentication("aadPreAuthentication");
    public final String value;
    ExternalAuthenticationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ExternalAuthenticationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "passthru": return Passthru;
            case "aadPreAuthentication": return AadPreAuthentication;
            default: return null;
        }
    }
}
