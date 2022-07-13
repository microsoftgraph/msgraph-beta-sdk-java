package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum Windows10VpnProfileTarget implements ValuedEnum {
    /** User targeted VPN profile. */
    User("user"),
    /** Device targeted VPN profile. */
    Device("device"),
    /** AutoPilot Device targeted VPN profile. */
    AutoPilotDevice("autoPilotDevice");
    public final String value;
    Windows10VpnProfileTarget(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Windows10VpnProfileTarget forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "device": return Device;
            case "autoPilotDevice": return AutoPilotDevice;
            default: return null;
        }
    }
}
