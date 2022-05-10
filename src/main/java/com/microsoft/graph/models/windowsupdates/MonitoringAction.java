package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum MonitoringAction implements ValuedEnum {
    AlertError("alertError"),
    PauseDeployment("pauseDeployment"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MonitoringAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MonitoringAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alertError": return AlertError;
            case "pauseDeployment": return PauseDeployment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
