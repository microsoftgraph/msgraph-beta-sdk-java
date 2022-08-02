package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AndroidRequiredPasswordComplexity implements ValuedEnum {
    /** Device default value, no password. */
    None("none"),
    /** The required password complexity on the device is of type low as defined by the Android documentation. */
    Low("low"),
    /** The required password complexity on the device is of type medium as defined by the Android documentation. */
    Medium("medium"),
    /** The required password complexity on the device is of type high as defined by the Android documentation. */
    High("high");
    public final String value;
    AndroidRequiredPasswordComplexity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidRequiredPasswordComplexity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            default: return null;
        }
    }
}
