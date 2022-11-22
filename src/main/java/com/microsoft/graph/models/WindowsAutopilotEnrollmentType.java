package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum WindowsAutopilotEnrollmentType implements ValuedEnum {
    Unknown("unknown"),
    AzureADJoinedWithAutopilotProfile("azureADJoinedWithAutopilotProfile"),
    OfflineDomainJoined("offlineDomainJoined"),
    AzureADJoinedUsingDeviceAuthWithAutopilotProfile("azureADJoinedUsingDeviceAuthWithAutopilotProfile"),
    AzureADJoinedUsingDeviceAuthWithoutAutopilotProfile("azureADJoinedUsingDeviceAuthWithoutAutopilotProfile"),
    AzureADJoinedWithOfflineAutopilotProfile("azureADJoinedWithOfflineAutopilotProfile"),
    AzureADJoinedWithWhiteGlove("azureADJoinedWithWhiteGlove"),
    OfflineDomainJoinedWithWhiteGlove("offlineDomainJoinedWithWhiteGlove"),
    OfflineDomainJoinedWithOfflineAutopilotProfile("offlineDomainJoinedWithOfflineAutopilotProfile");
    public final String value;
    WindowsAutopilotEnrollmentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsAutopilotEnrollmentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "azureADJoinedWithAutopilotProfile": return AzureADJoinedWithAutopilotProfile;
            case "offlineDomainJoined": return OfflineDomainJoined;
            case "azureADJoinedUsingDeviceAuthWithAutopilotProfile": return AzureADJoinedUsingDeviceAuthWithAutopilotProfile;
            case "azureADJoinedUsingDeviceAuthWithoutAutopilotProfile": return AzureADJoinedUsingDeviceAuthWithoutAutopilotProfile;
            case "azureADJoinedWithOfflineAutopilotProfile": return AzureADJoinedWithOfflineAutopilotProfile;
            case "azureADJoinedWithWhiteGlove": return AzureADJoinedWithWhiteGlove;
            case "offlineDomainJoinedWithWhiteGlove": return OfflineDomainJoinedWithWhiteGlove;
            case "offlineDomainJoinedWithOfflineAutopilotProfile": return OfflineDomainJoinedWithOfflineAutopilotProfile;
            default: return null;
        }
    }
}
