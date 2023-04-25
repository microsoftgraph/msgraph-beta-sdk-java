package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Administrator configured device compliance state Enum */
public enum AdministratorConfiguredDeviceComplianceState implements ValuedEnum {
    /** Set compliance state based on other compliance polices */
    BasedOnDeviceCompliancePolicy("basedOnDeviceCompliancePolicy"),
    /** Set compliance to nonCompliant */
    NonCompliant("nonCompliant");
    public final String value;
    AdministratorConfiguredDeviceComplianceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AdministratorConfiguredDeviceComplianceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basedOnDeviceCompliancePolicy": return BasedOnDeviceCompliancePolicy;
            case "nonCompliant": return NonCompliant;
            default: return null;
        }
    }
}
