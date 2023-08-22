package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcPartnerAgentInstallStatus implements ValuedEnum {
    Installed("installed"),
    InstallFailed("installFailed"),
    Installing("installing"),
    Uninstalling("uninstalling"),
    UninstallFailed("uninstallFailed"),
    Licensed("licensed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPartnerAgentInstallStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcPartnerAgentInstallStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "installed": return Installed;
            case "installFailed": return InstallFailed;
            case "installing": return Installing;
            case "uninstalling": return Uninstalling;
            case "uninstallFailed": return UninstallFailed;
            case "licensed": return Licensed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
