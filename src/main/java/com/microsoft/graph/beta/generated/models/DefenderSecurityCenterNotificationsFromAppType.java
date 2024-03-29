package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for defenderSecurityCenterNotificationsFromApp
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefenderSecurityCenterNotificationsFromAppType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Block non-critical notifications */
    BlockNoncriticalNotifications("blockNoncriticalNotifications"),
    /** Block all notifications */
    BlockAllNotifications("blockAllNotifications");
    public final String value;
    DefenderSecurityCenterNotificationsFromAppType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderSecurityCenterNotificationsFromAppType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockNoncriticalNotifications": return BlockNoncriticalNotifications;
            case "blockAllNotifications": return BlockAllNotifications;
            default: return null;
        }
    }
}
