package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported values for the padding scheme used by encryption provider.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserPfxPaddingScheme implements ValuedEnum {
    /** Unknown padding Scheme. */
    None("none"),
    /** Pkcs1 is no longer supported */
    Pkcs1("pkcs1"),
    /** OaepSha1 is no longer supported */
    OaepSha1("oaepSha1"),
    /** Use OAEP SHA-256 padding. */
    OaepSha256("oaepSha256"),
    /** Use OAEP SHA-384 padding. */
    OaepSha384("oaepSha384"),
    /** Use OAEP SHA-512 padding. */
    OaepSha512("oaepSha512");
    public final String value;
    UserPfxPaddingScheme(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserPfxPaddingScheme forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "pkcs1": return Pkcs1;
            case "oaepSha1": return OaepSha1;
            case "oaepSha256": return OaepSha256;
            case "oaepSha384": return OaepSha384;
            case "oaepSha512": return OaepSha512;
            default: return null;
        }
    }
}
