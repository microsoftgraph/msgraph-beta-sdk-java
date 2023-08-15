package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IkeIntegrity implements ValuedEnum {
    Sha256("sha256"),
    Sha384("sha384"),
    GcmAes128("gcmAes128"),
    GcmAes256("gcmAes256"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IkeIntegrity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IkeIntegrity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sha256": return Sha256;
            case "sha384": return Sha384;
            case "gcmAes128": return GcmAes128;
            case "gcmAes256": return GcmAes256;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
