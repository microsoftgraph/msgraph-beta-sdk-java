package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AndroidDeviceOwnerVirtualHomeButtonType implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Swipe-up for home button. */
    SwipeUp("swipeUp"),
    /** Floating home button. */
    Floating("floating");
    public final String value;
    AndroidDeviceOwnerVirtualHomeButtonType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerVirtualHomeButtonType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "swipeUp": return SwipeUp;
            case "floating": return Floating;
            default: return null;
        }
    }
}
