package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ResourceConnectionState implements ValuedEnum {
    Connected("connected"),
    NotAuthorized("notAuthorized"),
    NotFound("notFound"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResourceConnectionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourceConnectionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "connected": return Connected;
            case "notAuthorized": return NotAuthorized;
            case "notFound": return NotFound;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
