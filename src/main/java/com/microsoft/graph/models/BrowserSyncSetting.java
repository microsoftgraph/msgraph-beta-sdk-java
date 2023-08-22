package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowserSyncSetting implements ValuedEnum {
    /** Default  Allow syncing of browser settings across devices. */
    NotConfigured("notConfigured"),
    /** Prevent syncing of browser settings across user devices, allow user override of setting. */
    BlockedWithUserOverride("blockedWithUserOverride"),
    /** Absolutely prevent syncing of browser settings across user devices. */
    Blocked("blocked");
    public final String value;
    BrowserSyncSetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowserSyncSetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockedWithUserOverride": return BlockedWithUserOverride;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
