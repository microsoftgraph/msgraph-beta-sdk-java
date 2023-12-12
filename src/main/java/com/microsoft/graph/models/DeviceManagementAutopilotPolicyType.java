package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementAutopilotPolicyType implements ValuedEnum {
    Unknown("unknown"),
    Application("application"),
    AppModel("appModel"),
    ConfigurationPolicy("configurationPolicy");
    public final String value;
    DeviceManagementAutopilotPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementAutopilotPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
