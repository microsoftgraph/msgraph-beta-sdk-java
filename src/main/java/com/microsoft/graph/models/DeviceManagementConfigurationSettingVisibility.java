package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceManagementConfigurationSettingVisibility implements ValuedEnum {
    /** Not visible */
    None("none"),
    /** Visible to setting catalog UX */
    SettingsCatalog("settingsCatalog"),
    /** Visible to template */
    Template("template");
    public final String value;
    DeviceManagementConfigurationSettingVisibility(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationSettingVisibility forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "settingsCatalog": return SettingsCatalog;
            case "template": return Template;
            default: return null;
        }
    }
}
