package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicySource implements ValuedEnum {
    UserCreated("userCreated"),
    SystemDefault("systemDefault"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicySource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicySource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userCreated": return UserCreated;
            case "systemDefault": return SystemDefault;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
