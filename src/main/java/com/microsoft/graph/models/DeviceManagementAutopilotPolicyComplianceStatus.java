package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementAutopilotPolicyComplianceStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
