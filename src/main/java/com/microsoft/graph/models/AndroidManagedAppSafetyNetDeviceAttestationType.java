package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** An admin enforced Android SafetyNet Device Attestation requirement on a managed app. */
public enum AndroidManagedAppSafetyNetDeviceAttestationType implements ValuedEnum {
    /** no requirement set */
    None("none"),
    /** require that Android device passes SafetyNet Basic Integrity validation */
    BasicIntegrity("basicIntegrity"),
    /** require that Android device passes SafetyNet Basic Integrity and Device Certification validations */
    BasicIntegrityAndDeviceCertification("basicIntegrityAndDeviceCertification");
    public final String value;
    AndroidManagedAppSafetyNetDeviceAttestationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedAppSafetyNetDeviceAttestationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "basicIntegrity": return BasicIntegrity;
            case "basicIntegrityAndDeviceCertification": return BasicIntegrityAndDeviceCertification;
            default: return null;
        }
    }
}
