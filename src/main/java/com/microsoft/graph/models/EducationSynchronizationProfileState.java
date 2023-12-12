package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationSynchronizationProfileState implements ValuedEnum {
    Deleting("deleting"),
    DeletionFailed("deletionFailed"),
    ProvisioningFailed("provisioningFailed"),
    Provisioned("provisioned"),
    Provisioning("provisioning"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationSynchronizationProfileState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationSynchronizationProfileState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deleting": return Deleting;
            case "deletionFailed": return DeletionFailed;
            case "provisioningFailed": return ProvisioningFailed;
            case "provisioned": return Provisioned;
            case "provisioning": return Provisioning;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
