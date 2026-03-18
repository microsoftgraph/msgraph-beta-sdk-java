package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudFirewallAction implements ValuedEnum {
    Allow("allow"),
    Block("block"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudFirewallAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudFirewallAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allow": return Allow;
            case "block": return Block;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
