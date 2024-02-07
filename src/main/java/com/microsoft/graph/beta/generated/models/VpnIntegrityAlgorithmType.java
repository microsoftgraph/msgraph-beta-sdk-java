package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of VPN security association integrity algorithm
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnIntegrityAlgorithmType implements ValuedEnum {
    /** SHA2-256 */
    Sha2_256("sha2_256"),
    /** SHA1-96 */
    Sha1_96("sha1_96"),
    /** SHA1-160 */
    Sha1_160("sha1_160"),
    /** SHA2-384 */
    Sha2_384("sha2_384"),
    /** SHA2-512 */
    Sha2_512("sha2_512"),
    /** MD5 */
    Md5("md5");
    public final String value;
    VpnIntegrityAlgorithmType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnIntegrityAlgorithmType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sha2_256": return Sha2_256;
            case "sha1_96": return Sha1_96;
            case "sha1_160": return Sha1_160;
            case "sha2_384": return Sha2_384;
            case "sha2_512": return Sha2_512;
            case "md5": return Md5;
            default: return null;
        }
    }
}
