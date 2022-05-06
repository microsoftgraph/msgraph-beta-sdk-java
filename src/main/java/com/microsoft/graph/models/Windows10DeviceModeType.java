package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum Windows10DeviceModeType implements ValuedEnum {
    StandardConfiguration("standardConfiguration"),
    SModeConfiguration("sModeConfiguration");
    public final String value;
    Windows10DeviceModeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Windows10DeviceModeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standardConfiguration": return StandardConfiguration;
            case "sModeConfiguration": return SModeConfiguration;
            default: return null;
        }
    }
}
