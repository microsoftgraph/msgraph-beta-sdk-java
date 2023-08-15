package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AlertRuleTemplate implements ValuedEnum {
    CloudPcProvisionScenario("cloudPcProvisionScenario"),
    CloudPcImageUploadScenario("cloudPcImageUploadScenario"),
    CloudPcOnPremiseNetworkConnectionCheckScenario("cloudPcOnPremiseNetworkConnectionCheckScenario"),
    UnknownFutureValue("unknownFutureValue"),
    CloudPcInGracePeriodScenario("cloudPcInGracePeriodScenario"),
    CloudPcFrontlineInsufficientLicensesScenario("cloudPcFrontlineInsufficientLicensesScenario");
    public final String value;
    AlertRuleTemplate(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertRuleTemplate forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cloudPcProvisionScenario": return CloudPcProvisionScenario;
            case "cloudPcImageUploadScenario": return CloudPcImageUploadScenario;
            case "cloudPcOnPremiseNetworkConnectionCheckScenario": return CloudPcOnPremiseNetworkConnectionCheckScenario;
            case "unknownFutureValue": return UnknownFutureValue;
            case "cloudPcInGracePeriodScenario": return CloudPcInGracePeriodScenario;
            case "cloudPcFrontlineInsufficientLicensesScenario": return CloudPcFrontlineInsufficientLicensesScenario;
            default: return null;
        }
    }
}
