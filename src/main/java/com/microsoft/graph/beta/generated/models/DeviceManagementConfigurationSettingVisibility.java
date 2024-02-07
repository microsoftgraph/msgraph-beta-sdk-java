package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported setting types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationSettingVisibility implements ValuedEnum {
    /** Default. Not visible. */
    None("none"),
    /** Visible to setting catalog policy type. */
    SettingsCatalog("settingsCatalog"),
    /** Visible to template policy type. */
    Template("template"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationSettingVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationSettingVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "settingsCatalog": return SettingsCatalog;
            case "template": return Template;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
