package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WindowsFirewallRuleInterfaceTypes implements ValuedEnum {
    /** No flags set. */
    NotConfigured("notConfigured"),
    /** The Remote Access interface type. */
    RemoteAccess("remoteAccess"),
    /** The Wireless interface type. */
    Wireless("wireless"),
    /** The LAN interface type. */
    Lan("lan");
    public final String value;
    WindowsFirewallRuleInterfaceTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsFirewallRuleInterfaceTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "remoteAccess": return RemoteAccess;
            case "wireless": return Wireless;
            case "lan": return Lan;
            default: return null;
        }
    }
}
