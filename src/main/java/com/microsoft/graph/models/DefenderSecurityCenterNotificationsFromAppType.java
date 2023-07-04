package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for defenderSecurityCenterNotificationsFromApp
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderSecurityCenterNotificationsFromAppType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockNoncriticalNotifications": return BlockNoncriticalNotifications;
            case "blockAllNotifications": return BlockAllNotifications;
            default: return null;
        }
    }
}
