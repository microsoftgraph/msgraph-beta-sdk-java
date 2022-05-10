package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton. */
public enum ManagedDeviceManagementFeatures implements ValuedEnum {
    /** Unknown device management features. */
    None("none"),
    /** Microsoft Managed Desktop */
    MicrosoftManagedDesktop("microsoftManagedDesktop");
    public final String value;
    ManagedDeviceManagementFeatures(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedDeviceManagementFeatures forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "microsoftManagedDesktop": return MicrosoftManagedDesktop;
            default: return null;
        }
    }
}
