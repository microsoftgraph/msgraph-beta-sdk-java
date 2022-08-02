package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum CloudPcServicePlanType implements ValuedEnum {
    Enterprise("enterprise"),
    Business("business"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcServicePlanType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcServicePlanType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enterprise": return Enterprise;
            case "business": return Business;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
