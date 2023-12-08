package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceIdentityAttestationStatus implements ValuedEnum {
    /** Default. Set to unknown if attestation has not yet been calculated */
    Unknown("unknown"),
    /** Indicates that the Device attestation is supported on the device, it was attempted on the device and the attestation has passed. The device is trusted. */
    Trusted("trusted"),
    /** Indicates that the Device attestation is supported on the device, it was attempted on the device and the attestation has failed. The device is untrusted */
    UnTrusted("unTrusted"),
    /** Indicates that the device does not support Attestation. This could be because of missing hardware or software support. */
    NotSupported("notSupported"),
    /** Indicates that the device did not provide with the data that were required to perform attestation. */
    IncompleteData("incompleteData"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceIdentityAttestationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceIdentityAttestationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "trusted": return Trusted;
            case "unTrusted": return UnTrusted;
            case "notSupported": return NotSupported;
            case "incompleteData": return IncompleteData;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
