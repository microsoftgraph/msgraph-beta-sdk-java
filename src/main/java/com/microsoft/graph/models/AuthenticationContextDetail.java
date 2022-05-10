package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton. */
public enum AuthenticationContextDetail implements ValuedEnum {
    Required("required"),
    PreviouslySatisfied("previouslySatisfied"),
    NotApplicable("notApplicable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationContextDetail(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationContextDetail forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "required": return Required;
            case "previouslySatisfied": return PreviouslySatisfied;
            case "notApplicable": return NotApplicable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
