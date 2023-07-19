package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of device script.
 */
public enum DeviceHealthScriptType implements ValuedEnum {
    /** Indicates this is a device health script. */
    DeviceHealthScript("deviceHealthScript"),
    /** Indicates this is a managed installer script. */
    ManagedInstallerScript("managedInstallerScript");
    public final String value;
    DeviceHealthScriptType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceHealthScriptType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceHealthScript": return DeviceHealthScript;
            case "managedInstallerScript": return ManagedInstallerScript;
            default: return null;
        }
    }
}
