package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Output category: summary text or an artifact, both retrieved through the authenticated content stream.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvestigationOutputType implements ValuedEnum {
    Summary("summary"),
    Artifact("artifact"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InvestigationOutputType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvestigationOutputType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "summary": return Summary;
            case "artifact": return Artifact;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
