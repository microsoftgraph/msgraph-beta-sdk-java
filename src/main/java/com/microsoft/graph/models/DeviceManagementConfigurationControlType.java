package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Setting control type representation in the UX
 */
public enum DeviceManagementConfigurationControlType implements ValuedEnum {
    /** Default. UX uses default UX element base on setting type for the setting. */
    Default("default"),
    /** Display the setting in dropdown box. */
    Dropdown("dropdown"),
    /** Display text input in small text input. */
    SmallTextBox("smallTextBox"),
    /** Display text input in large text input. */
    LargeTextBox("largeTextBox"),
    /** Allow for toggle control type. */
    Toggle("toggle"),
    /** Allow for multiheader grid control type. */
    MultiheaderGrid("multiheaderGrid"),
    /** Allow for context pane control type. */
    ContextPane("contextPane"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationControlType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationControlType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "dropdown": return Dropdown;
            case "smallTextBox": return SmallTextBox;
            case "largeTextBox": return LargeTextBox;
            case "toggle": return Toggle;
            case "multiheaderGrid": return MultiheaderGrid;
            case "contextPane": return ContextPane;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
