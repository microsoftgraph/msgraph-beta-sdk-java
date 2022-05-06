package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum MobileAppIntent implements ValuedEnum {
    Available("available"),
    NotAvailable("notAvailable"),
    RequiredInstall("requiredInstall"),
    RequiredUninstall("requiredUninstall"),
    RequiredAndAvailableInstall("requiredAndAvailableInstall"),
    AvailableInstallWithoutEnrollment("availableInstallWithoutEnrollment"),
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
