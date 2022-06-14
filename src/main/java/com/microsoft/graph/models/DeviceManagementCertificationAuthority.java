package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DeviceManagementCertificationAuthority implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Microsoft Certification Authority type. */
    Microsoft("microsoft"),
    /** DigiCert Certification Authority type. */
    DigiCert("digiCert");
    public final String value;
    DeviceManagementCertificationAuthority(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementCertificationAuthority forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "microsoft": return Microsoft;
            case "digiCert": return DigiCert;
            default: return null;
        }
    }
}
