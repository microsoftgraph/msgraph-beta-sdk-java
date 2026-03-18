package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CrossTenantAccessType implements ValuedEnum {
    None("none"),
    B2bCollaboration("b2bCollaboration"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantAccessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CrossTenantAccessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "b2bCollaboration": return B2bCollaboration;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
