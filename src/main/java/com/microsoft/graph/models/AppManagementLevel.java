package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum AppManagementLevel implements ValuedEnum {
    /** Unspecified */
    Unspecified("unspecified"),
    /** Unmanaged */
    Unmanaged("unmanaged"),
    /** MDM */
    Mdm("mdm"),
    /** Android Enterprise */
    AndroidEnterprise("androidEnterprise");
    public final String value;
    AppManagementLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppManagementLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "unmanaged": return Unmanaged;
            case "mdm": return Mdm;
            case "androidEnterprise": return AndroidEnterprise;
            default: return null;
        }
    }
}
