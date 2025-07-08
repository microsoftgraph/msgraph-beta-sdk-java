package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RequiredLicenses implements ValuedEnum {
    NotApplicable("notApplicable"),
    MicrosoftEntraIdFree("microsoftEntraIdFree"),
    MicrosoftEntraIdP1("microsoftEntraIdP1"),
    MicrosoftEntraIdP2("microsoftEntraIdP2"),
    MicrosoftEntraIdGovernance("microsoftEntraIdGovernance"),
    MicrosoftEntraWorkloadId("microsoftEntraWorkloadId"),
    UnknownFutureValue("unknownFutureValue"),
    Aatp("aatp");
    public final String value;
    RequiredLicenses(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequiredLicenses forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "microsoftEntraIdFree": return MicrosoftEntraIdFree;
            case "microsoftEntraIdP1": return MicrosoftEntraIdP1;
            case "microsoftEntraIdP2": return MicrosoftEntraIdP2;
            case "microsoftEntraIdGovernance": return MicrosoftEntraIdGovernance;
            case "microsoftEntraWorkloadId": return MicrosoftEntraWorkloadId;
            case "unknownFutureValue": return UnknownFutureValue;
            case "aatp": return Aatp;
            default: return null;
        }
    }
}
