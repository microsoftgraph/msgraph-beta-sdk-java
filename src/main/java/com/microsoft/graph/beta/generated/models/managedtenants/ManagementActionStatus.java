package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagementActionStatus implements ValuedEnum {
    ToAddress("toAddress"),
    Completed("completed"),
    Error("error"),
    TimeOut("timeOut"),
    InProgress("inProgress"),
    Planned("planned"),
    ResolvedBy3rdParty("resolvedBy3rdParty"),
    ResolvedThroughAlternateMitigation("resolvedThroughAlternateMitigation"),
    RiskAccepted("riskAccepted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagementActionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagementActionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "toAddress": return ToAddress;
            case "completed": return Completed;
            case "error": return Error;
            case "timeOut": return TimeOut;
            case "inProgress": return InProgress;
            case "planned": return Planned;
            case "resolvedBy3rdParty": return ResolvedBy3rdParty;
            case "resolvedThroughAlternateMitigation": return ResolvedThroughAlternateMitigation;
            case "riskAccepted": return RiskAccepted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
