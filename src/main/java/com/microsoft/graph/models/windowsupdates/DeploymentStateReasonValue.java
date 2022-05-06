package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton.  */
public enum DeploymentStateReasonValue implements ValuedEnum {
    ScheduledByOfferWindow("scheduledByOfferWindow"),
    OfferingByRequest("offeringByRequest"),
    PausedByRequest("pausedByRequest"),
    PausedByMonitoring("pausedByMonitoring"),
    UnknownFutureValue("unknownFutureValue"),
    FaultedByContentOutdated("faultedByContentOutdated");
    public final String value;
    DeploymentStateReasonValue(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeploymentStateReasonValue forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduledByOfferWindow": return ScheduledByOfferWindow;
            case "offeringByRequest": return OfferingByRequest;
            case "pausedByRequest": return PausedByRequest;
            case "pausedByMonitoring": return PausedByMonitoring;
            case "unknownFutureValue": return UnknownFutureValue;
            case "faultedByContentOutdated": return FaultedByContentOutdated;
            default: return null;
        }
    }
}
