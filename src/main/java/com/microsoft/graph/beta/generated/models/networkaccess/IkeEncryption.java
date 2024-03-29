package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IkeEncryption implements ValuedEnum {
    Aes128("aes128"),
    Aes192("aes192"),
    Aes256("aes256"),
    GcmAes128("gcmAes128"),
    GcmAes256("gcmAes256"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IkeEncryption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IkeEncryption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aes128": return Aes128;
            case "aes192": return Aes192;
            case "aes256": return Aes256;
            case "gcmAes128": return GcmAes128;
            case "gcmAes256": return GcmAes256;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
