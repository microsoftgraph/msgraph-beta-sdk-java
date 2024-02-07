package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device Management Certification Authority Types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementCertificationAuthority implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Microsoft Certification Authority type. */
    Microsoft("microsoft"),
    /** DigiCert Certification Authority type. */
    DigiCert("digiCert");
    public final String value;
    DeviceManagementCertificationAuthority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementCertificationAuthority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "microsoft": return Microsoft;
            case "digiCert": return DigiCert;
            default: return null;
        }
    }
}
