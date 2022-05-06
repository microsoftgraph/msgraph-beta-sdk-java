package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum MembershipRuleProcessingStatusDetails implements ValuedEnum {
    NotStarted("NotStarted"),
    Running("Running"),
    Failed("Failed"),
    Succeeded("Succeeded"),
    UnsupportedFutureValue("UnsupportedFutureValue");
    public final String value;
    MembershipRuleProcessingStatusDetails(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MembershipRuleProcessingStatusDetails forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotStarted": return NotStarted;
            case "Running": return Running;
            case "Failed": return Failed;
            case "Succeeded": return Succeeded;
            case "UnsupportedFutureValue": return UnsupportedFutureValue;
            default: return null;
        }
    }
}
