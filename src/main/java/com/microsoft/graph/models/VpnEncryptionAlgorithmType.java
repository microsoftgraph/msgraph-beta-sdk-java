package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of VPN security association encryption algorithm
 */
public enum VpnEncryptionAlgorithmType implements ValuedEnum {
    /** AES-256 */
    Aes256("aes256"),
    /** DES */
    Des("des"),
    /** 3DES */
    TripleDes("tripleDes"),
    /** AES-128 */
    Aes128("aes128"),
    /** AES-128-GCM */
    Aes128Gcm("aes128Gcm"),
    /** AES-256-GCM */
    Aes256Gcm("aes256Gcm"),
    /** AES-192 */
    Aes192("aes192"),
    /** AES-192-GCM */
    Aes192Gcm("aes192Gcm"),
    /** ChaCha20Poly1305 */
    ChaCha20Poly1305("chaCha20Poly1305");
    public final String value;
    VpnEncryptionAlgorithmType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnEncryptionAlgorithmType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aes256": return Aes256;
            case "des": return Des;
            case "tripleDes": return TripleDes;
            case "aes128": return Aes128;
            case "aes128Gcm": return Aes128Gcm;
            case "aes256Gcm": return Aes256Gcm;
            case "aes192": return Aes192;
            case "aes192Gcm": return Aes192Gcm;
            case "chaCha20Poly1305": return ChaCha20Poly1305;
            default: return null;
        }
    }
}
