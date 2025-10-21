package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SkillPreviewState implements ValuedEnum {
    Ga("ga"),
    Public("public"),
    Private("private"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SkillPreviewState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SkillPreviewState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ga": return Ga;
            case "public": return Public;
            case "private": return Private;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
