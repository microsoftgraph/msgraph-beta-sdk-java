package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ApplicationGuardEnabledOptions implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Enabled For Edge */
    EnabledForEdge("enabledForEdge"),
    /** Enabled For Office */
    EnabledForOffice("enabledForOffice"),
    /** Enabled For Edge And Office */
    EnabledForEdgeAndOffice("enabledForEdgeAndOffice");
    public final String value;
    ApplicationGuardEnabledOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationGuardEnabledOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enabledForEdge": return EnabledForEdge;
            case "enabledForOffice": return EnabledForOffice;
            case "enabledForEdgeAndOffice": return EnabledForEdgeAndOffice;
            default: return null;
        }
    }
}
