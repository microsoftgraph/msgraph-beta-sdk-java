package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsSmartCardRemovalBehaviorType implements ValuedEnum {
    /** No Action */
    NoAction("noAction"),
    /** Lock Workstation */
    LockWorkstation("lockWorkstation"),
    /** Force Logoff */
    ForceLogoff("forceLogoff"),
    /** Disconnect if a remote Remote Desktop Services session */
    DisconnectRemoteDesktopSession("disconnectRemoteDesktopSession");
    public final String value;
    LocalSecurityOptionsSmartCardRemovalBehaviorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsSmartCardRemovalBehaviorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noAction": return NoAction;
            case "lockWorkstation": return LockWorkstation;
            case "forceLogoff": return ForceLogoff;
            case "disconnectRemoteDesktopSession": return DisconnectRemoteDesktopSession;
            default: return null;
        }
    }
}
