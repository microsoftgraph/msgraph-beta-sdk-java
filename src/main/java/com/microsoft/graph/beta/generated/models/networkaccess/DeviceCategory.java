package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceCategory implements ValuedEnum {
    Client("client"),
    Branch("branch"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "client": return Client;
            case "branch": return Branch;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
