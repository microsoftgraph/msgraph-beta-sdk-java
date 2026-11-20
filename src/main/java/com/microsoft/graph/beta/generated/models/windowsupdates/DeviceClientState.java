package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceClientState implements ValuedEnum {
    Offering("offering"),
    OnHold("onHold"),
    Installing("installing"),
    Installed("installed"),
    Cancelled("cancelled"),
    Uninstalling("uninstalling"),
    Uninstalled("uninstalled"),
    NotOffering("notOffering"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceClientState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceClientState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "offering": return Offering;
            case "onHold": return OnHold;
            case "installing": return Installing;
            case "installed": return Installed;
            case "cancelled": return Cancelled;
            case "uninstalling": return Uninstalling;
            case "uninstalled": return Uninstalled;
            case "notOffering": return NotOffering;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
