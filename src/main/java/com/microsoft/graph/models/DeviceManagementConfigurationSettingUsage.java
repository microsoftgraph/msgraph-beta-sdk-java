package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementConfigurationSettingUsage implements ValuedEnum {
    None("none"),
    Configuration("configuration"),
    Compliance("compliance");
    public final String value;
    DeviceManagementConfigurationSettingUsage(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationSettingUsage forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "configuration": return Configuration;
            case "compliance": return Compliance;
            default: return null;
        }
    }
}
