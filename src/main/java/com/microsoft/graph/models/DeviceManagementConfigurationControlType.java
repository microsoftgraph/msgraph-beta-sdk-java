package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DeviceManagementConfigurationControlType implements ValuedEnum {
    /** Don’t override default */
    Default_escaped("default_escaped"),
    /** Display Choice in dropdown */
    Dropdown("dropdown"),
    /** Display text input in small text input */
    SmallTextBox("smallTextBox"),
    /** Display text input in large text input */
    LargeTextBox("largeTextBox"),
    /** Allow for toggle control type */
    Toggle("toggle"),
    /** Allow for multiheader grid control type */
    MultiheaderGrid("multiheaderGrid"),
    /** Allow for context pane control type */
    ContextPane("contextPane");
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
            case "default": return Default_escaped;
            case "dropdown": return Dropdown;
            case "smallTextBox": return SmallTextBox;
            case "largeTextBox": return LargeTextBox;
            case "toggle": return Toggle;
            case "multiheaderGrid": return MultiheaderGrid;
            case "contextPane": return ContextPane;
            default: return null;
        }
    }
}
