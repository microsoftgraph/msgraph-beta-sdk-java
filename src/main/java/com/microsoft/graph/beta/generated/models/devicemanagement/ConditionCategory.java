package com.microsoft.graph.beta.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionCategory implements ValuedEnum {
    ProvisionFailures("provisionFailures"),
    ImageUploadFailures("imageUploadFailures"),
    AzureNetworkConnectionCheckFailures("azureNetworkConnectionCheckFailures"),
    CloudPcInGracePeriod("cloudPcInGracePeriod"),
    FrontlineInsufficientLicenses("frontlineInsufficientLicenses"),
    CloudPcConnectionErrors("cloudPcConnectionErrors"),
    CloudPcHostHealthCheckFailures("cloudPcHostHealthCheckFailures"),
    CloudPcZoneOutage("cloudPcZoneOutage"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "provisionFailures": return ProvisionFailures;
            case "imageUploadFailures": return ImageUploadFailures;
            case "azureNetworkConnectionCheckFailures": return AzureNetworkConnectionCheckFailures;
            case "cloudPcInGracePeriod": return CloudPcInGracePeriod;
            case "frontlineInsufficientLicenses": return FrontlineInsufficientLicenses;
            case "cloudPcConnectionErrors": return CloudPcConnectionErrors;
            case "cloudPcHostHealthCheckFailures": return CloudPcHostHealthCheckFailures;
            case "cloudPcZoneOutage": return CloudPcZoneOutage;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
