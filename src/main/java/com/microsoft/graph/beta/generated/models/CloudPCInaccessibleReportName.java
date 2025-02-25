package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPCInaccessibleReportName implements ValuedEnum {
    InaccessibleCloudPcReports("inaccessibleCloudPcReports"),
    InaccessibleCloudPcTrendReport("inaccessibleCloudPcTrendReport"),
    UnknownFutureValue("unknownFutureValue"),
    RegionalInaccessibleCloudPcTrendReport("regionalInaccessibleCloudPcTrendReport");
    public final String value;
    CloudPCInaccessibleReportName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPCInaccessibleReportName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inaccessibleCloudPcReports": return InaccessibleCloudPcReports;
            case "inaccessibleCloudPcTrendReport": return InaccessibleCloudPcTrendReport;
            case "unknownFutureValue": return UnknownFutureValue;
            case "regionalInaccessibleCloudPcTrendReport": return RegionalInaccessibleCloudPcTrendReport;
            default: return null;
        }
    }
}
