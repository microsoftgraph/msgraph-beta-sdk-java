package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IngestionSource forValue(@javax.annotation.Nonnull final String searchValue) {
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
