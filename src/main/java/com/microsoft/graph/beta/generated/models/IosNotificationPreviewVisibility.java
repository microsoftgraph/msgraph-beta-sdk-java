package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Determines when notification previews are visible on an iOS device. Previews can include things like text (from Messages and Mail) and invitation details (from Calendar). When configured, it will override the user&apos;s defined preview settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IosNotificationPreviewVisibility implements ValuedEnum {
    /** Notification preview settings will not be overwritten. */
    NotConfigured("notConfigured"),
    /** Always show notification previews. */
    AlwaysShow("alwaysShow"),
    /** Only show notification previews when the device is unlocked. */
    HideWhenLocked("hideWhenLocked"),
    /** Never show notification previews. */
    NeverShow("neverShow");
    public final String value;
    IosNotificationPreviewVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IosNotificationPreviewVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "alwaysShow": return AlwaysShow;
            case "hideWhenLocked": return HideWhenLocked;
            case "neverShow": return NeverShow;
            default: return null;
        }
    }
}
