package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationSettingAccessTypes implements ValuedEnum {
    None("none"),
    Add("add"),
    Copy("copy"),
    Delete("delete"),
    Get("get"),
    Replace("replace"),
    Execute("execute");
    public final String value;
    DeviceManagementConfigurationSettingAccessTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationSettingAccessTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "add": return Add;
            case "copy": return Copy;
            case "delete": return Delete;
            case "get": return Get;
            case "replace": return Replace;
            case "execute": return Execute;
            default: return null;
        }
    }
}
