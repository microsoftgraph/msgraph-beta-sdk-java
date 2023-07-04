package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DeviceCategory implements ValuedEnum {
    Client("client"),
    Branch("branch"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "client": return Client;
            case "branch": return Branch;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
