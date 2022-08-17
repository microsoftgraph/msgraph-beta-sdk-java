package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WindowsManagedAppDataTransferLevel implements ValuedEnum {
    /** All apps. */
    AllApps("allApps"),
    /** No apps. */
    None("none");
    public final String value;
    WindowsManagedAppDataTransferLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsManagedAppDataTransferLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "none": return None;
            default: return null;
        }
    }
}
