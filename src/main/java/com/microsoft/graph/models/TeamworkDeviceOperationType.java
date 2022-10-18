package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum TeamworkDeviceOperationType implements ValuedEnum {
    DeviceRestart("deviceRestart"),
    ConfigUpdate("configUpdate"),
    DeviceDiagnostics("deviceDiagnostics"),
    SoftwareUpdate("softwareUpdate"),
    DeviceManagementAgentConfigUpdate("deviceManagementAgentConfigUpdate"),
    RemoteLogin("remoteLogin"),
    RemoteLogout("remoteLogout"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkDeviceOperationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkDeviceOperationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceRestart": return DeviceRestart;
            case "configUpdate": return ConfigUpdate;
            case "deviceDiagnostics": return DeviceDiagnostics;
            case "softwareUpdate": return SoftwareUpdate;
            case "deviceManagementAgentConfigUpdate": return DeviceManagementAgentConfigUpdate;
            case "remoteLogin": return RemoteLogin;
            case "remoteLogout": return RemoteLogout;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
