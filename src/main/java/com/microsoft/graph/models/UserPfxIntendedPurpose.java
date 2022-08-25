package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum UserPfxIntendedPurpose implements ValuedEnum {
    /** No roles/usages assigned. */
    Unassigned("unassigned"),
    /** Valid for S/MIME encryption. */
    SmimeEncryption("smimeEncryption"),
    /** Valid for S/MIME signing. */
    SmimeSigning("smimeSigning"),
    /** Valid for use in VPN. */
    Vpn("vpn"),
    /** Valid for use in WiFi. */
    Wifi("wifi");
    public final String value;
    UserPfxIntendedPurpose(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserPfxIntendedPurpose forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "smimeEncryption": return SmimeEncryption;
            case "smimeSigning": return SmimeSigning;
            case "vpn": return Vpn;
            case "wifi": return Wifi;
            default: return null;
        }
    }
}
