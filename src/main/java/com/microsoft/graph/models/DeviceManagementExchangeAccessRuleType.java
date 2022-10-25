package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DeviceManagementExchangeAccessRuleType implements ValuedEnum {
    /** Family of devices */
    Family("family"),
    /** Specific model of device */
    Model("model");
    public final String value;
    DeviceManagementExchangeAccessRuleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeAccessRuleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "family": return Family;
            case "model": return Model;
            default: return null;
        }
    }
}
