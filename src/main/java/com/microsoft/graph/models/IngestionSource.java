package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Category Ingestion source
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IngestionSource implements ValuedEnum {
    /** Indicates unknown category */
    Unknown("unknown"),
    /** Indicates the category is ingested by IT admin with sufficient permissions through custom ingestion process */
    Custom("custom"),
    /** Indicates the category is ingested through system ingestion process */
    BuiltIn("builtIn"),
    /** Unknown future enum value */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IngestionSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IngestionSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "custom": return Custom;
            case "builtIn": return BuiltIn;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
