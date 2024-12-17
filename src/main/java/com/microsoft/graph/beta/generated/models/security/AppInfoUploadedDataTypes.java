package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoUploadedDataTypes implements ValuedEnum {
    Documents("documents"),
    MediaFiles("mediaFiles"),
    CodingFiles("codingFiles"),
    CreditCards("creditCards"),
    DatabaseFiles("databaseFiles"),
    None("none"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppInfoUploadedDataTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoUploadedDataTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "documents": return Documents;
            case "mediaFiles": return MediaFiles;
            case "codingFiles": return CodingFiles;
            case "creditCards": return CreditCards;
            case "databaseFiles": return DatabaseFiles;
            case "none": return None;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
