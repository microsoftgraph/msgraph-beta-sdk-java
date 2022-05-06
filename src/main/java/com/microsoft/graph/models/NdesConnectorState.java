package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum NdesConnectorState implements ValuedEnum {
    None("none"),
    Active("active"),
    Inactive("inactive");
    public final String value;
    NdesConnectorState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NdesConnectorState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "active": return Active;
            case "inactive": return Inactive;
            default: return null;
        }
    }
}
