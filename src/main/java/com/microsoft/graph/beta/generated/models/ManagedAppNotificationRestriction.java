package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Restrict managed app notification
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppNotificationRestriction implements ValuedEnum {
    /** Share all notifications. */
    Allow("allow"),
    /** Do not share Orgnizational data in notifications. */
    BlockOrganizationalData("blockOrganizationalData"),
    /** Do not share notifications. */
    Block("block");
    public final String value;
    ManagedAppNotificationRestriction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppNotificationRestriction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allow": return Allow;
            case "blockOrganizationalData": return BlockOrganizationalData;
            case "block": return Block;
            default: return null;
        }
    }
}
