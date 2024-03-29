package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkDeviceOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
