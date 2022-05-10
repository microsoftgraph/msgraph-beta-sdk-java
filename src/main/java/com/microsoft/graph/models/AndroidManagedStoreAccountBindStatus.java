package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AndroidManagedStoreAccountBindStatus implements ValuedEnum {
    NotBound("notBound"),
    Bound("bound"),
    BoundAndValidated("boundAndValidated"),
    Unbinding("unbinding");
    public final String value;
    AndroidManagedStoreAccountBindStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedStoreAccountBindStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notBound": return NotBound;
            case "bound": return Bound;
            case "boundAndValidated": return BoundAndValidated;
            case "unbinding": return Unbinding;
            default: return null;
        }
    }
}
