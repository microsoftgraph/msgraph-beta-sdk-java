package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ShiftWorkCloudPcAccessState implements ValuedEnum {
    Unassigned("unassigned"),
    NoLicensesAvailable("noLicensesAvailable"),
    ActivationFailed("activationFailed"),
    Active("active"),
    Activating("activating"),
    Waitlisted("waitlisted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ShiftWorkCloudPcAccessState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ShiftWorkCloudPcAccessState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "noLicensesAvailable": return NoLicensesAvailable;
            case "activationFailed": return ActivationFailed;
            case "active": return Active;
            case "activating": return Activating;
            case "waitlisted": return Waitlisted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
