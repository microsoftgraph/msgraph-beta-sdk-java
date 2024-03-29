package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Authentication transform values for Windows10 VPN policies with IKEv2 connection type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationTransformConstant implements ValuedEnum {
    /** MD596 */
    Md5_96("md5_96"),
    /** SHA196 */
    Sha1_96("sha1_96"),
    /** SHA256128 */
    Sha_256_128("sha_256_128"),
    /** GCMAES128 */
    Aes128Gcm("aes128Gcm"),
    /** GCMAES192 */
    Aes192Gcm("aes192Gcm"),
    /** GCMAES256 */
    Aes256Gcm("aes256Gcm");
    public final String value;
    AuthenticationTransformConstant(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationTransformConstant forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "md5_96": return Md5_96;
            case "sha1_96": return Sha1_96;
            case "sha_256_128": return Sha_256_128;
            case "aes128Gcm": return Aes128Gcm;
            case "aes192Gcm": return Aes192Gcm;
            case "aes256Gcm": return Aes256Gcm;
            default: return null;
        }
    }
}
