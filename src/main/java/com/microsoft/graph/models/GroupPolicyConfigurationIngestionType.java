package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum GroupPolicyConfigurationIngestionType implements ValuedEnum {
    /** Unknown policy configuration ingestion type */
    Unknown("unknown"),
    /** Indicates policy created have definitions ingested by IT admin with sufficient permissions through custom ingestion process */
    Custom("custom"),
    /** Indicates policy created have definitions ingested through system ingestion process */
    BuiltIn("builtIn"),
    /** Indicated atleast 1 tenant admin & system ingested definitions configured for this policy */
    Mixed("mixed"),
    /** Unknown future enum value */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GroupPolicyConfigurationIngestionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyConfigurationIngestionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "custom": return Custom;
            case "builtIn": return BuiltIn;
            case "mixed": return Mixed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
