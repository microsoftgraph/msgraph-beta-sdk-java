package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceManagementAutopilotPolicyType implements ValuedEnum {
    Unknown("unknown"),
    Application("application"),
    AppModel("appModel"),
    ConfigurationPolicy("configurationPolicy");
    public final String value;
    DeviceManagementAutopilotPolicyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementAutopilotPolicyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "application": return Application;
            case "appModel": return AppModel;
            case "configurationPolicy": return ConfigurationPolicy;
            default: return null;
        }
    }
}
