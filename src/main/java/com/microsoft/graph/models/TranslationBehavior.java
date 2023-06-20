package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TranslationBehavior implements ValuedEnum {
    Ask("Ask"),
    Yes("Yes"),
    No("No");
    public final String value;
    TranslationBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TranslationBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Ask": return Ask;
            case "Yes": return Yes;
            case "No": return No;
            default: return null;
        }
    }
}
