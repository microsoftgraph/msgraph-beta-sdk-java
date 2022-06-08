package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Casts the previous resource to group. */
public enum ConfirmedBy implements ValuedEnum {
    None("none"),
    User("user"),
    Manager("manager"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConfirmedBy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConfirmedBy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "user": return User;
            case "manager": return Manager;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
