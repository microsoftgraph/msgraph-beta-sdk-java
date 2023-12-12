package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementAutopilotPolicyComplianceStatus implements ValuedEnum {
    Unknown("unknown"),
    Compliant("compliant"),
    Installed("installed"),
    NotCompliant("notCompliant"),
    NotInstalled("notInstalled"),
    Error("error");
    public final String value;
    DeviceManagementAutopilotPolicyComplianceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementAutopilotPolicyComplianceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "compliant": return Compliant;
            case "installed": return Installed;
            case "notCompliant": return NotCompliant;
            case "notInstalled": return NotInstalled;
            case "error": return Error;
            default: return null;
        }
    }
}
