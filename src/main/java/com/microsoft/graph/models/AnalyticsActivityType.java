package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AnalyticsActivityType implements ValuedEnum {
    Email("Email"),
    Meeting("Meeting"),
    Focus("Focus"),
    Chat("Chat"),
    Call("Call");
    public final String value;
    AnalyticsActivityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AnalyticsActivityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Email": return Email;
            case "Meeting": return Meeting;
            case "Focus": return Focus;
            case "Chat": return Chat;
            case "Call": return Call;
            default: return null;
        }
    }
}
