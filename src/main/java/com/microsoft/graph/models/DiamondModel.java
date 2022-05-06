package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the tiIndicators property of the microsoft.graph.security entity.  */
public enum DiamondModel implements ValuedEnum {
    Unknown("unknown"),
    Adversary("adversary"),
    Capability("capability"),
    Infrastructure("infrastructure"),
    Victim("victim"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DiamondModel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DiamondModel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "adversary": return Adversary;
            case "capability": return Capability;
            case "infrastructure": return Infrastructure;
            case "victim": return Victim;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
