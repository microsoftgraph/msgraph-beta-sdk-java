package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum CloudPcAuditActorType implements ValuedEnum {
    ItPro("itPro"),
    Application("application"),
    Partner("partner"),
    Unknown("unknown");
    public final String value;
    CloudPcAuditActorType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcAuditActorType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "itPro": return ItPro;
            case "application": return Application;
            case "partner": return Partner;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
