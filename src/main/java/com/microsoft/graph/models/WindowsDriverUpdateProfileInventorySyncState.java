package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WindowsDriverUpdateProfileInventorySyncState implements ValuedEnum {
    /** Pending sync. */
    Pending("pending"),
    /** Successful sync. */
    Success("success"),
    /** Failed sync. */
    Failure("failure");
    public final String value;
    WindowsDriverUpdateProfileInventorySyncState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDriverUpdateProfileInventorySyncState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "success": return Success;
            case "failure": return Failure;
            default: return null;
        }
    }
}
