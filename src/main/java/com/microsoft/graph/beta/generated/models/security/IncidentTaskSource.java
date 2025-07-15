package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncidentTaskSource implements ValuedEnum {
    DefenderExpertsGuidedResponse("defenderExpertsGuidedResponse"),
    DefenderExpertsManagedResponse("defenderExpertsManagedResponse"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncidentTaskSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncidentTaskSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "defenderExpertsGuidedResponse": return DefenderExpertsGuidedResponse;
            case "defenderExpertsManagedResponse": return DefenderExpertsManagedResponse;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
