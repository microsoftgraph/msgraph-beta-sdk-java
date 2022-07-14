package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum GroupAccessType implements ValuedEnum {
    None("none"),
    Private_escaped("private_escaped"),
    Secret("secret"),
    Public_escaped("public_escaped");
    public final String value;
    GroupAccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupAccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "private": return Private_escaped;
            case "secret": return Secret;
            case "public": return Public_escaped;
            default: return null;
        }
    }
}
