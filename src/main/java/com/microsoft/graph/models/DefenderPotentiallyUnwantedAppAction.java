package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defenders action to take on detected Potentially Unwanted Application (PUA).
 */
public enum DefenderPotentiallyUnwantedAppAction implements ValuedEnum {
    /** PUA Protection is off. Defender will not protect against potentially unwanted applications. */
    DeviceDefault("deviceDefault"),
    /** PUA Protection is on. Detected items are blocked. They will show in history along with other threats. */
    Block("block"),
    /** Audit mode. Defender will detect potentially unwanted applications, but take no actions. You can review information about applications Defender would have taken action against by searching for events created by Defender in the Event Viewer. */
    Audit("audit");
    public final String value;
    DefenderPotentiallyUnwantedAppAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderPotentiallyUnwantedAppAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "block": return Block;
            case "audit": return Audit;
            default: return null;
        }
    }
}
