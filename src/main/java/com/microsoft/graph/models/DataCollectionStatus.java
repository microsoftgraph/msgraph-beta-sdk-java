package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataCollectionStatus implements ValuedEnum {
    Online("online"),
    Offline("offline"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataCollectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataCollectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "online": return Online;
            case "offline": return Offline;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
