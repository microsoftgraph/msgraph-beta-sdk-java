package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum TeamTemplateAudience implements ValuedEnum {
    Organization("organization"),
    User("user"),
    Public_escaped("public_escaped"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamTemplateAudience(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamTemplateAudience forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "organization": return Organization;
            case "user": return User;
            case "public": return Public_escaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
