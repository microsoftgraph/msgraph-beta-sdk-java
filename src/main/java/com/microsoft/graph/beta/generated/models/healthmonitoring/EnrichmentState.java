package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrichmentState implements ValuedEnum {
    None("none"),
    InProgress("inProgress"),
    Enriched("enriched"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrichmentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrichmentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "inProgress": return InProgress;
            case "enriched": return Enriched;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
