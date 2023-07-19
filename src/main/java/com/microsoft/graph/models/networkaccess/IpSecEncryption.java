package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IpSecEncryption forValue(@javax.annotation.Nonnull final String searchValue) {
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
