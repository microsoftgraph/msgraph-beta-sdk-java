package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementConfigurationControlType implements ValuedEnum {
    Default_escaped("default_escaped"),
    Dropdown("dropdown"),
    SmallTextBox("smallTextBox"),
    LargeTextBox("largeTextBox"),
    Toggle("toggle"),
    MultiheaderGrid("multiheaderGrid"),
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
            case "default_escaped": return Default_escaped;
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
