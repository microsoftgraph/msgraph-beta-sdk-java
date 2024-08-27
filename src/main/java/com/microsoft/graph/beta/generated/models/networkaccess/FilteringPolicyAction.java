package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FilteringPolicyAction implements ValuedEnum {
    Block("block"),
    Allow("allow"),
    UnknownFutureValue("unknownFutureValue"),
    Bypass("bypass"),
    Alert("alert");
    public final String value;
    FilteringPolicyAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FilteringPolicyAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "allow": return Allow;
            case "unknownFutureValue": return UnknownFutureValue;
            case "bypass": return Bypass;
            case "alert": return Alert;
            default: return null;
        }
    }
}
