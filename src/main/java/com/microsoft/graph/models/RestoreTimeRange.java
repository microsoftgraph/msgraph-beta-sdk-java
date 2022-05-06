package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the bulkRestoreCloudPc method.  */
public enum RestoreTimeRange implements ValuedEnum {
    Before("before"),
    After("after"),
    BeforeOrAfter("beforeOrAfter"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RestoreTimeRange(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RestoreTimeRange forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "before": return Before;
            case "after": return After;
            case "beforeOrAfter": return BeforeOrAfter;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
