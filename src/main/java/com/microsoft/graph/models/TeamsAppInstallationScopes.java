package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the appCatalogs singleton.  */
public enum TeamsAppInstallationScopes implements ValuedEnum {
    Team("team"),
    GroupChat("groupChat"),
    Personal("personal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppInstallationScopes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamsAppInstallationScopes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "team": return Team;
            case "groupChat": return GroupChat;
            case "personal": return Personal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
