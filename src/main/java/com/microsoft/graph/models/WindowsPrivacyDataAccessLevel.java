package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the windowsPrivacyAccessControls method.  */
public enum WindowsPrivacyDataAccessLevel implements ValuedEnum {
    NotConfigured("notConfigured"),
    ForceAllow("forceAllow"),
    ForceDeny("forceDeny"),
    UserInControl("userInControl");
    public final String value;
    WindowsPrivacyDataAccessLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsPrivacyDataAccessLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "forceAllow": return ForceAllow;
            case "forceDeny": return ForceDeny;
            case "userInControl": return UserInControl;
            default: return null;
        }
    }
}
