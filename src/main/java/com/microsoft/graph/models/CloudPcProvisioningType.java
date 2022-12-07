package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CloudPcProvisioningType implements ValuedEnum {
    Dedicated("dedicated"),
    Shared("shared"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcProvisioningType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcProvisioningType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dedicated": return Dedicated;
            case "shared": return Shared;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
