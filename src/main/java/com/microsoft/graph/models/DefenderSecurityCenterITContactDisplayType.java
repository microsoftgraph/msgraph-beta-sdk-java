package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DefenderSecurityCenterITContactDisplayType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Display in app and in notifications */
    DisplayInAppAndInNotifications("displayInAppAndInNotifications"),
    /** Display only in app */
    DisplayOnlyInApp("displayOnlyInApp"),
    /** Display only in notifications */
    DisplayOnlyInNotifications("displayOnlyInNotifications");
    public final String value;
    DefenderSecurityCenterITContactDisplayType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderSecurityCenterITContactDisplayType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "displayInAppAndInNotifications": return DisplayInAppAndInNotifications;
            case "displayOnlyInApp": return DisplayOnlyInApp;
            case "displayOnlyInNotifications": return DisplayOnlyInNotifications;
            default: return null;
        }
    }
}
