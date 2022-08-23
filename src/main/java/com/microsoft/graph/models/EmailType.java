package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum EmailType implements ValuedEnum {
    Unknown("unknown"),
    Work("work"),
    Personal("personal"),
    Main("main"),
    Other("other");
    public final String value;
    EmailType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EmailType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "work": return Work;
            case "personal": return Personal;
            case "main": return Main;
            case "other": return Other;
            default: return null;
        }
    }
}
