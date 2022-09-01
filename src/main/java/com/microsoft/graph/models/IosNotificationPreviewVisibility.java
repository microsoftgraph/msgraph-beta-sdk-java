package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IosNotificationPreviewVisibility forValue(@javax.annotation.Nonnull final String searchValue) {
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
