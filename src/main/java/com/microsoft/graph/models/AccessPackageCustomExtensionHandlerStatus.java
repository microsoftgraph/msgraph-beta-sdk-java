package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessPackageCustomExtensionHandlerStatus implements ValuedEnum {
    RequestSent("requestSent"),
    RequestReceived("requestReceived"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCustomExtensionHandlerStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageCustomExtensionHandlerStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "requestSent": return RequestSent;
            case "requestReceived": return RequestReceived;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
