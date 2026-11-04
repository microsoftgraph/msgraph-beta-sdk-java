package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceServiceSubstate implements ValuedEnum {
    Unknown("unknown"),
    Scheduled("scheduled"),
    OfferReady("offerReady"),
    AdminPaused("adminPaused"),
    AdminCancelled("adminCancelled"),
    RemovedFromDeployment("removedFromDeployment"),
    NotOffering("notOffering"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceServiceSubstate(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceServiceSubstate forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "scheduled": return Scheduled;
            case "offerReady": return OfferReady;
            case "adminPaused": return AdminPaused;
            case "adminCancelled": return AdminCancelled;
            case "removedFromDeployment": return RemovedFromDeployment;
            case "notOffering": return NotOffering;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
