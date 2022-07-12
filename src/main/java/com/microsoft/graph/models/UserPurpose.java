package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum UserPurpose implements ValuedEnum {
    Unknown("unknown"),
    User("user"),
    Linked("linked"),
    Shared("shared"),
    Room("room"),
    Equipment("equipment"),
    Others("others"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserPurpose(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserPurpose forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "user": return User;
            case "linked": return Linked;
            case "shared": return Shared;
            case "room": return Room;
            case "equipment": return Equipment;
            case "others": return Others;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
