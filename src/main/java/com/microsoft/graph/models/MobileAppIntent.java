package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton. */
public enum MobileAppIntent implements ValuedEnum {
    /** Available */
    Available("available"),
    /** Not Available */
    NotAvailable("notAvailable"),
    /** Required Install */
    RequiredInstall("requiredInstall"),
    /** Required Uninstall */
    RequiredUninstall("requiredUninstall"),
    /** RequiredAndAvailableInstall */
    RequiredAndAvailableInstall("requiredAndAvailableInstall"),
    /** AvailableInstallWithoutEnrollment */
    AvailableInstallWithoutEnrollment("availableInstallWithoutEnrollment"),
    /** Exclude */
    Exclude("exclude");
    public final String value;
    MobileAppIntent(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileAppIntent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "notAvailable": return NotAvailable;
            case "requiredInstall": return RequiredInstall;
            case "requiredUninstall": return RequiredUninstall;
            case "requiredAndAvailableInstall": return RequiredAndAvailableInstall;
            case "availableInstallWithoutEnrollment": return AvailableInstallWithoutEnrollment;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
