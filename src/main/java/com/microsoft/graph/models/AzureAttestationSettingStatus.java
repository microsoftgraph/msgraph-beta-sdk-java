package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible Azure Attestation states for a device. Azure Attestation setting status is determined by report sent from Microsoft Azure Attestation service. Only Windows 11 devices will have values "enabled" or "disabled". Windows 10 devices will have value "notApplicable".
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AzureAttestationSettingStatus implements ValuedEnum {
    /** Indicates that the device is not a Windows 11 device. */
    NotApplicable("notApplicable"),
    /** Indicates that the device has the Azure attestation setting enabled. */
    Enabled("enabled"),
    /** Indicates that the device has the Azure attestation setting disabled. */
    Disabled("disabled"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AzureAttestationSettingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AzureAttestationSettingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
