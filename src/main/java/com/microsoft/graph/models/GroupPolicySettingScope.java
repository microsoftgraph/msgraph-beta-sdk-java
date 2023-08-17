package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Scope of the group policy setting.
 */
public enum GroupPolicySettingScope implements ValuedEnum {
    /** Device scope unknown */
    Unknown("unknown"),
    /** Device scope */
    Device("device"),
    /** User scope */
    User("user");
    public final String value;
    GroupPolicySettingScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicySettingScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "device": return Device;
            case "user": return User;
            default: return null;
        }
    }
}
