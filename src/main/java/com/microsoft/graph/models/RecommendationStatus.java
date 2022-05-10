package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the directory singleton. */
public enum RecommendationStatus implements ValuedEnum {
    Active("active"),
    CompletedBySystem("completedBySystem"),
    CompletedByUser("completedByUser"),
    Dismissed("dismissed"),
    Postponed("postponed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RecommendationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecommendationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "completedBySystem": return CompletedBySystem;
            case "completedByUser": return CompletedByUser;
            case "dismissed": return Dismissed;
            case "postponed": return Postponed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
