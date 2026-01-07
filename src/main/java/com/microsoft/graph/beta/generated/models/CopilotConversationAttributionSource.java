package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The source of the attribution.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotConversationAttributionSource implements ValuedEnum {
    Grounding("grounding"),
    Model("model"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotConversationAttributionSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotConversationAttributionSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "grounding": return Grounding;
            case "model": return Model;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
