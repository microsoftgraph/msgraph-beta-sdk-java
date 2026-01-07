package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of attribution.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotConversationAttributionType implements ValuedEnum {
    Citation("citation"),
    Annotation("annotation"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotConversationAttributionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotConversationAttributionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "citation": return Citation;
            case "annotation": return Annotation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
