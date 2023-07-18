package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum NotificationDeliveryPreference implements ValuedEnum {
    Unknown("unknown"),
    DeliverImmedietly("deliverImmedietly"),
    DeliverAfterCampaignEnd("deliverAfterCampaignEnd"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationDeliveryPreference(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NotificationDeliveryPreference forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "deliverImmedietly": return DeliverImmedietly;
            case "deliverAfterCampaignEnd": return DeliverAfterCampaignEnd;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
