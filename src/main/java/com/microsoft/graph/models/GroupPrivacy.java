package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum GroupPrivacy implements ValuedEnum {
    Unspecified("unspecified"),
    Public_escaped("public_escaped"),
    Private_escaped("private_escaped"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GroupPrivacy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPrivacy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "public": return Public_escaped;
            case "private": return Private_escaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
