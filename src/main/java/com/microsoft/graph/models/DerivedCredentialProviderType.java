package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DerivedCredentialProviderType implements ValuedEnum {
    /** No Derived Credential Provider Configured. */
    NotConfigured("notConfigured"),
    /** Entrust. */
    EntrustDataCard("entrustDataCard"),
    /** Purebred - Defense Information Systems Agency. */
    Purebred("purebred"),
    /** Xtec - AuthentX. */
    XTec("xTec"),
    /** Intercede. */
    Intercede("intercede");
    public final String value;
    DerivedCredentialProviderType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DerivedCredentialProviderType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "entrustDataCard": return EntrustDataCard;
            case "purebred": return Purebred;
            case "xTec": return XTec;
            case "intercede": return Intercede;
            default: return null;
        }
    }
}
