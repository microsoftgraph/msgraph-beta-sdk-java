package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AndroidProfileApplicability implements ValuedEnum {
    Default_escaped("default_escaped"),
    AndroidWorkProfile("androidWorkProfile"),
    AndroidDeviceOwner("androidDeviceOwner");
    public final String value;
    AndroidProfileApplicability(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidProfileApplicability forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "androidWorkProfile": return AndroidWorkProfile;
            case "androidDeviceOwner": return AndroidDeviceOwner;
            default: return null;
        }
    }
}
