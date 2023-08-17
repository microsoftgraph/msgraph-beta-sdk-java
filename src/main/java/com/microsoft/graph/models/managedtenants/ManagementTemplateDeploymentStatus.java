package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ManagementTemplateDeploymentStatus implements ValuedEnum {
    Unknown("unknown"),
    InProgress("inProgress"),
    Completed("completed"),
    Failed("failed"),
    Ineligible("ineligible"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagementTemplateDeploymentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagementTemplateDeploymentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "failed": return Failed;
            case "ineligible": return Ineligible;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
