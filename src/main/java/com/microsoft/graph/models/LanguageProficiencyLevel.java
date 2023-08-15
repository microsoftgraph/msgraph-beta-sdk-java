package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LanguageProficiencyLevel implements ValuedEnum {
    Elementary("elementary"),
    Conversational("conversational"),
    LimitedWorking("limitedWorking"),
    ProfessionalWorking("professionalWorking"),
    FullProfessional("fullProfessional"),
    NativeOrBilingual("nativeOrBilingual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LanguageProficiencyLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LanguageProficiencyLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "elementary": return Elementary;
            case "conversational": return Conversational;
            case "limitedWorking": return LimitedWorking;
            case "professionalWorking": return ProfessionalWorking;
            case "fullProfessional": return FullProfessional;
            case "nativeOrBilingual": return NativeOrBilingual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
