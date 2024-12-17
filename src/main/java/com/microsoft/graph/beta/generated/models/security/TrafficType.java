package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TrafficType implements ValuedEnum {
    DownloadedBytes("downloadedBytes"),
    UploadedBytes("uploadedBytes"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrafficType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TrafficType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "downloadedBytes": return DownloadedBytes;
            case "uploadedBytes": return UploadedBytes;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
