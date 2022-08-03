package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum OutlierMemberType implements ValuedEnum {
    User("user"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OutlierMemberType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OutlierMemberType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
