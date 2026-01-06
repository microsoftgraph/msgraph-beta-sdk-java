package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcClientAppUsageReportType implements ValuedEnum {
    MicrosoftRemoteDesktopClientUsageReport("microsoftRemoteDesktopClientUsageReport"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcClientAppUsageReportType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcClientAppUsageReportType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftRemoteDesktopClientUsageReport": return MicrosoftRemoteDesktopClientUsageReport;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
