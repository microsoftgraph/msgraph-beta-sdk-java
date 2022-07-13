package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum EmailSyncSchedule implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Sync as messages arrive. */
    AsMessagesArrive("asMessagesArrive"),
    /** Sync manually. */
    Manual("manual"),
    /** Sync every fifteen minutes. */
    FifteenMinutes("fifteenMinutes"),
    /** Sync every thirty minutes. */
    ThirtyMinutes("thirtyMinutes"),
    /** Sync every sixty minutes. */
    SixtyMinutes("sixtyMinutes"),
    /** Sync based on my usage. */
    BasedOnMyUsage("basedOnMyUsage");
    public final String value;
    EmailSyncSchedule(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EmailSyncSchedule forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "asMessagesArrive": return AsMessagesArrive;
            case "manual": return Manual;
            case "fifteenMinutes": return FifteenMinutes;
            case "thirtyMinutes": return ThirtyMinutes;
            case "sixtyMinutes": return SixtyMinutes;
            case "basedOnMyUsage": return BasedOnMyUsage;
            default: return null;
        }
    }
}
