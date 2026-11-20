package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The name of the health check metric being evaluated for an NDES connector.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectorHealthCheckMetricName implements ValuedEnum {
    /** Measures connectivity between the connector and the Certificate Authority. */
    CaConnectivity("caConnectivity"),
    /** Measures whether the connector has the required Enroll permission on the certificate template for issuance. */
    CaIssuancePermissions("caIssuancePermissions"),
    /** Measures whether the connector has the required permissions to revoke certificates on the CA. */
    CaRevocationPermissions("caRevocationPermissions"),
    /** Measures whether the configured certificate template is valid and accessible. */
    CertificateTemplate("certificateTemplate"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectorHealthCheckMetricName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectorHealthCheckMetricName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "caConnectivity": return CaConnectivity;
            case "caIssuancePermissions": return CaIssuancePermissions;
            case "caRevocationPermissions": return CaRevocationPermissions;
            case "certificateTemplate": return CertificateTemplate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
