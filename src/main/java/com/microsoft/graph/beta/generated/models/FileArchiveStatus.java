package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileArchiveStatus implements ValuedEnum {
    NotArchived("notArchived"),
    FullyArchived("fullyArchived"),
    Reactivating("reactivating"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileArchiveStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileArchiveStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notArchived": return NotArchived;
            case "fullyArchived": return FullyArchived;
            case "reactivating": return Reactivating;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
