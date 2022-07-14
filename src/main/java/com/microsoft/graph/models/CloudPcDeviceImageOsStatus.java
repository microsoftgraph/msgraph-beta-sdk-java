package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CloudPcDeviceImageOsStatus implements ValuedEnum {
    Supported("supported"),
    SupportedWithWarning("supportedWithWarning"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDeviceImageOsStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcDeviceImageOsStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "supported": return Supported;
            case "supportedWithWarning": return SupportedWithWarning;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
