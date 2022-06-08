package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceRegistrationPolicy singleton. */
public enum MultiFactorAuthConfiguration implements ValuedEnum {
    NotRequired("notRequired"),
    Required("required"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MultiFactorAuthConfiguration(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MultiFactorAuthConfiguration forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notRequired": return NotRequired;
            case "required": return Required;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
