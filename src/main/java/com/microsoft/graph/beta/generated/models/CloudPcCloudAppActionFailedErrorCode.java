package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcCloudAppActionFailedErrorCode implements ValuedEnum {
    CloudAppQuotaExceeded("cloudAppQuotaExceeded"),
    CloudPcLicenseNotFound("cloudPcLicenseNotFound"),
    InternalServerError("internalServerError"),
    AppDiscoveryFailed("appDiscoveryFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcCloudAppActionFailedErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcCloudAppActionFailedErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cloudAppQuotaExceeded": return CloudAppQuotaExceeded;
            case "cloudPcLicenseNotFound": return CloudPcLicenseNotFound;
            case "internalServerError": return InternalServerError;
            case "appDiscoveryFailed": return AppDiscoveryFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
