package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of certificate the VPN server will present to the VPN client for authentication
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnServerCertificateType implements ValuedEnum {
    /** RSA */
    Rsa("rsa"),
    /** ECDSA256 */
    Ecdsa256("ecdsa256"),
    /** ECDSA384 */
    Ecdsa384("ecdsa384"),
    /** ECDSA521 */
    Ecdsa521("ecdsa521");
    public final String value;
    VpnServerCertificateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnServerCertificateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rsa": return Rsa;
            case "ecdsa256": return Ecdsa256;
            case "ecdsa384": return Ecdsa384;
            case "ecdsa521": return Ecdsa521;
            default: return null;
        }
    }
}
