package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the tiIndicators property of the microsoft.graph.security entity.  */
public enum TlpLevel implements ValuedEnum {
    Unknown("unknown"),
    White("white"),
    Green("green"),
    Amber("amber"),
    Red("red"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TlpLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TlpLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "white": return White;
            case "green": return Green;
            case "amber": return Amber;
            case "red": return Red;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
