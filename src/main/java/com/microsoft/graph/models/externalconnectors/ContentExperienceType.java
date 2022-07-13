package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum ContentExperienceType implements ValuedEnum {
    Search("search"),
    Compliance("compliance"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentExperienceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContentExperienceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "search": return Search;
            case "compliance": return Compliance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
