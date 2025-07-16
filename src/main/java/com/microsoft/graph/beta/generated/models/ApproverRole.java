package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApproverRole implements ValuedEnum {
    Owner("owner"),
    Approver("approver"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApproverRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApproverRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "owner": return Owner;
            case "approver": return Approver;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
