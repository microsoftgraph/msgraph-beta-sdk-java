package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Admin consent state. */
public enum AdminConsentState implements ValuedEnum {
    /** Admin did not configure the item */
    NotConfigured("notConfigured"),
    /** Admin granted item */
    Granted("granted"),
    /** Admin deos not grant item */
    NotGranted("notGranted");
    public final String value;
    AdminConsentState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AdminConsentState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "granted": return Granted;
            case "notGranted": return NotGranted;
            default: return null;
        }
    }
}
