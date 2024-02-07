package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android action taken when an app requests a dangerous permission.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidPermissionActionType implements ValuedEnum {
    Prompt("prompt"),
    AutoGrant("autoGrant"),
    AutoDeny("autoDeny");
    public final String value;
    AndroidPermissionActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidPermissionActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prompt": return Prompt;
            case "autoGrant": return AutoGrant;
            case "autoDeny": return AutoDeny;
            default: return null;
        }
    }
}
