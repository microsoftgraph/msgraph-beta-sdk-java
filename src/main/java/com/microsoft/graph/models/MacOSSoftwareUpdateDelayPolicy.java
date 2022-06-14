package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum MacOSSoftwareUpdateDelayPolicy implements ValuedEnum {
    /** Software update delays will not be enforced. */
    None("none"),
    /** Force delays for OS software updates. */
    DelayOSUpdateVisibility("delayOSUpdateVisibility"),
    /** Force delays for app software updates. */
    DelayAppUpdateVisibility("delayAppUpdateVisibility"),
    /** Sentinel member for cases where the client cannot handle the new enum values. */
    UnknownFutureValue("unknownFutureValue"),
    /** Force delays for major OS software updates. */
    DelayMajorOsUpdateVisibility("delayMajorOsUpdateVisibility");
    public final String value;
    MacOSSoftwareUpdateDelayPolicy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSSoftwareUpdateDelayPolicy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "delayOSUpdateVisibility": return DelayOSUpdateVisibility;
            case "delayAppUpdateVisibility": return DelayAppUpdateVisibility;
            case "unknownFutureValue": return UnknownFutureValue;
            case "delayMajorOsUpdateVisibility": return DelayMajorOsUpdateVisibility;
            default: return null;
        }
    }
}
