package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the teamwork singleton. */
public enum TeamworkSupportedClient implements ValuedEnum {
    Unknown("unknown"),
    SkypeDefaultAndTeams("skypeDefaultAndTeams"),
    TeamsDefaultAndSkype("teamsDefaultAndSkype"),
    SkypeOnly("skypeOnly"),
    TeamsOnly("teamsOnly"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkSupportedClient(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkSupportedClient forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "skypeDefaultAndTeams": return SkypeDefaultAndTeams;
            case "teamsDefaultAndSkype": return TeamsDefaultAndSkype;
            case "skypeOnly": return SkypeOnly;
            case "teamsOnly": return TeamsOnly;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
