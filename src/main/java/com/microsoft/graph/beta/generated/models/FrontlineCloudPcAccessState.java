package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FrontlineCloudPcAccessState implements ValuedEnum {
    Unassigned("unassigned"),
    NoLicensesAvailable("noLicensesAvailable"),
    ActivationFailed("activationFailed"),
    Active("active"),
    Activating("activating"),
    StandbyMode("standbyMode"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FrontlineCloudPcAccessState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FrontlineCloudPcAccessState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "noLicensesAvailable": return NoLicensesAvailable;
            case "activationFailed": return ActivationFailed;
            case "active": return Active;
            case "activating": return Activating;
            case "standbyMode": return StandbyMode;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
