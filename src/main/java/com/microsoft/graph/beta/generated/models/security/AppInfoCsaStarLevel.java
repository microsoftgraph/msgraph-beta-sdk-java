package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoCsaStarLevel implements ValuedEnum {
    SelfAssessment("selfAssessment"),
    Certification("certification"),
    Attestation("attestation"),
    CStarAssessment("cStarAssessment"),
    ContinuousMonitoring("continuousMonitoring"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppInfoCsaStarLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoCsaStarLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "selfAssessment": return SelfAssessment;
            case "certification": return Certification;
            case "attestation": return Attestation;
            case "cStarAssessment": return CStarAssessment;
            case "continuousMonitoring": return ContinuousMonitoring;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
