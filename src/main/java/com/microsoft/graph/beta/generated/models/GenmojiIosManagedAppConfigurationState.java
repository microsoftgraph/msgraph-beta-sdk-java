package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Configuration state set by admin for Genmoji Apple Intelligence setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GenmojiIosManagedAppConfigurationState implements ValuedEnum {
    /** Setting is not blocked */
    NotBlocked("notBlocked"),
    /** Setting is blocked */
    Blocked("blocked"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GenmojiIosManagedAppConfigurationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GenmojiIosManagedAppConfigurationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notBlocked": return NotBlocked;
            case "blocked": return Blocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
