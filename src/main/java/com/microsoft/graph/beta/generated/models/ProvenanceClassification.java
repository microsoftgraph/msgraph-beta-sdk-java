package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvenanceClassification implements ValuedEnum {
    HighAssurance("highAssurance"),
    MediumAssurance("mediumAssurance"),
    LowAssurance("lowAssurance"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvenanceClassification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvenanceClassification forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "highAssurance": return HighAssurance;
            case "mediumAssurance": return MediumAssurance;
            case "lowAssurance": return LowAssurance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
