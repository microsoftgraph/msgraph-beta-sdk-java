package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum PageOrientation implements ValuedEnum {
    Horizontal("horizontal"),
    Diagonal("diagonal");
    public final String value;
    PageOrientation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PageOrientation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "horizontal": return Horizontal;
            case "diagonal": return Diagonal;
            default: return null;
        }
    }
}
