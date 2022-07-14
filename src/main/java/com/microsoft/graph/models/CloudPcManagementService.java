package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum CloudPcManagementService implements ValuedEnum {
    Windows365("windows365"),
    DevBox("devBox"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcManagementService(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcManagementService forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windows365": return Windows365;
            case "devBox": return DevBox;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
