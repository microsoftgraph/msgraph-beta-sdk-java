package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum NetworkSingleSignOnType implements ValuedEnum {
    /** Disabled */
    Disabled("disabled"),
    /** Pre-Logon */
    Prelogon("prelogon"),
    /** Post-Logon */
    Postlogon("postlogon");
    public final String value;
    NetworkSingleSignOnType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NetworkSingleSignOnType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "prelogon": return Prelogon;
            case "postlogon": return Postlogon;
            default: return null;
        }
    }
}
