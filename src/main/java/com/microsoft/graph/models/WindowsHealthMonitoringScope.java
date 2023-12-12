package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device health monitoring scope
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsHealthMonitoringScope implements ValuedEnum {
    /** Undefined */
    Undefined("undefined"),
    /** Basic events for windows device health monitoring */
    HealthMonitoring("healthMonitoring"),
    /** Boot performance events */
    BootPerformance("bootPerformance"),
    /** Windows updates events */
    WindowsUpdates("windowsUpdates"),
    /** PrivilegeManagement */
    PrivilegeManagement("privilegeManagement");
    public final String value;
    WindowsHealthMonitoringScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsHealthMonitoringScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undefined": return Undefined;
            case "healthMonitoring": return HealthMonitoring;
            case "bootPerformance": return BootPerformance;
            case "windowsUpdates": return WindowsUpdates;
            case "privilegeManagement": return PrivilegeManagement;
            default: return null;
        }
    }
}
