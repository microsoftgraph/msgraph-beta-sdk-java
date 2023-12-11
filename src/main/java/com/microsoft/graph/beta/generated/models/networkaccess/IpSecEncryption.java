package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IpSecEncryption implements ValuedEnum {
    None("none"),
    GcmAes128("gcmAes128"),
    GcmAes192("gcmAes192"),
    GcmAes256("gcmAes256"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IpSecEncryption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IpSecEncryption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "gcmAes128": return GcmAes128;
            case "gcmAes192": return GcmAes192;
            case "gcmAes256": return GcmAes256;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
