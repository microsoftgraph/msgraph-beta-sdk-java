package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementExchangeAccessRuleType implements ValuedEnum {
    Family("family"),
    Model("model");
    public final String value;
    DeviceManagementExchangeAccessRuleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeAccessRuleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "family": return Family;
            case "model": return Model;
            default: return null;
        }
    }
}
