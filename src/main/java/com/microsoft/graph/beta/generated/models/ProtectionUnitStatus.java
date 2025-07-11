package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtectionUnitStatus implements ValuedEnum {
    ProtectRequested("protectRequested"),
    Protected("protected"),
    UnprotectRequested("unprotectRequested"),
    Unprotected("unprotected"),
    RemoveRequested("removeRequested"),
    UnknownFutureValue("unknownFutureValue"),
    OffboardRequested("offboardRequested"),
    Offboarded("offboarded"),
    CancelOffboardRequested("cancelOffboardRequested");
    public final String value;
    ProtectionUnitStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtectionUnitStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "protectRequested": return ProtectRequested;
            case "protected": return Protected;
            case "unprotectRequested": return UnprotectRequested;
            case "unprotected": return Unprotected;
            case "removeRequested": return RemoveRequested;
            case "unknownFutureValue": return UnknownFutureValue;
            case "offboardRequested": return OffboardRequested;
            case "offboarded": return Offboarded;
            case "cancelOffboardRequested": return CancelOffboardRequested;
            default: return null;
        }
    }
}
