package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApprovalStatus implements ValuedEnum {
    Approved("approved"),
    Suspended("suspended"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApprovalStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApprovalStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approved": return Approved;
            case "suspended": return Suspended;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
