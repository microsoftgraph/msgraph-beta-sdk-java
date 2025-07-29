package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcProvisioningSourceType implements ValuedEnum {
    Image("image"),
    Snapshot("snapshot"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcProvisioningSourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcProvisioningSourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "image": return Image;
            case "snapshot": return Snapshot;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
