package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceScopeStatus implements ValuedEnum {
    None("none"),
    Computing("computing"),
    InsufficientData("insufficientData"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceScopeStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "computing": return Computing;
            case "insufficientData": return InsufficientData;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
