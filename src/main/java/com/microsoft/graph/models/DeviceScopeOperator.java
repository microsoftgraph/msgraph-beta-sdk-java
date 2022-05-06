package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceScopeOperator implements ValuedEnum {
    None("none"),
    Equals("equals"),
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
