package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported values for the intended purpose of a user PFX certificate.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserPfxIntendedPurpose forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
