package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPCUserSettingsPersistenceProfileStatus implements ValuedEnum {
    Connected("connected"),
    NotConnected("notConnected"),
    Deleting("deleting"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPCUserSettingsPersistenceProfileStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPCUserSettingsPersistenceProfileStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "connected": return Connected;
            case "notConnected": return NotConnected;
            case "deleting": return Deleting;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
