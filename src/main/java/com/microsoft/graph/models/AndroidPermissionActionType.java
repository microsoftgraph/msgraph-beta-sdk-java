package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Android action taken when an app requests a dangerous permission. */
public enum AndroidPermissionActionType implements ValuedEnum {
    Prompt("prompt"),
    AutoGrant("autoGrant"),
    AutoDeny("autoDeny");
    public final String value;
    AndroidPermissionActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidPermissionActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prompt": return Prompt;
            case "autoGrant": return AutoGrant;
            case "autoDeny": return AutoDeny;
            default: return null;
        }
    }
}
