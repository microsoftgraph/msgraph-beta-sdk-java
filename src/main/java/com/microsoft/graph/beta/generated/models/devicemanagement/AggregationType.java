package com.microsoft.graph.beta.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AggregationType implements ValuedEnum {
    Count("count"),
    Percentage("percentage"),
    AffectedCloudPcCount("affectedCloudPcCount"),
    AffectedCloudPcPercentage("affectedCloudPcPercentage"),
    UnknownFutureValue("unknownFutureValue"),
    DurationInMinutes("durationInMinutes");
    public final String value;
    AggregationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AggregationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "count": return Count;
            case "percentage": return Percentage;
            case "affectedCloudPcCount": return AffectedCloudPcCount;
            case "affectedCloudPcPercentage": return AffectedCloudPcPercentage;
            case "unknownFutureValue": return UnknownFutureValue;
            case "durationInMinutes": return DurationInMinutes;
            default: return null;
        }
    }
}
