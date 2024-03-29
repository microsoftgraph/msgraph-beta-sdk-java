package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Power action types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PowerActionType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** No action */
    NoAction("noAction"),
    /** Put device in sleep state */
    Sleep("sleep"),
    /** Put device in hibernate state */
    Hibernate("hibernate"),
    /** Shutdown device */
    Shutdown("shutdown");
    public final String value;
    PowerActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PowerActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "noAction": return NoAction;
            case "sleep": return Sleep;
            case "hibernate": return Hibernate;
            case "shutdown": return Shutdown;
            default: return null;
        }
    }
}
