package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceJoinType implements ValuedEnum {
    None("none"),
    MicrosoftEntraJoined("microsoftEntraJoined"),
    MicrosoftEntraRegistered("microsoftEntraRegistered"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceJoinType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceJoinType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "microsoftEntraJoined": return MicrosoftEntraJoined;
            case "microsoftEntraRegistered": return MicrosoftEntraRegistered;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
