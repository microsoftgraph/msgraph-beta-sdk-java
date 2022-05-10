package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of application entities. */
public enum ConnectorGroupRegion implements ValuedEnum {
    Nam("nam"),
    Eur("eur"),
    Aus("aus"),
    Asia("asia"),
    Ind("ind"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectorGroupRegion(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectorGroupRegion forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "nam": return Nam;
            case "eur": return Eur;
            case "aus": return Aus;
            case "asia": return Asia;
            case "ind": return Ind;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
