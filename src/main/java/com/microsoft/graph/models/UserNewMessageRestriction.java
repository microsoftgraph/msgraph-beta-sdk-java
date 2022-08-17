package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum UserNewMessageRestriction implements ValuedEnum {
    Everyone("everyone"),
    EveryoneExceptGuests("everyoneExceptGuests"),
    Moderators("moderators"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserNewMessageRestriction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserNewMessageRestriction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "everyoneExceptGuests": return EveryoneExceptGuests;
            case "moderators": return Moderators;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
