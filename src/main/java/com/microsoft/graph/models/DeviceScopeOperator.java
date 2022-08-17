package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DeviceScopeOperator implements ValuedEnum {
    /** No operator set for the device scope configuration. */
    None("none"),
    /** Operator for the device configuration query to be used (Equals). */
    Equals("equals"),
    /** Placeholder value for future expansion enums such as notEquals, contains, notContains, greaterThan, lessThan. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeOperator(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceScopeOperator forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "equals": return Equals;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
