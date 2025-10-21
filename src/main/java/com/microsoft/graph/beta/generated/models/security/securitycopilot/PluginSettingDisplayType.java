package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PluginSettingDisplayType implements ValuedEnum {
    None("none"),
    Textbox("textbox"),
    Checkbox("checkbox"),
    Dropdown("dropdown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PluginSettingDisplayType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PluginSettingDisplayType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "textbox": return Textbox;
            case "checkbox": return Checkbox;
            case "dropdown": return Dropdown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
