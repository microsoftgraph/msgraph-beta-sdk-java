package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceCustomAttributeValueType implements ValuedEnum {
    /** Indicates the value for a custom attribute script is an integer. */
    Integer("integer"),
    /** Indicates the value for a custom attribute script is a string. */
    String("string"),
    /** Indicates the value for a custom attribute script is a date conforming to ISO 8601. */
    DateTime("dateTime");
    public final String value;
    DeviceCustomAttributeValueType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceCustomAttributeValueType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "integer": return Integer;
            case "string": return String;
            case "dateTime": return DateTime;
            default: return null;
        }
    }
}
