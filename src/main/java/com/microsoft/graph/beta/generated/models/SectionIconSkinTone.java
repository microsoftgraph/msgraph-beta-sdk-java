package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SectionIconSkinTone implements ValuedEnum {
    Light("light"),
    MediumLight("mediumLight"),
    Medium("medium"),
    MediumDark("mediumDark"),
    Dark("dark"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SectionIconSkinTone(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SectionIconSkinTone forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "light": return Light;
            case "mediumLight": return MediumLight;
            case "medium": return Medium;
            case "mediumDark": return MediumDark;
            case "dark": return Dark;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
