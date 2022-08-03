package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AccountStatus implements ValuedEnum {
    Unknown("unknown"),
    Staged("staged"),
    Active("active"),
    Suspended("suspended"),
    Deleted("deleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccountStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "staged": return Staged;
            case "active": return Active;
            case "suspended": return Suspended;
            case "deleted": return Deleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
