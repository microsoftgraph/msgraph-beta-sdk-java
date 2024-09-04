package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DisableReason implements ValuedEnum {
    None("none"),
    InvalidBillingProfile("invalidBillingProfile"),
    UserRequested("userRequested"),
    UnknownFutureValue("unknownFutureValue"),
    ControllerServiceAppDeleted("controllerServiceAppDeleted");
    public final String value;
    DisableReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DisableReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "invalidBillingProfile": return InvalidBillingProfile;
            case "userRequested": return UserRequested;
            case "unknownFutureValue": return UnknownFutureValue;
            case "controllerServiceAppDeleted": return ControllerServiceAppDeleted;
            default: return null;
        }
    }
}
