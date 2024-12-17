package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RoadmapItemDeliveryStage implements ValuedEnum {
    PrivatePreview("privatePreview"),
    PublicPreview("publicPreview"),
    Ga("ga"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RoadmapItemDeliveryStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RoadmapItemDeliveryStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "privatePreview": return PrivatePreview;
            case "publicPreview": return PublicPreview;
            case "ga": return Ga;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
