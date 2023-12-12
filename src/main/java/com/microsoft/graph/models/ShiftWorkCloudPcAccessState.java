package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShiftWorkCloudPcAccessState implements ValuedEnum {
    Unassigned("unassigned"),
    NoLicensesAvailable("noLicensesAvailable"),
    ActivationFailed("activationFailed"),
    Active("active"),
    Activating("activating"),
    UnknownFutureValue("unknownFutureValue"),
    StandbyMode("standbyMode");
    public final String value;
    ShiftWorkCloudPcAccessState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShiftWorkCloudPcAccessState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "noLicensesAvailable": return NoLicensesAvailable;
            case "activationFailed": return ActivationFailed;
            case "active": return Active;
            case "activating": return Activating;
            case "unknownFutureValue": return UnknownFutureValue;
            case "standbyMode": return StandbyMode;
            default: return null;
        }
    }
}
