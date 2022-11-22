package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum CloudPcPartnerAgentName implements ValuedEnum {
    Citrix("citrix"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPartnerAgentName(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcPartnerAgentName forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "citrix": return Citrix;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
