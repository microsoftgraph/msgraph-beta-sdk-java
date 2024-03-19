package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CampaignStatus implements ValuedEnum {
    Unknown("unknown"),
    Draft("draft"),
    InProgress("inProgress"),
    Scheduled("scheduled"),
    Completed("completed"),
    Failed("failed"),
    Cancelled("cancelled"),
    Excluded("excluded"),
    Deleted("deleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CampaignStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CampaignStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "draft": return Draft;
            case "inProgress": return InProgress;
            case "scheduled": return Scheduled;
            case "completed": return Completed;
            case "failed": return Failed;
            case "cancelled": return Cancelled;
            case "excluded": return Excluded;
            case "deleted": return Deleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
