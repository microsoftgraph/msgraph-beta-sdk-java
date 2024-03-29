package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of VPN local identifier
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnLocalIdentifier implements ValuedEnum {
    /** Device Fully Qualified Domain Name */
    DeviceFQDN("deviceFQDN"),
    /** Empty */
    Empty("empty"),
    /** Client Certificate Subject Name */
    ClientCertificateSubjectName("clientCertificateSubjectName");
    public final String value;
    VpnLocalIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnLocalIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceFQDN": return DeviceFQDN;
            case "empty": return Empty;
            case "clientCertificateSubjectName": return ClientCertificateSubjectName;
            default: return null;
        }
    }
}
