package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum CloudPcOnPremisesConnectionStatus implements ValuedEnum {
    Pending("pending"),
    Running("running"),
    Passed("passed"),
    Failed("failed"),
    Warning("warning"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcOnPremisesConnectionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcOnPremisesConnectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "running": return Running;
            case "passed": return Passed;
            case "failed": return Failed;
            case "warning": return Warning;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
