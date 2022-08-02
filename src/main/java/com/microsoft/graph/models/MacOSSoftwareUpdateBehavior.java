package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum MacOSSoftwareUpdateBehavior implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Download and/or install the software update, depending on the current device state. */
    Default_escaped("default_escaped"),
    /** Download the software update without installing it. */
    DownloadOnly("downloadOnly"),
    /** Install an already downloaded software update. */
    InstallASAP("installASAP"),
    /** Download the software update and notify the user via the App Store. */
    NotifyOnly("notifyOnly"),
    /** Download the software update and install it at a later time. */
    InstallLater("installLater");
    public final String value;
    MacOSSoftwareUpdateBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSSoftwareUpdateBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "default": return Default_escaped;
            case "downloadOnly": return DownloadOnly;
            case "installASAP": return InstallASAP;
            case "notifyOnly": return NotifyOnly;
            case "installLater": return InstallLater;
            default: return null;
        }
    }
}
