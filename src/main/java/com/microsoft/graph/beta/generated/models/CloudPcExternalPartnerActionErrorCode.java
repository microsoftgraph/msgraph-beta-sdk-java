package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcExternalPartnerActionErrorCode implements ValuedEnum {
    None("none"),
    ExecuteActionFailed("executeActionFailed"),
    ExecuteActionTimeout("executeActionTimeout"),
    DeviceNotFound("deviceNotFound"),
    DeviceNotAvailable("deviceNotAvailable"),
    CheckDiskSpaceFailed("checkDiskSpaceFailed"),
    CheckNetworkConnectionFailed("checkNetworkConnectionFailed"),
    AgentNotFound("agentNotFound"),
    InvalidAgentFormat("invalidAgentFormat"),
    InvalidAgentChecksum("invalidAgentChecksum"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcExternalPartnerActionErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcExternalPartnerActionErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "executeActionFailed": return ExecuteActionFailed;
            case "executeActionTimeout": return ExecuteActionTimeout;
            case "deviceNotFound": return DeviceNotFound;
            case "deviceNotAvailable": return DeviceNotAvailable;
            case "checkDiskSpaceFailed": return CheckDiskSpaceFailed;
            case "checkNetworkConnectionFailed": return CheckNetworkConnectionFailed;
            case "agentNotFound": return AgentNotFound;
            case "invalidAgentFormat": return InvalidAgentFormat;
            case "invalidAgentChecksum": return InvalidAgentChecksum;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
