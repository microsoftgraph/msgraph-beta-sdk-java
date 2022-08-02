package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum TargetedManagedAppGroupType implements ValuedEnum {
    /** Target the collection of apps manually selected by the admin. */
    SelectedPublicApps("selectedPublicApps"),
    /** Target the core set of Microsoft apps (Office, Edge, etc). */
    AllCoreMicrosoftApps("allCoreMicrosoftApps"),
    /** Target all apps with Microsoft as publisher. */
    AllMicrosoftApps("allMicrosoftApps"),
    /** Target all apps with an available assignment. */
    AllApps("allApps");
    public final String value;
    TargetedManagedAppGroupType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TargetedManagedAppGroupType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "selectedPublicApps": return SelectedPublicApps;
            case "allCoreMicrosoftApps": return AllCoreMicrosoftApps;
            case "allMicrosoftApps": return AllMicrosoftApps;
            case "allApps": return AllApps;
            default: return null;
        }
    }
}
