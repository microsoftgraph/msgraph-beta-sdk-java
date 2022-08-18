package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum NetworkType implements ValuedEnum {
    Intranet("intranet"),
    Extranet("extranet"),
    NamedNetwork("namedNetwork"),
    Trusted("trusted"),
    TrustedNamedLocation("trustedNamedLocation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NetworkType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "intranet": return Intranet;
            case "extranet": return Extranet;
            case "namedNetwork": return NamedNetwork;
            case "trusted": return Trusted;
            case "trustedNamedLocation": return TrustedNamedLocation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
