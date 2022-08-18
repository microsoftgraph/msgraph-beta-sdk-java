package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MicrosoftLauncherDockPresence implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Indicates the device's dock will be displayed on the device. */
    Show("show"),
    /** Indicates the device's dock will be hidden on the device, but the user can access the dock by dragging the handler on the bottom of the screen. */
    Hide("hide"),
    /** Indicates the device's dock will be disabled on the device. */
    Disabled("disabled");
    public final String value;
    MicrosoftLauncherDockPresence(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftLauncherDockPresence forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "show": return Show;
            case "hide": return Hide;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
