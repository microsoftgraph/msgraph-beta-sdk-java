package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AggregationType implements ValuedEnum {
    Count("count"),
    Percentage("percentage"),
    AffectedCloudPcCount("affectedCloudPcCount"),
    AffectedCloudPcPercentage("affectedCloudPcPercentage"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AggregationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AggregationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "count": return Count;
            case "percentage": return Percentage;
            case "affectedCloudPcCount": return AffectedCloudPcCount;
            case "affectedCloudPcPercentage": return AffectedCloudPcPercentage;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
