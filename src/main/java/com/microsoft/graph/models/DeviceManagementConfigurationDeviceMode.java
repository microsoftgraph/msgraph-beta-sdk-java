package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceManagementConfigurationDeviceMode implements ValuedEnum {
    /** No Device Mode specified */
    None("none"),
    /** Device must be in kiosk mode for this setting to apply */
    Kiosk("kiosk");
    public final String value;
    DeviceManagementConfigurationDeviceMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationDeviceMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "kiosk": return Kiosk;
            default: return null;
        }
    }
}
