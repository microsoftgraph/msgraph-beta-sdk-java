package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton. */
public enum CloudPcOperatingSystem implements ValuedEnum {
    Windows10("windows10"),
    Windows11("windows11"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcOperatingSystem(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcOperatingSystem forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windows10": return Windows10;
            case "windows11": return Windows11;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
