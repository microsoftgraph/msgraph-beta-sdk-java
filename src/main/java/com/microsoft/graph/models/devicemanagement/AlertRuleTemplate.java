package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AlertRuleTemplate implements ValuedEnum {
    CloudPcProvisionScenario("cloudPcProvisionScenario"),
    CloudPcImageUploadScenario("cloudPcImageUploadScenario"),
    CloudPcOnPremiseNetworkConnectionCheckScenario("cloudPcOnPremiseNetworkConnectionCheckScenario"),
    UnknownFutureValue("unknownFutureValue"),
    CloudPcInGracePeriodScenario("cloudPcInGracePeriodScenario");
    public final String value;
    AlertRuleTemplate(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AlertRuleTemplate forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cloudPcProvisionScenario": return CloudPcProvisionScenario;
            case "cloudPcImageUploadScenario": return CloudPcImageUploadScenario;
            case "cloudPcOnPremiseNetworkConnectionCheckScenario": return CloudPcOnPremiseNetworkConnectionCheckScenario;
            case "unknownFutureValue": return UnknownFutureValue;
            case "cloudPcInGracePeriodScenario": return CloudPcInGracePeriodScenario;
            default: return null;
        }
    }
}
