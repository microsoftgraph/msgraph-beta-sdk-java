package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies how an ID-JAG resource server matches a supplied resource URI.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IdJagResourceServerUriMatchType implements ValuedEnum {
    Absent("absent"),
    Exact("exact"),
    PathPrefix("pathPrefix"),
    AnyURI("anyURI"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdJagResourceServerUriMatchType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IdJagResourceServerUriMatchType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "absent": return Absent;
            case "exact": return Exact;
            case "pathPrefix": return PathPrefix;
            case "anyURI": return AnyURI;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
