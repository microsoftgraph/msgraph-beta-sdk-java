package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Kind of external resource identifier or keyword supplied to a playbook.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvestigationInputType implements ValuedEnum {
    DefenderIncidentId("defenderIncidentId"),
    DefenderAlertId("defenderAlertId"),
    DefenderThreatIntelligenceId("defenderThreatIntelligenceId"),
    AzureSubscriptionId("azureSubscriptionId"),
    AzureIdentityId("azureIdentityId"),
    Keyword("keyword"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InvestigationInputType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvestigationInputType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "defenderIncidentId": return DefenderIncidentId;
            case "defenderAlertId": return DefenderAlertId;
            case "defenderThreatIntelligenceId": return DefenderThreatIntelligenceId;
            case "azureSubscriptionId": return AzureSubscriptionId;
            case "azureIdentityId": return AzureIdentityId;
            case "keyword": return Keyword;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
