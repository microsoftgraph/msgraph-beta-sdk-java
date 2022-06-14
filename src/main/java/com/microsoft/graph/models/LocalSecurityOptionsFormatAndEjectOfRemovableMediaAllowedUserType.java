package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Administrators */
    Administrators("administrators"),
    /** Administrators and Power Users */
    AdministratorsAndPowerUsers("administratorsAndPowerUsers"),
    /** Administrators and Interactive Users  */
    AdministratorsAndInteractiveUsers("administratorsAndInteractiveUsers");
    public final String value;
    LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "administrators": return Administrators;
            case "administratorsAndPowerUsers": return AdministratorsAndPowerUsers;
            case "administratorsAndInteractiveUsers": return AdministratorsAndInteractiveUsers;
            default: return null;
        }
    }
}
