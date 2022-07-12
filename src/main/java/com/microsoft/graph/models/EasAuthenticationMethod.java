package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum EasAuthenticationMethod implements ValuedEnum {
    /** Authenticate with a username and password. */
    UsernameAndPassword("usernameAndPassword"),
    /** Authenticate with a certificate. */
    Certificate("certificate"),
    /** Authenticate with derived credential. */
    DerivedCredential("derivedCredential");
    public final String value;
    EasAuthenticationMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EasAuthenticationMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "usernameAndPassword": return UsernameAndPassword;
            case "certificate": return Certificate;
            case "derivedCredential": return DerivedCredential;
            default: return null;
        }
    }
}
