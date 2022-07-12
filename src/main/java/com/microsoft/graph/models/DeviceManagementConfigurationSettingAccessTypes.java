package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationSettingAccessTypes forValue(@javax.annotation.Nonnull final String searchValue) {
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
