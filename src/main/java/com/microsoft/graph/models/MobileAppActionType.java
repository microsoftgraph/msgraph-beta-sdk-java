package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the Action Types for an Intune Application.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppActionType implements ValuedEnum {
    /** Unknown result. */
    Unknown("unknown"),
    /** Application install command was sent. */
    InstallCommandSent("installCommandSent"),
    /** Application installed. */
    Installed("installed"),
    /** Application uninstalled. */
    Uninstalled("uninstalled"),
    /** User requested installation */
    UserRequestedInstall("userRequestedInstall");
    public final String value;
    MobileAppActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "installCommandSent": return InstallCommandSent;
            case "installed": return Installed;
            case "uninstalled": return Uninstalled;
            case "userRequestedInstall": return UserRequestedInstall;
            default: return null;
        }
    }
}
