package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum UserPfxIntendedPurpose implements ValuedEnum {
    Unassigned("unassigned"),
    SmimeEncryption("smimeEncryption"),
    SmimeSigning("smimeSigning"),
    Vpn("vpn"),
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
