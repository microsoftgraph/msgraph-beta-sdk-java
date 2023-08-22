package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DiscoverySource implements ValuedEnum {
    /** DiscoverySource is Unknown. */
    Unknown("unknown"),
    /** Device is imported by admin. */
    AdminImport("adminImport"),
    /** Device is added by Apple device enrollment program (Dep). */
    DeviceEnrollmentProgram("deviceEnrollmentProgram");
    public final String value;
    DiscoverySource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DiscoverySource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "adminImport": return AdminImport;
            case "deviceEnrollmentProgram": return DeviceEnrollmentProgram;
            default: return null;
        }
    }
}
