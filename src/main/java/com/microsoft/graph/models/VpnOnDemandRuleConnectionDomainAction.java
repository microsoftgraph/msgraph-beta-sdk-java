package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum VpnOnDemandRuleConnectionDomainAction implements ValuedEnum {
    /** Connect if needed. */
    ConnectIfNeeded("connectIfNeeded"),
    /** Never connect. */
    NeverConnect("neverConnect");
    public final String value;
    VpnOnDemandRuleConnectionDomainAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnOnDemandRuleConnectionDomainAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "connectIfNeeded": return ConnectIfNeeded;
            case "neverConnect": return NeverConnect;
            default: return null;
        }
    }
}
